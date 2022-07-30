package com.example.authentication.data.remote

import com.example.authentication.data.remote.response.login.LoginResponse
import com.example.authentication.data.remote.response.registration.RegistrationResponse
import com.example.authentication.domain.model.request.login.LoginBody
import com.example.authentication.domain.model.request.registration.RegistrationBody
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationService {

    @POST("auth/register")
    suspend fun registerUser(@Body registrationDTO: RegistrationBody) : RegistrationResponse

    @POST("auth/login")
    suspend fun loginUser(@Body loginBody: LoginBody) : LoginResponse

}