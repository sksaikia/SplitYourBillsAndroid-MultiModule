package com.example.authentication.presentation.viewModel

import com.example.authentication.domain.model.response.registration.RegistrationResponse

data class RegistrationState(
    val registration : RegistrationResponse? = null,
    val isLoading : Boolean = false,
)