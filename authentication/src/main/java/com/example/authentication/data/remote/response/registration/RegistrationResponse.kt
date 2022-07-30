package com.example.authentication.data.remote.response.registration

import com.google.gson.annotations.SerializedName

data class RegistrationResponse(
    @SerializedName("success")
    val success : Boolean,
    @SerializedName("message")
    val message : String,
    @SerializedName("code")
    val code : String,
)