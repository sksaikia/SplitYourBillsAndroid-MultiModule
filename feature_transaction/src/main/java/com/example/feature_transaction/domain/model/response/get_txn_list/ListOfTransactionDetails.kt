package com.example.feature_transaction.domain.model.response.get_txn_list

import com.example.feature_transaction.domain.model.response.single_txn_details.TransactionDetailsResponse

data class ListOfTransactionDetails(
    val totalTransactions: Int,
    val transactionDetailsResponse: TransactionDetailsResponse
)
