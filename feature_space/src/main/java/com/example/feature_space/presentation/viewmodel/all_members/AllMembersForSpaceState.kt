package com.example.feature_space.presentation.viewmodel.all_members

import com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse

data class AllMembersForSpaceState(
    val isLoading: Boolean = false,
    val data: AllMembersForSpaceResponse? = null
)
