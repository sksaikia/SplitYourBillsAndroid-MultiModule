package com.example.feature_space.domain.model.response.create_space

import com.example.feature_space.domain.model.response.SpaceDetailsResponse


data class CreateSpaceResponse(
    val success : Boolean,
    val data : SpaceDetailsResponse
)
