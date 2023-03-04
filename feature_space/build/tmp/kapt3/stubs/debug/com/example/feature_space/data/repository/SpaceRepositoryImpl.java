package com.example.feature_space.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J+\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J-\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0019\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u001d\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\b0\u00072\u0006\u0010\u001d\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/feature_space/data/repository/SpaceRepositoryImpl;", "Lcom/example/feature_space/domain/repository/SpacesRepository;", "Lcom/example/network/RemoteDataSource;", "api", "Lcom/example/feature_space/data/remote/SpaceService;", "(Lcom/example/feature_space/data/remote/SpaceService;)V", "addMembersToSpace", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/feature_space/domain/model/response/add_members/AddMembersResponse;", "addedMembersBody", "", "Lcom/example/feature_space/domain/model/request/add_members/AddMembersBody;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewSpace", "Lcom/example/feature_space/domain/model/response/create_space/CreateSpaceResponse;", "createSpaceBody", "Lcom/example/feature_space/domain/model/request/create_space/CreateSpaceBody;", "(Lcom/example/feature_space/domain/model/request/create_space/CreateSpaceBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editSpaceBySpaceId", "spaceId", "", "(Lcom/example/feature_space/domain/model/request/create_space/CreateSpaceBody;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMembersBySpaceId", "Lcom/example/feature_space/domain/model/response/all_member_for_space/AllMembersForSpaceResponse;", "spaceid", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSpacesByUserId", "Lcom/example/feature_space/domain/model/response/all_spaces/GetAllSpacesResponse;", "userId", "getAllTxnDetailsBySpaceId", "Lcom/example/feature_space/domain/model/response/txn_details_by_space/TxnDetailsBySpaceResponse;", "getSpecificSpaceBySpaceId", "Lcom/example/feature_space/domain/model/response/space_details/SingleSpaceDetailsResponse;", "getTxnDetailsBalance", "Lcom/example/feature_space/domain/model/response/txn_balance/TxnBalanceResponse;", "feature_space_debug"})
@javax.inject.Singleton
public final class SpaceRepositoryImpl extends com.example.network.RemoteDataSource implements com.example.feature_space.domain.repository.SpacesRepository {
    private final com.example.feature_space.data.remote.SpaceService api = null;
    
    @javax.inject.Inject
    public SpaceRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.SpaceService api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object createNewSpace(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.model.request.create_space.CreateSpaceBody createSpaceBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllSpacesByUserId(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSpecificSpaceBySpaceId(int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object editSpaceBySpaceId(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.model.request.create_space.CreateSpaceBody createSpaceBody, int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addMembersToSpace(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_space.domain.model.request.add_members.AddMembersBody> addedMembersBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.add_members.AddMembersResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllMembersBySpaceId(int spaceid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllTxnDetailsBySpaceId(int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTxnDetailsBalance(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.txn_balance.TxnBalanceResponse>>> continuation) {
        return null;
    }
}