package com.example.authentication.data.remote.response.login

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("success")
    val success : Boolean,
    @SerializedName("data")
    val loginData : LoginData
) {
    data class LoginData(
        @SerializedName("jwt")
        val jwtResponse: JwtResponse,
        @SerializedName("userDetails")
        val userDetailsResponse: UserDetailsResponse
    )
}
