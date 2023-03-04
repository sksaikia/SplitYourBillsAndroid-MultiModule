package com.example.feature_profile.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/feature_profile/data/repository/UserProfileRepositoryImpl;", "Lcom/example/feature_profile/domain/repository/ProfileRepository;", "Lcom/example/network/RemoteDataSource;", "api", "Lcom/example/feature_profile/data/remote/UserProfileService;", "(Lcom/example/feature_profile/data/remote/UserProfileService;)V", "getProfileInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/feature_profile/domain/model/response/UserProfileResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProfilePic", "Lcom/example/feature_profile/domain/model/response/ImageUploadResponse;", "body", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_profile_debug"})
public final class UserProfileRepositoryImpl extends com.example.network.RemoteDataSource implements com.example.feature_profile.domain.repository.ProfileRepository {
    private final com.example.feature_profile.data.remote.UserProfileService api = null;
    
    @javax.inject.Inject
    public UserProfileRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.data.remote.UserProfileService api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProfileInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_profile.domain.model.response.UserProfileResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object uploadProfilePic(@org.jetbrains.annotations.NotNull
    okhttp3.MultipartBody.Part body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_profile.domain.model.response.ImageUploadResponse>>> continuation) {
        return null;
    }
}