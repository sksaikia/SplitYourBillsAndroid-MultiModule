package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody
import com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class DeleteTransactionUseCase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(transactionId: Int)
    : Flow<Result<DeleteTransactionResponse>> {
        return repository.deleteTransactionById(transactionId)
    }
}
