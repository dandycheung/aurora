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
package org.pushingpixels.aurora.theming.painter.overlay

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.unit.dp
import org.pushingpixels.aurora.common.withAlpha
import org.pushingpixels.aurora.common.withBrightness
import org.pushingpixels.aurora.theming.DecorationAreaType
import org.pushingpixels.aurora.theming.colorscheme.AuroraSkinColors
import kotlin.jvm.Synchronized

/**
 * Overlay painter that paints a few pixel-high drop shadow at the top edge of
 * the relevant decoration area. The constructor is private to enforce that
 * [.getInstance] is the only way an application can get an instance of this class.
 *
 * @author Kirill Grouchnikov
 */
class TopShadowOverlayPainter private constructor(private val startAlpha: Float) : AuroraOverlayPainter {
    override val displayName = "Top Shadow"

    override fun paintOverlay(
        drawScope: DrawScope,
        decorationAreaType: DecorationAreaType,
        width: Float,
        height: Float,
        colors: AuroraSkinColors
    ) {
        val shadowColor =
            colors.getBackgroundColorScheme(decorationAreaType).backgroundFillColor
                .withBrightness(brightnessFactor = -0.4f)

        with(drawScope) {
            val shadowHeight = 4.0.dp.toPx()
            drawRect(
                topLeft = Offset.Zero,
                size = Size(width, shadowHeight),
                style = Fill,
                brush = Brush.verticalGradient(
                    colors = listOf(
                        shadowColor.withAlpha(startAlpha),
                        shadowColor.withAlpha(0.0625f)
                    ),
                    startY = 0.0f,
                    endY = shadowHeight,
                    tileMode = TileMode.Clamp
                )
            )
        }
    }

    companion object {
        private val MAP: MutableMap<Int, TopShadowOverlayPainter> = HashMap()
        private const val DEFAULT_SHADOW_START_ALPHA = 160.0f / 255.0f
        private const val MIN_SHADOW_START_ALPHA = 32.0f / 255.0f

        /**
         * Returns an instance of top shadow overlay painter with the requested strength.
         *
         * @param strength Drop shadow strength. Must be in [0..100] range.
         * @return Top shadow overlay painter with the requested strength.
         */
        @Synchronized
        fun getInstance(strength: Int): TopShadowOverlayPainter {
            require(!(strength < 0 || strength > 100)) { "Strength must be in [0..100] range" }
            var result = MAP[strength]
            if (result == null) {
                val startAlpha = MIN_SHADOW_START_ALPHA +
                        (DEFAULT_SHADOW_START_ALPHA - MIN_SHADOW_START_ALPHA) * strength / 100
                result = TopShadowOverlayPainter(startAlpha = startAlpha)
                MAP[strength] = result
            }
            return result
        }
    }
}