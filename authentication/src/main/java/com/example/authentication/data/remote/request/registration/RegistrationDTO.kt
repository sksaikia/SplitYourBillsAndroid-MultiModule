package com.example.authentication.data.remote.request.registration

import com.google.gson.annotations.SerializedName

data class RegistrationDTO(
    @SerializedName("name")
    val name: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("phoneNo")
    val phoneNo: String
)
