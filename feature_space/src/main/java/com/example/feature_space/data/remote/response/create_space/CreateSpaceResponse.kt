package com.example.feature_space.data.remote.response.create_space

import com.example.feature_space.data.remote.response.SpaceDetailsResponse
import com.google.gson.annotations.SerializedName

data class CreateSpaceResponse(
    @SerializedName("success")
    val success : Boolean,
    @SerializedName("data")
    val data : SpaceDetailsResponse
)
