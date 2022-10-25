package com.example.feature_space.data.remote.response.all_members_for_space

import com.example.feature_space.data.remote.response.SingleSpaceMemberResponse
import com.google.gson.annotations.SerializedName

data class AllMembersForSpaceResponse(
    @SerializedName("success")
    var success: Boolean,
    @SerializedName("data")
    var data: AllMembersForSpaceResponseData
    // Add Error field
) {
    data class AllMembersForSpaceResponseData(
        @SerializedName("totalMembers")
        var totalMembers: Int,
        @SerializedName("spaceMemberResponses")
        var spaceMemberResponse: List<SingleSpaceMemberResponse>
    )
}
