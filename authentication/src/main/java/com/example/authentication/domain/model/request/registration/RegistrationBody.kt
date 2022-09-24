package com.example.authentication.domain.model.request.registration

data class RegistrationBody(
    val name: String,
    val password: String,
    val phoneNo: String
)
