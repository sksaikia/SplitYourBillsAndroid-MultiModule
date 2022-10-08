package com.example.feature_space.domain.model.response.txn_details_by_space


data class TxnDetailResponse(
    val totalTransactions: Int,
    val txnDetails: List<SingleTxnDetailResponse>
)
