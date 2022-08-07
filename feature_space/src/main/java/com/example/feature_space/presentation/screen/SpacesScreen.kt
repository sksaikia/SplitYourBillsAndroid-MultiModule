package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.design.UnifyText
import com.example.navigation.NavigationItem

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SpacesScreen(navigateTo : (String) -> Unit) {

    val scaffoldState = rememberScaffoldState()

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {
                navigateTo(NavigationItem.CreateNewSpaceScreen.route)
            },
            backgroundColor = MaterialTheme.colors.primary
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add Note")
        }
    },
        scaffoldState = scaffoldState,
        modifier =  Modifier.padding(bottom = 50.dp)

    ) {
        Column() {

        }
    }

    
    
}