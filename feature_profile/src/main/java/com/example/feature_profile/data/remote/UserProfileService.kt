package com.example.feature_profile.data.remote

import com.example.feature_profile.data.remote.response.ImageUploadResponse
import com.example.feature_profile.data.remote.response.UserProfileResponse
import okhttp3.MultipartBody
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface UserProfileService {

    @GET("user/me")
    suspend fun getMyProfile(): UserProfileResponse

    @Multipart
    @POST("upload")
    suspend fun uploadProfilePic(@Part image : MultipartBody.Part): ImageUploadResponse
}
