package com.example.feature_space.presentation.ui_composition

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.design.UnifyText

@Composable
fun UserCard(name: String = "", phoneNo: String = "", modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(horizontal = 20.dp).fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
        UnifyText(
            modifier = Modifier
                .padding(8.dp)
                .drawBehind {
                    drawCircle(
                        color = getRandomColor(),
                        radius = 60f
                    )
                },
            text = getShortName(name),
            fontColor = Color.White
        )
        Spacer(modifier = modifier.width(20.dp))
        UnifyText(text = name)
    }
}

fun getShortName(name: String): String {
    val words = name.split("\\p{Space}".toRegex()).toTypedArray()
    return if (words.isEmpty()) {
        ""
    } else if (words.size == 1) {
        words[0].toCharArray().getOrNull(0).toString()
    } else if (words.size == 2) {
        words[0].toCharArray().getOrNull(0).toString() + words[1].toCharArray().getOrNull(0).toString()
    } else {
        words[0].toCharArray().getOrNull(0).toString() + words[words.size - 1].toCharArray().getOrNull(0).toString()
    }
}

fun getRandomColor(): Color {
    val colorList = listOf<Color>(
        Color.Green,
        Color.Red,
        Color.Gray,
        Color.Magenta,
        Color.Yellow
    )
    val state = rand(0, 4)
    return colorList[state]
}

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (Math.random() * (end - start + 1)).toInt() + start
}
