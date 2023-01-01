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
package org.pushingpixels.aurora.theming.painter.decoration

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.Density
import org.jetbrains.skia.Data
import org.jetbrains.skia.Shader
import org.pushingpixels.aurora.theming.colorscheme.AuroraColorScheme
import org.pushingpixels.aurora.theming.utils.getDuotoneEffect
import java.nio.ByteBuffer
import java.nio.ByteOrder

/**
 * Implementation of [AuroraDecorationPainter] that uses marble noise
 * painting on decoration areas.
 *
 * @author Kirill Grouchnikov
 */
class MarbleNoiseDecorationPainter(
    val textureAlpha: Float,
    baseDecorationPainter: AuroraDecorationPainter? = null
) : ShaderWrapperDecorationPainter(
    runtimeEffect = getDuotoneEffect(),
    baseShader = Shader.makeFractalNoise(
        baseFrequencyX = 0.25f,
        baseFrequencyY = 0.25f,
        numOctaves = 1,
        seed = 0.0f
    ),
    baseDecorationPainter = baseDecorationPainter
) {

    override val displayName = "Marble Noise"

    override fun getShaderData(
        density: Density,
        componentSize: Size,
        offsetFromRoot: Offset,
        fillScheme: AuroraColorScheme
    ): Data {
        val dataBuffer = ByteBuffer.allocate(36).order(ByteOrder.LITTLE_ENDIAN)
        // RGBA colorLight
        dataBuffer.putFloat(0, fillScheme.lightColor.red)
        dataBuffer.putFloat(4, fillScheme.lightColor.green)
        dataBuffer.putFloat(8, fillScheme.lightColor.blue)
        dataBuffer.putFloat(12, fillScheme.lightColor.alpha)
        // RGBA colorDark
        dataBuffer.putFloat(16, fillScheme.darkColor.red)
        dataBuffer.putFloat(20, fillScheme.darkColor.green)
        dataBuffer.putFloat(24, fillScheme.darkColor.blue)
        dataBuffer.putFloat(28, fillScheme.darkColor.alpha)
        // Alpha
        dataBuffer.putFloat(32, textureAlpha)

        return Data.makeFromBytes(dataBuffer.array())
    }
}