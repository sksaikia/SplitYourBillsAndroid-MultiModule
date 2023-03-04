package com.example.feature_transaction.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\u0006\u0010!\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\u0006\u0010$\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\u0006\u0010$\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J-\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/example/feature_transaction/domain/repository/TransactionRepository;", "", "addTxnList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/feature_transaction/domain/model/response/add_txn_list/AddTxnListResponse;", "txnList", "", "Lcom/example/feature_transaction/domain/model/request/add_txn_list/AddTxnListBody;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransaction", "Lcom/example/feature_transaction/domain/model/response/create_transaction/CreateTransactionResponse;", "createTransactionBody", "Lcom/example/feature_transaction/domain/model/request/create_transaction/CreateTransactionBody;", "(Lcom/example/feature_transaction/domain/model/request/create_transaction/CreateTransactionBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransactionById", "Lcom/example/feature_transaction/domain/model/response/delete_transaction/DeleteTransactionResponse;", "transactionId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTxnDetailsByTxnDetailsId", "Lcom/example/feature_transaction/domain/model/response/delete_txn_detail/DeleteTxnDetailsResponse;", "txnDetailsId", "getAllMembersBySpaceId", "Lcom/example/feature_transaction/domain/model/response/all_member_for_space/AllMembersForSpaceResponse;", "spaceid", "getAllSpacesByUserId", "Lcom/example/feature_transaction/domain/model/response/all_spaces/GetAllSpacesResponse;", "userId", "getTxnDetailsBalance", "Lcom/example/feature_transaction/domain/model/response/txn_balance/TxnBalanceResponse;", "getTxnDetailsByInviteId", "Lcom/example/feature_transaction/domain/model/response/get_txn_list/GetTxnListResponse;", "inviteId", "getTxnDetailsByTxnDetailsId", "Lcom/example/feature_transaction/domain/model/response/get_single_txn_details/GetSingleTxnDetailsResponse;", "txnId", "getTxnDetailsByTxnId", "getTxnDetailsByUserId", "updateTxnDetailsByTxnDetailsId", "(ILcom/example/feature_transaction/domain/model/request/add_txn_list/AddTxnListBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_transaction_debug"})
public abstract interface TransactionRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllSpacesByUserId(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllMembersBySpaceId(int spaceid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object createTransaction(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody createTransactionBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTransactionById(int transactionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addTxnList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody> txnList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTxnDetailsByUserId(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTxnDetailsByInviteId(int inviteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTxnDetailsByTxnId(int txnId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTxnDetailsByTxnDetailsId(int txnId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTxnDetailsByTxnDetailsId(int txnDetailsId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.delete_txn_detail.DeleteTxnDetailsResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTxnDetailsByTxnDetailsId(int txnDetailsId, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody txnList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTxnDetailsBalance(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.txn_balance.TxnBalanceResponse>>> continuation);
}