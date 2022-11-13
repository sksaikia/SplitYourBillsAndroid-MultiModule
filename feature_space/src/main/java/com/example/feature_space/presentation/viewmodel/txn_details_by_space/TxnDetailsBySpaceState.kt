package com.example.feature_space.presentation.viewmodel.specific_space

import com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse

data class TxnDetailsBySpaceState(
    val isLoading: Boolean = false,
    val data: TxnDetailsBySpaceResponse? = null
)
