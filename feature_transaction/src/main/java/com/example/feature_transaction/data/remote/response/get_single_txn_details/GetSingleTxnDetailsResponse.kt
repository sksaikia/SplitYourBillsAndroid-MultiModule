package com.example.feature_transaction.data.remote.response.get_single_txn_details

import com.example.feature_transaction.data.remote.response.get_txn_list.TransactionDetailsResponse
import com.google.gson.annotations.SerializedName

data class GetSingleTxnDetailsResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: TransactionDetailsResponse,
)