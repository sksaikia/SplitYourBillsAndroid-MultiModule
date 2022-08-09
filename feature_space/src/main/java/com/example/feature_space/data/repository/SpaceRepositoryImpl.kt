package com.example.feature_space.data.repository

import com.example.feature_space.data.mapper.convertToCreateSpaceBodyData
import com.example.feature_space.data.remote.SpaceService
import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.RemoteDataSource
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SpaceRepositoryImpl @Inject constructor(
    private val api : SpaceService
) : SpacesRepository, RemoteDataSource() {

    override suspend fun createNewSpace(createSpaceBody: CreateSpaceBody)
        : Flow<Result<CreateSpaceResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))
            //Domain to Data
            safeApiCall({
                api.createNewSpace(createSpaceBody.convertToCreateSpaceBodyData())
            }, { exception ->
                emit(Result.Error(exception))
            })

        }
    }
}