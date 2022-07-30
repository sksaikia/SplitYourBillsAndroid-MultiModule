package com.example.authentication.domain.usecase

import com.example.authentication.domain.model.request.login.LoginBody
import com.example.authentication.domain.model.response.login.LoginResponse
import com.example.authentication.domain.repository.AuthenticationRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class LoginUseCase(
    private val repository : AuthenticationRepository
) {

    suspend operator fun invoke(phoneNo : String, password : String) : Flow<Result<LoginResponse>> {
        val loginBody = LoginBody(phoneNo, password)
        return repository.loginUser(loginBody)
    }

}