package com.example.feature_profile.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_profile.domain.usecase.GetProfileInfoUseCase
import com.example.feature_profile.presentation.viewmodel.state.UserProfileState
import com.example.network.Result
import com.example.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@HiltViewModel
class UserProfileViewModel @Inject constructor(
    private val getProfileInfoUseCase: GetProfileInfoUseCase,
    private val sessionManager: SessionManager
) : ViewModel() {

    var userProfileInfo by mutableStateOf(UserProfileState())

    fun getProfileDetail() {
        viewModelScope.launch {
            getProfileInfoUseCase.invoke()
                .collectLatest { result ->
                    when (result) {
                        is com.example.network.Result.Success -> {
                            userProfileInfo = userProfileInfo.copy(
                                isLoading = false,
                                response = result.data
                            )
                        }
                        is com.example.network.Result.Error -> {
                            userProfileInfo = userProfileInfo.copy(
                                isLoading = false,
                                response = null
                            )
                        }
                        is com.example.network.Result.Loading -> {
                            userProfileInfo = userProfileInfo.copy(
                                isLoading = true
                            )
                        }
                    }
                }
        }
    }
}
