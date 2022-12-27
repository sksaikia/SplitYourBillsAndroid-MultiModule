package com.example.feature_profile.data.mapper

import com.example.feature_profile.data.remote.response.UserProfileResponse

fun UserProfileResponse.toDomainUserProfileResponse(): com.example.feature_profile.domain.model.response.UserProfileResponse {
    return com.example.feature_profile.domain.model.response.UserProfileResponse(
        this.id,
        this.name,
        this.phoneNo,
        convertProfilePicToAndroidSpecificUrl(this.profilePic)
    )
}

/***
 * This is hacky way of loading images in Android from localhost. better use a service to
 * upload the image and have the link here, later use firebase to upload the image for App
 * and send the url to Backend.
 ***/
fun convertProfilePicToAndroidSpecificUrl(profilePic: String?): String? {
    return profilePic?.replace("localhost:8080/", "10.0.2.2:8080/")
}
