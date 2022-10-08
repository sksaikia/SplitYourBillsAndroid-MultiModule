package com.example.feature_space.data.remote.response.txn_details_by_space

import com.google.gson.annotations.SerializedName

data class TxnDetailsBySpaceResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: TxnDetailResponse
)
