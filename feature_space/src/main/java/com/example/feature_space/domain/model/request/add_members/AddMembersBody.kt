package com.example.feature_space.domain.model.request.add_members


data class AddMembersBody(
    val spaceId : String,
    val inviteName : String,
    val phoneNo : String
)
