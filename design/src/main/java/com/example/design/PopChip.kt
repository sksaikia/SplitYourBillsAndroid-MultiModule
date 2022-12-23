package com.example.design

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PopChip(
    text: String,
    randomColor : Boolean = true,
    color : Color = Color.Red,
    modifier: Modifier = Modifier
) {
    Surface(
        color = if (randomColor) { getRandomColor() } else { color},
        shape = CircleShape,
        elevation = 5.dp,
        modifier = modifier) {
        PopText(
            text = text,
            fontSize = 10.sp,
            modifier = Modifier.padding(
                horizontal = 8.dp,
                vertical = 4.dp
            )
        )
    }
}

fun getRandomColor(): Color {
    val colorList = listOf<Color>(
        Color.Green,
        Color.Red,
        Color.Gray,
        Color.Magenta,
        Color.Yellow,
    )
    val state = rand(0,4)
    return colorList[state]
}

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (Math.random() * (end - start + 1)).toInt() + start
}