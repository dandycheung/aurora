/*
 * Copyright (c) 2020 Aurora, Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.aurora.utils

import androidx.compose.ui.graphics.Color
import org.pushingpixels.aurora.colorscheme.AuroraColorScheme
import org.pushingpixels.aurora.colorscheme.BaseDarkColorScheme
import org.pushingpixels.aurora.colorscheme.BaseLightColorScheme
import org.pushingpixels.aurora.colorscheme.ColorSchemes
import org.pushingpixels.aurora.common.interpolateTowards
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

private fun decodeColor(value: String, colorMap: Map<String, Color>): Color {
    if (value.startsWith("@")) {
        return colorMap[value.substring(1)] ?: error("No color entry found for $value")
    }
    val decodedInt = Integer.decode(value)
    return Color(decodedInt shr 16 and 0xFF, decodedInt shr 8 and 0xFF, decodedInt and 0xFF)
}

private enum class ColorSchemeKind {
    LIGHT, DARK
}

fun getColorSchemes(inputStream: InputStream): ColorSchemes {
    val schemes: MutableList<AuroraColorScheme> = arrayListOf()
    val colorMap: MutableMap<String, Color> = HashMap()
    var ultraLight: Color? = null
    var extraLight: Color? = null
    var light: Color? = null
    var mid: Color? = null
    var dark: Color? = null
    var ultraDark: Color? = null
    var foreground: Color? = null
    var background: Color? = null
    var name: String? = null
    var kind: ColorSchemeKind? = null
    val additionalColors: MutableMap<String, Color> = HashMap()
    var inColorSchemeBlock = false
    var inColorsBlock = false
    var lineNumber = 0
    try {
        BufferedReader(InputStreamReader(inputStream)).use { reader ->
            while (true) {
                var line: String? = reader.readLine()
                lineNumber++
                if (line == null) break
                line = line.trim { it <= ' ' }
                if (line.isEmpty()) continue
                if (line.startsWith("#")) {
                    // allow comments
                    continue
                }
                if (line.contains("{")) {
                    require(!(inColorSchemeBlock || inColorsBlock)) { "Already in color scheme or colors definition, line $lineNumber" }
                    name = line.substring(0, line.indexOf("{")).trim { it <= ' ' }
                    if (name == "@colors") {
                        inColorsBlock = true
                    } else {
                        inColorSchemeBlock = true
                    }
                    continue
                }
                if (line.contains("}")) {
                    require(!(!inColorSchemeBlock && !inColorsBlock)) { "Not in color scheme or colors definition, line $lineNumber" }
                    if (inColorsBlock) {
                        // Colors have already been processed
                        inColorsBlock = false
                        continue
                    }
                    inColorSchemeBlock = false
                    if (background == null) {
                        require(
                            !(name == null || ultraLight == null
                                    || extraLight == null || light == null || mid == null
                                    || dark == null || ultraDark == null || foreground == null)
                        ) { "Incomplete specification of '$name', line $lineNumber" }
                    } else {
                        require(!(name == null || foreground == null)) { "Incomplete specification '$name', line $lineNumber" }
                    }

                    val colors: Array<Color> = if (background != null) arrayOf(
                        background!!, background!!, background!!, background!!, background!!, background!!,
                        foreground!!
                    ) else arrayOf(ultraLight!!, extraLight!!, light!!, mid!!, dark!!, ultraDark!!, foreground!!)
                    if (kind === ColorSchemeKind.LIGHT) {
                        schemes.add(getLightColorScheme(name!!, colors, HashMap(additionalColors)))
                    } else {
                        schemes.add(getDarkColorScheme(name!!, colors, HashMap(additionalColors)))
                    }
                    name = null
                    kind = null
                    ultraLight = null
                    extraLight = null
                    light = null
                    mid = null
                    dark = null
                    ultraDark = null
                    foreground = null
                    background = null
                    additionalColors.clear()
                    continue
                }
                val split = line.split("=".toRegex()).toTypedArray()
                require(split.size == 2) { "Unsupported format in line $line [$lineNumber]" }
                val key = split[0].trim { it <= ' ' }
                val value = split[1].trim { it <= ' ' }
                if (inColorsBlock) {
                    colorMap[key] = decodeColor(value, colorMap)
                    continue
                }
                if ("kind" == key) {
                    if (kind == null) {
                        if ("Light" == value) {
                            kind = ColorSchemeKind.LIGHT
                            continue
                        }
                        if ("Dark" == value) {
                            kind = ColorSchemeKind.DARK
                            continue
                        }
                        throw IllegalArgumentException("Unsupported format in line $line [$lineNumber]")
                    }
                    throw IllegalArgumentException("'kind' should only be defined once, line $lineNumber")
                }
                if ("colorUltraLight" == key) {
                    if (ultraLight == null) {
                        ultraLight = decodeColor(value, colorMap)
                        continue
                    }
                    throw IllegalArgumentException("'ultraLight' should only be defined once, line $lineNumber")
                }
                if ("colorExtraLight" == key) {
                    if (extraLight == null) {
                        extraLight = decodeColor(value, colorMap)
                        continue
                    }
                    throw IllegalArgumentException("'extraLight' should only be defined once, line $lineNumber")
                }
                if ("colorLight" == key) {
                    if (light == null) {
                        light = decodeColor(value, colorMap)
                        continue
                    }
                    throw IllegalArgumentException("'light' should only be defined once, line $lineNumber")
                }
                if ("colorMid" == key) {
                    if (mid == null) {
                        mid = decodeColor(value, colorMap)
                        continue
                    }
                    throw IllegalArgumentException("'mid' should only be defined once, line $lineNumber")
                }
                if ("colorDark" == key) {
                    if (dark == null) {
                        dark = decodeColor(value, colorMap)
                        continue
                    }
                    throw IllegalArgumentException("'dark' should only be defined once, line $lineNumber")
                }
                if ("colorUltraDark" == key) {
                    if (ultraDark == null) {
                        ultraDark = decodeColor(value, colorMap)
                        continue
                    }
                    throw IllegalArgumentException("'ultraDark' should only be defined once, line $lineNumber")
                }
                if ("colorForeground" == key) {
                    if (foreground == null) {
                        foreground = decodeColor(value, colorMap)
                        continue
                    }
                    throw IllegalArgumentException("'foreground' should only be defined once, line $lineNumber")
                }
                if ("colorBackground" == key) {
                    if (value.contains("->")) {
                        val splitInner = value.split("->".toRegex()).toTypedArray()
                        val colorStart: Color = decodeColor(splitInner[0].trim { it <= ' ' }, colorMap)
                        val colorEnd: Color = decodeColor(splitInner[1].trim { it <= ' ' }, colorMap)
                        ultraLight = colorStart
                        extraLight = colorStart.interpolateTowards(colorEnd, 0.9f)
                        light = colorStart.interpolateTowards(colorEnd, 0.7f)
                        mid = colorStart.interpolateTowards(colorEnd, 0.5f)
                        dark = colorStart.interpolateTowards(colorEnd, 0.2f)
                        ultraDark = colorEnd
                        continue
                    } else {
                        if (background == null) {
                            background = decodeColor(value, colorMap)
                            continue
                        }
                    }
                    throw IllegalArgumentException("'foreground' should only be defined once, line $lineNumber")
                }
                additionalColors[key] = decodeColor(value, colorMap)
            }
        }
    } catch (t: Throwable) {
        throw IllegalArgumentException(t)
    }
    return object : ColorSchemes {
        override val all: Collection<AuroraColorScheme>
            get() = schemes.map { it }

        override
        operator fun get(displayName: String): AuroraColorScheme {
            for (scheme in schemes) {
                if (scheme.displayName == displayName) {
                    return scheme
                }
            }
            throw IllegalArgumentException("Requested non-existent $displayName")
        }
    }
}

private fun getLightColorScheme(
    name: String, colors: Array<Color>,
    additionalColors: Map<String, Color>
): AuroraColorScheme {
    require(colors.size == 7) { "Color encoding must have 7 components" }
    return object : BaseLightColorScheme(name) {
        // Base
        override val ultraLightColor: Color
            get() = colors[0]
        override val extraLightColor: Color
            get() = colors[1]
        override val lightColor: Color
            get() = colors[2]
        override val midColor: Color
            get() = colors[3]
        override val darkColor: Color
            get() = colors[4]
        override val ultraDarkColor: Color
            get() = colors[5]
        override val foregroundColor: Color
            get() = colors[6]

        // Derived
        override val lineColor: Color
            get() = additionalColors["colorLine"] ?: super.lineColor
        override val backgroundFillColor: Color
            get() = additionalColors["colorBackgroundFill"] ?: super.backgroundFillColor
        override val accentedBackgroundFillColor: Color
            get() = additionalColors["colorAccentedBackgroundFill"] ?: super.accentedBackgroundFillColor
        override val textBackgroundFillColor: Color
            get() = additionalColors["colorTextBackgroundFill"] ?: super.textBackgroundFillColor
        override val selectionBackgroundColor: Color
            get() = additionalColors["colorSelectionBackground"] ?: super.selectionBackgroundColor
        override val selectionForegroundColor: Color
            get() = additionalColors["colorSelectionForeground"] ?: super.selectionForegroundColor
        override val focusRingColor: Color
            get() = additionalColors["colorFocusRing"] ?: super.focusRingColor
        override val separatorPrimaryColor: Color
            get() = additionalColors["colorSeparatorPrimary"] ?: super.separatorPrimaryColor
        override val separatorSecondaryColor: Color
            get() = additionalColors["colorSeparatorSecondary"] ?: super.separatorSecondaryColor
        override val markColor: Color
            get() = additionalColors["colorMark"] ?: super.markColor
        override val echoColor: Color
            get() = additionalColors["colorEcho"] ?: super.echoColor
    }
}

private fun getDarkColorScheme(
    name: String, colors: Array<Color>,
    additionalColors: Map<String, Color>
): AuroraColorScheme {
    require(colors.size == 7) { "Color encoding must have 7 components" }
    return object : BaseDarkColorScheme(name) {
        // Base
        override val ultraLightColor: Color
            get() = colors[0]
        override val extraLightColor: Color
            get() = colors[1]
        override val lightColor: Color
            get() = colors[2]
        override val midColor: Color
            get() = colors[3]
        override val darkColor: Color
            get() = colors[4]
        override val ultraDarkColor: Color
            get() = colors[5]
        override val foregroundColor: Color
            get() = colors[6]

        // Derived
        override val lineColor: Color
            get() = additionalColors["colorLine"] ?: super.lineColor
        override val backgroundFillColor: Color
            get() = additionalColors["colorBackgroundFill"] ?: super.backgroundFillColor
        override val accentedBackgroundFillColor: Color
            get() = additionalColors["colorAccentedBackgroundFill"] ?: super.accentedBackgroundFillColor
        override val textBackgroundFillColor: Color
            get() = additionalColors["colorTextBackgroundFill"] ?: super.textBackgroundFillColor
        override val selectionBackgroundColor: Color
            get() = additionalColors["colorSelectionBackground"] ?: super.selectionBackgroundColor
        override val selectionForegroundColor: Color
            get() = additionalColors["colorSelectionForeground"] ?: super.selectionForegroundColor
        override val focusRingColor: Color
            get() = additionalColors["colorFocusRing"] ?: super.focusRingColor
        override val separatorPrimaryColor: Color
            get() = additionalColors["colorSeparatorPrimary"] ?: super.separatorPrimaryColor
        override val separatorSecondaryColor: Color
            get() = additionalColors["colorSeparatorSecondary"] ?: super.separatorSecondaryColor
        override val markColor: Color
            get() = additionalColors["colorMark"] ?: super.markColor
        override val echoColor: Color
            get() = additionalColors["colorEcho"] ?: super.echoColor
    }
}
