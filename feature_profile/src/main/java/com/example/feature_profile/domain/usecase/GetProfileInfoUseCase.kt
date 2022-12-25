package com.example.feature_profile.domain.usecase

import com.example.feature_profile.domain.model.response.UserProfileResponse
import com.example.feature_profile.domain.repository.ProfileRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetProfileInfoUseCase(
    private val repository: ProfileRepository
) {

    suspend operator fun invoke(): Flow<Result<UserProfileResponse>> {
        return repository.getProfileInfo()
    }
}
