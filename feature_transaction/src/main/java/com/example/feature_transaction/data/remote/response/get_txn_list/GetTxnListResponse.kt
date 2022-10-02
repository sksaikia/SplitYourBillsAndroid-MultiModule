package com.example.feature_transaction.data.remote.response.get_txn_list

import com.google.gson.annotations.SerializedName

data class GetTxnListResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: ListOfTransactionDetails,
)