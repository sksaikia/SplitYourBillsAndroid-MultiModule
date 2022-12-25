package com.example.feature_profile.presentation.viewmodel.state

import com.example.feature_profile.domain.model.response.UserProfileResponse

data class UserProfileState(
    val response: UserProfileResponse? = null,
    val isLoading: Boolean = false
)
