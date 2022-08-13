package com.example.feature_space.presentation.viewmodel.all_spaces

import com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse

data class AllSpacesState(
    val getAllSpacesResponse: GetAllSpacesResponse? = null,
    val isLoading: Boolean = false
)
