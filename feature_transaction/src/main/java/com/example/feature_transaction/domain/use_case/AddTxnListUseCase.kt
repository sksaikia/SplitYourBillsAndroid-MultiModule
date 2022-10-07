package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody
import com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody
import com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse
import com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class AddTxnListUseCase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(addTxnListBody: List<AddTxnListBody>)
    : Flow<Result<AddTxnListResponse>> {
        return repository.addTxnList(addTxnListBody)
    }
}
