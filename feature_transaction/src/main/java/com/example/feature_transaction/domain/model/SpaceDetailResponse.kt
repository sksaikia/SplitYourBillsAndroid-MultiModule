package com.example.feature_transaction.domain.model

data class SpaceDetailsResponse(
    val spaceId : Int,
    val personId : Int,
    val spaceName : String,
    val spaceDescription : String,
    val lastUpdated : String,
    val active : Boolean
)