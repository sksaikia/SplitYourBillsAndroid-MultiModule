package com.example.feature_transaction.domain.model.response.all_spaces

import com.example.feature_transaction.domain.model.SpaceDetailsResponse


data class GetAllSpacesResponse(
    val success : Boolean,
    val spacesResponse : SpacesResponse
) {
    data class SpacesResponse(
        val totalMembers : Int,
        val spaceMembers : List<SingleSpaceMemberResponse>
    ) {
        data class SingleSpaceMemberResponse(
            val spaceMemberId : Int,
            val spaceId : Int,
            val personId : Int,
            val userDetails : UserDetails,
            val inviteId : Int,
//            @SerializedName("invite")
//            val invite : Int,
            val lastUpdated : String,
            val joined : Boolean,
            val spaceDetailsResponse : SpaceDetailsResponse
        ) {
            data class UserDetails(
                val phoneNo : String,
                val username : String,
                val userId : Int,
            )
        }
    }
}

