package com.example.feature_profile.data.remote.response

import com.google.gson.annotations.SerializedName

data class UserProfileResponse(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("username")
    val userName: Long,
    @SerializedName("profilePic")
    val profilePic: String
)
