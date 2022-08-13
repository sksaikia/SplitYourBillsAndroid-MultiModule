package com.example.feature_space.data.remote.response.all_spaces

import com.example.feature_space.data.remote.response.SpaceDetailsResponse
import com.google.gson.annotations.SerializedName

data class GetAllSpacesResponse(
    @SerializedName("success")
    val success : Boolean,
    @SerializedName("data")
    val spacesResponse : SpacesResponse
) {
    data class SpacesResponse(
        @SerializedName("totalMembers")
        val totalMembers : Int,
        @SerializedName("spaceMemberResponses")
        val spaceMembers : List<SingleSpaceMemberResponse>
    ) {
        data class SingleSpaceMemberResponse(
            @SerializedName("spaceMemberId")
            val spaceMemberId : Int,
            @SerializedName("spaceId")
            val spaceId : Int,
            @SerializedName("personId")
            val personId : Int,
            @SerializedName("userDetails")
            val userDetails : UserDetails,
            @SerializedName("inviteId")
            val inviteId : Int,
//            @SerializedName("invite")
//            val invite : Int,
            @SerializedName("lastUpdated")
            val lastUpdated : String,
            @SerializedName("joined")
            val joined : Boolean,
            @SerializedName("spaceResponse")
            val spaceDetailsResponse : SpaceDetailsResponse
        ) {
            data class UserDetails(
                @SerializedName("phoneNo")
                val phoneNo : String,
                @SerializedName("username")
                val username : String,
                @SerializedName("userId")
                val userId : Int,
            )
        }
    }
}

