package com.example.authentication.data.remote.response.login

import com.google.gson.annotations.SerializedName

data class UserDetailsResponse(
    @SerializedName("phoneNo")
    val phoneNo: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("userId")
    val userId: Int
)
