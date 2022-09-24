package com.example.authentication.domain.model.request.login

data class LoginBody(
    val phoneNo: String,
    val password: String
)
