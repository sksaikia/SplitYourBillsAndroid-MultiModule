package com.example.feature_transaction.domain.model.response.create_transaction

data class CreateTransactionResponse(
    val success: Boolean,
    val data: CreatedTransactionResponse
) {
    data class CreatedTransactionResponse(
        val transactionId: Int,
        val spaceId: Int,
        val transactionName: String,
        val transactionDescription: String,
        val lastUpdated: String
    )
}
