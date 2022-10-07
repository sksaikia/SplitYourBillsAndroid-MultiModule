package com.example.feature_transaction.data.remote.response.get_txn_list

import com.example.feature_transaction.data.remote.response.single_txn_details.TransactionDetailsResponse
import com.google.gson.annotations.SerializedName

data class ListOfTransactionDetails(
    @SerializedName("totalTransactions")
    val totalTransactions: Int,
    @SerializedName("transactionDetailsResponse")
    val transactionDetailsResponse: TransactionDetailsResponse,
)
