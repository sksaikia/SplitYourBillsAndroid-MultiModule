package com.example.feature_transaction.data.remote.response.delete_txn_detail

import com.google.gson.annotations.SerializedName

data class DeleteTxnDetailsResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("code")
    val code: String
)
