package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetAllTxnDetailsByUserIdUseCase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(userId: Int): Flow<Result<GetTxnListResponse>> {
        return repository.getTxnDetailsByUserId(userId)
    }
}
