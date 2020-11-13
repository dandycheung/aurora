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
package org.pushingpixels.mosaic.components

import androidx.compose.animation.asDisposableClock
import androidx.compose.animation.core.*
import androidx.compose.animation.transition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.InteractionState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerMoveFilter
import androidx.compose.ui.platform.AnimationClockAmbient
import androidx.compose.ui.unit.dp
import org.pushingpixels.mosaic.AmbientTextColor
import org.pushingpixels.mosaic.ColorSchemeAssociationKind
import org.pushingpixels.mosaic.ComponentState
import org.pushingpixels.mosaic.MosaicSkin
import org.pushingpixels.mosaic.utils.*
import java.util.*

// This will be initialized on first usage using the getSelectedTransitionDefinition
// with duration animation coming from [AmbientAnimationConfig]
private lateinit var SelectedTransitionDefinition: TransitionDefinition<ButtonState>

// This will be initialized on first usage using the getRolloverTransitionDefinition
// with duration animation coming from [AmbientAnimationConfig]
private lateinit var RolloverTransitionDefinition: TransitionDefinition<Boolean>

@Immutable
private class ButtonDrawingCache(
    val colorScheme: MutableColorScheme = MutableColorScheme(
        displayName = "Internal mutable",
        ultraLight = Color.White,
        extraLight = Color.White,
        light = Color.White,
        mid = Color.White,
        dark = Color.White,
        ultraDark = Color.White,
        foreground = Color.Black
    )
)

@Composable
fun MosaicToggleButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: Shape = MosaicSkin.shapes.regular,
    content: @Composable RowScope.() -> Unit
) {
    MosaicToggleButton(
        modifier = modifier,
        onClick = onClick,
        shape = shape,
        stateTransitionFloat = AnimatedFloat(0.0f, AnimationClockAmbient.current.asDisposableClock()),
        content = content
    )
}

