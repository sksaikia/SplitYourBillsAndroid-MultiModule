package com.example.design

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UnifyLabel(text : String, color : Color = Color(0xFF4EDD8A), modifier: Modifier = Modifier) {
    Surface(
        color = color,
        shape = RectangleShape,
        elevation = 5.dp,
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
            ) {
            UnifyText(
                text = text,
                fontSize = 10.sp,
                modifier = Modifier.padding(4.dp),
                fontColor = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

    }
}
