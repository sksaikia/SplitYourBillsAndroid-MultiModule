package com.example.feature_space.presentation.viewmodel.get_txn_balance

import com.example.feature_space.domain.model.response.txn_balance.TxnBalanceResponse

data class GetTxnBalanceState(
    val isLoading: Boolean = false,
    val response: TxnBalanceResponse? = null
)
