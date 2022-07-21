package com.example.authentication

import LoginScreen
import RegistrationScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AuthenticationNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AuthenticationScreen.MainScreen.route) {
        composable(route = AuthenticationScreen.MainScreen.route) {
            AuthenticationSelectionScreen(navController)
        }
        composable(route = AuthenticationScreen.LoginScreen.route + "/{name}",
        arguments = listOf(
            navArgument("name") {
                type = NavType.StringType
                defaultValue = "Test"
                nullable = true
            }
        )) { entry ->
            LoginScreen(navController, name = entry.arguments?.getString("name"))
        }
        composable(route = AuthenticationScreen.RegisterScreen.route) {
            RegistrationScreen(navController)
        }
    }
}