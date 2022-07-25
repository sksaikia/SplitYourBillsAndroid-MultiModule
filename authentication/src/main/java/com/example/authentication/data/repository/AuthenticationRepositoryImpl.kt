package com.example.authentication.data.repository

import com.example.authentication.data.mapper.toRegistration
import com.example.authentication.data.mapper.toRegistrationDto
import com.example.authentication.data.remote.AuthenticationService
import com.example.authentication.data.remote.request.registration.RegistrationDTO
import com.example.authentication.domain.model.request.registration.RegistrationBody
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

    //Replace Channel with Flow
    override suspend fun registerUser(registrationBody: RegistrationBody)
        : Flow<Result<RegistrationResponse>> {
        return channelFlow {
            send(Result.Loading(true))

            safeApiCall({
                val registrationResponse = api.registerUser(registrationBody)
                send(Result.Success(data = registrationResponse.toRegistration()))
            }, { exception ->
                send(Result.Error(exception))
            })

        }
    }
}