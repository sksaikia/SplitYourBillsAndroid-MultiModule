package com.example.feature_space.domain.repository

import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface SpacesRepository {

    suspend fun createNewSpace(createSpaceBody: CreateSpaceBody)
        : Flow<Result<CreateSpaceResponse>>

}