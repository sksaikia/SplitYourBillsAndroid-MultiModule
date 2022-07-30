package com.example.authentication.domain.model.response.login

data class LoginResponse(
    val success: Boolean,
    val loginData: LoginData
) {
    data class LoginData(
        val jwtResponse: JwtResponse,
        val userDetailsResponse: UserDetailsResponse
    )
}

