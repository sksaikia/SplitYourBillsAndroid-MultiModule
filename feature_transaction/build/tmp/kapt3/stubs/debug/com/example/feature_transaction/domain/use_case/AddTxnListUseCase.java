package com.example.feature_transaction.domain.use_case;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/feature_transaction/domain/use_case/AddTxnListUseCase;", "", "repository", "Lcom/example/feature_transaction/domain/repository/TransactionRepository;", "(Lcom/example/feature_transaction/domain/repository/TransactionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/feature_transaction/domain/model/response/add_txn_list/AddTxnListResponse;", "addTxnListBody", "", "Lcom/example/feature_transaction/domain/model/request/add_txn_list/AddTxnListBody;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_transaction_debug"})
public final class AddTxnListUseCase {
    private final com.example.feature_transaction.domain.repository.TransactionRepository repository = null;
    
    public AddTxnListUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody> addTxnListBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse>>> continuation) {
        return null;
    }
}