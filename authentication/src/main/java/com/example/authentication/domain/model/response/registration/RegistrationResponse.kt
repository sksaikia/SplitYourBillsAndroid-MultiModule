package com.example.authentication.domain.model.response.registration

data class RegistrationResponse(
    val success: Boolean,
    val message: String,
    val code: String
)
