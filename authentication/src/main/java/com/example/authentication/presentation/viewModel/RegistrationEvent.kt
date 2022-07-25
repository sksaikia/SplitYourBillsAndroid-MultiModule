package com.example.authentication.presentation.viewModel

sealed class RegistrationEvent{
    data class OnUserRegistrationClick(val userName : String, val phoneNo : String, val password : String) : RegistrationEvent()
}