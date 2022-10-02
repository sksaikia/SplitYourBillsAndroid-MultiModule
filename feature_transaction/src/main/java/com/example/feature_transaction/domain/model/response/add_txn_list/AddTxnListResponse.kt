package com.example.feature_transaction.domain.model.response.add_txn_list

data class AddTxnListResponse(
    val success: Boolean,
    val data: AddTxnListDetails,
) {
    data class AddTxnListDetails(
        val success: Int,
        val failure: Int,
        val ignored: Int,
    )
}
