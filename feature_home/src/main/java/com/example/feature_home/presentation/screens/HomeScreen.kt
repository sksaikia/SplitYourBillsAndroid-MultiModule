package com.example.feature_home.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compositions.PopAnalogClock
import com.example.design.PopText
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navigateTo: (String) -> Unit) {
    var hour by remember {
        mutableStateOf(0)
    }

    var minute by remember {
        mutableStateOf(0)
    }

    LaunchedEffect(true) {
        while (true) {
            if ((minute + 1) > 59) {
                hour++
                minute = 0
            } else {
                minute++
            }
            delay(15)
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        PopText(text = "Feature coming soon", fontSize = 20.sp, modifier = Modifier.padding(16.dp))
        PopAnalogClock(
            hour = hour,
            minute = minute,
            modifier = Modifier.fillMaxSize()
        )

//        mermaid()
    }
}
