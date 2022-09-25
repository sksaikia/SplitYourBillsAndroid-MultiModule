package com.example.feature_space.data.remote.request.add_members

import com.google.gson.annotations.SerializedName

data class AddMembersDTO(
    @SerializedName("spaceId")
    val spaceId: String,
    @SerializedName("inviteName")
    val inviteName: String,
    @SerializedName("phoneNo")
    val phoneNo: String
)
