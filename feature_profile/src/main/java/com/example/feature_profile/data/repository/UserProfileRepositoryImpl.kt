package com.example.feature_profile.data.repository

import com.example.feature_profile.data.mapper.toDomainImageUploadResponse
import com.example.feature_profile.data.mapper.toDomainUserProfileResponse
import com.example.feature_profile.data.remote.UserProfileService
import com.example.feature_profile.domain.model.response.ImageUploadResponse
import com.example.feature_profile.domain.model.response.UserProfileResponse
import com.example.feature_profile.domain.repository.ProfileRepository
import com.example.network.RemoteDataSource
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okhttp3.MultipartBody
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

    override suspend fun uploadProfilePic(body: MultipartBody.Part): Flow<Result<ImageUploadResponse>> {
        return flow {
            emit(com.example.network.Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.uploadProfilePic(body)
                emit(com.example.network.Result.Success(data = response.toDomainImageUploadResponse()))
            }, { exception ->
                emit(com.example.network.Result.Error(exception))
            })
        }
    }
}