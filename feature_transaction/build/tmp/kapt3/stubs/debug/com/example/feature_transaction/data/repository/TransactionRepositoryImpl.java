package com.example.feature_transaction.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J+\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u001a\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u001d\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b0\u00072\u0006\u0010 \u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\b0\u00072\u0006\u0010 \u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\b0\u00072\u0006\u0010%\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\b0\u00072\u0006\u0010(\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\b0\u00072\u0006\u0010(\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\b0\u00072\u0006\u0010 \u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J-\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\b0\u00072\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/example/feature_transaction/data/repository/TransactionRepositoryImpl;", "Lcom/example/feature_transaction/domain/repository/TransactionRepository;", "Lcom/example/network/RemoteDataSource;", "api", "Lcom/example/feature_transaction/data/remote/TransactionService;", "(Lcom/example/feature_transaction/data/remote/TransactionService;)V", "addTxnList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/feature_transaction/domain/model/response/add_txn_list/AddTxnListResponse;", "txnList", "", "Lcom/example/feature_transaction/domain/model/request/add_txn_list/AddTxnListBody;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransaction", "Lcom/example/feature_transaction/domain/model/response/create_transaction/CreateTransactionResponse;", "createTransactionBody", "Lcom/example/feature_transaction/domain/model/request/create_transaction/CreateTransactionBody;", "(Lcom/example/feature_transaction/domain/model/request/create_transaction/CreateTransactionBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransactionById", "Lcom/example/feature_transaction/domain/model/response/delete_transaction/DeleteTransactionResponse;", "transactionId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTxnDetailsByTxnDetailsId", "Lcom/example/feature_transaction/domain/model/response/delete_txn_detail/DeleteTxnDetailsResponse;", "txnDetailsId", "getAllMembersBySpaceId", "Lcom/example/feature_transaction/domain/model/response/all_member_for_space/AllMembersForSpaceResponse;", "spaceid", "getAllSpacesByUserId", "Lcom/example/feature_transaction/domain/model/response/all_spaces/GetAllSpacesResponse;", "userId", "getTxnDetailsBalance", "Lcom/example/feature_transaction/domain/model/response/txn_balance/TxnBalanceResponse;", "getTxnDetailsByInviteId", "Lcom/example/feature_transaction/domain/model/response/get_txn_list/GetTxnListResponse;", "inviteId", "getTxnDetailsByTxnDetailsId", "Lcom/example/feature_transaction/domain/model/response/get_single_txn_details/GetSingleTxnDetailsResponse;", "txnId", "getTxnDetailsByTxnId", "getTxnDetailsByUserId", "updateTxnDetailsByTxnDetailsId", "txnBody", "(ILcom/example/feature_transaction/domain/model/request/add_txn_list/AddTxnListBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_transaction_debug"})
public final class TransactionRepositoryImpl extends com.example.network.RemoteDataSource implements com.example.feature_transaction.domain.repository.TransactionRepository {
    private final com.example.feature_transaction.data.remote.TransactionService api = null;
    
    @javax.inject.Inject
    public TransactionRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.data.remote.TransactionService api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllSpacesByUserId(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllMembersBySpaceId(int spaceid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object createTransaction(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody createTransactionBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTransactionById(int transactionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addTxnList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody> txnList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTxnDetailsByUserId(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTxnDetailsByInviteId(int inviteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTxnDetailsByTxnId(int txnId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTxnDetailsByTxnDetailsId(int txnId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTxnDetailsByTxnDetailsId(int txnDetailsId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.delete_txn_detail.DeleteTxnDetailsResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateTxnDetailsByTxnDetailsId(int txnDetailsId, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody txnBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTxnDetailsBalance(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.txn_balance.TxnBalanceResponse>>> continuation) {
        return null;
    }
}