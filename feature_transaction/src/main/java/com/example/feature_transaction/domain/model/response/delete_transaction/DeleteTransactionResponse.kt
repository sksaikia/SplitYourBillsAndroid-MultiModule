package com.example.feature_transaction.domain.model.response.delete_transaction

data class DeleteTransactionResponse(
    val success: Boolean,
    val data: DeletedTransactionResponse
) {
    data class DeletedTransactionResponse(
        val success: Boolean,
        val message: String,
        val code: String,
    )
}
