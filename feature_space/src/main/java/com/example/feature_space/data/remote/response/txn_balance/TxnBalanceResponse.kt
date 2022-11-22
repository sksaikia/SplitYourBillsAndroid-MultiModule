package com.example.feature_space.data.remote.response.txn_balance

import com.google.gson.annotations.SerializedName

data class TxnBalanceResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: TxnBalanceDataResponse
) {
    data class TxnBalanceDataResponse(
        @SerializedName("totalIn")
        val totalIn: Int,
        @SerializedName("totalOut")
        val totalOut: Int
    )
}
