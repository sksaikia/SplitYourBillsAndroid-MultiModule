package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetSingleTxnDetailsByTxnDetailsIdUsecase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(txnDetailsId: Int): Flow<Result<GetSingleTxnDetailsResponse>> {
        return repository.getTxnDetailsByTxnDetailsId(txnDetailsId)
    }
}
