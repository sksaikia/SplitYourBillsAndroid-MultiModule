package com.example

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

/**
 * Contribution from Ankit Kumar - Android Engineer, Rapido , Ex-Tokopedia, MeetApp, ClikLabs
 **/

object ViewModelHelper {

    @Composable
    inline fun <reified T : ViewModel> activityViewModel(): T {
        return viewModel(LocalContext.current as ComponentActivity)
    }
}
