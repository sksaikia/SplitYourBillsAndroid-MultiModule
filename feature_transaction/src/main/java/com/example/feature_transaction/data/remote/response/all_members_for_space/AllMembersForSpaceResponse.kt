package com.example.feature_transaction.data.remote.response.all_members_for_space

import com.example.feature_transaction.data.remote.response.SingleSpaceMemberResponse
import com.example.feature_transaction.data.remote.response.all_spaces.GetAllSpacesResponse
import com.google.gson.annotations.SerializedName

data class AllMembersForSpaceResponse(
    @SerializedName("success")
    var success : Boolean,
    @SerializedName("data")
    var data : AllMembersForSpaceResponseData,
    //Add Error field
) {
    data class AllMembersForSpaceResponseData(
        @SerializedName("totalMembers")
        var totalMembers : Int,
        @SerializedName("spaceMemberResponses")
        var spaceMemberResponse : List<SingleSpaceMemberResponse>
    )
}
