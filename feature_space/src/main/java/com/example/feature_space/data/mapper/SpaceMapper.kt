package com.example.feature_space.data.mapper

import com.example.feature_space.data.remote.request.add_members.AddMembersDTO
import com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO
import com.example.feature_space.data.remote.response.SingleSpaceMemberResponse
import com.example.feature_space.data.remote.response.add_members.AddMembersResponse
import com.example.feature_space.data.remote.response.all_members_for_space.AllMembersForSpaceResponse
import com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.data.remote.response.txn_details_by_space.SingleTxnDetailResponse
import com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailResponse
import com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailsBySpaceResponse
import com.example.feature_space.domain.model.request.add_members.AddMembersBody
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
    val list =
        mutableListOf<com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse>()
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

fun List<AddMembersBody>.toDataAddMembersBody(): ArrayList<AddMembersDTO> {
    val list = ArrayList<AddMembersDTO>()
    this.forEach {
        val curr = it.toSingleAddMembersBody()
        list.add(curr)
    }

    return list
}

fun AddMembersBody.toSingleAddMembersBody(): AddMembersDTO {
    return AddMembersDTO(
        this.spaceId,
        this.inviteName,
        this.phoneNo
    )
}

fun AddMembersResponse.toDomainAddMembersResponse(): com.example.feature_space.domain.model.response.add_members.AddMembersResponse {
    return com.example.feature_space.domain.model.response.add_members.AddMembersResponse(
        success = this.success,
        data = this.data.toDomainAddMembersCountResponse()
    )
}

fun AddMembersResponse.AddMembersCountResponse.toDomainAddMembersCountResponse(): com.example.feature_space.domain.model.response.add_members.AddMembersResponse.AddMembersCountResponse {
    return com.example.feature_space.domain.model.response.add_members.AddMembersResponse.AddMembersCountResponse(
        this.registeredUsers,
        this.invitedUsers,
        this.errors,
        this.ignored
    )
}

fun TxnDetailsBySpaceResponse.toDomainTxnDetailsBySpaceResponse(): com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse {
    return com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse(
        this.success,
        this.data.convertTxnDetailToDomain()
    )
}

fun TxnDetailResponse.convertTxnDetailToDomain(): com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailResponse {
    return com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailResponse(
        this.totalTransactions,
        this.txnDetails.convertToSingleTxnDetailResponseList()
    )
}

fun List<SingleTxnDetailResponse>.convertToSingleTxnDetailResponseList(): List<com.example.feature_space.domain.model.response.txn_details_by_space.SingleTxnDetailResponse> {
    val list =
        ArrayList<com.example.feature_space.domain.model.response.txn_details_by_space.SingleTxnDetailResponse>()
    this.forEach {
        list.add(
            com.example.feature_space.domain.model.response.txn_details_by_space.SingleTxnDetailResponse(
                it.transactionDetailId,
                it.transactionId,
                it.amount,
                it.personId,
                it.inviteId,
                it.lastUpdated,
                it.spaceId,
                it.transactionName,
                it.transactionDescription,
                it.spaceName,
                it.spaceDescription,
                it.userName,
                it.inviteName
            )
        )
    }
    return list
}

fun AllMembersForSpaceResponse.toDomainAllMembersForSpaceResponse(): com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse {
    return com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse(
        success = this.success,
        data = this.data.toDomainAllmembersForSpaceResponse()
    )
}

fun AllMembersForSpaceResponse.AllMembersForSpaceResponseData.toDomainAllmembersForSpaceResponse(): com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData {
    return com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData(
        totalMembers = this.totalMembers,
        spaceMemberResponse = getSpaceMembersForAllmembersList(this.spaceMemberResponse)
    )
}

fun getSpaceMembersForAllmembersList(spaceMembers: List<SingleSpaceMemberResponse>): List<com.example.feature_space.domain.model.response.SingleSpaceMemberResponse> {
    val list =
        mutableListOf<com.example.feature_space.domain.model.response.SingleSpaceMemberResponse>()
    spaceMembers.forEach {
        list.add(it.toDomainSingleSpaceMemberResponse())
    }
    return list
}

fun SingleSpaceMemberResponse.toDomainSingleSpaceMemberResponse(): com.example.feature_space.domain.model.response.SingleSpaceMemberResponse {
    return com.example.feature_space.domain.model.response.SingleSpaceMemberResponse(
        this.spaceMemberId,
        this.spaceId,
        this.personId,
        this.userDetails?.toDomainUserDetails(),
        this.inviteId,
        this.lastUpdated,
        this.joined,
        this.spaceDetailsResponse?.toSpaceDetailsResponseDomain(),
        this.invite?.toInviteDetailsDomain()
    )
}

private fun SingleSpaceMemberResponse.InviteDetails?.toInviteDetailsDomain(): com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails {
    return com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails(
        this?.inviteID ?: 0,
        this?.spaceId ?: 0,
        this?.phoneNo ?: "",
        this?.inviteName ?: "",
        this?.lastUpdated ?: ""
    )
}

fun SingleSpaceMemberResponse.UserDetails.toDomainUserDetails(): com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails {
    return com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails(
        this.phoneNo,
        this.username,
        this.userId
    )
}
