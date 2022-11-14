package com.example.feature_profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.compositions.UnifyAnalogClock
import kotlinx.coroutines.delay

@Composable
fun ProfileScreen(navigateTo: (String) -> Unit) {
//    LazyColumn {
//
//        items(10) { i ->
//            UserEditableCard("ABC $i")
//
//       }
//    }

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
        UnifyAnalogClock(
            hour = hour,
            minute = minute,
            modifier = Modifier.fillMaxSize()
        )
    }
}

