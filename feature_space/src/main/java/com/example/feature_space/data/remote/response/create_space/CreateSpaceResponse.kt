package com.example.feature_space.data.remote.response.create_space

import com.google.gson.annotations.SerializedName

data class CreateSpaceResponse(
    @SerializedName("success")
    val success : Boolean,
    @SerializedName("data")
    val data : SpaceDetailsResponse
) {
    data class SpaceDetailsResponse(
        @SerializedName("spaceId")
        val spaceId : Int,
        @SerializedName("personId")
        val personId : Int,
        @SerializedName("spaceName")
        val spaceName : String,
        @SerializedName("spaceDescription")
        val spaceDescription : String,
        @SerializedName("lastUpdated")
        val lastUpdated : String,
        @SerializedName("active")
        val active : Boolean
    )
}
