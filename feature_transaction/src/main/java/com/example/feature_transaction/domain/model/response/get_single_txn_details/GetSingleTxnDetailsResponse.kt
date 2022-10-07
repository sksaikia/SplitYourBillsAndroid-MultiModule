package com.example.feature_transaction.domain.model.response.get_single_txn_details

import com.example.feature_transaction.domain.model.response.single_txn_details.TransactionDetailsResponse

data class GetSingleTxnDetailsResponse(
    val success: Boolean,
    val data: TransactionDetailsResponse
)
