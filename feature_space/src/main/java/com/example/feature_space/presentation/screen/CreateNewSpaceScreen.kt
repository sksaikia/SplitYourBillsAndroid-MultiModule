package com.example.feature_space.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.design.UnifyButton
import com.example.design.UnifyEditText
import com.example.design.UnifyText
import com.example.navigation.NavigationItem

@Composable
fun CreateNewSpaceScreen(navigateTo : (String) -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        UnifyEditText(headerText = "Name")
        UnifyEditText(headerText = "Description (Optional)")
        Spacer(modifier = Modifier.height(20.dp))
        UnifyText(
            text = "Note: Once you have created a space, you will be able to invite other people too.... ",
            modifier = Modifier.padding(horizontal = 20.dp))
        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            UnifyButton(buttonText = "Invite Members" , {
            })

            UnifyButton(buttonText = "Save Space" , {
                //TODO for testing
                navigateTo(NavigationItem.ShareSpaceScreen.route)
            })
        }

    }
}