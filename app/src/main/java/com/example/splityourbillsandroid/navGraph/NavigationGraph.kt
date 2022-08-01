package com.example.splityourbillsandroid

import LoginScreen
import RegistrationScreen
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.authentication.AuthenticationSelectionScreen
import com.example.feature_home.presentation.screens.HomeScreen
import com.example.navigation.NavigationItem
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavigationGraph(
    navController: NavHostController,
    startLocation : String
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = startLocation
    ) {
        composable(
            route = NavigationItem.AuthenticationSelectionScreen.route,
        ) {
            AuthenticationSelectionScreen(
                navigateTo = {
                    navController.navigate(it)
                }
            )
        }

        composable(
            route = NavigationItem.LoginScreen.route
        ) {
            LoginScreen(navigateTo = {
                navController.navigate(it)
            }, name = "")
        }

        composable(
            route = NavigationItem.RegistrationScreen.route
        ) {
            RegistrationScreen(navigateTo = {
                navController.navigate(it)
            })
        }

        composable(
            route = NavigationItem.HomeScreen.route
        ) {
            HomeScreen(navigateTo = {
                navController.navigate(it)
            })
        }

    }
}
