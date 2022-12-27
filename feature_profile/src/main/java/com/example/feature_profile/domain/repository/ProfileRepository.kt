package com.example.feature_profile.domain.repository

import com.example.feature_profile.domain.model.response.ImageUploadResponse
import com.example.feature_profile.domain.model.response.UserProfileResponse
import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody

interface ProfileRepository {
    suspend fun getProfileInfo() : Flow<com.example.network.Result<UserProfileResponse>>
    suspend fun uploadProfilePic(body: MultipartBody.Part): Flow<com.example.network.Result<ImageUploadResponse>>
}