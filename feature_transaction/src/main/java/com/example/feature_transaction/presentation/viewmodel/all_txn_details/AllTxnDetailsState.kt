package com.example.feature_transaction.presentation.viewmodel.all_txn_details

import com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse

data class AllTxnDetailsState(
    val isLoading: Boolean = false,
    val allTxnDetails: GetTxnListResponse? = null
)
