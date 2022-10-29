package com.example.feature_space.domain.model.response

data class SingleSpaceMemberResponse(
    val spaceMemberId: Int,
    val spaceId: Int,
    val personId: Int,
    val userDetails: UserDetails?,
    val inviteId: Int,
    val lastUpdated: String,
    val joined: Boolean,
    val spaceDetailsResponse: SpaceDetailsResponse?,
    val inviteDetails: InviteDetails? = null
) {
    data class UserDetails(
        val phoneNo: String,
        val username: String,
        val userId: Int
    )
    data class InviteDetails(
        val inviteID: Int,
        val spaceId: Int,
        val phoneNo: String,
        val inviteName: String,
        val lastUpdated: String
    )
}
