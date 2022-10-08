package com.example.feature_space.domain.model.response.txn_details_by_space


data class SingleTxnDetailResponse(
    val transactionDetailId: Int,
    val transactionId: Int,
    val amount: Int,
    val personId: Int,
    val inviteId: Int,
    val lastUpdated: String,
    val spaceId: Int,
    val transactionName: String,
    val transactionDescription: String,
    val spaceName: String,
    val spaceDescription: String,
    val userName: String?,
    val inviteName: String?
)
