/*
 * Copyright (c) 2020 Mosaic, Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.mosaic.colorscheme

import org.pushingpixels.mosaic.utils.getHueShiftedColor

/**
 * Hue-shifted color scheme. A hue-shifted color scheme is a color scheme that
 * is hue-shifted in HSB space.
 *
 * @author Kirill Grouchnikov
 */
class HueShiftColorScheme(
    origScheme: MosaicColorScheme,
    hueShiftFactor: Float
) : BaseColorScheme(
    displayName =
    "Hue-shift " + origScheme.displayName() + " "
            + (100 * hueShiftFactor).toInt() + "%",
    ultraLight = getHueShiftedColor(origScheme.ultraLightColor, hueShiftFactor),
    extraLight = getHueShiftedColor(origScheme.extraLightColor, hueShiftFactor),
    light = getHueShiftedColor(origScheme.lightColor, hueShiftFactor),
    mid = getHueShiftedColor(origScheme.midColor, hueShiftFactor),
    dark = getHueShiftedColor(origScheme.darkColor, hueShiftFactor),
    ultraDark = getHueShiftedColor(origScheme.ultraDarkColor, hueShiftFactor),
    foreground = getHueShiftedColor(origScheme.foregroundColor, hueShiftFactor / 2.0f)
)