package com.example.feature_space.data.remote

import com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO
import com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface SpaceService {

    @POST("spaces/add")
    suspend fun createNewSpace(@Body createNewSpace : CreateSpaceDTO) : CreateSpaceResponse

    @GET("spaces/member/getallspaces")
    suspend fun getAllSpacesByUserId(@Query(value = "userId") userId : Int) : GetAllSpacesResponse

}