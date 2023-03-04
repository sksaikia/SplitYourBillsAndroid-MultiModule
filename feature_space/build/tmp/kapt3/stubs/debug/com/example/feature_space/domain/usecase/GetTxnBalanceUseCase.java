package com.example.feature_space.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/feature_space/domain/usecase/GetTxnBalanceUseCase;", "", "repository", "Lcom/example/feature_space/domain/repository/SpacesRepository;", "(Lcom/example/feature_space/domain/repository/SpacesRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/feature_space/domain/model/response/txn_balance/TxnBalanceResponse;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_space_debug"})
public final class GetTxnBalanceUseCase {
    private final com.example.feature_space.domain.repository.SpacesRepository repository = null;
    
    public GetTxnBalanceUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_space.domain.model.response.txn_balance.TxnBalanceResponse>>> continuation) {
        return null;
    }
}