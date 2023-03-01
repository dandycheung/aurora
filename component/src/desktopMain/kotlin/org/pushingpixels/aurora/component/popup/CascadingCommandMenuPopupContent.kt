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
package org.pushingpixels.aurora.component.popup

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalContext
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.State
import androidx.compose.ui.awt.ComposePanel
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.*
import org.pushingpixels.aurora.common.AuroraInternalApi
import org.pushingpixels.aurora.common.AuroraPopupManager
import org.pushingpixels.aurora.common.AuroraSwingPopupMenu
import org.pushingpixels.aurora.component.model.*
import org.pushingpixels.aurora.component.utils.getPlacementAwarePopupShift
import org.pushingpixels.aurora.theming.*
import org.pushingpixels.aurora.theming.colorscheme.AuroraColorSchemeBundle
import org.pushingpixels.aurora.theming.colorscheme.AuroraSkinColors
import java.awt.*
import java.awt.geom.Rectangle2D
import javax.swing.JPopupMenu
import javax.swing.border.Border
import kotlin.math.ceil

interface BaseCascadingCommandMenuPopupLayoutInfo {
    val popupSize: Size
}

/**
 * This extension of [BaseCommandMenuHandler] should be used for cascading popup menus,
 * where each next level of secondary content is displayed in a separate popup menu, while
 * keeping the parent popup menu(s) visible on the screen.
 */
