package com.example.authentication.presentation.viewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.authentication.domain.model.request.registration.RegistrationBody
import com.example.authentication.domain.usecase.LoginUseCase
import com.example.authentication.domain.usecase.RegistrationUseCase
import com.example.authentication.presentation.viewModel.login.LoginEvent
import com.example.authentication.presentation.viewModel.login.LoginState
import com.example.authentication.presentation.viewModel.registration.RegistrationEvent
import com.example.authentication.presentation.viewModel.registration.RegistrationState
import com.example.network.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthenticationViewModel @Inject constructor(
    private val registrationUseCase: RegistrationUseCase,
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    var registrationState by mutableStateOf(RegistrationState())
    var loginState by mutableStateOf(LoginState())

    private val _eventFlow = MutableSharedFlow<LoginEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onRegistrationEvent(event: RegistrationEvent) {
        when(event) {
            is RegistrationEvent.OnUserRegistrationClick -> {
                registerUser(event.userName, event.phoneNo, event.password)
            }
        }
    }

    fun onLoginEvent(event : LoginEvent) {
        when(event) {
            is LoginEvent.OnUserLoginClick -> {
                loginUser(event.phoneNo, event.password)
            }
        }
    }

    init {
    //    registerUser("Test 1", "1231234568", "password")
   //     Correct User DEtails
  //      loginUser("1234567893", "test")
        //     INCorrect User DEtails
    //        loginUser("1234567893", "test2")
    }

    private fun registerUser(userName : String,phoneNo : String,password : String) {
        viewModelScope.launch {
            registrationUseCase(RegistrationBody(userName, phoneNo, password))
                .collect{ result ->
                    when(result) {
                        is Result.Success -> {
                            result.data?.let { registrationResponse ->
                                registrationState = registrationState.copy(
                                    registration = registrationResponse
                                )
                            }
                        }
                        is Result.Error -> {

                        }
                        is Result.Loading -> {
                            registrationState = registrationState.copy(isLoading = result.isLoading)
                        }
                    }
                }
        }
    }

    private fun loginUser(phoneNo : String, password : String) {
        viewModelScope.launch {
            if (phoneNo.isEmpty()) {
                _eventFlow.emit(LoginEvent.ShowErrorToast("Phone No can not be empty"))
                return@launch
            }
            if (password.isEmpty()) {
                _eventFlow.emit(LoginEvent.ShowErrorToast("Password can not be empty"))
                return@launch
            }


            loginUseCase(phoneNo, password).collect{ result ->
                when(result) {
                    is Result.Success -> {
                        result.data?.let { loginResponse ->
                            Log.d("FATAL", "loginUser: $loginResponse")
                            loginState = loginState.copy(
                                loginResponse = loginResponse
                            )
                            _eventFlow.emit(LoginEvent.NavigateToHome)
                        }
                    }
                    is Result.Error -> {
                        _eventFlow.emit(LoginEvent.ShowErrorToast("${result.message}"))
                        Log.d("FATAL", "loginUser: ERROR : ${result.message}" )
                    }
                    is Result.Loading -> {
                        loginState = loginState.copy(isLoading = result.isLoading)
                    }
                }
            }
        }
    }



}