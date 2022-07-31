package com.example.design

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UnifyEditText(
    headerText : String,
    editText : String = "",
    textColor : Color = Color.Black,
    onValueChanged : (String) -> Unit = {}
) {

    Column(modifier = Modifier.fillMaxWidth()) {
        var text by remember { mutableStateOf(editText) }
        
        Spacer(modifier = Modifier.height(10.dp))
        UnifyText(text = headerText, fontSize = 12.sp , modifier = Modifier.padding(horizontal = 16.dp))

        TextField(
            value = text,
            onValueChange = {
                text = it
                onValueChanged(it)
            },
            colors = TextFieldDefaults.textFieldColors(
                textColor = textColor,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),

        )

        Divider(thickness = 1.dp , color = Color.Black , modifier = Modifier.padding(horizontal = 20.dp))
    }


}