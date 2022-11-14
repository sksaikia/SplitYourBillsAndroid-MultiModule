package com.example.feature_transaction.data.remote.request.add_txn_list

import com.google.gson.annotations.SerializedName

data class AddTxnListDTO(
    @SerializedName("transactionId")
    val transactionId: Int,
    @SerializedName("personId")
    val personId: Int,
    @SerializedName("inviteId")
    val inviteId: Int,
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("payableAmount")
    val payableAmount: Long
)
