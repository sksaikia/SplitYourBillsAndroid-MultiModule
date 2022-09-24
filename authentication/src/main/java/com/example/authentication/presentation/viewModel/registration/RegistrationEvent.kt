package com.example.authentication.presentation.viewModel.registration

sealed class RegistrationEvent {
    data class OnUserRegistrationClick(val userName: String, val phoneNo: String, val password: String) : RegistrationEvent()
    data class ShowErrorToast(val errorMessage: String) : RegistrationEvent()
    object NavigateToHome : RegistrationEvent()
}
