package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.design.UnifyButton
import com.example.design.UnifyText
import com.example.feature_space.presentation.viewmodel.SpaceViewModel
import com.example.navigation.NavigationItem

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SpaceDetailsScreen(
    navigateTo: (String) -> Unit,
    spaceId: String? = "0",
    spaceViewModel: SpaceViewModel = hiltViewModel()
) {

    val specificSpaceDetails = spaceViewModel.singleSpaceState
    val scaffoldState = rememberScaffoldState()

//    spaceViewModel.getSpecificSpaceBySpaceId(spaceId?.toInt() ?: 0)

    LaunchedEffect(key1 = true) {
        spaceViewModel.getSpecificSpaceBySpaceId(spaceId?.toInt() ?: 0)

    }

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {
                navigateTo(NavigationItem.CreateNewSpaceScreen.route)
            },
            backgroundColor = MaterialTheme.colors.primary
        ) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "Add Note")
        }
    },
        scaffoldState = scaffoldState,
        modifier =  Modifier.padding(bottom = 50.dp)

    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            if (specificSpaceDetails.isLoading)
                CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
            UnifyText(text = "Space Name", fontSize = 12.sp, fontWeight = FontWeight.Normal)
            Spacer(modifier = Modifier.height(6.dp))
            UnifyText(
                text = specificSpaceDetails.data?.spacesResponse?.spaceName ?: "",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(20.dp))
            UnifyText(text = "Description", fontSize = 12.sp, fontWeight = FontWeight.Normal)
            Spacer(modifier = Modifier.height(6.dp))
            UnifyText(
                text = specificSpaceDetails.data?.spacesResponse?.spaceDescription ?: "",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(20.dp))
            UnifyText(text = "Created By", fontSize = 12.sp, fontWeight = FontWeight.Normal)
            Spacer(modifier = Modifier.height(6.dp))
            UnifyText(
                text = specificSpaceDetails.data?.spacesResponse?.userResponse?.username ?: "",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(20.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                UnifyButton(buttonText = "All Transactions")
                UnifyButton(buttonText = "All members")
            }
            
        }
    }
}