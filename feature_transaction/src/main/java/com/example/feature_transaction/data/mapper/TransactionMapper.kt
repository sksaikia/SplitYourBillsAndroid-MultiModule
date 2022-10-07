package com.example.feature_transaction.data.mapper

import com.example.feature_transaction.data.remote.request.add_txn_list.AddTxnListDTO
import com.example.feature_transaction.data.remote.request.create_transaction.CreateTransactionDTO
import com.example.feature_transaction.data.remote.response.SingleSpaceMemberResponse
import com.example.feature_transaction.data.remote.response.add_txn_list.AddTxnListResponse
import com.example.feature_transaction.data.remote.response.all_members_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.data.remote.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.data.remote.response.delete_transaction.DeleteTransactionResponse
import com.example.feature_transaction.data.remote.response.delete_txn_detail.DeleteTxnDetailsResponse
import com.example.feature_transaction.data.remote.response.get_single_txn_details.GetSingleTxnDetailsResponse
import com.example.feature_transaction.data.remote.response.get_txn_list.GetTxnListResponse
import com.example.feature_transaction.data.remote.response.single_txn_details.TransactionDetailsResponse
import com.example.feature_transaction.domain.model.SpaceDetailsResponse
import com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody
import com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody
import com.example.feature_transaction.domain.model.response.get_txn_list.ListOfTransactionDetails

fun GetAllSpacesResponse.toDomainGetAllSpacesResponse(): com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse {
    return com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse(
        this.success,
        spacesResponse = this.spacesResponse.toDomainSpacesResponse()
    )
}

fun GetAllSpacesResponse.SpacesResponse.toDomainSpacesResponse(): com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse {
    return com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse(
        totalMembers = this.totalMembers,
        spaceMembers = getSpaceMembers(this.spaceMembers)
    )
}

fun getSpaceMembers(spaceMembers: List<SingleSpaceMemberResponse>): List<com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse> {
    val list = mutableListOf<com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse>()
    spaceMembers.forEach {
        list.add(it.toDomainSingleSpaceMemberResponse())
    }
    return list
}

fun SingleSpaceMemberResponse.toDomainSingleSpaceMemberResponse(): com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse {
    return com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse(
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

private fun SingleSpaceMemberResponse.InviteDetails?.toInviteDetailsDomain(): com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.InviteDetails {
    return com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.InviteDetails(
        this?.inviteID ?: 0,
        this?.spaceId ?: 0,
        this?.phoneNo ?: "",
        this?.inviteName ?: "",
        this?.lastUpdated ?: ""
    )
}

fun SingleSpaceMemberResponse.UserDetails.toDomainUserDetails(): com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails {
    return com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails(
        this.phoneNo,
        this.username,
        this.userId
    )
}

fun com.example.feature_transaction.data.remote.response.SpaceDetailsResponse.toSpaceDetailsResponseDomain(): SpaceDetailsResponse {
    return SpaceDetailsResponse(
        this.spaceId,
        this.personId,
        this.spaceName,
        this.spaceDescription,
        this.lastUpdated,
        this.active
    )
}

fun AllMembersForSpaceResponse.toDomainAllMembersForSpaceResponse(): com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse {
    return com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse(
        success = this.success,
        data = this.data.toDomainAllmembersForSpaceResponse()
    )
}

fun AllMembersForSpaceResponse.AllMembersForSpaceResponseData.toDomainAllmembersForSpaceResponse(): com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData {
    return com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData(
        totalMembers = this.totalMembers,
        spaceMemberResponse = getSpaceMembers(this.spaceMemberResponse)
    )
}

fun CreateTransactionBody.toCreateTransactionDTO(): CreateTransactionDTO {
    return CreateTransactionDTO(
        this.spaceId,
        this.transactionName,
        this.transactionDescription
    )
}

fun CreateTransactionResponse.toDomainCreateTransactionResponse(): com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse {
    return com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse(
        this.success,
        data = this.data.convertToDomainCreatedTransactionResponse()
    )
}

fun CreateTransactionResponse.CreatedTransactionResponse.convertToDomainCreatedTransactionResponse(): com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse {
    return com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse(
        this.transactionId,
        this.spaceId,
        this.transactionName,
        this.transactionDescription,
        this.lastUpdated
    )
}

fun DeleteTransactionResponse.toDomainDeleteTransactionResponse(): com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse {
    return com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse(
        this.success,
        data = this.data.convertToDeletedTransactionResponse()
    )
}

fun DeleteTransactionResponse.DeletedTransactionResponse.convertToDeletedTransactionResponse(): com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse.DeletedTransactionResponse {
    return com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse.DeletedTransactionResponse(
        this.success,
        this.message,
        this.code
    )
}

fun List<AddTxnListBody>.toAddTxnDTO(): List<AddTxnListDTO> {
    val list = mutableListOf<AddTxnListDTO>()
    this.forEach { list.add(it.toAddTxnSingleDTO())
    }
    return list
}

fun AddTxnListBody.toAddTxnSingleDTO(): AddTxnListDTO {
    return AddTxnListDTO(
        this.transactionId,
        this.personId,
        this.inviteId,
        this.amount
    )
}

fun AddTxnListResponse.toDomainAddTxnListResponse(): com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse {
    return com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse(
        this.success,
        this.data.convertToAddTxnListDetails()
    )
}

fun AddTxnListResponse.AddTxnListDetails.convertToAddTxnListDetails(): com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse.AddTxnListDetails {
    return com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse.AddTxnListDetails(
        this.success,
        this.failure,
        this.ignored
    )
}

fun GetTxnListResponse.toDomainGetTxnDetailsResponse(): com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse {
    return com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse(
        this.success,
        this.data.convertToListOfTxnDetails()
    )
}

fun com.example.feature_transaction.data.remote.response.get_txn_list.ListOfTransactionDetails.convertToListOfTxnDetails(): ListOfTransactionDetails {
    return ListOfTransactionDetails(
        this.totalTransactions,
        this.transactionDetailsResponse.toDomainTransactionDetailsResponse()
    )
}

fun TransactionDetailsResponse.toDomainTransactionDetailsResponse(): com.example.feature_transaction.domain.model.response.single_txn_details.TransactionDetailsResponse {
    return com.example.feature_transaction.domain.model.response.single_txn_details.TransactionDetailsResponse(
        this.trasnactionDetailId,
        this.transactionId,
        this.transaction.convertToDomainCreatedTransactionResponse(),
        this.personId,
        this.userDetails?.toDomainUserDetails(),
        this.inviteId,
        this.inviteDetails?.toInviteDetailsDomain(),
        this.amount,
        this.lastUpdated
    )
}

fun GetSingleTxnDetailsResponse.toDomainGetSingleTxnDetails(): com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse {
    return com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse(
        this.success,
        this.data.toDomainTransactionDetailsResponse()
    )
}

fun DeleteTxnDetailsResponse.toDomainDeleteTxnDetailsResponse(): com.example.feature_transaction.domain.model.response.delete_txn_detail.DeleteTxnDetailsResponse {
    return com.example.feature_transaction.domain.model.response.delete_txn_detail.DeleteTxnDetailsResponse(
        this.success,
        this.message,
        this.code
    )
}
