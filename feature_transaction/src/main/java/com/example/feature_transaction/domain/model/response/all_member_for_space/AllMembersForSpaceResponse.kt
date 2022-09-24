package com.example.feature_transaction.domain.model.response.all_member_for_space

import com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse

data class AllMembersForSpaceResponse(
    var success: Boolean,
    var data: AllMembersForSpaceResponseData
) {
    data class AllMembersForSpaceResponseData(
        var totalMembers: Int?,
        var spaceMemberResponse: List<SingleSpaceMemberResponse>
    )
}
