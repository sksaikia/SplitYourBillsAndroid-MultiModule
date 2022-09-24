package com.example.authentication.presentation.viewModel.registration

import com.example.authentication.domain.model.response.registration.RegistrationResponse

data class RegistrationState(
    val registration: RegistrationResponse? = null,
    val isLoading: Boolean = false
)
