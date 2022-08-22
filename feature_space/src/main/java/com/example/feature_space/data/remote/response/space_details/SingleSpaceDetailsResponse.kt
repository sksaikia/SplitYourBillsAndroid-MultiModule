package com.example.feature_space.data.remote.response.space_details

import com.google.gson.annotations.SerializedName

data class SingleSpaceDetailsResponse(
    @SerializedName("success")
    val success : Boolean,
    @SerializedName("data")
    val spacesResponse : SingleSpaceDetail
) {
    data class SingleSpaceDetail(
        @SerializedName("spaceId")
        val spaceId : Long,
        @SerializedName("personId")
        val personId : Long,
        @SerializedName("spaceName")
        val spaceName : String,
        @SerializedName("spaceDescription")
        val spaceDescription : String,
        @SerializedName("lastUpdated")
        val lastUpdated : String,
        @SerializedName("active")
        val active : Boolean,
        @SerializedName("userResponse")
        val userResponse : UserResponse,
    ) {
        data class UserResponse(
            @SerializedName("phoneNo")
            val phoneNo : String,
            @SerializedName("username")
            val username : String,
            @SerializedName("userId")
            val userId : Long,
        )
    }
}
