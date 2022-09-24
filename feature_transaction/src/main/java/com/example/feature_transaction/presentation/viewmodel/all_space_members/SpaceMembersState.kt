package com.example.feature_transaction.presentation.viewmodel.all_space_members

import com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse

data class SpaceMembersState(
    val allSpaceMembers: AllMembersForSpaceResponse? = null,
    val isLoading: Boolean = true
)
