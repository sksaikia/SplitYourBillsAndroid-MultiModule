package com.example.feature_transaction.data.remote.response.all_spaces

import com.example.feature_transaction.data.remote.response.SingleSpaceMemberResponse
import com.google.gson.annotations.SerializedName

data class GetAllSpacesResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val spacesResponse: SpacesResponse
) {
    data class SpacesResponse(
        @SerializedName("totalMembers")
        val totalMembers: Int,
        @SerializedName("spaceMemberResponses")
        val spaceMembers: List<SingleSpaceMemberResponse>
    )
}
