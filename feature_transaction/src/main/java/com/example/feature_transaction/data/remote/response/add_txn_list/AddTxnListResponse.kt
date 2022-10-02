package com.example.feature_transaction.data.remote.response.add_txn_list

import com.google.gson.annotations.SerializedName

data class AddTxnListResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: AddTxnListDetails,
) {
    data class AddTxnListDetails(
        @SerializedName("success")
        val success: Int,
        @SerializedName("failure")
        val failure: Int,
        @SerializedName("ignored")
        val ignored: Int,
    )
}
