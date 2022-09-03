package com.example.design

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UnifyButtonSmallType(
    buttonText: String,
    onClickButton : () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(
            onClick = onClickButton,
            border = BorderStroke(1.dp, color = Color.Black),
            shape = MaterialTheme.shapes.large
        ) {
            UnifyText(
                text = buttonText,
                fontSize = 10.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

    }
}