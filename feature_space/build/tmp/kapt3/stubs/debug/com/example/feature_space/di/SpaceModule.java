package com.example.feature_space.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/example/feature_space/di/SpaceModule;", "", "()V", "provideAddMembersToSpaceUsecase", "Lcom/example/feature_space/domain/usecase/AddMembersToSpaceUseCase;", "repository", "Lcom/example/feature_space/domain/repository/SpacesRepository;", "provideCreateSpaceUsecase", "Lcom/example/feature_space/domain/usecase/CreateSpaceUseCase;", "provideEditSpaceUsecase", "Lcom/example/feature_space/domain/usecase/EditSpaceUseCase;", "provideGetAllMembersForSpaceIdUseCase", "Lcom/example/feature_space/domain/usecase/GetAllMembersForSpaceIdUseCase;", "provideGetAllSpacesByUserIdUsecase", "Lcom/example/feature_space/domain/usecase/GetAllSpaceByUserIdUsecase;", "provideGetSpecificSpaceDetailsBySpaceId", "Lcom/example/feature_space/domain/usecase/GetSpecificSpaceDetailsBySpaceIdUseCase;", "provideGetTxnBalanceUseCase", "Lcom/example/feature_space/domain/usecase/GetTxnBalanceUseCase;", "provideGetTxnDetailsBySpaceIdUseCase", "Lcom/example/feature_space/domain/usecase/GetTxnDetailsBySpaceIdUseCase;", "provideSpaceRepository", "api", "Lcom/example/feature_space/data/remote/SpaceService;", "provideSpaceService", "retrofit", "Lretrofit2/Retrofit;", "feature_space_debug"})
@dagger.Module
public final class SpaceModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_space.di.SpaceModule INSTANCE = null;
    
    private SpaceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.data.remote.SpaceService provideSpaceService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.repository.SpacesRepository provideSpaceRepository(@org.jetbrains.annotations.NotNull
    com.example.feature_space.data.remote.SpaceService api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.CreateSpaceUseCase provideCreateSpaceUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.GetAllSpaceByUserIdUsecase provideGetAllSpacesByUserIdUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.GetSpecificSpaceDetailsBySpaceIdUseCase provideGetSpecificSpaceDetailsBySpaceId(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.EditSpaceUseCase provideEditSpaceUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.AddMembersToSpaceUseCase provideAddMembersToSpaceUsecase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.GetAllMembersForSpaceIdUseCase provideGetAllMembersForSpaceIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.GetTxnDetailsBySpaceIdUseCase provideGetTxnDetailsBySpaceIdUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_space.domain.usecase.GetTxnBalanceUseCase provideGetTxnBalanceUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.repository.SpacesRepository repository) {
        return null;
    }
}