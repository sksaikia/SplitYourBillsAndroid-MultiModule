package com.example.feature_transaction.data.remote.request.create_transaction

import com.google.gson.annotations.SerializedName

data class CreateTransactionDTO(
    @SerializedName("spaceId")
    val spaceId: Int,
    @SerializedName("transactionName")
    val transactionName: String,
    @SerializedName("transactionDescription")
    val transactionDescription: String,
)