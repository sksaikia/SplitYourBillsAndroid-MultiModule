package com.example.feature_space.domain.model.response.add_members


data class AddMembersResponse(
    val success: Boolean,
    val data: AddMembersCountResponse
) {
    data class AddMembersCountResponse(
        val registeredUsers: Int,
        val invitedUsers: Int,
        val errors: Int,
        val ignored: Int
    )
}