@Composable
private fun MosaicToggleButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: Shape = MosaicSkin.shapes.regular,
    stateTransitionFloat: AnimatedFloat,
    content: @Composable RowScope.() -> Unit
) {
    val state = remember { InteractionState() }
    val drawingCache = remember { ButtonDrawingCache() }

    val selectedState = remember { mutableStateOf(ButtonState.IDLE) }
    val rolloverState = remember { mutableStateOf(false) }

    val modelStateInfo = remember {
        ModelStateInfo(
            ComponentState.getState(
                isEnabled = true, isRollover = false,
                isSelected = false
            )
        )
    }

    val decorationAreaType = MosaicSkin.decorationArea.type

    // Transition for the selection state
    if (!::SelectedTransitionDefinition.isInitialized) {
        SelectedTransitionDefinition =
            getSelectedTransitionDefinition(MosaicSkin.animationConfig.regular)
    }
    val selectionTransitionState = transition(
        definition = SelectedTransitionDefinition,
        initState = selectedState.value,
        toState = selectedState.value
    )
    // Transition for the rollover state
    if (!::RolloverTransitionDefinition.isInitialized) {
        RolloverTransitionDefinition =
            getRolloverTransitionDefinition(MosaicSkin.animationConfig.regular)
    }
    val rolloverTransitionState = transition(
        definition = RolloverTransitionDefinition,
        initState = rolloverState.value,
        toState = rolloverState.value
    )

    // TODO - how to trigger the state transition animation without these two transitions
    // that track the changes in selected and rollover states?
    selectionTransitionState[SelectionTransitionFraction]
    rolloverTransitionState[RolloverTransitionFraction]

    val currentState = ComponentState.getState(
        isEnabled = true,
        isRollover = rolloverState.value,
        isSelected = (selectedState.value == ButtonState.SELECTED)
    )

    var duration = MosaicSkin.animationConfig.regular
    if (currentState != modelStateInfo.currModelState) {
        stateTransitionFloat.stop()
        println("******** Have new state to move to $currentState ********")
        modelStateInfo.dumpState(stateTransitionFloat.value)
        // Need to transition to the new state
        if (modelStateInfo.stateContributionMap.containsKey(currentState)) {
            println("Already has new state")
            // Going to a state that is already partially active
            val transitionPosition = modelStateInfo.stateContributionMap[currentState]!!.contribution
            duration = (duration * (1.0f - transitionPosition)).toInt()
            stateTransitionFloat.setBounds(transitionPosition, 1.0f)
            stateTransitionFloat.snapTo(transitionPosition)
        } else {
            println("Does not have new state (curr state ${modelStateInfo.currModelState}) at ${stateTransitionFloat.value}")
            stateTransitionFloat.setBounds(0.0f, 1.0f)
            stateTransitionFloat.snapTo(0.0f)
            println("\tat ${stateTransitionFloat.value}")
        }

        // Create a new contribution map
        val newContributionMap: MutableMap<ComponentState, StateContributionInfo> = HashMap()
        if (modelStateInfo.stateContributionMap.containsKey(currentState)) {
            // 1. the new state goes from current value to 1.0
            // 2. the rest go from current value to 0.0
            for ((contribState, currRange) in modelStateInfo.stateContributionMap.entries) {
                val newEnd = if (contribState == currentState) 1.0f else 0.0f
                newContributionMap[contribState] = StateContributionInfo(
                    currRange.contribution, newEnd
                )
            }
        } else {
            // 1. all existing states go from current value to 0.0
            // 2. the new state goes from 0.0 to 1.0
            for ((contribState, currRange) in modelStateInfo.stateContributionMap.entries) {
                newContributionMap[contribState] = StateContributionInfo(
                    currRange.contribution, 0.0f
                )
            }
            newContributionMap[currentState] = StateContributionInfo(0.0f, 1.0f)
        }
        modelStateInfo.stateContributionMap = newContributionMap
        modelStateInfo.sync()

        modelStateInfo.currModelState = currentState
        println("******** After moving to new state *****")
        modelStateInfo.dumpState(stateTransitionFloat.value)

        println("Animating over $duration from ${stateTransitionFloat.value} to 1.0f")
        stateTransitionFloat.animateTo(
            targetValue = 1.0f,
            anim = FloatTweenSpec(duration = duration),
            onEnd = { endReason, endValue ->
                println("Ended with reason $endReason at $endValue / ${stateTransitionFloat.value}")
                if (endReason == AnimationEndReason.TargetReached) {
                    modelStateInfo.updateActiveStates(1.0f)
                    modelStateInfo.clear()
                    println("******** After clear (target reached) ********")
                    modelStateInfo.dumpState(stateTransitionFloat.value)
                }
            }
        )

        println()
    }

    if (stateTransitionFloat.isRunning) {
        modelStateInfo.updateActiveStates(stateTransitionFloat.value)
        println("********* During animation ${stateTransitionFloat.value} to ${stateTransitionFloat.targetValue} *******")
        modelStateInfo.dumpState(stateTransitionFloat.value)
    }

    Box(
        modifier = modifier
            .pointerMoveFilter(
                onEnter = {
                    rolloverState.value = true
                    false
                },
                onExit = {
                    rolloverState.value = false
                    false
                },
                onMove = {
                    false
                })
            .clickable(onClick = {
                selectedState.value = if (selectedState.value == ButtonState.IDLE) {
                    ButtonState.SELECTED
                } else {
                    ButtonState.IDLE
                }
                onClick.invoke()
            }, interactionState = state, indication = null),
        alignment = Alignment.TopStart
    ) {
        // Populate the cached color scheme for filling the button container
        // based on the current model state info
        populateColorScheme(
            drawingCache.colorScheme, modelStateInfo, decorationAreaType,
            ColorSchemeAssociationKind.FILL
        )
        // And retrieve the container fill colors
        val fillUltraLight = drawingCache.colorScheme.ultraLightColor
        val fillExtraLight = drawingCache.colorScheme.extraLightColor
        val fillLight = drawingCache.colorScheme.lightColor
        val fillMid = drawingCache.colorScheme.midColor
        val fillDark = drawingCache.colorScheme.darkColor
        val fillUltraDark = drawingCache.colorScheme.ultraDarkColor
        
        val textColor = drawingCache.colorScheme.foregroundColor

        // Populate the cached color scheme for drawing the button border
        // based on the current model state info
        populateColorScheme(
            drawingCache.colorScheme, modelStateInfo, decorationAreaType,
            ColorSchemeAssociationKind.BORDER
        )
        // And retrieve the border colors
        val borderUltraLight = drawingCache.colorScheme.ultraLightColor
        val borderExtraLight = drawingCache.colorScheme.extraLightColor
        val borderLight = drawingCache.colorScheme.lightColor
        val borderMid = drawingCache.colorScheme.midColor
        val borderDark = drawingCache.colorScheme.darkColor
        val borderUltraDark = drawingCache.colorScheme.ultraDarkColor

        val fillPainter = MosaicSkin.painters.fillPainter
        val borderPainter = MosaicSkin.painters.borderPainter

        Canvas(modifier.matchParentSize().padding(2.dp)) {
            val width = this.size.width
            val height = this.size.height

            val outline = shape.createOutline(Size(width, height), this)

            // Populate the cached color scheme for filling the button container
            drawingCache.colorScheme.ultraLight = fillUltraLight
            drawingCache.colorScheme.extraLight = fillExtraLight
            drawingCache.colorScheme.light = fillLight
            drawingCache.colorScheme.mid = fillMid
            drawingCache.colorScheme.dark = fillDark
            drawingCache.colorScheme.ultraDark = fillUltraDark
            drawingCache.colorScheme.foreground = textColor
            fillPainter.paintContourBackground(
                this, this.size, outline, drawingCache.colorScheme
            )

            // Populate the cached color scheme for drawing the button border
            drawingCache.colorScheme.ultraLight = borderUltraLight
            drawingCache.colorScheme.extraLight = borderExtraLight
            drawingCache.colorScheme.light = borderLight
            drawingCache.colorScheme.mid = borderMid
            drawingCache.colorScheme.dark = borderDark
            drawingCache.colorScheme.ultraDark = borderUltraDark
            drawingCache.colorScheme.foreground = textColor
            borderPainter.paintBorder(
                this, this.size, outline, null, drawingCache.colorScheme
            )
        }

        // Pass our text color to the children
        Providers(AmbientTextColor provides textColor) {
            Row(
                Modifier
                    .defaultMinSizeConstraints(
                        minWidth = 64.dp,
                        minHeight = 36.dp
                    )
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                children = content
            )
        }
    }
}
