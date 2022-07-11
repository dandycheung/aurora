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
package org.pushingpixels.aurora.theming.utils

import org.intellij.lang.annotations.Language
import org.jetbrains.skia.RuntimeEffect
import org.jetbrains.skia.Shader

internal fun getDuotoneEffect(): RuntimeEffect {
    // Duotone shader
    @Language("GLSL")
    val duotoneDesc = """
            uniform shader shaderInput;
            uniform vec4 colorLight;
            uniform vec4 colorDark;
            uniform float alpha;
            
            half4 main(vec2 fragcoord) { 
                vec4 inputColor = shaderInput.eval(fragcoord);
                float luma = dot(inputColor.rgb, vec3(0.299, 0.587, 0.114));
                vec4 duotone = mix(colorLight, colorDark, luma);
                return half4(duotone.r * alpha, duotone.g * alpha, duotone.b * alpha, alpha);
            }
        """

    return RuntimeEffect.makeForShader(duotoneDesc)
}

internal fun getBrushedMetalShader(): Shader {
    // Fractal noise shader
    val noiseShader = Shader.makeFractalNoise(
        baseFrequencyX = 0.45f,
        baseFrequencyY = 0.45f,
        numOctaves = 4,
        seed = 0.0f
    )

    // Brushed metal shader
    @Language("GLSL")
    val brushedMetalDesc = """
            uniform shader shaderInput;

            half4 main(vec2 fragcoord) { 
              vec4 inputColor = shaderInput.eval(vec2(0, fragcoord.y));
              // Compute the luma at the first pixel in this row
              float luma = dot(inputColor.rgb, vec3(0.299, 0.587, 0.114));
              // Apply modulation to stretch and shift the texture for the brushed metal look 
              float modulated = abs(cos((0.004 + 0.02 * luma) * (fragcoord.x + 200) + 0.26 * luma) 
                  * sin((0.06 - 0.25 * luma) * (fragcoord.x + 85) + 0.75 * luma));
              // Map 0.0-1.0 range to inverse 0.15-0.3
              float modulated2 = 0.3 - modulated / 6.5;
              half4 result = half4(modulated2, modulated2, modulated2, 1.0);
              return result;
            }
    """
    val brushedMetalEffect = RuntimeEffect.makeForShader(brushedMetalDesc)
    return brushedMetalEffect.makeShader(
        uniforms = null,
        children = arrayOf(noiseShader),
        localMatrix = null,
        isOpaque = false
    )
}

internal fun getSpecularRectangularEffect(): RuntimeEffect {
    @Language("GLSL")
    val specularRectangularDesc = """
            uniform vec4 color;
            uniform float alpha;
            uniform float width;
            uniform float height;
            uniform float topLeftCornerRadius;
            uniform float topRightCornerRadius;
            uniform float gap;
            uniform float ramp;

            vec2 start = vec2(0.0, 0.0);
            vec2 control1 = vec2(0.5, 0.1);
            vec2 control2 = vec2(0.6, 0.9);
            vec2 end = vec2(1.0, 1.0);
            
            vec2 spline(vec2 start, vec2 control1, vec2 control2, vec2 end, float t) {
                // https://en.wikipedia.org/wiki/B%C3%A9zier_curve
                float invT = 1.0 - t;
                return start * invT * invT * invT + control1 * 3.0 * t * invT * invT + control2 * 3.0 * t * t * invT + end * t * t * t;
            }

            // SDF (signed distance function) for a rounded box
            // from https://www.iquilezles.org/www/articles/distfunctions2d/distfunctions2d.htm
            float sdRoundedBox( in vec2 p, in vec2 b, in vec4 r ) {
                r.xy = (p.x > 0.0)? r.xy : r.zw;
                r.x  = (p.y > 0.0)? r.x  : r.y;
                vec2 q = abs(p) - b + r.x;
                return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r.x;  
            }

            half4 main(vec2 fragcoord) {
                // No specular highlight in bottom half
                if (fragcoord.y > height / 2.0) {
                    return half4(0.0, 0.0, 0.0, 0.0);
                }
                
                // Get distance from the edge of the box
                vec2 rectangle = vec2(width, height) / 2.0;
                vec4 radius = vec4(0.0, topRightCornerRadius, 0.0, topLeftCornerRadius);
                float distanceToClosestEdge = sdRoundedBox(
                    fragcoord - rectangle, rectangle, radius);

                // Nothing outside the box
                if (distanceToClosestEdge > 0.0) {
                    return half4(0.0, 0.0, 0.0, 0.0);
                }

                // Nothing in the gap
                if (distanceToClosestEdge >= -gap) {
                    return half4(0.0, 0.0, 0.0, 0.0);
                }
                
                // Ramp up or down between gap and ramp, also account for the downwards fade 
                // based on the Y coordinate
                if (distanceToClosestEdge >= -(gap + ramp)) {
                    float dfraction = -(distanceToClosestEdge + gap) / ramp;
                    float cfraction = (fragcoord.y - gap - ramp) / (height / 2.0 - gap - ramp);
                    float falpha = alpha * 
                        spline(start, control1, control2, end, dfraction).y *
                        spline(start, control1, control2, end, 1.0 - cfraction).y;
                    return half4(color.r * falpha, color.g * falpha, color.b * falpha, falpha); 
                }
                
                // Otherwise account for the downwards fade based on the Y coordinate
                float cfraction = (fragcoord.y - gap - ramp) / (height / 2.0 - gap - ramp);
                float falpha = alpha * spline(start, control1, control2, end, 1.0 - cfraction).y;
                return half4(color.r * falpha, color.g * falpha, color.b * falpha, falpha); 
            }
        """

    return RuntimeEffect.makeForShader(specularRectangularDesc)
}
