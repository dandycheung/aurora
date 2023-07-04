/*
 * Copyright 2020-2023 Aurora, Kirill Grouchnikov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pushingpixels.aurora.window.ribbon

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.resolveDefaults
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.pushingpixels.aurora.common.AuroraInternalApi
import org.pushingpixels.aurora.component.model.*
import org.pushingpixels.aurora.component.projection.BaseCommandButtonProjection
import org.pushingpixels.aurora.component.projection.CommandButtonProjection
import org.pushingpixels.aurora.component.projection.LabelProjection
import org.pushingpixels.aurora.component.projection.VerticalSeparatorProjection
import org.pushingpixels.aurora.component.ribbon.*
import org.pushingpixels.aurora.component.ribbon.impl.LocalRibbonBandRowHeight
import org.pushingpixels.aurora.component.ribbon.resize.CoreRibbonResizePolicy
import org.pushingpixels.aurora.component.ribbon.resize.CoreRibbonResizePolicies
import org.pushingpixels.aurora.component.ribbon.resize.FlowRibbonBandResizePolicy
import org.pushingpixels.aurora.component.ribbon.resize.RibbonBandResizePolicy
import org.pushingpixels.aurora.component.utils.getEndwardDoubleArrowIcon
import org.pushingpixels.aurora.component.utils.getLabelPreferredHeight
import org.pushingpixels.aurora.component.utils.getLabelPreferredSingleLineWidth
import org.pushingpixels.aurora.theming.*
import org.pushingpixels.aurora.theming.decoration.AuroraDecorationArea
import kotlin.math.ceil
import kotlin.math.max

@Composable
private fun getBandsIntrinsicWidth(
    bands: List<AbstractRibbonBand>,
    bandCurrentResizePolicies: Map<AbstractRibbonBand, RibbonBandResizePolicy>,
    bandFullHeight: Int,
    bandContentHeight: Int,
    gap: Int,
    separatorWidth: Int
): Int {
    var result = 0
    for (band in bands) {
        val bandCurrentResizePolicy = bandCurrentResizePolicies[band]!!
        val heightForWidth = if (bandCurrentResizePolicy is CoreRibbonResizePolicies.Icon)
            bandFullHeight else bandContentHeight
        result += bandCurrentResizePolicy.getPreferredWidth(
            ribbonBand = band,
            availableHeight = heightForWidth,
            gap = gap
        )
    }
    result += bands.size * separatorWidth

    return result
}

private fun validateResizePolicies(
    bands: List<AbstractRibbonBand>,
    intrinsicWidthList: List<Pair<Map<AbstractRibbonBand, RibbonBandResizePolicy>, Int>>
) {
    for (index in 0 until intrinsicWidthList.size - 1) {
        val currentIntrinsicWidth = intrinsicWidthList[index].second
        val nextIntrinsicWidth = intrinsicWidthList[index + 1].second
        if (nextIntrinsicWidth > currentIntrinsicWidth) {
            val currentMapping = intrinsicWidthList[index].first
            val nextMapping = intrinsicWidthList[index + 1].first
            val currentLegend =
                bands.joinToString { "${it.title}:${currentMapping[it]?.javaClass?.simpleName}" }
            val nextLegend =
                bands.joinToString { "${it.title}:${nextMapping[it]?.javaClass?.simpleName}" }
            error(
                """Inconsistent intrinsic widths
                resizing sequence $currentLegend with intrinsic width $currentIntrinsicWidth
                is followed by
                resizing sequence $nextLegend with intrinsic width $nextIntrinsicWidth
            """.trimMargin()
            )
        }
    }
}

@OptIn(AuroraInternalApi::class)
@Composable
internal fun RibbonBands(ribbonTask: RibbonTask) {
    val density = LocalDensity.current
    val layoutDirection = LocalLayoutDirection.current
    val textStyle = LocalTextStyle.current
    val fontFamilyResolver = LocalFontFamilyResolver.current
    val resolvedTextStyle = remember { resolveDefaults(textStyle, layoutDirection) }
    val gap = (RibbonBandContentGap.value * density.density).toInt()

    val bands = ribbonTask.bands

    // The height of ribbon band control panel is computed based on the preferred height of a command
    // button in BIG state.
    val commandForSizing = Command(text = "Text", action = {})
    val presentationForSizing = CommandButtonPresentationModel(
        presentationState = CommandButtonPresentationState.Big,
        forceAllocateSpaceForIcon = true
    )
    val sizingLayoutManager = presentationForSizing.presentationState.createLayoutManager(
        layoutDirection = layoutDirection,
        density = density,
        textStyle = resolvedTextStyle,
        fontFamilyResolver = fontFamilyResolver
    )
    val sizingPreLayoutInfo =
        sizingLayoutManager.getPreLayoutInfo(
            commandForSizing,
            presentationForSizing
        )
    val bandContentHeight = (sizingLayoutManager.getPreferredSize(
        commandForSizing, presentationForSizing, sizingPreLayoutInfo
    ).height + 2 * gap).toInt()
    val bandTitleHeight = getLabelPreferredHeight(
        contentModel = LabelContentModel(text = "Title"),
        presentationModel = LabelPresentationModel(contentPadding = RibbonBandTitleLabelPadding, textMaxLines = 1),
        resolvedTextStyle = resolvedTextStyle,
        layoutDirection = layoutDirection,
        density = density,
        fontFamilyResolver = fontFamilyResolver,
        availableWidth = Float.MAX_VALUE
    )
    val bandFullHeight = (bandContentHeight + bandTitleHeight).toInt()
    val bandFullHeightDp = (bandFullHeight / density.density).dp

    val rowHeight = ((bandContentHeight - 4 * gap) / 3.0f).toInt()
    val separatorWidth: Int = VerticalSeparatorProjection().intrinsicWidth(bandFullHeight)

    val resizePolicySequence = ribbonTask.resizeSequencingPolicy.getResizeSequence(ribbonTask)
    val intrinsicWidthList: MutableList<Pair<Map<AbstractRibbonBand, RibbonBandResizePolicy>, Int>> =
        arrayListOf()

    // Start with the most permissive resize policy for every band
    val bandCurrentResizePolicies: MutableMap<AbstractRibbonBand, RibbonBandResizePolicy> =
        bands.associateWith { it.resizePolicies[0] }.toMutableMap()
    for (resizePolicy in resizePolicySequence) {
        // Start replacing the resize policies for the ribbon bands based on the resize
        // sequence associated with this task
        bandCurrentResizePolicies[resizePolicy.first] = resizePolicy.second

        var neededWidth = getBandsIntrinsicWidth(
            bands, bandCurrentResizePolicies,
            bandFullHeight, bandContentHeight, gap, separatorWidth
        )
        neededWidth += bands.size * separatorWidth

        intrinsicWidthList.add(Pair(bandCurrentResizePolicies.toMap(), neededWidth))
    }

    // Make sure that resize policies configured on this task create a non-increasing sequence
    // of intrinsic widths
    validateResizePolicies(bands, intrinsicWidthList)

    CompositionLocalProvider(
        LocalRibbonBandRowHeight provides rowHeight,
    ) {
        AuroraDecorationArea(decorationAreaType = DecorationAreaType.ControlPane) {
            SubcomposeLayout(
                modifier = Modifier.fillMaxWidth().height(bandFullHeightDp)
            ) { constraints ->
                val widthAvailable = constraints.maxWidth
                val heightAvailable = constraints.maxHeight

                val bandResizePolicies: Map<AbstractRibbonBand, RibbonBandResizePolicy> =
                    intrinsicWidthList.find { it.second <= widthAvailable }?.first
                        ?: intrinsicWidthList.last().first
                // TODO - kick in horizontal scrolling if we don't have enough horizontal
                // space to display the most restrictive configuration

                val bandsPlaceable =
                    subcompose(1) {
                        Row(modifier = Modifier.fillMaxSize().auroraBackground()) {
                            for (band in bands) {
                                RibbonBand(
                                    band = band,
                                    bandResizePolicy = bandResizePolicies[band]!!,
                                    bandContentHeight = bandContentHeight,
                                    bandFullHeight = bandFullHeight
                                )
                                VerticalSeparatorProjection().project(modifier = Modifier.fillMaxHeight())
                            }
                        }
                    }.first().measure(
                        Constraints.fixed(
                            width = widthAvailable,
                            height = heightAvailable
                        )
                    )
                layout(widthAvailable, heightAvailable) {
                    bandsPlaceable.placeRelative(x = 0, y = 0)
                }
            }
        }
    }
}

@Composable
private fun RibbonBand(
    band: AbstractRibbonBand,
    bandResizePolicy: RibbonBandResizePolicy,
    bandContentHeight: Int,
    bandFullHeight: Int
) {
    val density = LocalDensity.current
    if (bandResizePolicy is CoreRibbonResizePolicies.Icon) {
        val width = bandResizePolicy.getPreferredWidth(
            ribbonBand = band,
            availableHeight = bandFullHeight,
            gap = 0
        )
        Box(modifier = Modifier.width((width / density.density).dp).fillMaxHeight()) {
            val iconCommand = Command(
                text = band.title,
                icon = band.icon
            )
            val iconPresentationModel =
                CommandButtonPresentationModel(
                    presentationState = CommandButtonPresentationState.Big,
                    backgroundAppearanceStrategy = BackgroundAppearanceStrategy.Flat,
                    popupKeyTip = band.collapsedStateKeyTip
                )
            CommandButtonProjection(
                contentModel = iconCommand,
                presentationModel = iconPresentationModel
            ).project(modifier = Modifier.fillMaxSize())
        }
    } else {
        when (band) {
            is RibbonBand -> {
                Column(modifier = Modifier.width(IntrinsicSize.Min).fillMaxHeight()) {
                    Box(modifier = Modifier.fillMaxWidth().weight(1.0f)) {
                        RibbonBandContent(band, bandResizePolicy as CoreRibbonResizePolicy, bandContentHeight)
                    }

                    RibbonBandTitle(band)
                }
            }

            is FlowRibbonBand -> {
                Column(modifier = Modifier.width(IntrinsicSize.Min).fillMaxHeight()) {
                    Box(modifier = Modifier.fillMaxWidth().weight(1.0f)) {
                        FlowRibbonBandContent(band, bandResizePolicy as FlowRibbonBandResizePolicy, bandContentHeight)
                    }

                    RibbonBandTitle(band)
                }
            }
        }
    }
}

@Composable
private fun RibbonBandContent(
    band: RibbonBand,
    bandResizePolicy: CoreRibbonResizePolicy,
    bandContentHeight: Int
) {
    Row(modifier = Modifier.fillMaxSize().padding(0.dp)) {
        for ((index, bandGroup) in band.groups.withIndex()) {
            when (bandGroup) {
                is RibbonBandCommandGroup -> {
                    RibbonBandCommandGroupContent(bandGroup, bandResizePolicy)
                }

                is RibbonBandComponentGroup -> {
                    RibbonBandComponentGroupContent(bandGroup, bandResizePolicy, bandContentHeight)
                }
            }
            if (index < (band.groups.size - 1)) {
                VerticalSeparatorProjection().project(
                    modifier = Modifier.fillMaxHeight().padding(vertical = RibbonBandContentGap)
                )
            }
        }
    }
}

@Composable
private fun RibbonBandCommandGroupContent(
    group: RibbonBandCommandGroup,
    bandResizePolicy: CoreRibbonResizePolicy
) {
    Row(modifier = Modifier.fillMaxHeight().padding(all = RibbonBandContentGap)) {
        // Display galleries first
        for (gallery in group.galleries) {
            val mappedPriority = bandResizePolicy.mapping.invoke(gallery.presentationPriority)
            val visibleCount = when (mappedPriority) {
                PresentationPriority.Low -> gallery.collapsedVisibleCountLow
                PresentationPriority.Medium -> gallery.collapsedVisibleCountMedium
                PresentationPriority.Top -> gallery.collapsedVisibleCountTop
            }
            gallery.inlineState.presentationPriority = mappedPriority
            gallery.inlineState.visibleCount = visibleCount
            RibbonGalleryProjection(
                contentModel = gallery.contentModel,
                presentationModel = InRibbonGalleryPresentationModel(
                    collapsedVisibleCount = visibleCount,
                    commandButtonPresentationState = gallery.presentationModel.commandButtonPresentationState,
                    commandButtonTextOverflow = gallery.presentationModel.commandButtonTextOverflow,
                    commandPopupFireTrigger = gallery.presentationModel.commandPopupFireTrigger,
                    commandSelectedStateHighlight = gallery.presentationModel.commandSelectedStateHighlight,
                    contentPadding = gallery.presentationModel.contentPadding,
                    layoutGap = gallery.presentationModel.layoutGap,
                    expandKeyTip = gallery.presentationModel.expandKeyTip,
                    popupLayoutSpec = gallery.presentationModel.popupLayoutSpec
                ),
                secondaryOverlays = gallery.secondaryOverlays
            ).project(inlineState = gallery.inlineState)
        }
        // And command buttons second

        // TODO - this will be a combination of presentation priority, available horizontal space
        // and ribbon band resize policies
        val buttonsBig: MutableList<BaseCommandButtonProjection<*, *, *>> = arrayListOf()
        val buttonsMedium: MutableList<BaseCommandButtonProjection<*, *, *>> = arrayListOf()
        val buttonsSmall: MutableList<BaseCommandButtonProjection<*, *, *>> = arrayListOf()
        for (commandProjection in group.commandProjections) {
            when (bandResizePolicy.mapping.invoke(commandProjection.second)) {
                PresentationPriority.Top -> buttonsBig.add(commandProjection.first)
                PresentationPriority.Medium -> buttonsMedium.add(commandProjection.first)
                PresentationPriority.Low -> buttonsSmall.add(commandProjection.first)
            }
        }

        Row(
            modifier = Modifier.fillMaxHeight(),
            horizontalArrangement = Arrangement.spacedBy(RibbonBandContentGap)
        ) {
            if (buttonsBig.isNotEmpty()) {
                BigButtons(buttonsBig)
            }
            if (buttonsMedium.isNotEmpty()) {
                MediumButtons(buttonsMedium)
            }
            if (buttonsSmall.isNotEmpty()) {
                SmallButtons(buttonsSmall)
            }
        }
    }
}

@Composable
private fun BigButtons(buttons: List<BaseCommandButtonProjection<*, *, *>>) {
    Row(
        modifier = Modifier.fillMaxHeight(),
        horizontalArrangement = Arrangement.spacedBy(RibbonBandContentGap)
    ) {
        for (button in buttons) {
            button.reproject(modifier = Modifier,
                primaryOverlay = BaseCommandButtonPresentationModel.Overlay(
                    presentationState = CommandButtonPresentationState.Big,
                    backgroundAppearanceStrategy = BackgroundAppearanceStrategy.Flat
                ),
                actionInteractionSource = remember { MutableInteractionSource() },
                popupInteractionSource = remember { MutableInteractionSource() })
        }
    }
}

@Composable
private fun MediumButtons(buttons: List<BaseCommandButtonProjection<*, *, *>>) {
    Row(
        modifier = Modifier.fillMaxHeight(),
        horizontalArrangement = Arrangement.spacedBy(RibbonBandContentGap)
    ) {
        val columnCount = ceil(buttons.size / 3.0f).toInt()
        var buttonIndex = 0
        for (column in 1..columnCount) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(RibbonBandContentGap)
            ) {
                for (row in 1..3) {
                    if (buttonIndex < buttons.size) {
                        buttons[buttonIndex].reproject(modifier = Modifier,
                            primaryOverlay = BaseCommandButtonPresentationModel.Overlay(
                                presentationState = CommandButtonPresentationState.Medium,
                                backgroundAppearanceStrategy = BackgroundAppearanceStrategy.Flat
                            ),
                            actionInteractionSource = remember { MutableInteractionSource() },
                            popupInteractionSource = remember { MutableInteractionSource() })
                        buttonIndex++
                    }
                }
            }
        }
    }
}

@Composable
private fun SmallButtons(buttons: List<BaseCommandButtonProjection<*, *, *>>) {
    Row(
        modifier = Modifier.fillMaxHeight(),
        horizontalArrangement = Arrangement.spacedBy(RibbonBandContentGap)
    ) {
        val columnCount = ceil(buttons.size / 3.0f).toInt()
        var buttonIndex = 0
        for (column in 1..columnCount) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(RibbonBandContentGap)
            ) {
                for (row in 1..3) {
                    if (buttonIndex < buttons.size) {
                        buttons[buttonIndex].reproject(modifier = Modifier,
                            primaryOverlay = BaseCommandButtonPresentationModel.Overlay(
                                presentationState = CommandButtonPresentationState.Small,
                                backgroundAppearanceStrategy = BackgroundAppearanceStrategy.Flat
                            ),
                            actionInteractionSource = remember { MutableInteractionSource() },
                            popupInteractionSource = remember { MutableInteractionSource() })
                        buttonIndex++
                    }
                }
            }
        }
    }
}

private data class RibbonBandComponentGroupLayoutInfo(
    val fullWidth: Int,
    val titleLabelWidth: Int,
    val columnWidths: List<Int>
)

@OptIn(AuroraInternalApi::class)
@Composable
private fun getComponentGroupContentLayoutInfo(
    group: RibbonBandComponentGroup,
    bandContentHeight: Int,
    gap: Int
): RibbonBandComponentGroupLayoutInfo {
    val density = LocalDensity.current
    val layoutDirection = LocalLayoutDirection.current
    val textStyle = LocalTextStyle.current
    val resolvedTextStyle = remember { resolveDefaults(textStyle, layoutDirection) }

    val rowHeight = ((bandContentHeight - 4 * gap) / 3.0f).toInt()

    val hasTitle = (group.title != null)
    val contentRows = if (hasTitle) 2 else 3

    val titleLabelWidth = if (hasTitle)
        getLabelPreferredSingleLineWidth(
            contentModel = LabelContentModel(text = group.title!!),
            presentationModel = LabelPresentationModel(
                contentPadding = PaddingValues(0.dp),
                textMaxLines = 1
            ),
            resolvedTextStyle = resolvedTextStyle,
            layoutDirection = layoutDirection,
            density = density,
            fontFamilyResolver = LocalFontFamilyResolver.current
        ).toInt() else 0

    val columnWidths: MutableList<Int> = arrayListOf()

    var contentWidth = 0
    var currentColumnWidth = 0
    var currentIndexInColumn = 0
    for (projection in group.componentProjections) {
        val widthNeeded = projection.intrinsicWidth(height = rowHeight)
        currentColumnWidth = max(currentColumnWidth, widthNeeded)

        currentIndexInColumn++
        if (currentIndexInColumn == contentRows) {
            columnWidths.add(currentColumnWidth)

            // Start a new column
            contentWidth += currentColumnWidth
            currentIndexInColumn = 0
            currentColumnWidth = 0
        }
    }
    if (currentIndexInColumn < contentRows) {
        // Incomplete last column
        contentWidth += currentColumnWidth
        columnWidths.add(currentColumnWidth)
    }

    // Account for gaps between columns
    val contentColumnCount = ceil(group.componentProjections.size.toFloat() / contentRows.toFloat()).toInt()
    contentWidth += (contentColumnCount - 1) * gap

    val fullWidth = max(titleLabelWidth, contentWidth) + 2 * gap

    return RibbonBandComponentGroupLayoutInfo(
        fullWidth = fullWidth,
        titleLabelWidth = titleLabelWidth,
        columnWidths = columnWidths
    )
}

@Composable
private fun RibbonBandComponentGroupContent(
    group: RibbonBandComponentGroup,
    bandResizePolicy: CoreRibbonResizePolicy,
    bandContentHeight: Int
) {
    val density = LocalDensity.current
    val gap = (RibbonBandContentGap.value * density.density).toInt()
    val layoutInfo = getComponentGroupContentLayoutInfo(group, bandContentHeight, gap)

    val hasTitle = (group.title != null)
    val contentRows = if (hasTitle) 2 else 3

    Layout(modifier = Modifier.fillMaxHeight()
        .width((layoutInfo.fullWidth / density.density).dp)
        .padding(horizontal = RibbonBandContentGap),
        content = {
            // Title label if exists
            if (group.title != null) {
                LabelProjection(contentModel = LabelContentModel(text = group.title!!)).project(
                    Modifier.width((layoutInfo.titleLabelWidth / density.density).dp)
                )
            }

            // The rest of the content
            var currentColumnIndex = 0
            var currentContentRow = 0
            for (projection in group.componentProjections) {
                // All components in the same column have the same (max) width
                val currentColumnWidth = layoutInfo.columnWidths[currentColumnIndex]
                projection.project(Modifier.width((currentColumnWidth / density.density).dp))

                currentContentRow++
                if (currentContentRow == contentRows) {
                    currentColumnIndex++
                    currentContentRow = 0
                }
            }
        },
        measurePolicy = { measurables, constraints ->
            val width = constraints.maxWidth
            val placeables = measurables.map { it.measure(Constraints()) }

            layout(width = width, height = constraints.maxHeight) {
                val rowHeight = constraints.maxHeight / 3
                var x = 0
                var y = gap

                if (hasTitle) {
                    placeables[0].placeRelative(x, y)
                    y += rowHeight
                }

                val topContentY = y
                var currentContentRow = 0
                var currentColumnIndex = 0
                for (placeable in placeables.subList(
                    fromIndex = if (hasTitle) 1 else 0,
                    toIndex = placeables.size
                )) {
                    placeable.placeRelative(x, y)
                    currentContentRow++
                    y += rowHeight

                    if (currentContentRow == contentRows) {
                        // Start a new column
                        y = topContentY
                        x += (layoutInfo.columnWidths[currentColumnIndex] + gap)
                        currentContentRow = 0
                        currentColumnIndex++
                    }
                }
            }
        })
}

@Composable
private fun FlowRibbonBandContent(
    band: FlowRibbonBand,
    bandResizePolicy: FlowRibbonBandResizePolicy,
    bandContentHeight: Int
) {
    val density = LocalDensity.current
    val gap = (RibbonBandContentGap.value * density.density).toInt()
    val rowHeight = ((bandContentHeight - 4 * gap) / 3.0f).toInt()

    val optimalWidth = bandResizePolicy.getPreferredWidth(band, bandContentHeight, gap)
    Layout(modifier = Modifier.fillMaxHeight().width((optimalWidth / density.density).dp)
        .padding(horizontal = RibbonBandContentGap),
        content = {
            // Project all the content
            for (projection in band.flowComponentProjections) {
                projection.project(Modifier)
            }
        },
        measurePolicy = { measurables, constraints ->
            val width = constraints.maxWidth

            val placeables = measurables.map { it.measure(Constraints()) }
            // count the rows
            var rows = 1
            var currX = 0
            for (placeable in placeables) {
                if (currX + placeable.measuredWidth <= width) {
                    currX += (placeable.measuredWidth + gap)
                } else {
                    currX = 0
                    rows++
                }
            }

            // Compute vertical gap for balanced, vertically centered layout of the rows
            val verticalGap = (constraints.maxHeight - rows * rowHeight) / (rows + 1)

            layout(width = width, height = constraints.maxHeight) {
                var x = 0
                var y = verticalGap

                for (placeable in placeables) {
                    if (x + placeable.measuredWidth > width) {
                        x = 0
                        y += (rowHeight + verticalGap)
                    }
                    placeable.placeRelative(x, y)
                    x += placeable.measuredWidth
                    x += gap
                }
            }
        })
}

@OptIn(AuroraInternalApi::class)
@Composable
private fun RibbonBandTitle(
    band: AbstractRibbonBand,
) {
    val colors = AuroraSkin.colors
    val decorationAreaType = AuroraSkin.decorationAreaType
    val density = LocalDensity.current

    Row(
        modifier = Modifier.fillMaxWidth().padding(RibbonBandTitleAreaPadding),
        verticalAlignment = Alignment.CenterVertically
    ) {
        LabelProjection(
            contentModel = LabelContentModel(text = band.title),
            presentationModel = LabelPresentationModel(
                contentPadding = RibbonBandTitleLabelPadding,
                horizontalAlignment = HorizontalAlignment.Center,
                textMaxLines = 1,
            )
        ).project(modifier = Modifier.weight(1.0f))

        if (band.expandCommand != null) {
            CommandButtonProjection(
                contentModel = Command(
                    text = "",
                    icon = getEndwardDoubleArrowIcon(
                        decorationAreaType = decorationAreaType,
                        skinColors = colors,
                        colorSchemeBundle = null,
                        density = density
                    ),
                    action = { band.expandCommand?.action?.invoke() },
                    actionRichTooltip = band.expandCommand?.actionRichTooltip
                ),
                presentationModel = CommandButtonPresentationModel(
                    presentationState = CommandButtonPresentationState.SmallFitToIcon,
                    backgroundAppearanceStrategy = BackgroundAppearanceStrategy.Flat,
                    contentPadding = RibbonBandExpandButtonContentPadding,
                    sides = Sides.ClosedRectangle,
                    actionKeyTip = band.expandCommandKeyTip
                )
            ).project()
        }
    }
}

private val RibbonBandTitleAreaPadding = PaddingValues(horizontal = 4.dp, vertical = 2.dp)
private val RibbonBandTitleLabelPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp)
private val RibbonBandExpandButtonContentPadding = PaddingValues(horizontal = 2.dp, vertical = 2.dp)
private val RibbonBandContentGap: Dp = 4.dp
