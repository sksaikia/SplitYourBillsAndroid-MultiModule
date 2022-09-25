package com.example.feature_space.presentation.viewmodel.add_members

import com.example.feature_space.domain.model.response.add_members.AddMembersResponse

data class AddMembersState(
    val response: AddMembersResponse? = null,
    val isLoading: Boolean = false
)
