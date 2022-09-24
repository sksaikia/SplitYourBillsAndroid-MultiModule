package com.example.authentication.data.remote.request.login

import com.google.gson.annotations.SerializedName

data class LoginDTO(
    @SerializedName("password")
    val password: String,
    @SerializedName("phoneNo")
    val phoneNo: String
)
