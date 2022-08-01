package com.example.splityourbillsandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.navigation.NavigationItem
import com.example.session.SessionManager
import com.example.splityourbillsandroid.ui.theme.SplitYourBillsAndroidTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var sessionManager : SessionManager

    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplitYourBillsAndroidTheme {
                val navController = rememberAnimatedNavController()
                // A surface container using the 'background' color from the theme
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    //Add Splash Screen here
                    Log.d("FATAL", "onCreate: ${sessionManager.fetchAuthToken()}")
                    val authToken = sessionManager.fetchAuthToken()
                    if (authToken == null)
                        NavigationGraph(navController, NavigationItem.AuthenticationSelectionScreen.route)
                    else
                        NavigationGraph(navController, NavigationItem.HomeScreen.route)
                }
            }
        }
    }
}
