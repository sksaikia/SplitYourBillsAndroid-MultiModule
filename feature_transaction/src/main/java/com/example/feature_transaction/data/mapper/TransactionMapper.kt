package com.example.feature_transaction.data.mapper

import com.example.feature_transaction.data.remote.response.SingleSpaceMemberResponse
import com.example.feature_transaction.data.remote.response.all_members_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.data.remote.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.domain.model.SpaceDetailsResponse


fun GetAllSpacesResponse.toDomainGetAllSpacesResponse()
        : com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse {
    return com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse(
        this.success,
        spacesResponse = this.spacesResponse.toDomainSpacesResponse()
    )
}

fun GetAllSpacesResponse.SpacesResponse.toDomainSpacesResponse ()
        : com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse {
    return com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse (
        totalMembers = this.totalMembers,
        spaceMembers = getSpaceMembers(this.spaceMembers)
    )
}

fun getSpaceMembers(spaceMembers: List<SingleSpaceMemberResponse>)
        : List<com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse> {
    val list = mutableListOf<com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse>()
    spaceMembers.forEach {
        list.add(it.toDomainSingleSpaceMemberResponse())
    }
    return list
}

fun SingleSpaceMemberResponse.toDomainSingleSpaceMemberResponse()
        : com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse {
    return com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse(
        this.spaceMemberId,
        this.spaceId,
        this.personId,
        this.userDetails?.toDomainUserDetails(),
        this.inviteId,
        this.lastUpdated,
        this.joined,
        this.spaceDetailsResponse?.toSpaceDetailsResponseDomain()
    )
}

fun SingleSpaceMemberResponse.UserDetails.toDomainUserDetails()
        : com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails {
    return com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails (
        this.phoneNo,
        this.username,
        this.userId
    )
}

fun com.example.feature_transaction.data.remote.response.SpaceDetailsResponse.toSpaceDetailsResponseDomain()
        : SpaceDetailsResponse {
    return SpaceDetailsResponse (
        this.spaceId,
        this.personId,
        this.spaceName,
        this.spaceDescription,
        this.lastUpdated,
        this.active
    )
}

fun AllMembersForSpaceResponse.toDomainAllMembersForSpaceResponse() : com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse {
    return com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse(
        success = this.success,
        data = this.data.toDomainAllmembersForSpaceResponse()
    )
}

fun AllMembersForSpaceResponse.AllMembersForSpaceResponseData.toDomainAllmembersForSpaceResponse() : com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData {
    return com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData(
        totalMembers = this.totalMembers,
        spaceMemberResponse = getSpaceMembers(this.spaceMemberResponse)
    )
}

//fun getSpaceMembers(spaceMembers: List<SingleSpaceMemberResponse>)
//        : List<com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse> {
//    val list = mutableListOf<com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse>()
//    spaceMembers.forEach {
//        list.add(it.toDomainSingleSpaceMemberResponse())
//    }
//    return list
//}
