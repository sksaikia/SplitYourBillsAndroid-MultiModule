package com.example.feature_space.domain.usecase

import com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetAllSpaceByUserIdUsecase(
    private val repository: SpacesRepository
) {

    suspend operator fun invoke(userId: Int): Flow<Result<GetAllSpacesResponse>> {
        return repository.getAllSpacesByUserId(userId)
    }
}
