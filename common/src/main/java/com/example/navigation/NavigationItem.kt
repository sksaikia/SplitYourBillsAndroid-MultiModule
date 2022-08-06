package com.example.navigation

import com.example.common.R


sealed class NavigationItem(
    val route : String,
    val title : String,
    //TODO change this
    val icon : Int = R.drawable.ic_home
) {
    object AuthenticationSelectionScreen : NavigationItem(
        route = "authentication_selection_screen",
        title = "Authentication Selection"
    )

    object LoginScreen : NavigationItem(
        "login_screen",
        title = "Login"
    )

    object RegistrationScreen : NavigationItem(
        "registration_screen",
        title = "Registration"
    )

    object HomeScreen : NavigationItem(
        "home_screen",
        title = "Home",
        icon = R.drawable.ic_home
    )

    object SpacesScreen : NavigationItem(
        route = "spaces_screen",
        title = "Spaces",
        icon = R.drawable.ic_space
    )

    object SpendAnalyzerScreen : NavigationItem(
        route = "spend_analyzer_screen",
        title = "Spend Analyzer",
        icon = R.drawable.ic_spent_analyzer
    )

    object TransactionScreen : NavigationItem(
        route = "transaction_screen",
        title = "Transactions",
        icon = R.drawable.ic_transaction
    )

    object ProfileScreen : NavigationItem(
        route = "profile_screen",
        title = "Profile",
        icon = R.drawable.ic_user
    )

}