package com.example.feature_space.domain.model.response.space_details

data class SingleSpaceDetailsResponse(
    val success: Boolean,
    val spacesResponse: SingleSpaceDetail
) {
    data class SingleSpaceDetail(
        val spaceId: Long,
        val personId: Long,
        val spaceName: String,
        val spaceDescription: String,
        val lastUpdated: String,
        val active: Boolean,
        val userResponse: UserResponse
    ) {
        data class UserResponse(
            val phoneNo: String,
            val username: String,
            val userId: Long
        )
    }
}
