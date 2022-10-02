package com.example.feature_transaction.data.remote.response.get_txn_list

import com.google.gson.annotations.SerializedName

data class ListOfTransactionDetails(
    @SerializedName("totalTransactions")
    val totalTransactions: Int,
    @SerializedName("transactionDetailsResponse")
    val transactionDetailsResponse: TransactionDetailsResponse,
)
