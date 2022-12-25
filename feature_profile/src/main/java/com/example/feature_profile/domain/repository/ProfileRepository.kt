package com.example.feature_profile.domain.repository

import com.example.feature_profile.domain.model.response.UserProfileResponse
import kotlinx.coroutines.flow.Flow

interface ProfileRepository {
    suspend fun getProfileInfo() : Flow<com.example.network.Result<UserProfileResponse>>
}