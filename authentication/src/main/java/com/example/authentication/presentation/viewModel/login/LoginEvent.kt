package com.example.authentication.presentation.viewModel.login

sealed class LoginEvent {
    data class OnUserLoginClick(val phoneNo: String, val password: String) : LoginEvent()
    object NavigateToHome : LoginEvent()
    data class ShowErrorToast(val errorMessage: String) : LoginEvent()
}
