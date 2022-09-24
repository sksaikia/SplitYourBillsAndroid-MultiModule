package com.example.authentication.domain.repository

import com.example.authentication.domain.model.request.login.LoginBody
import com.example.authentication.domain.model.request.registration.RegistrationBody
import com.example.authentication.domain.model.response.login.LoginResponse
import com.example.authentication.domain.model.response.registration.RegistrationResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {

    suspend fun registerUser(registrationBody: RegistrationBody): Flow<Result<RegistrationResponse>>

    suspend fun loginUser(loginBody: LoginBody): Flow<Result<LoginResponse>>
}
