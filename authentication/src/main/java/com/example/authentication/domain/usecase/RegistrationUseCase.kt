package com.example.authentication.domain.usecase

import com.example.authentication.domain.model.request.registration.RegistrationBody
import com.example.authentication.domain.model.response.registration.RegistrationResponse
import com.example.authentication.domain.repository.AuthenticationRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class RegistrationUseCase(
    private val repository: AuthenticationRepository
) {

    suspend operator fun invoke(registrationBody: RegistrationBody): Flow<Result<RegistrationResponse>> {
        return repository.registerUser(registrationBody)
    }
}
