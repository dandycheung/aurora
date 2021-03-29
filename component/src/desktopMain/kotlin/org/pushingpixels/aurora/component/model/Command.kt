/*
 * Copyright (c) 2020-2021 Aurora, Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.aurora.component.model

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import org.pushingpixels.aurora.BackgroundAppearanceStrategy
import org.pushingpixels.aurora.IconFilterStrategy
import org.pushingpixels.aurora.PopupPlacementStrategy
import org.pushingpixels.aurora.component.layout.CommandButtonLayoutManager
import org.pushingpixels.aurora.component.layout.CommandButtonLayoutManagerMedium
import org.pushingpixels.aurora.component.layout.CommandButtonLayoutManagerTile
import org.pushingpixels.aurora.icon.AuroraIcon

interface CommandActionPreview {
    /**
     * Invoked when a command preview has been activated.
     *
     * @param command Command for which the preview has been activated.
     */
    fun onCommandPreviewActivated(command: Command)

    /**
     * Invoked when a command preview has been canceled.
     *
     * @param command Command for which the preview has been canceled.
     */
    fun onCommandPreviewCanceled(command: Command)
}

data class Command(
    val text: String,
    val extraText: String? = null,
    val iconFactory: AuroraIcon.Factory? = null,
    val disabledIconFactory: AuroraIcon.Factory? = null,
    val action: (() -> Unit)? = null,
    val actionPreview: CommandActionPreview? = null,
    val isActionEnabled: Boolean = true,
    val isActionToggle: Boolean = false,
    val isActionToggleSelected: Boolean = false,
    val onTriggerActionToggleSelectedChange: ((Boolean) -> Unit)? = null,
    val secondaryContentModel: CommandMenuContentModel? = null,
    val isSecondaryEnabled: Boolean = true
)

data class CommandGroup(
    val title: String? = null,
    val commands: List<Command>
)

data class CommandMenuContentModel(val groups: List<CommandGroup>) {
    constructor(group: CommandGroup) : this(listOf(group))
}

enum class TextClick {
    ACTION, POPUP
}

data class CommandButtonPresentationModel(
    val presentationState: CommandButtonPresentationState = CommandButtonPresentationState.MEDIUM,
    val backgroundAppearanceStrategy: BackgroundAppearanceStrategy = BackgroundAppearanceStrategy.ALWAYS,
    val horizontalAlignment: HorizontalAlignment = HorizontalAlignment.CENTER,
    val iconDimension: Int? = null,
    val iconDisabledFilterStrategy: IconFilterStrategy = IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME,
    val iconEnabledFilterStrategy: IconFilterStrategy = IconFilterStrategy.ORIGINAL,
    val iconActiveFilterStrategy: IconFilterStrategy = IconFilterStrategy.ORIGINAL,
    val popupPlacementStrategy: PopupPlacementStrategy = PopupPlacementStrategy.DOWNWARD,
    val textClick: TextClick = TextClick.ACTION,
    val horizontalGapScaleFactor: Float = 1.0f,
    val verticalGapScaleFactor: Float = 1.0f,
    val isMenu: Boolean = false
)

enum class HorizontalAlignment {
    LEADING, CENTER, TRAILING
}

/**
 * Enumerates the available command button kinds.
 */
enum class CommandButtonKind(val hasAction: Boolean, val hasPopup: Boolean) {
    /**
     * Command button that has only action area.
     */
    ACTION_ONLY(true, false),

    /**
     * Command button that has only popup area.
     */
    POPUP_ONLY(false, true),

    /**
     * Command button that has both action and popup areas, with the main
     * text click activating the action.
     */
    ACTION_AND_POPUP_MAIN_ACTION(true, true),

    /**
     * Command button that has both action and popup areas, with the main
     * text click activating the popup.
     */
    ACTION_AND_POPUP_MAIN_POPUP(true, true);
}

/**
 * Presentation state for command buttons. This class provides a number of core
 * companion presentation states. In addition, it also allows creating additional
 * custom states by using the constructor and implementing the relevant abstract
 * methods.
 */
abstract class CommandButtonPresentationState(val displayName: String) {
    abstract fun createLayoutManager(
        layoutDirection: LayoutDirection,
        density: Density,
        textStyle: TextStyle,
        resourceLoader: Font.ResourceLoader
    ): CommandButtonLayoutManager

    override fun toString(): String {
        return displayName
    }

    companion object {
        /** Medium state */
        val MEDIUM: CommandButtonPresentationState =
            object : CommandButtonPresentationState("Medium") {
                override fun createLayoutManager(
                    layoutDirection: LayoutDirection,
                    density: Density,
                    textStyle: TextStyle,
                    resourceLoader: Font.ResourceLoader
                ): CommandButtonLayoutManager {
                    return CommandButtonLayoutManagerMedium(
                        layoutDirection,
                        density,
                        textStyle,
                        resourceLoader
                    )
                }
            }

        /** Tile state */
        val TILE: CommandButtonPresentationState =
            object : CommandButtonPresentationState("Tile") {
                override fun createLayoutManager(
                    layoutDirection: LayoutDirection,
                    density: Density,
                    textStyle: TextStyle,
                    resourceLoader: Font.ResourceLoader
                ): CommandButtonLayoutManager {
                    return CommandButtonLayoutManagerTile(
                        layoutDirection,
                        density,
                        textStyle,
                        resourceLoader
                    )
                }
            }
    }
}

