package com.example.authentication.presentation.viewModel.login

import com.example.authentication.domain.model.response.login.LoginResponse

data class LoginState(
    val loginResponse: LoginResponse? = null,
    val isLoading: Boolean = false
)
