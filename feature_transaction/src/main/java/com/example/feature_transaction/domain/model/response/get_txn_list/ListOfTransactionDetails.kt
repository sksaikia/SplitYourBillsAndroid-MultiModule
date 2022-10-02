package com.example.feature_transaction.domain.model.response.get_txn_list

import com.google.gson.annotations.SerializedName

data class ListOfTransactionDetails(
    val totalTransactions: Int,
    val transactionDetailsResponse: TransactionDetailsResponse
)
