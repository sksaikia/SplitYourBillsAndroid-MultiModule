package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.response.txn_balance.TxnBalanceResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetTxnBalanceUseCase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(userId: Int): Flow<Result<TxnBalanceResponse>> {
        return repository.getTxnDetailsBalance(userId)
    }
}
