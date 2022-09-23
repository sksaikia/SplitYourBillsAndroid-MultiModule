package com.example.feature_space.data.remote.request.create_space

import com.google.gson.annotations.SerializedName

data class CreateSpaceDTO(
    @SerializedName("spaceName")
    val spaceName: String,
    @SerializedName("spaceDescription")
    val spaceDescription: String
)
