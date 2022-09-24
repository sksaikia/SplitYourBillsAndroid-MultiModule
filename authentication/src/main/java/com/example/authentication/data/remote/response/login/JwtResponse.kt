package com.example.authentication.data.remote.response.login

import com.google.gson.annotations.SerializedName

data class JwtResponse(
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("tokenType")
    val tokenType: String
)
