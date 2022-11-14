package com.example.compositions

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.min

@Composable
fun UnifyAnalogClock(
    hour: Int,
    minute: Int,
    outlineColor: Color = Color.Black,
    outlineWidth: Dp = 8.dp,
    fillColor: Color = Color.Gray,
    hourHandColor: Color = Color.DarkGray,
    minuteHandColor: Color = Color.LightGray,
    hourMarkerColor: Color = Color.Black,
    centerColor: Color = Color.Red,
    modifier: Modifier = Modifier
) {
    with(LocalDensity.current) {
        val outlineWidthPx = remember(outlineWidth) {
            outlineWidth.toPx()
        }

        Canvas(modifier = modifier) {
            val diameter = min(size.width, size.height) * 0.8
            val radius: Float = (diameter / 2).toFloat()
            drawCircle(
                color = fillColor,
                radius = radius
            )

            drawCircle(
                color = outlineColor,
                radius = radius,
                style = Stroke(outlineWidthPx)
            )

            drawCircle(
                color = centerColor,
                radius = radius * 0.1f,
            )

            val hourMarkerLength = radius / 10f

            repeat(12) {
                rotate(it/12f * 360) {
                    val start = center - Offset(0f, radius)
                    val end = start + Offset(0f, hourMarkerLength)

                    drawLine(
                        color = hourMarkerColor,
                        start = start,
                        end = end,
                        strokeWidth = outlineWidthPx
                    )
                }
            }
            val minuteRatio = minute/60f
            val hourRatio = (hour + minuteRatio)/ 12f

            rotate(minuteRatio * 360) {
                drawLine(
                    color = minuteHandColor,
                    start = center - Offset(0f, radius*0.9f),
                    end = center,
                    strokeWidth = outlineWidthPx
                )
            }

            rotate(hourRatio * 360) {
                drawLine(
                    color = hourHandColor,
                    start = center - Offset(0f, radius*0.6f),
                    end = center,
                    strokeWidth = outlineWidthPx
                )
            }

        }
    }
}
