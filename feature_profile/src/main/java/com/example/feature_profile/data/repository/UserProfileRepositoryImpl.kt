package com.example.feature_profile.data.repository

import com.example.feature_profile.data.mapper.toDomainUserProfileResponse
import com.example.feature_profile.data.remote.UserProfileService
import com.example.feature_profile.domain.model.response.UserProfileResponse
import com.example.feature_profile.domain.repository.ProfileRepository
import com.example.network.RemoteDataSource
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserProfileRepositoryImpl @Inject constructor(
    private val api: UserProfileService
) : ProfileRepository, RemoteDataSource() {

    override suspend fun getProfileInfo(): Flow<Result<UserProfileResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.getMyProfile()
                emit(Result.Success(data = response.toDomainUserProfileResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }
}