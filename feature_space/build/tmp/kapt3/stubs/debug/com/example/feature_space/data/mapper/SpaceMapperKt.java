package com.example.feature_space.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u00f6\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\b\u0012\u0004\u0012\u00020\u00100\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017*\b\u0012\u0004\u0012\u00020\u00180\u0001\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u001b\u001a\n\u0010\u001c\u001a\u00020\u001d*\u00020\u001e\u001a\n\u0010\u001f\u001a\u00020 *\u00020!\u001a\n\u0010\"\u001a\u00020#*\u00020$\u001a\n\u0010%\u001a\u00020&*\u00020\'\u001a\n\u0010(\u001a\u00020)*\u00020*\u001a\n\u0010+\u001a\u00020,*\u00020-\u001a\n\u0010.\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010.\u001a\u00020\u0002*\u00020\u0004\u001a\n\u0010.\u001a\u00020/*\u000200\u001a\n\u00101\u001a\u000202*\u000203\u001a\n\u00104\u001a\u000205*\u000206\u001a\n\u00107\u001a\u000208*\u000209\u001a\n\u0010:\u001a\u00020;*\u00020<\u001a\n\u0010=\u001a\u00020>*\u00020?\u001a\n\u0010=\u001a\u00020@*\u00020A\u001a\n\u0010B\u001a\u00020C*\u00020D\u001a\u000e\u0010E\u001a\u00020F*\u0004\u0018\u00010GH\u0002\u001a\n\u0010H\u001a\u00020\u0016*\u00020\u0018\u001a\n\u0010I\u001a\u000202*\u000203\u00a8\u0006J"}, d2 = {"getSpaceMembers", "", "Lcom/example/feature_space/domain/model/response/all_spaces/GetAllSpacesResponse$SpacesResponse$SingleSpaceMemberResponse;", "spaceMembers", "Lcom/example/feature_space/data/remote/response/all_spaces/GetAllSpacesResponse$SpacesResponse$SingleSpaceMemberResponse;", "getSpaceMembersForAllmembersList", "Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse;", "Lcom/example/feature_space/data/remote/response/SingleSpaceMemberResponse;", "convertToCreateSpaceBodyData", "Lcom/example/feature_space/data/remote/request/create_space/CreateSpaceDTO;", "Lcom/example/feature_space/domain/model/request/create_space/CreateSpaceBody;", "convertToCreateSpaceResponseBodyData", "Lcom/example/feature_space/domain/model/response/create_space/CreateSpaceResponse;", "Lcom/example/feature_space/data/remote/response/create_space/CreateSpaceResponse;", "convertToSingleTxnDetailResponseList", "Lcom/example/feature_space/domain/model/response/txn_details_by_space/SingleTxnDetailResponse;", "Lcom/example/feature_space/data/remote/response/txn_details_by_space/SingleTxnDetailResponse;", "convertTxnDetailToDomain", "Lcom/example/feature_space/domain/model/response/txn_details_by_space/TxnDetailResponse;", "Lcom/example/feature_space/data/remote/response/txn_details_by_space/TxnDetailResponse;", "toDataAddMembersBody", "Ljava/util/ArrayList;", "Lcom/example/feature_space/data/remote/request/add_members/AddMembersDTO;", "Lkotlin/collections/ArrayList;", "Lcom/example/feature_space/domain/model/request/add_members/AddMembersBody;", "toDomainAddMembersCountResponse", "Lcom/example/feature_space/domain/model/response/add_members/AddMembersResponse$AddMembersCountResponse;", "Lcom/example/feature_space/data/remote/response/add_members/AddMembersResponse$AddMembersCountResponse;", "toDomainAddMembersResponse", "Lcom/example/feature_space/domain/model/response/add_members/AddMembersResponse;", "Lcom/example/feature_space/data/remote/response/add_members/AddMembersResponse;", "toDomainAllMembersForSpaceResponse", "Lcom/example/feature_space/domain/model/response/all_member_for_space/AllMembersForSpaceResponse;", "Lcom/example/feature_space/data/remote/response/all_members_for_space/AllMembersForSpaceResponse;", "toDomainAllmembersForSpaceResponse", "Lcom/example/feature_space/domain/model/response/all_member_for_space/AllMembersForSpaceResponse$AllMembersForSpaceResponseData;", "Lcom/example/feature_space/data/remote/response/all_members_for_space/AllMembersForSpaceResponse$AllMembersForSpaceResponseData;", "toDomainBalanceDataResponse", "Lcom/example/feature_space/domain/model/response/txn_balance/TxnBalanceResponse$TxnBalanceDataResponse;", "Lcom/example/feature_space/data/remote/response/txn_balance/TxnBalanceResponse$TxnBalanceDataResponse;", "toDomainGetAllSpacesResponse", "Lcom/example/feature_space/domain/model/response/all_spaces/GetAllSpacesResponse;", "Lcom/example/feature_space/data/remote/response/all_spaces/GetAllSpacesResponse;", "toDomainSingleSpaceDetail", "Lcom/example/feature_space/domain/model/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail;", "Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail;", "toDomainSingleSpaceMemberResponse", "Lcom/example/feature_space/domain/model/response/space_details/SingleSpaceDetailsResponse;", "Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse;", "toDomainSpaceDetailsResponse", "Lcom/example/feature_space/domain/model/response/SpaceDetailsResponse;", "Lcom/example/feature_space/data/remote/response/SpaceDetailsResponse;", "toDomainSpacesResponse", "Lcom/example/feature_space/domain/model/response/all_spaces/GetAllSpacesResponse$SpacesResponse;", "Lcom/example/feature_space/data/remote/response/all_spaces/GetAllSpacesResponse$SpacesResponse;", "toDomainTxnBalanceResponse", "Lcom/example/feature_space/domain/model/response/txn_balance/TxnBalanceResponse;", "Lcom/example/feature_space/data/remote/response/txn_balance/TxnBalanceResponse;", "toDomainTxnDetailsBySpaceResponse", "Lcom/example/feature_space/domain/model/response/txn_details_by_space/TxnDetailsBySpaceResponse;", "Lcom/example/feature_space/data/remote/response/txn_details_by_space/TxnDetailsBySpaceResponse;", "toDomainUserDetails", "Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$UserDetails;", "Lcom/example/feature_space/data/remote/response/SingleSpaceMemberResponse$UserDetails;", "Lcom/example/feature_space/domain/model/response/all_spaces/GetAllSpacesResponse$SpacesResponse$SingleSpaceMemberResponse$UserDetails;", "Lcom/example/feature_space/data/remote/response/all_spaces/GetAllSpacesResponse$SpacesResponse$SingleSpaceMemberResponse$UserDetails;", "toDomainUserResponse", "Lcom/example/feature_space/domain/model/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail$UserResponse;", "Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse$SingleSpaceDetail$UserResponse;", "toInviteDetailsDomain", "Lcom/example/feature_space/domain/model/response/SingleSpaceMemberResponse$InviteDetails;", "Lcom/example/feature_space/data/remote/response/SingleSpaceMemberResponse$InviteDetails;", "toSingleAddMembersBody", "toSpaceDetailsResponseDomain", "feature_space_debug"})
public final class SpaceMapperKt {
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO convertToCreateSpaceBodyData(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.model.request.create_space.CreateSpaceBody $this$convertToCreateSpaceBodyData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse convertToCreateSpaceResponseBodyData(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse $this$convertToCreateSpaceResponseBodyData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.SpaceDetailsResponse toSpaceDetailsResponseDomain(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.SpaceDetailsResponse $this$toSpaceDetailsResponseDomain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse toDomainGetAllSpacesResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse $this$toDomainGetAllSpacesResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse toDomainSpacesResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse.SpacesResponse $this$toDomainSpacesResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse> getSpaceMembers(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse> spaceMembers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse toDomainSingleSpaceMemberResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse $this$toDomainSingleSpaceMemberResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails toDomainUserDetails(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse.UserDetails $this$toDomainUserDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.SpaceDetailsResponse toDomainSpaceDetailsResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.SpaceDetailsResponse $this$toDomainSpaceDetailsResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse toDomainSingleSpaceMemberResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse $this$toDomainSingleSpaceMemberResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail toDomainSingleSpaceDetail(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail $this$toDomainSingleSpaceDetail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse toDomainUserResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse.SingleSpaceDetail.UserResponse $this$toDomainUserResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.ArrayList<com.example.feature_space.data.remote.request.add_members.AddMembersDTO> toDataAddMembersBody(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_space.domain.model.request.add_members.AddMembersBody> $this$toDataAddMembersBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.data.remote.request.add_members.AddMembersDTO toSingleAddMembersBody(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.model.request.add_members.AddMembersBody $this$toSingleAddMembersBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.add_members.AddMembersResponse toDomainAddMembersResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.add_members.AddMembersResponse $this$toDomainAddMembersResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.add_members.AddMembersResponse.AddMembersCountResponse toDomainAddMembersCountResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.add_members.AddMembersResponse.AddMembersCountResponse $this$toDomainAddMembersCountResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse toDomainTxnDetailsBySpaceResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailsBySpaceResponse $this$toDomainTxnDetailsBySpaceResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailResponse convertTxnDetailToDomain(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailResponse $this$convertTxnDetailToDomain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.example.feature_space.domain.model.response.txn_details_by_space.SingleTxnDetailResponse> convertToSingleTxnDetailResponseList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_space.data.remote.response.txn_details_by_space.SingleTxnDetailResponse> $this$convertToSingleTxnDetailResponseList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse toDomainAllMembersForSpaceResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.all_members_for_space.AllMembersForSpaceResponse $this$toDomainAllMembersForSpaceResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData toDomainAllmembersForSpaceResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.all_members_for_space.AllMembersForSpaceResponse.AllMembersForSpaceResponseData $this$toDomainAllmembersForSpaceResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.example.feature_space.domain.model.response.SingleSpaceMemberResponse> getSpaceMembersForAllmembersList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_space.data.remote.response.SingleSpaceMemberResponse> spaceMembers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse toDomainSingleSpaceMemberResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.SingleSpaceMemberResponse $this$toDomainSingleSpaceMemberResponse) {
        return null;
    }
    
    private static final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.InviteDetails toInviteDetailsDomain(com.example.feature_space.data.remote.response.SingleSpaceMemberResponse.InviteDetails $this$toInviteDetailsDomain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.SingleSpaceMemberResponse.UserDetails toDomainUserDetails(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.SingleSpaceMemberResponse.UserDetails $this$toDomainUserDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.txn_balance.TxnBalanceResponse toDomainTxnBalanceResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.txn_balance.TxnBalanceResponse $this$toDomainTxnBalanceResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.domain.model.response.txn_balance.TxnBalanceResponse.TxnBalanceDataResponse toDomainBalanceDataResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.response.txn_balance.TxnBalanceResponse.TxnBalanceDataResponse $this$toDomainBalanceDataResponse) {
        return null;
    }
}