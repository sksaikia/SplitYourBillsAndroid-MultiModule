package com.example.splityourbillsandroid.navGraph

import LoginScreen
import RegistrationScreen
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.authentication.presentation.screen.AuthenticationSelectionScreen
import com.example.contact_picker.view.ContactPickerScreen
import com.example.feature_home.presentation.screens.HomeScreen
import com.example.feature_profile.ProfileScreen
import com.example.feature_space.presentation.screen.CreateNewSpaceScreen
import com.example.feature_space.presentation.screen.ShareSpaceScreen
import com.example.feature_space.presentation.screen.SpaceDetailsScreen
import com.example.feature_space.presentation.screen.SpacesScreen
import com.example.feature_transaction.presentation.screen.ManualBillSplitScreen
import com.example.feature_transaction.presentation.screen.CreateNewTransactionScreen
import com.example.feature_transaction.presentation.screen.TransactionScreen
import com.example.navigation.NavigationItem
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavigationGraph(
    navController: NavHostController,
    startLocation: String
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = startLocation
    ) {
        composable(
            route = NavigationItem.AuthenticationSelectionScreen.route
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

        composable(
            route = NavigationItem.TransactionScreen.route
        ) {
            TransactionScreen(navigateTo = {
                navController.navigate(it)
            })
        }

        composable(
            route = NavigationItem.SpacesScreen.route
        ) {
            SpacesScreen(navigateTo = {
                navController.navigate(it)
            })
        }

        composable(
            route = NavigationItem.ProfileScreen.route
        ) {
            ProfileScreen(navigateTo = {
                navController.navigate(it)
            })
        }

        composable(
            route = NavigationItem.CreateNewSpaceScreen.route + "/{contacts}",
            arguments = listOf(
                navArgument("contacts") {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = true
                }
            )
        ) {
            CreateNewSpaceScreen(
                navigateTo = {
                    navController.navigate(it)
                },
                contactList = it.arguments?.getString("contacts")
            )
        }

        composable(
            route = NavigationItem.ShareSpaceScreen.route
        ) {
            ShareSpaceScreen(navigateTo = {
                navController.navigate(it)
            })
        }

        composable(
            route = NavigationItem.SpaceDetailsScreen.route + "/{spaceId}",
            arguments = listOf(
                navArgument("spaceId") {
                    type = NavType.StringType
                    defaultValue = "0"
                }
            )
        ) {
            SpaceDetailsScreen(
                navigateTo = {
                    navController.navigate(it)
                },
                spaceId = it.arguments?.getString("spaceId")
            )
        }

        composable(
            route = NavigationItem.ContactPickerScreen.route
        ) {
            ContactPickerScreen(
                navigateTo = {
                    navController.navigate(it)
                }
            )
        }

        composable(
            route = NavigationItem.ManualBillSplitScreen.route + "/{spaceId}",
            arguments = listOf(
                navArgument("spaceId") {
                    type = NavType.StringType
                    defaultValue = "0"
                }
            )
        ) {
            ManualBillSplitScreen(
                navigateTo = {
                    navController.navigate(it)
                },
                spaceId = it.arguments?.getString("spaceId")
            )
        }

        composable(
            route = NavigationItem.CreateNewTransactionScreen.route
        ) {
            CreateNewTransactionScreen(
                navigateTo = {
                    navController.navigate(it)
                }
            )
        }
    }
}
