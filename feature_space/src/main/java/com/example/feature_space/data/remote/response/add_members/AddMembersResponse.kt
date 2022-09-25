package com.example.feature_space.data.remote.response.add_members

import com.google.gson.annotations.SerializedName

data class AddMembersResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: AddMembersCountResponse
) {
    data class AddMembersCountResponse(
        @SerializedName("registeredUsers")
        val registeredUsers: Int,
        @SerializedName("invitedUsers")
        val invitedUsers: Int,
        @SerializedName("errors")
        val errors: Int,
        @SerializedName("ignored")
        val ignored: Int
    )
}
