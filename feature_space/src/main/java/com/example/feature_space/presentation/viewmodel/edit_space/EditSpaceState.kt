package com.example.feature_space.presentation.viewmodel.edit_space

import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse

data class EditSpaceState(
    val editSpaceResponse: CreateSpaceResponse? = null,
    val isLoading: Boolean = false
)
