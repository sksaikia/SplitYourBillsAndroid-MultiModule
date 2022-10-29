package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.response.delete_txn_detail.DeleteTxnDetailsResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class DeleteTransactionDetailsByTxnDetailsIdUseCase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(transactionId: Int): Flow<Result<DeleteTxnDetailsResponse>> {
        return repository.deleteTxnDetailsByTxnDetailsId(transactionId)
    }
}
