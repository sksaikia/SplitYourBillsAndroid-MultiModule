package com.example.feature_space.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.design.UnifyButton
import com.example.design.UnifyText

@Composable
fun ShareSpaceScreen(navigateTo : (String) -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 20.dp, vertical = 20.dp)) {
        UnifyText(text = "Space has been created. 6 members has been added.")

        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            UnifyButton(buttonText = "Add a transaction")
            Spacer(modifier = Modifier.width(20.dp))
            UnifyButton(buttonText = "Go to Spaces")
        }

        Spacer(modifier = Modifier.height(10.dp))
    }
}