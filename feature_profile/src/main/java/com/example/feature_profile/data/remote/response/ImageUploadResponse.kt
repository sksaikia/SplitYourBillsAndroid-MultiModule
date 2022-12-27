package com.example.feature_profile.data.remote.response

import com.google.gson.annotations.SerializedName

data class ImageUploadResponse(
    @SerializedName("message")
    val message: String = "",
    @SerializedName("url")
    val url: String = ""
)