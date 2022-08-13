package com.example.feature_space.presentation.screen

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.feature_space.presentation.viewmodel.SpaceViewModel

@Composable
fun SpaceDetailsScreen(
    navigateTo : (String) -> Unit,
    spaceId : String? = "0",
    spaceViewModel: SpaceViewModel = hiltViewModel()
) {
    Log.d("FATAL", "SpaceDetailsScreen: $spaceId")
}