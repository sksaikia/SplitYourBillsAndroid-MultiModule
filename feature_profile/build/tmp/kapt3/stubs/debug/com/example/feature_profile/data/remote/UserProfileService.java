package com.example.feature_profile.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/feature_profile/data/remote/UserProfileService;", "", "getMyProfile", "Lcom/example/feature_profile/data/remote/response/UserProfileResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadProfilePic", "Lcom/example/feature_profile/data/remote/response/ImageUploadResponse;", "image", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_profile_debug"})
public abstract interface UserProfileService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "user/me")
    public abstract java.lang.Object getMyProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_profile.data.remote.response.UserProfileResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "upload")
    @retrofit2.http.Multipart
    public abstract java.lang.Object uploadProfilePic(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.feature_profile.data.remote.response.ImageUploadResponse> continuation);
}