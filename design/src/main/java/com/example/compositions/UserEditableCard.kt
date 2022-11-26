package com.example.compositions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.design.UnifyEditTextWithoutHeader
import com.example.design.UnifyText

@Composable
fun UserEditableCard(
    name: String = "",
    phoneNo: String = "",
    onValueChangedForContribution: (String) -> Unit = {},
    onValueChangedForPayableAmount: (String) -> Unit = {},
    modifier: Modifier = Modifier,
    amount: Int = 0
) {
    val color by remember {
        mutableStateOf(getRandomColor())
    }
    Row(
        modifier = modifier.padding(horizontal = 20.dp).fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        UnifyText(
            modifier = Modifier
                .padding(8.dp)
                .drawBehind {
                    drawCircle(
                        color = color,
                        radius = 60f
                    )
                },
            text = getShortName(name).uppercase(),
            fontColor = Color.White
        )
        Spacer(modifier = modifier.width(20.dp))
        UnifyText(text = name)
        Spacer(modifier = modifier.width(40.dp))
        Column() {
            Row() {
                UnifyText(text = "Contribution:  $")
                UnifyEditTextWithoutHeader(
                    editText = amount.toString(),
                    onValueChanged = onValueChangedForContribution
                )
            }

            Row() {
                UnifyText(text = "Payable Amount:  $")
                UnifyEditTextWithoutHeader(
                    editText = amount.toString(),
                    onValueChanged = onValueChangedForPayableAmount
                )
            }
        }
    }
}

fun getShortName(name: String): String {
    val words = name.split("\\p{Space}".toRegex()).toTypedArray()
    return if (words.isEmpty()) {
        ""
    } else if (words.size == 1) {
        words[0].toCharArray().getOrNull(0).toString()
    } else if (words.size == 2) {
        words[0].toCharArray().getOrNull(0).toString() + words[1].toCharArray().getOrNull(0)
            .toString()
    } else {
        words[0].toCharArray().getOrNull(0).toString() + words[words.size - 1].toCharArray()
            .getOrNull(0).toString()
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
