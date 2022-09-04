package com.example.feature_transaction.data.remote.response

import com.google.gson.annotations.SerializedName

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
    @SerializedName("lastUpdated")
    val lastUpdated : String,
    @SerializedName("joined")
    val joined : Boolean,
    @SerializedName("spaceResponse")
    val spaceDetailsResponse : SpaceDetailsResponse,
    @SerializedName("invite")
    val invite : InviteDetails? = null
) {
    data class UserDetails(
        @SerializedName("phoneNo")
        val phoneNo : String,
        @SerializedName("username")
        val username : String,
        @SerializedName("userId")
        val userId : Int,
    )
    data class InviteDetails(
        @SerializedName("inviteId")
        val inviteID : Int ,
        @SerializedName("spaceId")
        val spaceId : Int,
        @SerializedName("phoneNo")
        val phoneNo : String,
        @SerializedName("inviteName")
        val inviteNaem : String,
        @SerializedName("lastUpdated")
        val lastUpdated : String
    )
}
