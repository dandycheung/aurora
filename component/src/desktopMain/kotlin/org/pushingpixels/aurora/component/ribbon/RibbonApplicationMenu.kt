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
package org.pushingpixels.aurora.component.ribbon

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.text.Paragraph
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.*
import org.pushingpixels.aurora.component.layout.CommandButtonLayoutManager
import org.pushingpixels.aurora.component.model.*
import org.pushingpixels.aurora.component.projection.BaseCommandButtonProjection
import org.pushingpixels.aurora.component.utils.popup.RibbonApplicationMenuPopupHandler
import org.pushingpixels.aurora.theming.*

data class RibbonApplicationMenuContentModel(
    val groups: List<CommandGroup>,
    val footerCommands: CommandGroup
): BaseCommandMenuContentModel

data class RibbonApplicationMenuCommand(
    override val text: String,
    override val secondaryContentModel: RibbonApplicationMenuContentModel,
    override val secondaryRichTooltip: RichTooltip? = null
) : BaseCommand {
    override val extraText = null
    override val icon = null
    override val action = null
    override val actionPreview = null
    override val isActionEnabled = false
    override val isActionToggle = false
    override val isActionToggleSelected = false
    override val actionRichTooltip = null
    override val onTriggerActionToggleSelectedChange = null
    override val isSecondaryEnabled = true
}

object RibbonApplicationMenuButtonPresentationStates {
    private class CommandButtonLayoutManagerRibbonApplicationMenuButton(
        override val layoutDirection: LayoutDirection,
        private val _density: Density,
        private val textStyle: TextStyle,
        private val fontFamilyResolver: FontFamily.Resolver
    ) : CommandButtonLayoutManager {
        override val density = _density.density
        override val fontScale = _density.fontScale

        override fun getPreferredIconSize(
            command: BaseCommand,
            presentationModel: BaseCommandButtonPresentationModel
        ): DpSize {
            return DpSize.Zero
        }

        override fun getPreferredSize(
            command: BaseCommand,
            presentationModel: BaseCommandButtonPresentationModel,
            preLayoutInfo: CommandButtonLayoutManager.CommandButtonPreLayoutInfo
        ): Size {
            val paddingValues = presentationModel.contentPadding
            val by = presentationModel.verticalGapScaleFactor * paddingValues.verticalPaddings.toPx()
            val bx = presentationModel.horizontalGapScaleFactor * paddingValues.horizontalPaddings.toPx()

            val paragraph = Paragraph(
                text = command.text, style = textStyle, constraints = Constraints(maxWidth = Int.MAX_VALUE),
                density = _density, maxLines = 1, fontFamilyResolver = fontFamilyResolver
            )

            return Size(
                width = bx + paragraph.maxIntrinsicWidth,
                height = by + paragraph.height
            )
        }

        override fun getPreLayoutInfo(
            command: BaseCommand,
            presentationModel: BaseCommandButtonPresentationModel
        ): CommandButtonLayoutManager.CommandButtonPreLayoutInfo {
            return CommandButtonLayoutManager.CommandButtonPreLayoutInfo(
                commandButtonKind = CommandButtonKind.PopupOnly,
                showIcon = false,
                texts = listOf(command.text),
                extraTexts = emptyList(),
                isTextInActionArea = true,
                separatorOrientation = null,
                showPopupIcon = false
            )
        }

        override fun getLayoutInfo(
            constraints: Constraints,
            command: BaseCommand,
            presentationModel: BaseCommandButtonPresentationModel,
            preLayoutInfo: CommandButtonLayoutManager.CommandButtonPreLayoutInfo
        ): CommandButtonLayoutManager.CommandButtonLayoutInfo {
            val preferredSize = getPreferredSize(command, presentationModel, preLayoutInfo)

            val paddingValues = presentationModel.contentPadding
            val top = presentationModel.verticalGapScaleFactor * paddingValues.topPadding.toPx()
            val left = presentationModel.horizontalGapScaleFactor *
                    paddingValues.calculateLeftPadding(layoutDirection).toPx()

            val paragraph = Paragraph(
                text = command.text, style = textStyle, constraints = Constraints(maxWidth = Int.MAX_VALUE),
                density = _density, maxLines = 1, fontFamilyResolver = fontFamilyResolver
            )

            return CommandButtonLayoutManager.CommandButtonLayoutInfo(
                fullSize = preferredSize,
                actionClickArea = Rect.Zero,
                popupClickArea = Rect(
                    left = 0.0f,
                    right = preferredSize.width,
                    top = 0.0f,
                    bottom = preferredSize.height
                ),
                separatorArea = Rect.Zero,
                iconRect = Rect.Zero,
                textLayoutInfoList = listOf(
                    CommandButtonLayoutManager.TextLayoutInfo(
                        text = command.text,
                        textRect = Rect(
                            left = left, right = left + paragraph.maxIntrinsicWidth,
                            top = top, bottom = top + paragraph.height
                        )
                    )
                ),
                extraTextLayoutInfoList = emptyList(),
                popupActionRect = Rect.Zero
            )
        }
    }

