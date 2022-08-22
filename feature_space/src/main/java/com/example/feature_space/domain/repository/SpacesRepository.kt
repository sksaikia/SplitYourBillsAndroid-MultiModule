package com.example.feature_space.domain.repository

import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse
import com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface SpacesRepository {

    suspend fun createNewSpace(createSpaceBody: CreateSpaceBody)
        : Flow<Result<CreateSpaceResponse>>

    suspend fun getAllSpacesByUserId(userId : Int)
        : Flow<Result<GetAllSpacesResponse>>

    suspend fun getSpecificSpaceBySpaceId(spaceId : Int)
        : Flow<Result<SingleSpaceDetailsResponse>>

}