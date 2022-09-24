package com.example.feature_space.data.mapper

import com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO
import com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.SpaceDetailsResponse
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse
import com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse

fun CreateSpaceBody.convertToCreateSpaceBodyData(): CreateSpaceDTO {
    return CreateSpaceDTO(
        this.spaceName,
        this.spaceDescription
    )
}

fun com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse.convertToCreateSpaceResponseBodyData(): CreateSpaceResponse {
    return CreateSpaceResponse(
        success = this.success,
        data = this.data.toSpaceDetailsResponseDomain()
    )
}

fun com.example.feature_space.data.remote.response.SpaceDetailsResponse.toSpaceDetailsResponseDomain(): SpaceDetailsResponse {
    return SpaceDetailsResponse(
        this.spaceId,
        this.personId,
        this.spaceName,
        this.spaceDescription,
        this.lastUpdated,
        this.active
    )
}

fun GetAllSpacesResponse.toDomainGetAllSpacesResponse(): com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse {
    return com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse(
        this.success,
        spacesResponse = this.spacesResponse.toDomainSpacesResponse()
    )
}

fun GetAllSpacesResponse.SpacesResponse.toDomainSpacesResponse(): com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse {
    return com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse(
        totalMembers = this.totalMembers,
        spaceMembers = getSpaceMembers(this.spaceMembers)
    )
}

fun getSpaceMembers(spaceMembers: List<GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse>): List<com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse> {
    val list = mutableListOf<com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse>()
    spaceMembers.forEach {
        list.add(it.toDomainSingleSpaceMemberResponse())
    }
    return list
}

fun GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.toDomainSingleSpaceMemberResponse(): com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse {
    return com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse(
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

fun GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails.toDomainUserDetails(): com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails {
    return com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails(
        this.phoneNo,
        this.username,
        this.userId
    )
}

fun com.example.feature_space.data.remote.response.SpaceDetailsResponse.toDomainSpaceDetailsResponse(): SpaceDetailsResponse {
    return SpaceDetailsResponse(
        this.spaceId,
        this.personId,
        this.spaceName,
        this.spaceDescription,
        this.lastUpdated,
        this.active
    )
}

fun com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.toDomainSingleSpaceMemberResponse(): SingleSpaceDetailsResponse {
    return SingleSpaceDetailsResponse(
        success = this.success,
        spacesResponse = this.spacesResponse.toDomainSingleSpaceDetail()
    )
}

fun com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.toDomainSingleSpaceDetail(): SingleSpaceDetailsResponse.SingleSpaceDetail {
    return SingleSpaceDetailsResponse.SingleSpaceDetail(
        spaceId = this.spaceId,
        personId = this.personId,
        spaceName = this.spaceName,
        spaceDescription = this.spaceDescription,
        lastUpdated = this.lastUpdated,
        active = this.active,
        userResponse = this.userResponse.toDomainUserResponse()
    )
}

fun com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse.toDomainUserResponse(): SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse {
    return SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse(
        phoneNo,
        username,
        userId
    )
}
