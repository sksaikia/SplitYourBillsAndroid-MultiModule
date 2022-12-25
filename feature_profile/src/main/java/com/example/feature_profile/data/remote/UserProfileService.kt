package com.example.feature_profile.data.remote

import com.example.feature_profile.data.remote.response.UserProfileResponse
import retrofit2.http.GET

interface UserProfileService {

    @GET("user/me")
    suspend fun getMyProfile(): UserProfileResponse
}
