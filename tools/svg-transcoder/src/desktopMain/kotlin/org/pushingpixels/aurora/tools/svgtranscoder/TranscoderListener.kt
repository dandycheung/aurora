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
package org.pushingpixels.aurora.tools.svgtranscoder

import java.io.Writer

/**
 * Transcoder listener.
 *
 * @author Kirill Grouchnikov.
 */
interface TranscoderListener {
    /**
     * Returns the writer for the Compose contents.
     *
     * @return Writer for the Compose contents.
     */
    val writer: Writer

    /**
     * Called when the transcoding process is finished.
     */
    fun finished()
}