    val AppMenuButtonState: CommandButtonPresentationState =
        object : CommandButtonPresentationState("Ribbon Application Menu Button") {
            override fun createLayoutManager(
                layoutDirection: LayoutDirection,
                density: Density,
                textStyle: TextStyle,
                fontFamilyResolver: FontFamily.Resolver
            ): CommandButtonLayoutManager {
                return CommandButtonLayoutManagerRibbonApplicationMenuButton(
                    layoutDirection, density, textStyle, fontFamilyResolver
                )
            }
        }

    val RibbonAppMenuSecondaryLevel: CommandButtonPresentationState =
        object : CommandButtonPresentationState("Ribbon application menu tile level 2") {
            override fun createLayoutManager(
                layoutDirection: LayoutDirection,
                density: Density,
                textStyle: TextStyle,
                fontFamilyResolver: FontFamily.Resolver
            ): CommandButtonLayoutManager {
                throw UnsupportedOperationException()
            }
        }
}

data class RibbonApplicationMenuCommandButtonPresentationModel(
    override val textStyle: TextStyle? = null,
    override val textOverflow: TextOverflow = TextOverflow.Clip,
    override val popupPlacementStrategy: PopupPlacementStrategy = PopupPlacementStrategy.Downward.HAlignStart,
    override val popupKeyTip: String? = null,
    override val popupRichTooltipPresentationModel: RichTooltipPresentationModel = RichTooltipPresentationModel(),
    override val contentPadding: PaddingValues = CommandButtonSizingConstants.WideButtonContentPadding,
    override val sides: Sides = Sides()
) : BaseCommandButtonPresentationModel {
    override val presentationState: CommandButtonPresentationState =
        RibbonApplicationMenuButtonPresentationStates.AppMenuButtonState
    override val backgroundAppearanceStrategy: BackgroundAppearanceStrategy = BackgroundAppearanceStrategy.Always
    override val horizontalAlignment: HorizontalAlignment = HorizontalAlignment.Center
    override val iconDimension: DpSize? = null
    override val iconDisabledFilterStrategy: IconFilterStrategy = IconFilterStrategy.ThemedFollowColorScheme
    override val iconEnabledFilterStrategy: IconFilterStrategy = IconFilterStrategy.Original
    override val iconActiveFilterStrategy: IconFilterStrategy = IconFilterStrategy.Original
    override val forceAllocateSpaceForIcon: Boolean = false
    override val actionKeyTip = null
    override val autoRepeatAction = false
    override val autoRepeatInitialInterval = CommandButtonInteractionConstants.DefaultAutoRepeatInitialIntervalMillis
    override val autoRepeatSubsequentInterval =
        CommandButtonInteractionConstants.DefaultAutoRepeatSubsequentIntervalMillis
    override val actionFireTrigger = ActionFireTrigger.OnPressReleased
    override val textClick = TextClick.Action
    override val actionRichTooltipPresentationModel = RichTooltipPresentationModel()
    override val toDismissPopupsOnActivation: Boolean = true
    override val popupMenuPresentationModel: CommandPopupMenuPresentationModel =
        CommandPopupMenuPresentationModel(
            itemPresentationState = CommandButtonPresentationState.Tile,
            itemContentPadding = PaddingValues(horizontal = 6.dp, vertical = 8.dp)
        )
    override val horizontalGapScaleFactor: Float = 1.0f
    override val verticalGapScaleFactor: Float = 1.0f
    override val minWidth: Dp = 0.dp
    override val isMenu: Boolean = false
}

class RibbonApplicationMenuCommandButtonProjection(
    contentModel: RibbonApplicationMenuCommand,
    presentationModel: RibbonApplicationMenuCommandButtonPresentationModel,
    overlays: Map<Command, CommandButtonPresentationModel.Overlay>? = null,
    secondaryStates: Map<Command, CommandButtonPresentationState>? = null
) : BaseCommandButtonProjection<RibbonApplicationMenuCommand, RibbonApplicationMenuCommandButtonPresentationModel>(
    contentModel, presentationModel, overlays
) {
    @Composable
    fun project(
        modifier: Modifier = Modifier,
        popupInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    ) {
        super.project(
            modifier = modifier,
            actionInteractionSource = remember { MutableInteractionSource() },
            popupInteractionSource = popupInteractionSource,
            popupHandler = RibbonApplicationMenuPopupHandler,
        )
    }
}
