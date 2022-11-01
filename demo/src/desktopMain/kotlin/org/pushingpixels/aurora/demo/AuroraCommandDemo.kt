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
package org.pushingpixels.aurora.demo

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.rememberWindowState
import org.pushingpixels.aurora.component.model.*
import org.pushingpixels.aurora.component.projection.CheckBoxProjection
import org.pushingpixels.aurora.component.projection.CommandButtonProjection
import org.pushingpixels.aurora.component.projection.CommandButtonStripProjection
import org.pushingpixels.aurora.component.projection.LabelProjection
import org.pushingpixels.aurora.demo.svg.material.*
import org.pushingpixels.aurora.demo.svg.radiance_menu
import org.pushingpixels.aurora.demo.svg.tango.*
import org.pushingpixels.aurora.theming.*
import org.pushingpixels.aurora.window.AuroraWindow
import org.pushingpixels.aurora.window.AuroraWindowScope
import org.pushingpixels.aurora.window.auroraApplication
import java.text.MessageFormat
import java.util.*

fun main() = auroraApplication {
    val state = rememberWindowState(
        placement = WindowPlacement.Floating,
        position = WindowPosition.Aligned(Alignment.Center),
        size = DpSize(800.dp, 480.dp)
    )
    var skin by remember { mutableStateOf(marinerSkin()) }
    val resourceBundle by derivedStateOf {
        ResourceBundle.getBundle("org.pushingpixels.aurora.demo.Resources", applicationLocale)
    }

    AuroraWindow(
        skin = skin,
        title = "Aurora Demo",
        icon = radiance_menu(),
        iconFilterStrategy = IconFilterStrategy.ThemedFollowText,
        state = state,
        undecorated = true,
        onCloseRequest = ::exitApplication,
    ) {
        DemoCommandContent({ skin = it }, resourceBundle)
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun DemoCommandRow(
    title: String,
    commandActionOnly: Command,
    commandSecondaryOnly: Command,
    commandActionAndSecondary: Command,
    presentationState: CommandButtonPresentationState,
    backgroundAppearanceStrategy: BackgroundAppearanceStrategy,
    overlays: Map<Command, CommandButtonPresentationModel.Overlay>
) {
    // Resolve the default text style to get the default font size
    val resolvedTextStyle = resolveAuroraDefaults()
    val fontSize = resolvedTextStyle.fontSize
    // Compute a smaller font size
    val smallerFontSize = TextUnit(fontSize.value - 4.0f, fontSize.type)
    // And create our own text style with smaller font size and bold weight
    val textStyle = TextStyle(
        fontSize = smallerFontSize,
        fontWeight = FontWeight.Bold
    )

    Column(modifier = Modifier.wrapContentHeight().fillMaxWidth().padding(vertical = 8.dp)) {
        LabelProjection(
            contentModel = LabelContentModel(text = title.uppercase()),
            presentationModel = LabelPresentationModel(textStyle = textStyle)
        ).project()

        Row {
            CommandButtonProjection(
                contentModel = commandActionOnly,
                presentationModel = CommandButtonPresentationModel(
                    presentationState = presentationState,
                    backgroundAppearanceStrategy = backgroundAppearanceStrategy
                )
            ).project()

            Spacer(modifier = Modifier.width(8.dp))

            CommandButtonProjection(
                contentModel = commandSecondaryOnly,
                presentationModel = CommandButtonPresentationModel(
                    presentationState = presentationState,
                    backgroundAppearanceStrategy = backgroundAppearanceStrategy
                )
            ).project()

            Spacer(modifier = Modifier.width(8.dp))

            CommandButtonProjection(
                contentModel = commandActionAndSecondary,
                presentationModel = CommandButtonPresentationModel(
                    presentationState = presentationState,
                    backgroundAppearanceStrategy = backgroundAppearanceStrategy,
                    textClick = TextClick.Action
                )
            ).project()

            Spacer(modifier = Modifier.width(8.dp))

            CommandButtonProjection(
                contentModel = commandActionAndSecondary,
                presentationModel = CommandButtonPresentationModel(
                    presentationState = presentationState,
                    backgroundAppearanceStrategy = backgroundAppearanceStrategy,
                    textClick = TextClick.Popup
                ),
                overlays = overlays
            ).project()
        }
    }
}

enum class CommandDemoAlignment {
    Center, Left, Right, Fill
}

@Stable
data class CommandDemoStyle(
    val bold: Boolean,
    val italic: Boolean,
    val underline: Boolean,
    val strikethrough: Boolean
)

@Composable
fun CommandDemoJustifyStrip(
    enabled: Boolean,
    backgroundAppearanceStrategy: BackgroundAppearanceStrategy,
    orientation: StripOrientation,
    alignment: CommandDemoAlignment,
    onAlignmentChanged: (CommandDemoAlignment) -> Unit,
    horizontalGapScaleFactor: Float,
    resourceBundle: ResourceBundle
) {
    val commandAlignCenter =
        Command(
            text = resourceBundle.getString("Justify.center"),
            icon = format_justify_center(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = (alignment == CommandDemoAlignment.Center),
            onTriggerActionToggleSelectedChange = {
                if (it) onAlignmentChanged(CommandDemoAlignment.Center)
            }
        )
    val commandAlignLeft =
        Command(
            text = resourceBundle.getString("Justify.left"),
            icon = format_justify_left(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = (alignment == CommandDemoAlignment.Left),
            onTriggerActionToggleSelectedChange = {
                if (it) onAlignmentChanged(CommandDemoAlignment.Left)
            }
        )
    val commandAlignRight =
        Command(
            text = resourceBundle.getString("Justify.right"),
            icon = format_justify_right(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = (alignment == CommandDemoAlignment.Right),
            onTriggerActionToggleSelectedChange = {
                if (it) onAlignmentChanged(CommandDemoAlignment.Right)
            }
        )
    val commandAlignFill =
        Command(
            text = resourceBundle.getString("Justify.fill"),
            icon = format_justify_fill(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = (alignment == CommandDemoAlignment.Fill),
            onTriggerActionToggleSelectedChange = {
                if (it) onAlignmentChanged(CommandDemoAlignment.Fill)
            }
        )

    CommandButtonStripProjection(
        contentModel = CommandGroup(
            commands = listOf(
                commandAlignCenter,
                commandAlignLeft,
                commandAlignRight,
                commandAlignFill
            )
        ),
        presentationModel = CommandStripPresentationModel(
            orientation = orientation,
            horizontalGapScaleFactor = horizontalGapScaleFactor,
            backgroundAppearanceStrategy = backgroundAppearanceStrategy
        )
    ).project()
}

@Composable
fun CommandDemoEditStrip(
    actionEnabled: Boolean,
    popupEnabled: Boolean,
    backgroundAppearanceStrategy: BackgroundAppearanceStrategy,
    orientation: StripOrientation,
    horizontalGapScaleFactor: Float,
    resourceBundle: ResourceBundle
) {
    val commandCut =
        Command(
            text = resourceBundle.getString("Edit.cut.text"),
            icon = content_cut_black_24dp(),
            isActionEnabled = actionEnabled,
            action = { println("Cut!") }

        )
    val commandCopy =
        Command(
            text = resourceBundle.getString("Edit.copy.text"),
            icon = content_copy_black_24dp(),
            isActionEnabled = actionEnabled,
            action = { println("Copy!") }

        )

    var togglePasteText by remember { mutableStateOf(false) }
    val commandPasteTextOnly = Command(
        text = resourceBundle.getString("Edit.paste.textOnlyText"),
        action = { println("Paste text only") },
        isActionToggle = true,
        isActionToggleSelected = togglePasteText,
        onTriggerActionToggleSelectedChange = {
            println("Selected toggle paste text? $it")
            togglePasteText = it
        }
    )

    val commandPaste =
        Command(
            text = resourceBundle.getString("Edit.paste.text"),
            icon = content_paste_black_24dp(),
            isActionEnabled = actionEnabled,
            action = { println("Paste!") },
            secondaryContentModel = CommandMenuContentModel(
                group = CommandGroup(
                    commands = listOf(
                        Command(
                            text = resourceBundle.getString("Edit.paste.keepFormattingText"),
                            action = { println("Paste with keep formatting") }),
                        Command(
                            text = resourceBundle.getString("Edit.paste.mergeFormattingText"),
                            action = { println("Paste with merge formatting") }),
                        commandPasteTextOnly,
                    )
                ),
                panelContentModel = getQuickStylesContentModel(resourceBundle)
            ),
            isSecondaryEnabled = popupEnabled
        )

    CommandButtonStripProjection(
        contentModel = CommandGroup(
            commands = listOf(
                commandCopy,
                commandCut,
                commandPaste
            )
        ),
        presentationModel = CommandStripPresentationModel(
            orientation = orientation,
            horizontalGapScaleFactor = horizontalGapScaleFactor,
            iconEnabledFilterStrategy = IconFilterStrategy.ThemedFollowText,
            iconDisabledFilterStrategy = IconFilterStrategy.ThemedFollowText,
            iconActiveFilterStrategy = IconFilterStrategy.ThemedFollowText,
            backgroundAppearanceStrategy = backgroundAppearanceStrategy
        ),
        overlays = mapOf(
            commandPasteTextOnly to CommandButtonPresentationModel.Overlay(
                toDismissPopupsOnActivation = false
            ),
            commandPaste to CommandButtonPresentationModel.Overlay(
                popupMenuPresentationModel = CommandPopupMenuPresentationModel(
                    panelPresentationModel = CommandPopupMenuPanelPresentationModel(
                        layoutSpec = MenuPopupPanelLayoutSpec(columnCount = 5, visibleRowCount = 3),
                        contentPadding = PaddingValues(0.dp),
                        showGroupLabels = true,
                        commandPresentationState = CommandButtonPresentationState.BigFitToIcon,
                        commandIconDimension = 24.dp,
                        iconActiveFilterStrategy = IconFilterStrategy.ThemedFollowText,
                        iconEnabledFilterStrategy = IconFilterStrategy.ThemedFollowText
                    )
                )
            )
        )
    ).project()
}

@Composable
fun CommandDemoStyleStrip2(
    enabled: Boolean,
    backgroundAppearanceStrategy: BackgroundAppearanceStrategy,
    orientation: StripOrientation,
    style: CommandDemoStyle,
    onStyleChanged: (CommandDemoStyle) -> Unit,
    horizontalGapScaleFactor: Float,
    resourceBundle: ResourceBundle
) {
    val commandBold =
        Command(
            text = resourceBundle.getString("FontStyle.bold.title"),
            icon = format_bold_black_24dp(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = style.bold,
            onTriggerActionToggleSelectedChange = {
                onStyleChanged.invoke(style.copy(bold = it))
                println("Selected bold? $it")
            }
        )
    val commandItalic =
        Command(
            text = resourceBundle.getString("FontStyle.italic.title"),
            icon = format_italic_black_24dp(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = style.italic,
            onTriggerActionToggleSelectedChange = {
                onStyleChanged.invoke(style.copy(italic = it))
                println("Selected italic? $it")
            }
        )
    val commandUnderline =
        Command(
            text = resourceBundle.getString("FontStyle.underline.title"),
            icon = format_underlined_black_24dp(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = style.underline,
            onTriggerActionToggleSelectedChange = {
                onStyleChanged.invoke(style.copy(underline = it))
                println("Selected underline? $it")
            }
        )
    val commandStrikethrough =
        Command(
            text = resourceBundle.getString("FontStyle.strikethrough.title"),
            icon = format_strikethrough_black_24dp(),
            isActionEnabled = enabled,
            isActionToggle = true,
            isActionToggleSelected = style.strikethrough,
            onTriggerActionToggleSelectedChange = {
                onStyleChanged.invoke(style.copy(strikethrough = it))
                println("Selected strikethrough? $it")
            }
        )

    CommandButtonStripProjection(
        contentModel = CommandGroup(
            commands = listOf(
                commandBold,
                commandItalic,
                commandUnderline,
                commandStrikethrough
            )
        ),
        presentationModel = CommandStripPresentationModel(
            orientation = orientation,
            horizontalGapScaleFactor = horizontalGapScaleFactor,
            iconEnabledFilterStrategy = IconFilterStrategy.ThemedFollowText,
            iconDisabledFilterStrategy = IconFilterStrategy.ThemedFollowText,
            iconActiveFilterStrategy = IconFilterStrategy.ThemedFollowText,
            backgroundAppearanceStrategy = backgroundAppearanceStrategy
        )
    ).project()
}

@Composable
fun AuroraWindowScope.DemoCommandContent(
    onSkinChange: (AuroraSkinDefinition) -> Unit,
    resourceBundle: ResourceBundle
) {
    var selected by remember { mutableStateOf(false) }
    var actionEnabled by remember { mutableStateOf(true) }
    var popupEnabled by remember { mutableStateOf(true) }
    var flat by remember { mutableStateOf(false) }

    val backgroundAppearanceStrategy by derivedStateOf {
        if (flat) BackgroundAppearanceStrategy.Flat
        else BackgroundAppearanceStrategy.Always
    }

    val commandActionOnly =
        Command(
            text = resourceBundle.getString("Action.text"),
            extraText = resourceBundle.getString("Action.textExtra"),
            icon = accessories_text_editor(),
            action = { println("Action activated!") },
            isActionEnabled = actionEnabled,
            actionPreview = object : CommandActionPreview {
                override fun onCommandPreviewActivated(command: Command) {
                    println("Action preview activated!")
                }

                override fun onCommandPreviewCanceled(command: Command) {
                    println("Action preview canceled!")
                }
            },
            actionRichTooltip = RichTooltip(
                title = resourceBundle.getString("Tooltip.textActionTitle"),
                mainIcon = user_home(),
                descriptionSections = listOf(
                    resourceBundle.getString("Tooltip.textParagraph1"),
                    resourceBundle.getString("Tooltip.textParagraph2")
                ),
                footerIcon = help_browser(),
                footerSections = listOf(
                    resourceBundle.getString("Tooltip.textFooterParagraph1")
                )
            )
        )

    val commandActionOnlyNoIcon =
        Command(
            text = resourceBundle.getString("Action.text"),
            extraText = resourceBundle.getString("Action.textExtra"),
            action = { println("Action 2 activated!") },
            isActionEnabled = actionEnabled,
            actionPreview = object : CommandActionPreview {
                override fun onCommandPreviewActivated(command: Command) {
                    println("Action 2 preview activated!")
                }

                override fun onCommandPreviewCanceled(command: Command) {
                    println("Action 2 preview canceled!")
                }
            }
        )

    val commandActionToggle =
        Command(
            text = resourceBundle.getString("Control.button.toggle"),
            icon = computer(),
            isActionEnabled = actionEnabled,
            isActionToggle = true,
            isActionToggleSelected = selected,
            onTriggerActionToggleSelectedChange = {
                selected = it
                println("Toggle selected? $selected")
            }
        )

    val entrySimpleMf = MessageFormat(resourceBundle.getString("Group.entrySimple"))
    val commandSecondaryOnly =
        Command(
            text = resourceBundle.getString("Popup.text"),
            extraText = resourceBundle.getString("Popup.textExtra"),
            icon = computer(),
            isSecondaryEnabled = popupEnabled,
            secondaryContentModel = CommandMenuContentModel(
                CommandGroup(
                    title = resourceBundle.getString("Group.titleSimple"),
                    commands = listOf(
                        Command(
                            text = entrySimpleMf.format(arrayOf<Any>(1)),
                            icon = computer(),
                            action = { println("popup1 activated!") },
                            isActionEnabled = actionEnabled
                        ),
                        Command(
                            text = entrySimpleMf.format(arrayOf<Any>(2)),
                            icon = computer(),
                            action = { println("popup2 activated!") },
                            isActionEnabled = actionEnabled
                        ),
                        Command(
                            text = entrySimpleMf.format(arrayOf<Any>(3)),
                            icon = computer(),
                            action = { println("popup3 activated!") },
                            isActionEnabled = actionEnabled
                        )
                    )
                )
            ),
            secondaryRichTooltip = RichTooltip(
                title = resourceBundle.getString("Tooltip.textPopupTitle"),
                mainIcon = user_home(),
                descriptionSections = listOf(
                    resourceBundle.getString("Tooltip.textParagraph1"),
                    resourceBundle.getString("Tooltip.textParagraph2")
                ),
                footerIcon = help_browser(),
                footerSections = listOf(
                    resourceBundle.getString("Tooltip.textFooterParagraph1")
                )
            )
        )

    val secondaryCommand1 = Command(
        text = entrySimpleMf.format(arrayOf<Any>(1)),
        icon = computer(),
        action = { println("secondary 1 activated!") },
        isActionEnabled = actionEnabled
    )
    val secondaryCommand2 = Command(
        text = entrySimpleMf.format(arrayOf<Any>(2)),
        icon = computer(),
        action = { println("secondary 2 activated!") },
        isActionEnabled = actionEnabled
    )
    val secondaryCommand3 = Command(
        text = entrySimpleMf.format(arrayOf<Any>(3)),
        icon = computer(),
        action = { println("secondary 3 activated!") },
        isActionEnabled = actionEnabled
    )
    val entryMf = MessageFormat(resourceBundle.getString("Group.entry"))
    val entryExtraMf = MessageFormat(resourceBundle.getString("Group.entryExtra"))
    val secondaryCommand4 = Command(
        text = entrySimpleMf.format(arrayOf<Any>(4)),
        icon = computer(),
        action = { println("secondary 4 activated!") },
        isActionEnabled = actionEnabled,
        secondaryContentModel = CommandMenuContentModel(
            group = CommandGroup(
                title = resourceBundle.getString("Group.titleSimple"),
                commands = listOf(
                    Command(
                        text = entryMf.format(arrayOf<Any>(4, 1)),
                        extraText = entryExtraMf.format(arrayOf<Any>(4, 1)),
                        icon = computer(),
                        action = { println("secondary 4/1 activated!") },
                        isActionEnabled = actionEnabled
                    ),
                    Command(
                        text = entryMf.format(arrayOf<Any>(4, 2)),
                        extraText = entryExtraMf.format(arrayOf<Any>(4, 2)),
                        icon = computer(),
                        action = { println("secondary 4/2 activated!") },
                        isActionEnabled = actionEnabled
                    ),
                    Command(
                        text = entryMf.format(arrayOf<Any>(4, 3)),
                        extraText = entryExtraMf.format(arrayOf<Any>(4, 3)),
                        icon = computer(),
                        action = { println("secondary 4/3 activated!") },
                        isActionEnabled = actionEnabled
                    )
                )
            )
        ),
        isSecondaryEnabled = popupEnabled
    )

    val secondaryCommand5 = Command(
        text = entrySimpleMf.format(arrayOf<Any>(5)),
        icon = computer(),
        action = { println("secondary 5 activated!") },
        isActionEnabled = actionEnabled,
        secondaryContentModel = CommandMenuContentModel(
            group = CommandGroup(
                title = resourceBundle.getString("Group.titleSimple"),
                commands = listOf(
                    Command(
                        text = entryMf.format(arrayOf<Any>(5, 1)),
                        extraText = entryExtraMf.format(arrayOf<Any>(5, 1)),
                        icon = computer(),
                        action = { println("secondary 5/1 activated!") },
                        isActionEnabled = actionEnabled
                    ),
                    Command(
                        text = entryMf.format(arrayOf<Any>(5, 2)),
                        extraText = entryExtraMf.format(arrayOf<Any>(5, 2)),
                        icon = computer(),
                        action = { println("secondary 5/2 activated!") },
                        isActionEnabled = actionEnabled
                    ),
                    Command(
                        text = entryMf.format(arrayOf<Any>(5, 3)),
                        extraText = entryExtraMf.format(arrayOf<Any>(5, 3)),
                        icon = computer(),
                        action = { println("secondary 5/3 activated!") },
                        isActionEnabled = actionEnabled
                    )
                )
            )
        ),
        isSecondaryEnabled = popupEnabled
    )

    val groupMf = MessageFormat(resourceBundle.getString("Group.title"))
    val commandActionAndSecondary =
        Command(
            text = resourceBundle.getString("Mixed.text"),
            extraText = resourceBundle.getString("Mixed.textExtra"),
            icon = computer(),
            action = { println("Split activated!") },
            actionPreview = object : CommandActionPreview {
                override fun onCommandPreviewActivated(command: Command) {
                    println("Both preview activated!")
                }

                override fun onCommandPreviewCanceled(command: Command) {
                    println("Both preview canceled!")
                }
            },
            actionRichTooltip = RichTooltip(
                title = resourceBundle.getString("Tooltip.textActionTitle"),
                mainIcon = user_home(),
                descriptionSections = listOf(
                    resourceBundle.getString("Tooltip.textParagraph1"),
                    resourceBundle.getString("Tooltip.textParagraph2")
                ),
                footerIcon = help_browser(),
                footerSections = listOf(
                    resourceBundle.getString("Tooltip.textFooterParagraph1")
                )
            ),
            isActionEnabled = actionEnabled,
            isSecondaryEnabled = popupEnabled,
            secondaryContentModel = CommandMenuContentModel(
                groups = listOf(
                    CommandGroup(
                        title = groupMf.format(arrayOf<Any>(1)),
                        commands = listOf(secondaryCommand1, secondaryCommand2, secondaryCommand3)
                    ),
                    CommandGroup(
                        title = groupMf.format(arrayOf<Any>(2)),
                        commands = listOf(secondaryCommand4, secondaryCommand5)
                    )
                )
            ),
            secondaryRichTooltip = RichTooltip(
                title = resourceBundle.getString("Tooltip.textPopupTitle"),
                mainIcon = user_home(),
                descriptionSections = listOf(
                    resourceBundle.getString("Tooltip.textParagraph1"),
                    resourceBundle.getString("Tooltip.textParagraph2")
                ),
                footerIcon = help_browser(),
                footerSections = listOf(
                    resourceBundle.getString("Tooltip.textFooterParagraph1")
                )
            )
        )

    val overlays = hashMapOf<Command, CommandButtonPresentationModel.Overlay>()
    // Configure one of our secondary commands to use a different presentation state
    // for its popup menu content
    overlays[secondaryCommand5] = CommandButtonPresentationModel.Overlay(
        popupMenuPresentationModel = CommandPopupMenuPresentationModel(
            menuPresentationState = CommandButtonPresentationState.Tile
        )
    )

    var alignment by remember { mutableStateOf(CommandDemoAlignment.Center) }
    var style by remember { mutableStateOf(CommandDemoStyle(
        bold = false,
        italic  = true,
        underline  = false,
        strikethrough  = false
    )) }

    Row(modifier = Modifier.fillMaxSize().padding(4.dp)) {
        Box(modifier = Modifier.padding(8.dp)) {
            CommandDemoJustifyStrip(
                enabled = actionEnabled,
                backgroundAppearanceStrategy = backgroundAppearanceStrategy,
                orientation = StripOrientation.Vertical,
                alignment = alignment,
                onAlignmentChanged = { alignment = it },
                horizontalGapScaleFactor = 0.7f,
                resourceBundle = resourceBundle
            )
        }
        Box(modifier = Modifier.padding(8.dp)) {
            CommandDemoStyleStrip2(
                enabled = actionEnabled,
                backgroundAppearanceStrategy = backgroundAppearanceStrategy,
                orientation = StripOrientation.Vertical,
                style = style,
                onStyleChanged = { style = it },
                horizontalGapScaleFactor = 0.7f,
                resourceBundle = resourceBundle
            )
        }

        Column(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Row(modifier = Modifier.wrapContentHeight().fillMaxWidth()) {
                AuroraSkinSwitcher(onSkinChange = onSkinChange)

                Spacer(modifier = Modifier.width(8.dp))

                AuroraLocaleSwitcher(resourceBundle)
            }

            Row(modifier = Modifier.wrapContentHeight().fillMaxWidth().padding(vertical = 8.dp)) {
                CheckBoxProjection(contentModel = SelectorContentModel(
                    text = resourceBundle.getString("Action.enabled"),
                    selected = actionEnabled,
                    onClick = { actionEnabled = !actionEnabled }
                )).project()
                Spacer(modifier = Modifier.width(8.dp))
                CheckBoxProjection(contentModel = SelectorContentModel(
                    text = resourceBundle.getString("Popup.enabled"),
                    selected = popupEnabled,
                    onClick = { popupEnabled = !popupEnabled }
                )).project()
                Spacer(modifier = Modifier.width(8.dp))
                CheckBoxProjection(contentModel = SelectorContentModel(
                    text = resourceBundle.getString("Flat.look"),
                    selected = flat,
                    onClick = { flat = !flat }
                )).project()
            }

            Row(modifier = Modifier.wrapContentHeight().fillMaxWidth().padding(vertical = 8.dp)) {
                CommandButtonProjection(
                    contentModel = commandActionOnlyNoIcon,
                    presentationModel = CommandButtonPresentationModel(
                        backgroundAppearanceStrategy = backgroundAppearanceStrategy
                    )
                ).project()
                Spacer(modifier = Modifier.width(8.dp))
                CommandButtonProjection(
                    contentModel = commandActionToggle,
                    presentationModel = CommandButtonPresentationModel(
                        backgroundAppearanceStrategy = backgroundAppearanceStrategy
                    )
                ).project()
                Spacer(modifier = Modifier.width(8.dp))
                CommandDemoJustifyStrip(
                    enabled = actionEnabled,
                    backgroundAppearanceStrategy = backgroundAppearanceStrategy,
                    orientation = StripOrientation.Horizontal,
                    alignment = alignment,
                    onAlignmentChanged = { alignment = it },
                    horizontalGapScaleFactor = CommandStripSizingConstants.DefaultGapScaleFactorPrimaryAxis,
                    resourceBundle = resourceBundle
                )
                Spacer(modifier = Modifier.width(8.dp))
                CommandDemoStyleStrip2(
                    enabled = actionEnabled,
                    backgroundAppearanceStrategy = backgroundAppearanceStrategy,
                    orientation = StripOrientation.Horizontal,
                    style = style,
                    onStyleChanged = { style = it },
                    horizontalGapScaleFactor = CommandStripSizingConstants.DefaultGapScaleFactorPrimaryAxis,
                    resourceBundle = resourceBundle
                )
                Spacer(modifier = Modifier.width(8.dp))
                CommandDemoEditStrip(
                    actionEnabled = actionEnabled,
                    popupEnabled = popupEnabled,
                    backgroundAppearanceStrategy = backgroundAppearanceStrategy,
                    orientation = StripOrientation.Horizontal,
                    horizontalGapScaleFactor = CommandStripSizingConstants.DefaultGapScaleFactorPrimaryAxis,
                    resourceBundle = resourceBundle
                )
            }

            DemoCommandRow(
                resourceBundle.getString("CommandButton.state.small"),
                commandActionOnly,
                commandSecondaryOnly,
                commandActionAndSecondary,
                CommandButtonPresentationState.Small,
                backgroundAppearanceStrategy,
                overlays
            )

            DemoCommandRow(
                resourceBundle.getString("CommandButton.state.medium"),
                commandActionOnly,
                commandSecondaryOnly,
                commandActionAndSecondary,
                CommandButtonPresentationState.Medium,
                backgroundAppearanceStrategy,
                overlays
            )

            DemoCommandRow(
                resourceBundle.getString("CommandButton.state.tile"),
                commandActionOnly,
                commandSecondaryOnly,
                commandActionAndSecondary,
                CommandButtonPresentationState.Tile,
                backgroundAppearanceStrategy,
                overlays
            )

            DemoCommandRow(
                resourceBundle.getString("CommandButton.state.big"),
                commandActionOnly,
                commandSecondaryOnly,
                commandActionAndSecondary,
                CommandButtonPresentationState.Big,
                backgroundAppearanceStrategy,
                overlays
            )
        }
    }
}



