package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody
import com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class CreateTransactionUseCase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(createTransactionBody: CreateTransactionBody): Flow<Result<CreateTransactionResponse>> {
        return repository.createTransaction(createTransactionBody)
    }
}
