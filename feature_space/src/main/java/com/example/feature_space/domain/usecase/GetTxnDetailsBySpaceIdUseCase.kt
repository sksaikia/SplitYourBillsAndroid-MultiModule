package com.example.feature_space.domain.usecase

import com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse
import com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetTxnDetailsBySpaceIdUseCase(
    private val repository: SpacesRepository
) {
    suspend operator fun invoke(spaceId: Int): Flow<Result<TxnDetailsBySpaceResponse>> {
        return repository.getAllTxnDetailsBySpaceId(spaceId)
    }
}
