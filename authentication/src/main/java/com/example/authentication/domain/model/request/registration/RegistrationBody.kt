package com.example.authentication.domain.model.request.registration

import com.google.gson.annotations.SerializedName

data class RegistrationBody (
    val name : String,
    val password : String,
    val phoneNo : String,
)