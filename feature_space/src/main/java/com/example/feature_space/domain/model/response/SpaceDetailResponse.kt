package com.example.feature_space.domain.model.response

data class SpaceDetailsResponse(
    val spaceId : Int,
    val personId : Int,
    val spaceName : String,
    val spaceDescription : String,
    val lastUpdated : String,
    val active : Boolean
)