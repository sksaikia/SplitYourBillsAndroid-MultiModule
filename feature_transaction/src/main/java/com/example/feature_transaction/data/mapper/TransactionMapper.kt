package com.example.feature_transaction.data.mapper

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

fun getSpaceMembers(spaceMembers: List<GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse>)
        : List<com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse> {
    val list = mutableListOf<com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse>()
    spaceMembers.forEach {
        list.add(it.toDomainSingleSpaceMemberResponse())
    }
    return list
}

fun GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.toDomainSingleSpaceMemberResponse()
        : com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse {
    return com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse(
        this.spaceMemberId,
        this.spaceId,
        this.personId,
        this.userDetails.toDomainUserDetails(),
        this.inviteId,
        this.lastUpdated,
        this.joined,
        this.spaceDetailsResponse.toSpaceDetailsResponseDomain()
    )
}

fun GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails.toDomainUserDetails()
        : com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails {
    return com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails (
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
