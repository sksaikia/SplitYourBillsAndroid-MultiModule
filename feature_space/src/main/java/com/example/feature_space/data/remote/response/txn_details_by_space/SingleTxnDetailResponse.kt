package com.example.feature_space.data.remote.response.txn_details_by_space

import com.google.gson.annotations.SerializedName

data class SingleTxnDetailResponse(
    @SerializedName("transactionDetailId")
    val transactionDetailId: Int,
    @SerializedName("transactionId")
    val transactionId: Int,
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("personId")
    val personId: Int,
    @SerializedName("inviteId")
    val inviteId: Int,
    @SerializedName("lastUpdated")
    val lastUpdated: String,
    @SerializedName("spaceId")
    val spaceId: Int,
    @SerializedName("transactionName")
    val transactionName: String,
    @SerializedName("transactionDescription")
    val transactionDescription: String,
    @SerializedName("spaceName")
    val spaceName: String,
    @SerializedName("spaceDescription")
    val spaceDescription: String,
    @SerializedName("userName")
    val userName: String?,
    @SerializedName("inviteName")
    val inviteName: String?
)
