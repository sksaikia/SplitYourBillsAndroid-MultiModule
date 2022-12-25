package com.example.feature_profile.data.mapper

import com.example.feature_profile.data.remote.response.UserProfileResponse

fun UserProfileResponse.toDomainUserProfileResponse() : com.example.feature_profile.domain.model.response.UserProfileResponse{
    return com.example.feature_profile.domain.model.response.UserProfileResponse(
        this.id,
        this.name,
        this.userName,
        this.profilePic
    )
}