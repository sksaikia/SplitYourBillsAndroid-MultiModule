package com.example.authentication.data.repository

import com.example.authentication.data.mapper.toLogin
import com.example.authentication.data.mapper.toRegistration
import com.example.authentication.data.remote.AuthenticationService
import com.example.authentication.data.remote.request.registration.RegistrationDTO
import com.example.authentication.domain.model.request.login.LoginBody
import com.example.authentication.domain.model.request.registration.RegistrationBody
import com.example.authentication.domain.model.response.login.LoginResponse
import com.example.authentication.domain.model.response.registration.RegistrationResponse
import com.example.authentication.domain.repository.AuthenticationRepository
import com.example.network.RemoteDataSource
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthenticationRepositoryImpl @Inject constructor(
    private val api : AuthenticationService
) : AuthenticationRepository, RemoteDataSource() {

    override suspend fun registerUser(registrationBody: RegistrationBody)
        : Flow<Result<RegistrationResponse>> {
        return flow {
            emit(Result.Loading(true))

            safeApiCall({
                val registrationResponse = api.registerUser(registrationBody)
                emit(Result.Success(data = registrationResponse.toRegistration()))
            }, { exception ->
                emit(Result.Error(exception))
            })

        }
    }

    override suspend fun loginUser(loginBody: LoginBody)
        : Flow<Result<LoginResponse>> {
        return flow {
            emit(Result.Loading(true))

            safeApiCall({
                val loginResponse = api.loginUser(loginBody)
                emit(Result.Success(data = loginResponse.toLogin()))
            }, { exception ->
                emit(Result.Error(exception))
            })

        }
    }
}