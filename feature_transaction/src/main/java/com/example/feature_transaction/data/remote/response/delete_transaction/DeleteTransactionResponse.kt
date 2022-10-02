package com.example.feature_transaction.data.remote.response.delete_transaction

import com.google.gson.annotations.SerializedName

data class DeleteTransactionResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: DeletedTransactionResponse
) {
    data class DeletedTransactionResponse(
        @SerializedName("success")
        val success: Boolean,
        @SerializedName("message")
        val message: String,
        @SerializedName("code")
        val code: String,
    )
}
