package com.example.authentication.data.mapper

import com.example.authentication.data.remote.request.registration.RegistrationDTO
import com.example.authentication.domain.model.request.registration.RegistrationBody

fun com.example.authentication.data.remote.response.RegistrationResponse.toRegistration() : com.example.authentication.domain.model.response.registration.RegistrationResponse {
    return com.example.authentication.domain.model.response.registration.RegistrationResponse(
        this.success,
        this.message,
        this.code
    )
}
fun RegistrationBody.toRegistrationDto() : RegistrationDTO {
    return RegistrationDTO(
        this.name,
        this.password,
        this.phoneNo
    )
}