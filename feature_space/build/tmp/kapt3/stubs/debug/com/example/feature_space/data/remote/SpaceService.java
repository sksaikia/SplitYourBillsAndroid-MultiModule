package com.example.feature_space.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0015\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/feature_space/data/remote/SpaceService;", "", "addMembersToSpaces", "Lcom/example/feature_space/data/remote/response/add_members/AddMembersResponse;", "contactList", "", "Lcom/example/feature_space/data/remote/request/add_members/AddMembersDTO;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewSpace", "Lcom/example/feature_space/data/remote/response/create_space/CreateSpaceResponse;", "Lcom/example/feature_space/data/remote/request/create_space/CreateSpaceDTO;", "(Lcom/example/feature_space/data/remote/request/create_space/CreateSpaceDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editSpaceDetailsById", "spaceId", "", "(Lcom/example/feature_space/data/remote/request/create_space/CreateSpaceDTO;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMembersForSpecificSpaceId", "Lcom/example/feature_space/data/remote/response/all_members_for_space/AllMembersForSpaceResponse;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSpacesByUserId", "Lcom/example/feature_space/data/remote/response/all_spaces/GetAllSpacesResponse;", "userId", "getAllTxnDetailsBySpaceId", "Lcom/example/feature_space/data/remote/response/txn_details_by_space/TxnDetailsBySpaceResponse;", "getSpecificSpaceById", "Lcom/example/feature_space/data/remote/response/space_details/SingleSpaceDetailsResponse;", "getTxnDetailsBalance", "Lcom/example/feature_space/data/remote/response/txn_balance/TxnBalanceResponse;", "feature_space_debug"})
public abstract interface SpaceService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "spaces/add")
    public abstract java.lang.Object createNewSpace(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO createNewSpace, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "spaces/member/getallspaces")
    public abstract java.lang.Object getAllSpacesByUserId(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "spaces/{spaceId}")
    public abstract java.lang.Object getSpecificSpaceById(@retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "spaces/{spaceId}")
    public abstract java.lang.Object editSpaceDetailsById(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO createNewSpace, @retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "spaces/member/add")
    public abstract java.lang.Object addMembersToSpaces(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    java.util.List<com.example.feature_space.data.remote.request.add_members.AddMembersDTO> contactList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.add_members.AddMembersResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "spaces/member/{spaceId}")
    public abstract java.lang.Object getAllMembersForSpecificSpaceId(@retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.all_members_for_space.AllMembersForSpaceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "transaction/details")
    public abstract java.lang.Object getAllTxnDetailsBySpaceId(@retrofit2.http.Query(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailsBySpaceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/api/transaction/details/balance")
    public abstract java.lang.Object getTxnDetailsBalance(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_space.data.remote.response.txn_balance.TxnBalanceResponse> continuation);
}