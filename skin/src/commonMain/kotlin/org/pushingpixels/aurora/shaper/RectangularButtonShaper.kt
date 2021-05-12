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
package org.pushingpixels.aurora.shaper

import androidx.compose.ui.graphics.drawscope.DrawScope

/**
 * Interface for rectangular-based button shapers.
 *
 * @author Kirill Grouchnikov
 */
interface RectangularButtonShaper {
    /**
     * Returns the corner radius of a button.
     *
     * @param insets Button insets.
     * @return Corner radius of a button.
     */
    fun getCornerRadius(width: Float, height: Float, insets: Float, drawScope: DrawScope): Float
}