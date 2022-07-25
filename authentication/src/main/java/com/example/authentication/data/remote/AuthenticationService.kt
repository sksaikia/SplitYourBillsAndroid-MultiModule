package com.example.authentication.data.remote

import com.example.authentication.data.remote.request.registration.RegistrationDTO
import com.example.authentication.data.remote.response.RegistrationResponse
import com.example.authentication.domain.model.request.registration.RegistrationBody
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationService {

    @POST("auth/register")
    suspend fun registerUser(@Body registrationDTO: RegistrationBody) : RegistrationResponse

}