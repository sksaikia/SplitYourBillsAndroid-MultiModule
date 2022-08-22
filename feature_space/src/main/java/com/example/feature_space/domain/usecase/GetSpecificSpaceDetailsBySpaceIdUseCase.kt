package com.example.feature_space.domain.usecase

import com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetSpecificSpaceDetailsBySpaceIdUseCase(
    private val repository: SpacesRepository
) {
    suspend operator fun invoke(spaceId : Int) : Flow<Result<SingleSpaceDetailsResponse>> {
        return repository.getSpecificSpaceBySpaceId(spaceId)
    }
}