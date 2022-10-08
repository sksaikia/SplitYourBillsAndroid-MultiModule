package com.example.feature_space.data.remote.response.txn_details_by_space

import com.google.gson.annotations.SerializedName

data class TxnDetailResponse(
    @SerializedName("totalTransactions")
    val totalTransactions: Int,
    @SerializedName("transactionDetailsResponse")
    val txnDetails: List<SingleTxnDetailResponse>
)
