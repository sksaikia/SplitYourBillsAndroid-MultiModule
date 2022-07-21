package com.example.authentication

import android.util.Log
import androidx.compose.foundation.clickable
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
import androidx.navigation.NavHostController
import com.example.design.UnifyButton
import com.example.design.UnifyEditText
import com.example.design.UnifyText

@Composable
fun AuthenticationSelectionScreen(navController: NavHostController) {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        UnifyText(text = "Split Your Bills", fontSize = 36.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {

            UnifyButton(buttonText = "Login", {
                //Tested with sample arg
                navController.navigate(AuthenticationScreen.LoginScreen.withArgs("Eren"))
            })

            UnifyButton(buttonText = "Register", {
                navController.navigate(AuthenticationScreen.RegisterScreen.route)
            })
        }
    }
}