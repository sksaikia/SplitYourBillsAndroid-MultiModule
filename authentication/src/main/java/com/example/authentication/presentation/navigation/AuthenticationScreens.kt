package com.example.authentication

sealed class AuthenticationScreen(val route: String) {
    object MainScreen : AuthenticationScreen("authentication_main_screen")
    object LoginScreen : AuthenticationScreen("login_screen")
    object RegisterScreen : AuthenticationScreen("registration_screen")

    fun withArgs(vararg args : String) : String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

}
