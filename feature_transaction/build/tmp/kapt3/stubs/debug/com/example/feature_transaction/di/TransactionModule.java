package com.example.feature_transaction.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006#"}, d2 = {"Lcom/example/feature_transaction/di/TransactionModule;", "", "()V", "provideAddTxnListUseCase", "Lcom/example/feature_transaction/domain/use_case/AddTxnListUseCase;", "repository", "Lcom/example/feature_transaction/domain/repository/TransactionRepository;", "provideCreateTransactionUsecase", "Lcom/example/feature_transaction/domain/use_case/CreateTransactionUseCase;", "provideDeleteTransactionDetailsByTxnDetailsIdUseCase", "Lcom/example/feature_transaction/domain/use_case/DeleteTransactionDetailsByTxnDetailsIdUseCase;", "provideDeleteTransactionUsecase", "Lcom/example/feature_transaction/domain/use_case/DeleteTransactionUseCase;", "provideGetAllSpaceMembersBySpaceIdUsecase", "Lcom/example/feature_transaction/domain/use_case/GetAllSpaceMembersBySpaceIdUsecase;", "provideGetAllSpacesByUserIdUsecase", "Lcom/example/feature_transaction/domain/use_case/GetAllSpaceByUserIdUsecase;", "provideGetAllTxnDetailsByInviteIdUseCase", "Lcom/example/feature_transaction/domain/use_case/GetAllTxnDetailsByInviteIdUseCase;", "provideGetAllTxnDetailsByTxnIdUseCase", "Lcom/example/feature_transaction/domain/use_case/GetAllTxnDetailsByTxnIdUseCase;", "provideGetAllTxnDetailsByUserIdUseCase", "Lcom/example/feature_transaction/domain/use_case/GetAllTxnDetailsByUserIdUseCase;", "provideGetSingleTxnDetailsByTxnDetailsIdUseCase", "Lcom/example/feature_transaction/domain/use_case/GetSingleTxnDetailsByTxnDetailsIdUsecase;", "provideSpaceRepository", "api", "Lcom/example/feature_transaction/data/remote/TransactionService;", "provideSpaceService", "retrofit", "Lretrofit2/Retrofit;", "provideUpdateSingleTxnDetailsByTxnIdUseCase", "Lcom/example/feature_transaction/domain/use_case/UpdateSingleTxnDetailsByTxnIdUseCase;", "providegetTxnBalanceUseCase", "Lcom/example/feature_transaction/domain/use_case/GetTxnBalanceUseCase;", "feature_transaction_debug"})
@dagger.Module
public final class TransactionModule {
    
    public TransactionModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.data.remote.TransactionService provideSpaceService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.repository.TransactionRepository provideSpaceRepository(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.data.remote.TransactionService api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.GetAllSpaceByUserIdUsecase provideGetAllSpacesByUserIdUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.GetAllSpaceMembersBySpaceIdUsecase provideGetAllSpaceMembersBySpaceIdUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.CreateTransactionUseCase provideCreateTransactionUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.DeleteTransactionUseCase provideDeleteTransactionUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.AddTxnListUseCase provideAddTxnListUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByUserIdUseCase provideGetAllTxnDetailsByUserIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByInviteIdUseCase provideGetAllTxnDetailsByInviteIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByTxnIdUseCase provideGetAllTxnDetailsByTxnIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.GetSingleTxnDetailsByTxnDetailsIdUsecase provideGetSingleTxnDetailsByTxnDetailsIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.DeleteTransactionDetailsByTxnDetailsIdUseCase provideDeleteTransactionDetailsByTxnDetailsIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.UpdateSingleTxnDetailsByTxnIdUseCase provideUpdateSingleTxnDetailsByTxnIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_transaction.domain.use_case.GetTxnBalanceUseCase providegetTxnBalanceUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.repository.TransactionRepository repository) {
        return null;
    }
}