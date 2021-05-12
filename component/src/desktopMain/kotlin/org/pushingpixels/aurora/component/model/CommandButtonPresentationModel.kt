/*
 * Copyright 2020-2021 Aurora, Kirill Grouchnikov
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
package org.pushingpixels.aurora.component.model

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.pushingpixels.aurora.BackgroundAppearanceStrategy
import org.pushingpixels.aurora.IconFilterStrategy
import org.pushingpixels.aurora.PopupPlacementStrategy

object CommandButtonSizingConstants {
    val WideButtonContentPadding = PaddingValues(start = 10.dp, top = 4.dp, end = 10.dp, bottom = 4.dp)
    val CompactButtonContentPadding = PaddingValues(start = 6.dp, top = 4.dp, end = 6.dp, bottom = 4.dp)
}

data class CommandButtonPresentationModel(
    val presentationState: CommandButtonPresentationState = CommandButtonPresentationState.MEDIUM,
    val backgroundAppearanceStrategy: BackgroundAppearanceStrategy = BackgroundAppearanceStrategy.ALWAYS,
    val horizontalAlignment: HorizontalAlignment = HorizontalAlignment.CENTER,
    val iconDimension: Dp? = null,
    val iconDisabledFilterStrategy: IconFilterStrategy = IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME,
    val iconEnabledFilterStrategy: IconFilterStrategy = IconFilterStrategy.ORIGINAL,
    val iconActiveFilterStrategy: IconFilterStrategy = IconFilterStrategy.ORIGINAL,
    val popupPlacementStrategy: PopupPlacementStrategy = PopupPlacementStrategy.DOWNWARD,
    val textClick: TextClick = TextClick.ACTION,
    val contentPadding: PaddingValues = CommandButtonSizingConstants.CompactButtonContentPadding,
    val horizontalGapScaleFactor: Float = 1.0f,
    val verticalGapScaleFactor: Float = 1.0f,
    val isMenu: Boolean = false
) {
    data class Overlay(
        val presentationState: CommandButtonPresentationState? = null,
        val backgroundAppearanceStrategy: BackgroundAppearanceStrategy? = null,
        val horizontalAlignment: HorizontalAlignment? = null,
        val iconDimension: Dp? = null,
        val iconDisabledFilterStrategy: IconFilterStrategy? = null,
        val iconEnabledFilterStrategy: IconFilterStrategy? = null,
        val iconActiveFilterStrategy: IconFilterStrategy? = null,
        val popupPlacementStrategy: PopupPlacementStrategy? = null,
        val textClick: TextClick? = null,
        val contentPadding: PaddingValues? = null,
        val horizontalGapScaleFactor: Float? = null,
        val verticalGapScaleFactor: Float? = null,
        val isMenu: Boolean? = null,
    )

    fun overlayWith(overlay: Overlay): CommandButtonPresentationModel {
        return CommandButtonPresentationModel(
            presentationState = overlay.presentationState ?: this.presentationState,
            backgroundAppearanceStrategy = overlay.backgroundAppearanceStrategy
                ?: this.backgroundAppearanceStrategy,
            horizontalAlignment = overlay.horizontalAlignment ?: this.horizontalAlignment,
            iconDimension = overlay.iconDimension ?: this.iconDimension,
            iconDisabledFilterStrategy = overlay.iconDisabledFilterStrategy ?: this.iconDisabledFilterStrategy,
            iconEnabledFilterStrategy = overlay.iconEnabledFilterStrategy ?: this.iconEnabledFilterStrategy,
            iconActiveFilterStrategy = overlay.iconActiveFilterStrategy ?: this.iconActiveFilterStrategy,
            popupPlacementStrategy = overlay.popupPlacementStrategy ?: this.popupPlacementStrategy,
            textClick = overlay.textClick ?: this.textClick,
            contentPadding = overlay.contentPadding ?: this.contentPadding,
            horizontalGapScaleFactor = overlay.horizontalGapScaleFactor ?: this.horizontalGapScaleFactor,
            verticalGapScaleFactor = overlay.verticalGapScaleFactor ?: this.verticalGapScaleFactor,
            isMenu = overlay.isMenu ?: this.isMenu
        )
    }
}