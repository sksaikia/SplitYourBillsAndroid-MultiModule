package com.example.feature_transaction.data.remote.response.single_txn_details

import com.example.feature_transaction.data.remote.response.SingleSpaceMemberResponse
import com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse
import com.google.gson.annotations.SerializedName

data class TransactionDetailsResponse(
    //TYPO here
    @SerializedName("trasnactionDetailId")
    val trasnactionDetailId: Int,
    @SerializedName("transactionId")
    val transactionId: Int,
    @SerializedName("transaction")
    val transaction: CreateTransactionResponse.CreatedTransactionResponse,
    @SerializedName("personId")
    val personId: Int,
    @SerializedName("user")
    val userDetails: SingleSpaceMemberResponse.UserDetails?,
    @SerializedName("inviteId")
    val inviteId: Int,
    @SerializedName("invite")
    val inviteDetails: SingleSpaceMemberResponse.InviteDetails?,
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("lastUpdated")
    val lastUpdated: String,
)
