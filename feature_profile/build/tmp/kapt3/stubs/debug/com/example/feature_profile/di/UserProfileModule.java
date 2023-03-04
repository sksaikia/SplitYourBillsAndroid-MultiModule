package com.example.feature_profile.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/feature_profile/di/UserProfileModule;", "", "()V", "provideGetProfileInfoUseCase", "Lcom/example/feature_profile/domain/usecase/GetProfileInfoUseCase;", "repository", "Lcom/example/feature_profile/domain/repository/ProfileRepository;", "provideProfileRepository", "api", "Lcom/example/feature_profile/data/remote/UserProfileService;", "provideProfileService", "retrofit", "Lretrofit2/Retrofit;", "provideUploadProfilePicUseCase", "Lcom/example/feature_profile/domain/usecase/UploadProfilePicUseCase;", "feature_profile_debug"})
@dagger.Module
public final class UserProfileModule {
    
    public UserProfileModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_profile.data.remote.UserProfileService provideProfileService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_profile.domain.repository.ProfileRepository provideProfileRepository(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.data.remote.UserProfileService api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_profile.domain.usecase.GetProfileInfoUseCase provideGetProfileInfoUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.domain.repository.ProfileRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.feature_profile.domain.usecase.UploadProfilePicUseCase provideUploadProfilePicUseCase(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.domain.repository.ProfileRepository repository) {
        return null;
    }
}