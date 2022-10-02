package com.example.feature_transaction.domain.model.response.get_txn_list


data class GetTxnListResponse(
    val success: Boolean,
    val data: ListOfTransactionDetails,
)