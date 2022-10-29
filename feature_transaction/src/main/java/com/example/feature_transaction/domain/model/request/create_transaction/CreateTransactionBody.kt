package com.example.feature_transaction.domain.model.request.create_transaction

data class CreateTransactionBody(
    val spaceId: Int,
    val transactionName: String,
    val transactionDescription: String,
)
