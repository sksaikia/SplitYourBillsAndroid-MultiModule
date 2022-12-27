package com.example.feature_profile.domain.usecase

import com.example.feature_profile.domain.model.response.ImageUploadResponse
import com.example.feature_profile.domain.model.response.UserProfileResponse
import com.example.feature_profile.domain.repository.ProfileRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody

class UploadProfilePicUseCase(
    private val repository: ProfileRepository
) {

    suspend operator fun invoke(body : MultipartBody.Part): Flow<Result<ImageUploadResponse>> {
        return repository.uploadProfilePic(body)
    }
}
