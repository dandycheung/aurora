/*
 * Copyright 2020-2022 Aurora, Kirill Grouchnikov
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
package org.pushingpixels.aurora.tools.screenshot

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.ImageComposeScene
import androidx.compose.ui.awt.ComposeWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.rememberWindowState
import org.pushingpixels.aurora.common.AuroraInternalApi
import org.pushingpixels.aurora.theming.*
import org.pushingpixels.aurora.tools.screenshot.svg.radiance_menu
import org.pushingpixels.aurora.window.AuroraApplicationScope
import org.pushingpixels.aurora.window.AuroraWindow
import java.io.File
import java.util.concurrent.atomic.AtomicInteger

@OptIn(AuroraInternalApi::class)
@Composable
fun AuroraApplicationScope.screenshot(
    skin: AuroraSkinDefinition,
    filename: String,
    toolbarIconEnabledFilterStrategy : IconFilterStrategy = IconFilterStrategy.Original,
    counter: AtomicInteger
) {
    val title = "Aurora"
    val icon = radiance_menu()
    val size = DpSize(340.dp, 258.dp)
    val state = rememberWindowState(
        placement = WindowPlacement.Floating,
        position = WindowPosition.Aligned(Alignment.Center),
        size = size
    )

    val density = LocalDensity.current
    AuroraWindow(
        skin = skin,
        title = title,
        state = state,
        undecorated = true,
        icon = icon,
        onCloseRequest = ::exitApplication
    ) {
        val scene = ImageComposeScene(
            width = (size.width.value * density.density).toInt(),
            height = (size.height.value * density.density).toInt()
        ) {
            CompositionLocalProvider(
                LocalWindow provides (window as ComposeWindow),
                LocalWindowSize provides size,
                LocalDensity provides density,
                LocalDecorationAreaType provides DecorationAreaType.None,
                LocalDisplayName provides skin.displayName,
                LocalSkinColors provides skin.colors,
                LocalButtonShaper provides skin.buttonShaper,
                LocalPainters provides skin.painters,
                LocalSkinTabDefinition provides skin.tabDefinition,
                LocalAnimationConfig provides AnimationConfig(),
            ) {
                ScreenshotContent(
                    windowScope = this,
                    skin = skin,
                    state = state,
                    title = title,
                    icon = icon,
                    toolbarIconEnabledFilterStrategy = toolbarIconEnabledFilterStrategy
                )
            }
        }

        LaunchedEffect(Unit) {
            val image = scene.render()
            val bytes = image.encodeToData()!!.bytes
            val file = File(filename)
            file.writeBytes(bytes)
            scene.close()
            if (counter.decrementAndGet() == 0) {
                exitApplication()
            }
        }
    }
}
