package com.example.feature_space.data.remote.response

import com.google.gson.annotations.SerializedName

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