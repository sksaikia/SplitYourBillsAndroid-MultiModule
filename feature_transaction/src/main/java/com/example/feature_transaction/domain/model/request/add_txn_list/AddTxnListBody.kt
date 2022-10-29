package com.example.feature_transaction.domain.model.request.add_txn_list

data class AddTxnListBody(
    val transactionId: Int,
    val personId: Int,
    val inviteId: Int,
    val amount: Int
)
