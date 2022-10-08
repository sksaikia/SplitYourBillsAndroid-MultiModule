package com.example.feature_space.presentation.viewmodel.all_members

import com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailsBySpaceResponse

data class AllMembersForSpaceState(
    val isLoading: Boolean = false,
    val data: TxnDetailsBySpaceResponse? = null
)
