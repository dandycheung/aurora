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
package org.pushingpixels.aurora.demo.button

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.rememberWindowState
import org.pushingpixels.aurora.component.model.Command
import org.pushingpixels.aurora.component.model.CommandButtonPresentationModel
import org.pushingpixels.aurora.component.model.CommandButtonPresentationState
import org.pushingpixels.aurora.component.projection.CommandButtonProjection
import org.pushingpixels.aurora.demo.svg.radiance_menu
import org.pushingpixels.aurora.demo.svg.tango.edit_paste
import org.pushingpixels.aurora.theming.IconFilterStrategy
import org.pushingpixels.aurora.theming.marinerSkin
import org.pushingpixels.aurora.window.AuroraApplicationScope
import org.pushingpixels.aurora.window.AuroraWindow
import org.pushingpixels.aurora.window.AuroraWindowTitlePaneConfigurations
import org.pushingpixels.aurora.window.auroraApplication

fun main() = auroraApplication {
    val state = rememberWindowState(
        placement = WindowPlacement.Floating,
        position = WindowPosition.Aligned(Alignment.Center),
        size = DpSize(600.dp, 212.dp)
    )

    AuroraWindow(
        skin = marinerSkin(),
        title = "Aurora Demo",
        icon = radiance_menu(),
        iconFilterStrategy = IconFilterStrategy.ThemedFollowText,
        state = state,
        windowTitlePaneConfiguration = AuroraWindowTitlePaneConfigurations.AuroraPlain(),
        onCloseRequest = ::exitApplication,
    ) {
        ButtonGapScalingContent()
    }
}

@Composable
fun AuroraApplicationScope.ButtonGapScalingContent() {
    Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
        Row(modifier = Modifier.fillMaxWidth().padding(top = 12.dp)) {
            Box(modifier = Modifier.weight(1.0f), contentAlignment = Alignment.Center) {
                CommandButtonProjection(
                    contentModel = Command(
                        text = "hgap_scale=1.0",
                        icon = edit_paste(),
                        action = {}),
                    presentationModel = CommandButtonPresentationModel(
                        presentationState = CommandButtonPresentationState.Medium,
                        horizontalGapScaleFactor = 1.0f
                    )
                ).project()
            }
            Box(modifier = Modifier.weight(1.0f), contentAlignment = Alignment.Center) {
                CommandButtonProjection(
                    contentModel = Command(
                        text = "hgap_scale=2.0",
                        icon = edit_paste(),
                        action = {}),
                    presentationModel = CommandButtonPresentationModel(
                        presentationState = CommandButtonPresentationState.Medium,
                        horizontalGapScaleFactor = 2.0f
                    )
                ).project()
            }
            Box(modifier = Modifier.weight(1.0f), contentAlignment = Alignment.Center) {
                CommandButtonProjection(
                    contentModel = Command(
                        text = "hgap_scale=3.0",
                        icon = edit_paste(),
                        action = {}),
                    presentationModel = CommandButtonPresentationModel(
                        presentationState = CommandButtonPresentationState.Medium,
                        horizontalGapScaleFactor = 3.0f
                    )
                ).project()
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1.0f), contentAlignment = Alignment.Center) {
                CommandButtonProjection(
                    contentModel = Command(
                        text = "vgap_scale=1.0",
                        icon = edit_paste(),
                        action = {}),
                    presentationModel = CommandButtonPresentationModel(
                        presentationState = CommandButtonPresentationState.Big,
                        verticalGapScaleFactor = 1.0f
                    )
                ).project()
            }
            Box(modifier = Modifier.weight(1.0f), contentAlignment = Alignment.Center) {
                CommandButtonProjection(
                    contentModel = Command(
                        text = "vgap_scale=2.0",
                        icon = edit_paste(),
                        action = {}),
                    presentationModel = CommandButtonPresentationModel(
                        presentationState = CommandButtonPresentationState.Big,
                        verticalGapScaleFactor = 2.0f
                    )
                ).project()
            }
            Box(modifier = Modifier.weight(1.0f), contentAlignment = Alignment.Center) {
                CommandButtonProjection(
                    contentModel = Command(
                        text = "vgap_scale=3.0",
                        icon = edit_paste(),
                        action = {}),
                    presentationModel = CommandButtonPresentationModel(
                        presentationState = CommandButtonPresentationState.Big,
                        verticalGapScaleFactor = 3.0f
                    )
                ).project()
            }
        }
    }
}



