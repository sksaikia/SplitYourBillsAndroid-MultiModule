package com.example.feature_transaction.data.remote.response.create_transaction

import com.google.gson.annotations.SerializedName

data class CreateTransactionResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: CreatedTransactionResponse
) {
    data class CreatedTransactionResponse(
        @SerializedName("transactionId")
        val transactionId: Int,
        @SerializedName("spaceId")
        val spaceId: Int,
        @SerializedName("transactionName")
        val transactionName: String,
        @SerializedName("transactionDescription")
        val transactionDescription: String,
        @SerializedName("lastUpdated")
        val lastUpdated: String,
    )
}
