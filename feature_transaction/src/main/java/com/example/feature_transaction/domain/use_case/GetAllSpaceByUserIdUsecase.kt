package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetAllSpaceByUserIdUsecase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(userId: Int): Flow<Result<GetAllSpacesResponse>> {
        return repository.getAllSpacesByUserId(userId)
    }
}
