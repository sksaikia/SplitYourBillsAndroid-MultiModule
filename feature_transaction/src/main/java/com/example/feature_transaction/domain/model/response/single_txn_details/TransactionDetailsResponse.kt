package com.example.feature_transaction.domain.model.response.single_txn_details

import com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse
import com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse

data class TransactionDetailsResponse(
    // TYPO here
    val trasnactionDetailId: Int,
    val transactionId: Int,
    val transaction: CreateTransactionResponse.CreatedTransactionResponse,
    val personId: Int,
    val userDetails: SingleSpaceMemberResponse.UserDetails?,
    val inviteId: Int,
    val inviteDetails: SingleSpaceMemberResponse.InviteDetails?,
    val amount: Int,
    val lastUpdated: String,
    val payableAmount: Long
)
