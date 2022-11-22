package com.example.feature_space.domain.usecase

import com.example.feature_space.domain.model.response.txn_balance.TxnBalanceResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetTxnBalanceUseCase(
    private val repository: SpacesRepository
) {

    suspend operator fun invoke(userId: Int): Flow<Result<TxnBalanceResponse>> {
        return repository.getTxnDetailsBalance(userId)
    }
}
