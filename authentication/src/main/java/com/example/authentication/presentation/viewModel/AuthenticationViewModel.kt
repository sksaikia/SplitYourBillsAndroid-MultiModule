package com.example.authentication.presentation.viewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.authentication.domain.model.request.registration.RegistrationBody
import com.example.authentication.domain.usecase.RegistrationUseCase
import com.example.network.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthenticationViewModel @Inject constructor(
    private val registrationUseCase: RegistrationUseCase
) : ViewModel() {

    var state by mutableStateOf(RegistrationState())

    fun onEvent(event: RegistrationEvent) {
        when(event) {
            is RegistrationEvent.OnUserRegistrationClick -> {
                registerUser(event.userName, event.phoneNo, event.password)
            }
        }
    }

    init {
        registerUser("Test 1", "1231234568", "password")
    }


    private fun registerUser(userName : String,phoneNo : String,password : String) {
        viewModelScope.launch {
            registrationUseCase(RegistrationBody(userName, phoneNo, password))
                .collect{ result ->
                    when(result) {
                        is Result.Success -> {
                            result.data?.let { registrationResponse ->
                                state = state.copy(
                                    registration = registrationResponse
                                )
                            }
                        }
                        is Result.Error -> {

                        }
                        is Result.Loading -> {
                            state = state.copy(isLoading = result.isLoading)
                        }
                    }
                }
        }
    }


}