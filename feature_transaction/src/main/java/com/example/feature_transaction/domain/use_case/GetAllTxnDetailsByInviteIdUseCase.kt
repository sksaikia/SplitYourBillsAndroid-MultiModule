package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetAllTxnDetailsByInviteIdUseCase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(inviteId: Int): Flow<Result<GetTxnListResponse>> {
        return repository.getTxnDetailsByInviteId(inviteId)
    }
}
