package com.example.splityourbillsandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.design.UnifyBottomNavigation
import com.example.navigation.NavigationItem
import com.example.session.SessionManager
import com.example.splityourbillsandroid.navGraph.NavigationGraph
import com.example.splityourbillsandroid.ui.theme.SplitYourBillsAndroidTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var sessionManager: SessionManager

    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplitYourBillsAndroidTheme {
                val navController = rememberAnimatedNavController()
                var isVisibleBT by remember {
                    mutableStateOf(false)
                }
//                val listener = NavController.OnDestinationChangedListener { _, destination, _ ->
//                    Log.d("EREN", "onCreate: ${destination.route.toString()}")
//                }
//
//                navController.addOnDestinationChangedListener(listener)

                Scaffold(
                    bottomBar = {
                        if (isVisibleBT) {
                            UnifyBottomNavigation(
                                navController = navController,
                                items = listOf(
                                    NavigationItem.SpacesScreen,
                                    NavigationItem.HomeScreen,
                                    NavigationItem.TransactionScreen,
                                    NavigationItem.ProfileScreen
                                )
                            )
                        }
                    }
                ) { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize().padding(
                            PaddingValues(0.dp, 0.dp, 0.dp, innerPadding.calculateBottomPadding())
                        )
                    ) {
                        // Add Splash Screen here
                        Log.d("FATAL", "onCreate: ${sessionManager.fetchAuthToken()}")
                        val authToken = sessionManager.fetchAuthToken()
                        if (authToken == null) {
                            NavigationGraph(
                                navController,
                                NavigationItem.AuthenticationSelectionScreen.route
                            )
                        } else {
                            isVisibleBT = true
                            NavigationGraph(navController, NavigationItem.SpacesScreen.route)
                        }
                    }
                }
            }
        }
    }
}
