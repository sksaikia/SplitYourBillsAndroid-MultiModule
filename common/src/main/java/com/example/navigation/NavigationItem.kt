package com.example.navigation


sealed class NavigationItem(
    val route : String
) {
    object AuthenticationSelectionScreen : NavigationItem(
        route = "authentication_selection_screen"
    )

    object LoginScreen : NavigationItem(
        "login_screen"
    )

    object RegistrationScreen : NavigationItem(
        "registration_screen"
    )
}