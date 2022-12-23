package com.example.authentication.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.PopButton
import com.example.design.PopText
import com.example.navigation.NavigationItem

@Composable
fun AuthenticationSelectionScreen(navigateTo: (String) -> Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PopText(text = "Split Your Bills", fontSize = 36.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            PopButton(buttonText = "Login", {
                // Tested with sample arg
                navigateTo(NavigationItem.LoginScreen.route)
            })

            PopButton(buttonText = "Register", {
                navigateTo(NavigationItem.RegistrationScreen.route)
            })
        }
    }
}
