package com.example.feature_profile.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u00a8\u0006\t"}, d2 = {"convertProfilePicToAndroidSpecificUrl", "", "profilePic", "toDomainImageUploadResponse", "Lcom/example/feature_profile/domain/model/response/ImageUploadResponse;", "Lcom/example/feature_profile/data/remote/response/ImageUploadResponse;", "toDomainUserProfileResponse", "Lcom/example/feature_profile/domain/model/response/UserProfileResponse;", "Lcom/example/feature_profile/data/remote/response/UserProfileResponse;", "feature_profile_debug"})
public final class UserProfileMapperKt {
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_profile.domain.model.response.UserProfileResponse toDomainUserProfileResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.data.remote.response.UserProfileResponse $this$toDomainUserProfileResponse) {
        return null;
    }
    
    /**
     * *
     * This is hacky way of loading images in Android from localhost. better use a service to
     * upload the image and have the link here, later use firebase to upload the image for App
     * and send the url to Backend.
     */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String convertProfilePicToAndroidSpecificUrl(@org.jetbrains.annotations.Nullable
    java.lang.String profilePic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.example.feature_profile.domain.model.response.ImageUploadResponse toDomainImageUploadResponse(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.data.remote.response.ImageUploadResponse $this$toDomainImageUploadResponse) {
        return null;
    }
}