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
import com.example.design.PopButton
import com.example.design.PopText
import com.example.navigation.NavigationItem

@Composable
fun ShareSpaceScreen(navigateTo: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 20.dp)
    ) {
        PopText(text = "Space has been created. 6 members has been added.")

        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            PopButton(buttonText = "Add a transaction")
            Spacer(modifier = Modifier.width(20.dp))
            PopButton(buttonText = "Go to Spaces", {
                navigateTo(NavigationItem.SpacesScreen.route)
            })
        }

        Spacer(modifier = Modifier.height(10.dp))
    }
}
