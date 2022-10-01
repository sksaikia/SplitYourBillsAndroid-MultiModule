package com.example.design

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun UnifyEditTextWithoutHeader(
    editText: String = "",
    textColor: Color = Color.Black,
    onValueChanged: (String) -> Unit = {}
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        var text by remember { mutableStateOf(editText) }

        BasicTextField(
            value = text,
            onValueChange = {
                text = it
                onValueChanged(it)
            }

        )
    }
}
