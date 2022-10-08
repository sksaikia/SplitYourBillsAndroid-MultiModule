package com.example.feature_space.domain.usecase

import com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailsBySpaceResponse
import com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetAllMembersForSpaceIdUseCase(
    private val repository: SpacesRepository
) {

    suspend operator fun invoke(spaceId: Int): Flow<Result<TxnDetailsBySpaceResponse>> {
        return repository.getAllMembersForSpaceId(spaceId)
    }
}
