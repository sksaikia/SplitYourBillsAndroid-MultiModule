package com.example.feature_space.presentation.viewmodel.specific_space

import com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse

data class SingleSpaceState(
    val isLoading: Boolean = false,
    val data: SingleSpaceDetailsResponse? = null
)
