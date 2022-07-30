package com.example.authentication.domain.model.response.login


data class JwtResponse(
    val accessToken : String,
    val tokenType : String
)