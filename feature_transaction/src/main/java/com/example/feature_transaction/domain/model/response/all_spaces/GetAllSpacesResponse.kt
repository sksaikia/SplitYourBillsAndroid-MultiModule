package com.example.feature_transaction.domain.model.response.all_spaces

import com.example.feature_transaction.domain.model.SpaceDetailsResponse
import com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse


data class GetAllSpacesResponse(
    val success : Boolean,
    val spacesResponse : SpacesResponse
) {
    data class SpacesResponse(
        val totalMembers: Int,
        val spaceMembers: List<SingleSpaceMemberResponse>
    )
}

