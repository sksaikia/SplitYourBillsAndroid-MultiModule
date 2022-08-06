package com.example.design

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UnifyToolBar(title : String = "Split Your Bills" , modifier: Modifier = Modifier) {
    TopAppBar(modifier = Modifier.fillMaxWidth() ) {
        UnifyText(text = title, fontSize = 24.sp)
    }
}