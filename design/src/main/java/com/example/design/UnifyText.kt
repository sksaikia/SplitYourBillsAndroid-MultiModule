package com.example.design

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun UnifyText(
    text : String,
    modifier : Modifier = Modifier,
    fontSize : TextUnit = 14.sp,
    fontColor : Color = Color.Black,
    fontStyle: FontStyle = FontStyle.Normal,
    fontFamily: FontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        fontSize = fontSize,
        color = fontColor,
        fontStyle = fontStyle,
        fontFamily = fontFamily,
        modifier = modifier,
        fontWeight = fontWeight
    )
}