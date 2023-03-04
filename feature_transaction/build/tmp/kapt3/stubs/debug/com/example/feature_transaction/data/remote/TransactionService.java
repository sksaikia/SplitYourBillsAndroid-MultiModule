package com.example.feature_transaction.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001a\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0014\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\"\u001a\u00020\u001e2\b\b\u0001\u0010#\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010$\u001a\u00020\u001e2\b\b\u0001\u0010\u001a\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J%\u0010%\u001a\u00020!2\b\b\u0001\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/example/feature_transaction/data/remote/TransactionService;", "", "addTxnList", "Lcom/example/feature_transaction/data/remote/response/add_txn_list/AddTxnListResponse;", "txnList", "", "Lcom/example/feature_transaction/data/remote/request/add_txn_list/AddTxnListDTO;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransaction", "Lcom/example/feature_transaction/data/remote/response/create_transaction/CreateTransactionResponse;", "createTransactionDTO", "Lcom/example/feature_transaction/data/remote/request/create_transaction/CreateTransactionDTO;", "(Lcom/example/feature_transaction/data/remote/request/create_transaction/CreateTransactionDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransactionById", "Lcom/example/feature_transaction/data/remote/response/delete_transaction/DeleteTransactionResponse;", "transactionId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTxnDetailsByTxnDetailsId", "Lcom/example/feature_transaction/data/remote/response/delete_txn_detail/DeleteTxnDetailsResponse;", "txnDetailsId", "getAllMembersForSpecificSpaceId", "Lcom/example/feature_transaction/data/remote/response/all_members_for_space/AllMembersForSpaceResponse;", "spaceId", "getAllSpacesByUserId", "Lcom/example/feature_transaction/data/remote/response/all_spaces/GetAllSpacesResponse;", "userId", "getTxnDetailsBalance", "Lcom/example/feature_transaction/data/remote/response/txn_balance/TxnBalanceResponse;", "getTxnListForInviteId", "Lcom/example/feature_transaction/data/remote/response/get_txn_list/GetTxnListResponse;", "userInviteId", "getTxnListForTxnDetailsId", "Lcom/example/feature_transaction/data/remote/response/get_single_txn_details/GetSingleTxnDetailsResponse;", "getTxnListForTxnId", "txnId", "getTxnListForUserId", "updateSingleTxnDetail", "(ILcom/example/feature_transaction/data/remote/request/add_txn_list/AddTxnListDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_transaction_debug"})
public abstract interface TransactionService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "spaces/member/getallspaces")
    public abstract java.lang.Object getAllSpacesByUserId(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.all_spaces.GetAllSpacesResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "spaces/member/{spaceId}")
    public abstract java.lang.Object getAllMembersForSpecificSpaceId(@retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.all_members_for_space.AllMembersForSpaceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "transaction/add")
    public abstract java.lang.Object createTransaction(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.feature_transaction.data.remote.request.create_transaction.CreateTransactionDTO createTransactionDTO, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.DELETE(value = "transaction")
    public abstract java.lang.Object deleteTransactionById(@retrofit2.http.Query(value = "transactionId")
    int transactionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.delete_transaction.DeleteTransactionResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "transaction/details/add")
    public abstract java.lang.Object addTxnList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    java.util.List<com.example.feature_transaction.data.remote.request.add_txn_list.AddTxnListDTO> txnList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.add_txn_list.AddTxnListResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "transaction/details/invites")
    public abstract java.lang.Object getTxnListForInviteId(@retrofit2.http.Query(value = "userInviteId")
    int userInviteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.get_txn_list.GetTxnListResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "transaction/details/user")
    public abstract java.lang.Object getTxnListForUserId(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.get_txn_list.GetTxnListResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "transaction/details/single/txn")
    public abstract java.lang.Object getTxnListForTxnId(@retrofit2.http.Query(value = "txnId")
    int txnId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.get_txn_list.GetTxnListResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "transaction/details/single/details")
    public abstract java.lang.Object getTxnListForTxnDetailsId(@retrofit2.http.Query(value = "txnDetailsId")
    int txnDetailsId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.get_single_txn_details.GetSingleTxnDetailsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.DELETE(value = "transaction/details")
    public abstract java.lang.Object deleteTxnDetailsByTxnDetailsId(@retrofit2.http.Query(value = "txnDetailsId")
    int txnDetailsId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.delete_txn_detail.DeleteTxnDetailsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "/transaction/details")
    public abstract java.lang.Object updateSingleTxnDetail(@retrofit2.http.Query(value = "txnDetailsId")
    int txnDetailsId, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.feature_transaction.data.remote.request.add_txn_list.AddTxnListDTO txnList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.get_single_txn_details.GetSingleTxnDetailsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/api/transaction/details/balance")
    public abstract java.lang.Object getTxnDetailsBalance(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_transaction.data.remote.response.txn_balance.TxnBalanceResponse> continuation);
}