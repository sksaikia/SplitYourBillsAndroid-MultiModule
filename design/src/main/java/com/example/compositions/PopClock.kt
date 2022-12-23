package com.example.compositions

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.min

@Composable
fun PopAnalogClock(
    hour: Int,
    minute: Int,
    outlineColor: Color = Color.Black,
    outlineWidth: Dp = 8.dp,
    fillColor: Color = Color(0xffFFFFFF),
 //   hourHandColor: Color = Color(0xFFb4b4b4),
    hourHandColor: Color = Color(0xFF606050),
//    minuteHandColor: Color = Color(0xFFb4b4b4),
    minuteHandColor: Color = Color(0xFF606050),
    hourMarkerColor: Color = Color(0xFF319af9),
    centerColor: Color = Color(0xFF00eaff),
    modifier: Modifier = Modifier
) {
    val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
    val listColors2 = listOf(
        Color(0xFFff00e8),
        Color(0xFF9658ef),
        Color(0xFF319af9),
//        Color(0xFF00a4ff),
  //      Color(0xFF00cfff),
 //       Color(0xFF00dfff)
    )
    with(LocalDensity.current) {
        val outlineWidthPx = remember(outlineWidth) {
            outlineWidth.toPx()
        }

        Canvas(modifier = modifier) {
            val diameter = min(size.width, size.height) * 0.8
            val radius: Float = (diameter / 2).toFloat()
            drawCircle(
                color = fillColor,
                radius = radius,
            )

            drawCircle(
                brush = Brush.linearGradient(colors = listColors2),
                radius = radius,
                style = Stroke(outlineWidthPx)
            )

            drawCircle(
                color = centerColor,
                radius = radius * 0.05f,
            )

            drawCircle(
                color = centerColor,
                radius = radius * 0.05f,
            )

            drawCircle(
                color = centerColor,
                radius = radius * 0.1f,
                style = Stroke(outlineWidthPx/4)
            )

            val hourMarkerLength = radius / 7f

            repeat(12) {
                rotate(it/12f * 360) {
                    val start = center - Offset(0f, radius - outlineWidthPx/2)
                    val end = start + Offset(0f, hourMarkerLength)

                    drawLine(
                        color = hourMarkerColor,
                        start = start,
                        end = end,
                        strokeWidth = outlineWidthPx/2
                    )
                }
            }
            val minuteRatio = minute/60f
            val hourRatio = (hour + minuteRatio)/ 12f

            rotate(minuteRatio * 360) {
                drawLine(
                    color = minuteHandColor,
                    start = center - Offset(0f, radius*0.8f),
                    end = center - Offset(0f, radius * 0.1f),
                    strokeWidth = outlineWidthPx/2
                )
            }

            rotate(hourRatio * 360) {
                drawLine(
                    color = hourHandColor,
                    start = center - Offset(0f, radius*0.6f),
                    end = center - Offset(0f, radius * 0.1f),
                    strokeWidth = outlineWidthPx/2
                )
            }

        }
    }
}