interface CascadingCommandMenuHandler<in M : BaseCommandMenuContentModel,
        in P : BaseCommandPopupMenuPresentationModel,
        L : BaseCascadingCommandMenuPopupLayoutInfo> : BaseCommandMenuHandler<M, P> {
    fun getPopupContentLayoutInfo(
        menuContentModel: M,
        menuPresentationModel: P,
        displayPrototypeCommand: BaseCommand?,
        layoutDirection: LayoutDirection,
        density: Density,
        textStyle: TextStyle,
        fontFamilyResolver: FontFamily.Resolver
    ): L

    @Composable
    fun generatePopupContent(
        menuContentModel: M,
        menuPresentationModel: P,
        overlays: Map<Command, CommandButtonPresentationModel.Overlay>,
        popupContentLayoutInfo: L
    )

    @OptIn(AuroraInternalApi::class)
    override fun showPopupContent(
        popupOriginator: Component,
        layoutDirection: LayoutDirection,
        density: Density,
        textStyle: TextStyle,
        fontFamilyResolver: FontFamily.Resolver,
        skinColors: AuroraSkinColors,
        colorSchemeBundle: AuroraColorSchemeBundle?,
        skinPainters: AuroraPainters,
        decorationAreaType: DecorationAreaType,
        compositionLocalContext: CompositionLocalContext,
        anchorBoundsInWindow: Rect,
        popupTriggerAreaInWindow: Rect,
        contentModel: State<M?>,
        presentationModel: P,
        displayPrototypeCommand: BaseCommand?,
        toDismissPopupsOnActivation: Boolean,
        popupPlacementStrategy: PopupPlacementStrategy,
        overlays: Map<Command, CommandButtonPresentationModel.Overlay>
    ) {
        val popupOriginatorLocationOnScreen = popupOriginator.locationOnScreen
        val currentScreenBounds = popupOriginator.graphicsConfiguration.bounds
        popupOriginatorLocationOnScreen.translate(-currentScreenBounds.x, -currentScreenBounds.y)

        val popupContentLayoutInfo = getPopupContentLayoutInfo(
            menuContentModel = contentModel.value!!,
            menuPresentationModel = presentationModel,
            displayPrototypeCommand = displayPrototypeCommand,
            layoutDirection = layoutDirection,
            density = density,
            textStyle = textStyle,
            fontFamilyResolver = fontFamilyResolver
        )

        // From this point, all coordinates are in Swing display units - which are density independent.
        // The popup width and height is converted from pixels into dp (density-independent units),
        // and then passed those as is (the numeric value) to Swing / AWT

        // Full size of the popup accounts for extra pixel on each side for the popup border
        val fullPopupWidth = ceil(popupContentLayoutInfo.popupSize.width / density.density).toInt() + 2
        val fullPopupHeight = ceil(popupContentLayoutInfo.popupSize.height / density.density).toInt() + 2

        val initialAnchorX = if (layoutDirection == LayoutDirection.Ltr)
            (popupOriginatorLocationOnScreen.x + anchorBoundsInWindow.left).toInt() else
            (popupOriginatorLocationOnScreen.x + anchorBoundsInWindow.left + anchorBoundsInWindow.width).toInt() - fullPopupWidth
        // Initial anchor corresponds to the on-screen location of the top-left corner of the
        // popup window under the default PopupPlacementStrategy.Downward.HAlignStart placement
        // strategy
        val initialAnchor = IntOffset(
            x = initialAnchorX,
            y = (popupOriginatorLocationOnScreen.y + anchorBoundsInWindow.top).toInt()
        )

        val popupShift = getPlacementAwarePopupShift(
            ltr = (layoutDirection == LayoutDirection.Ltr),
            anchorDimension = IntSize(
                width = anchorBoundsInWindow.width.toInt(),
                height = anchorBoundsInWindow.height.toInt()
            ),
            popupDimension = IntSize(fullPopupWidth, fullPopupHeight),
            popupPlacementStrategy = popupPlacementStrategy
        )
        val popupRect = Rectangle(
            initialAnchor.x + popupShift.width,
            initialAnchor.y + anchorBoundsInWindow.height.toInt() + popupShift.height,
            fullPopupWidth,
            fullPopupHeight
        )

        // Make sure the popup stays in screen bounds
        val screenBounds = popupOriginator.graphicsConfiguration.bounds
        if (popupRect.x < 0) {
            popupRect.translate(-popupRect.x, 0)
        }
        if ((popupRect.x + popupRect.width) > screenBounds.width) {
            popupRect.translate(
                screenBounds.width - popupRect.x - popupRect.width,
                0
            )
        }
        if (popupRect.y < 0) {
            popupRect.translate(0, -popupRect.y)
        }
        if ((popupRect.y + popupRect.height) > screenBounds.height) {
            popupRect.translate(
                0,
                screenBounds.height - popupRect.y - popupRect.height
            )
        }

        val popupContent = ComposePanel()
        val fillColor = skinColors.getBackgroundColorScheme(decorationAreaType).backgroundFillColor
        val awtFillColor = fillColor.awtColor
        popupContent.background = awtFillColor

        val borderScheme = skinColors.getColorScheme(
            decorationAreaType = DecorationAreaType.None,
            associationKind = ColorSchemeAssociationKind.Border,
            componentState = ComponentState.Enabled
        )
        val popupBorderColor = skinPainters.borderPainter.getRepresentativeColor(borderScheme)
        val awtBorderColor = popupBorderColor.awtColor
        val borderThickness = 1.0f / density.density

        popupContent.border = object : Border {
            override fun paintBorder(
                c: Component,
                g: Graphics,
                x: Int,
                y: Int,
                width: Int,
                height: Int
            ) {
                val g2d = g.create() as Graphics2D
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
                g2d.setRenderingHint(
                    RenderingHints.KEY_STROKE_CONTROL,
                    RenderingHints.VALUE_STROKE_PURE
                )

                g2d.color = awtFillColor
                g2d.fill(Rectangle(0, 0, width, height))

                val thickness = 0.5f
                g2d.stroke = BasicStroke(thickness, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)
                g2d.color = awtBorderColor
                g2d.draw(
                    Rectangle2D.Float(
                        borderThickness / 2.0f, borderThickness / 2.0f,
                        width - borderThickness, height - borderThickness
                    )
                )
                g2d.dispose()
            }

            override fun getBorderInsets(c: Component?): Insets {
                return Insets(1, 1, 1, 1)
            }

            override fun isBorderOpaque(): Boolean {
                return false
            }
        }
        popupContent.preferredSize = Dimension(popupRect.width, popupRect.height)

        val popupDpSize = DpSize(
            width = (popupRect.width / density.density).dp,
            height = (popupRect.height / density.density).dp
        )

        // This line is needed to ensure that each popup is displayed in its own heavyweight window
        JPopupMenu.setDefaultLightWeightPopupEnabled(false)

        val popupMenu = AuroraSwingPopupMenu(toDismissPopupsOnActivation)
        popupContent.setContent {
            // Get the current composition context
            CompositionLocalProvider(compositionLocalContext) {
                // And add the composition locals for the new popup
                CompositionLocalProvider(
                    LocalPopupMenu provides popupMenu,
                    LocalWindowSize provides popupDpSize,
                    LocalTopWindowSize provides LocalTopWindowSize.current
                ) {
                    generatePopupContent(
                        menuContentModel = contentModel.value!!,
                        menuPresentationModel = presentationModel,
                        overlays = overlays,
                        popupContentLayoutInfo = popupContentLayoutInfo
                    )
                }
            }
        }
        popupMenu.add(popupContent)

        // Hide the popups that "start" from our popup originator
        AuroraPopupManager.hidePopups(originator = popupOriginator)
        // And display our new popup content
        AuroraPopupManager.showPopup(
            originator = popupOriginator,
            popupTriggerAreaInOriginatorWindow = popupTriggerAreaInWindow,
            popup = popupMenu,
            popupContent = popupContent,
            popupRectOnScreen = popupRect,
            popupKind = AuroraPopupManager.PopupKind.Popup
        )
    }
}
