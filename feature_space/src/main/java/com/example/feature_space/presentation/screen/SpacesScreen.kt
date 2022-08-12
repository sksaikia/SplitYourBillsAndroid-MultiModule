package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.UnifyChip
import com.example.design.UnifyLabel
import com.example.design.UnifyText
import com.example.feature_space.presentation.ui_composition.SpaceCard
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
        Column {
            SpaceCard(
                spaceName =  "Space Name here",
                date = "28 - Jan",
                otherUserCount = 3 ,
                amount = 1170
            )
        }
    }
}