/*
 * Copyright 2020-2024 Aurora, Kirill Grouchnikov
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

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.SpringSpec
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.pushingpixels.aurora.theming.colorscheme.AuroraColorSchemeBundle

data class IndeterminateProgressContentModel(
    val enabled: Boolean = true,
): ContentModel

data class DeterminateProgressContentModel(
    val enabled: Boolean = true,
    val progress: Float
): ContentModel

object ProgressConstants {
    val DefaultWidth = 192.dp
    val DefaultHeight = 16.dp

    val ProgressAnimationSpec = SpringSpec(
        dampingRatio = Spring.DampingRatioNoBouncy,
        stiffness = Spring.StiffnessVeryLow,
        visibilityThreshold = 0.001f
    )
}

data class CircularProgressPresentationModel(
    val colorSchemeBundle: AuroraColorSchemeBundle? = null,
    val radius: Dp = 10.dp,
    val strokeWidth: Dp = 2.0f.dp
): PresentationModel

data class LinearProgressPresentationModel(
    val colorSchemeBundle: AuroraColorSchemeBundle? = null,
    val primarySize : Dp = ProgressConstants.DefaultWidth,
    val secondarySize : Dp = ProgressConstants.DefaultHeight
): PresentationModel
