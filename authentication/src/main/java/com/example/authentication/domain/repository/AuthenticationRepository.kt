package com.example.authentication.domain.repository

import com.example.authentication.domain.model.request.registration.RegistrationBody
import com.example.authentication.domain.model.response.registration.RegistrationResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {

    suspend fun registerUser(registrationBody: RegistrationBody)
        : Flow<Result<RegistrationResponse>>

}