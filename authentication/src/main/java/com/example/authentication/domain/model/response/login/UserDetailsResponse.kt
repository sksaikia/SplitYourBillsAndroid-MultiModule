package com.example.authentication.domain.model.response.login

data class UserDetailsResponse(
    val phoneNo : String,
    val username : String,
    val userId : Int
)
