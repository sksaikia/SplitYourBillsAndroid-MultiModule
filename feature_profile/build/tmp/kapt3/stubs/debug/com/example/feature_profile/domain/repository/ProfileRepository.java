package com.example.feature_profile.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/feature_profile/domain/repository/ProfileRepository;", "", "getProfileInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/feature_profile/domain/model/response/UserProfileResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProfilePic", "Lcom/example/feature_profile/domain/model/response/ImageUploadResponse;", "body", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_profile_debug"})
public abstract interface ProfileRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProfileInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_profile.domain.model.response.UserProfileResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadProfilePic(@org.jetbrains.annotations.NotNull
    okhttp3.MultipartBody.Part body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.feature_profile.domain.model.response.ImageUploadResponse>>> continuation);
}