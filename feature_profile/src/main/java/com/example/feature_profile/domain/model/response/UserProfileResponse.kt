package com.example.feature_profile.domain.model.response

data class UserProfileResponse(
    val id: Long,
    val name: String,
    val phoneNo: String,
    val profilePic: String?
)
