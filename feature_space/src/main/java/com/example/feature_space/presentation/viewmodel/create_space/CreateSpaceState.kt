package com.example.feature_space.presentation.viewmodel.create_space

import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse

data class CreateSpaceState(
    val createSpaceResponse: CreateSpaceResponse? = null,
    val isLoading: Boolean = false
)
