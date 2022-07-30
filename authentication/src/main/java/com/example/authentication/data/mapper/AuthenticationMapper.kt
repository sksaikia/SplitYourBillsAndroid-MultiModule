package com.example.authentication.data.mapper

import com.example.authentication.data.remote.request.login.LoginDTO
import com.example.authentication.data.remote.request.registration.RegistrationDTO
import com.example.authentication.data.remote.response.login.JwtResponse
import com.example.authentication.data.remote.response.login.LoginResponse
import com.example.authentication.data.remote.response.login.UserDetailsResponse
import com.example.authentication.data.remote.response.registration.RegistrationResponse
import com.example.authentication.domain.model.request.login.LoginBody
import com.example.authentication.domain.model.request.registration.RegistrationBody

fun RegistrationResponse.toRegistration() : com.example.authentication.domain.model.response.registration.RegistrationResponse {
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

fun LoginResponse.toLogin() : com.example.authentication.domain.model.response.login.LoginResponse {
    return com.example.authentication.domain.model.response.login.LoginResponse(
        this.success,
        this.loginData.toLoginData()
    )
}

fun LoginBody.toLoginDto() : LoginDTO {
    return LoginDTO(
        this.password,
        this.phoneNo
    )
}

fun JwtResponse.toJwtResponse() : com.example.authentication.domain.model.response.login.JwtResponse {
    return com.example.authentication.domain.model.response.login.JwtResponse(
        this.accessToken,
        this.tokenType
    )
}

fun UserDetailsResponse.toUserDetailsResponse() : com.example.authentication.domain.model.response.login.UserDetailsResponse {
    return com.example.authentication.domain.model.response.login.UserDetailsResponse(
        this.phoneNo,
        this.username,
        this.userId
    )
}

fun LoginResponse.LoginData.toLoginData() : com.example.authentication.domain.model.response.login.LoginResponse.LoginData {
    return com.example.authentication.domain.model.response.login.LoginResponse.LoginData(
        this.jwtResponse.toJwtResponse(),
        this.userDetailsResponse.toUserDetailsResponse()
    )
}