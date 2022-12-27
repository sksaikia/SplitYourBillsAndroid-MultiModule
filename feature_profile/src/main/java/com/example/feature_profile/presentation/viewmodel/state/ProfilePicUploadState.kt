package com.example.feature_profile.presentation.viewmodel.state

import com.example.feature_profile.domain.model.response.ImageUploadResponse
import com.example.feature_profile.domain.model.response.UserProfileResponse

data class ProfilePicUploadState(
    val response: ImageUploadResponse? = null,
    val isLoading: Boolean = false
)
