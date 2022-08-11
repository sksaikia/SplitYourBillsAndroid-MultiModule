package com.example.design

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun UnifyChip(
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
        UnifyText(
            text = text,
            fontSize = 12.sp,
            modifier = Modifier.padding(8.dp)
        )
    }
}

fun getRandomColor(): Color {
    val colorList = listOf<Color>(
        Color.Red,
        Color.Green,
        Color.Gray,
        Color.Magenta,
        Color.Yellow,
    )
    val state = rand(0,4)
    Log.d("Fatal", "getRandomColor: $state")
    return colorList[state]
}

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (Math.random() * (end - start + 1)).toInt() + start
}