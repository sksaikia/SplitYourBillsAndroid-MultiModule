package com.example.feature_space.data.remote

import com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO
import com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface SpaceService {

    @POST("spaces/add")
    suspend fun createNewSpace(@Body createNewSpace : CreateSpaceDTO) : CreateSpaceResponse

}