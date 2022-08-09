package com.example.feature_space.domain.model.response.create_space


data class CreateSpaceResponse(
    val success : Boolean,
    val data : SpaceDetailsResponse
) {
    data class SpaceDetailsResponse(
        val spaceId : Int,
        val personId : Int,
        val spaceName : String,
        val spaceDescription : String,
        val lastUpdated : String,
        val active : Boolean
    )
}
