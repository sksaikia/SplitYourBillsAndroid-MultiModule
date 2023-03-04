package com.example.feature_profile.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/example/feature_profile/presentation/viewmodel/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "getProfileInfoUseCase", "Lcom/example/feature_profile/domain/usecase/GetProfileInfoUseCase;", "uploadProfilePicUseCase", "Lcom/example/feature_profile/domain/usecase/UploadProfilePicUseCase;", "(Lcom/example/feature_profile/domain/usecase/GetProfileInfoUseCase;Lcom/example/feature_profile/domain/usecase/UploadProfilePicUseCase;)V", "<set-?>", "Lcom/example/feature_profile/presentation/viewmodel/state/ProfilePicUploadState;", "profilePicUpload", "getProfilePicUpload", "()Lcom/example/feature_profile/presentation/viewmodel/state/ProfilePicUploadState;", "setProfilePicUpload", "(Lcom/example/feature_profile/presentation/viewmodel/state/ProfilePicUploadState;)V", "profilePicUpload$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/example/feature_profile/presentation/viewmodel/state/UserProfileState;", "userProfileInfo", "getUserProfileInfo", "()Lcom/example/feature_profile/presentation/viewmodel/state/UserProfileState;", "setUserProfileInfo", "(Lcom/example/feature_profile/presentation/viewmodel/state/UserProfileState;)V", "userProfileInfo$delegate", "getProfileDetail", "", "getRealPathFromURI", "", "contentURI", "Landroid/net/Uri;", "contentResolver", "Landroid/content/ContentResolver;", "uploadProfilePic", "imageUri", "feature_profile_debug"})
public final class UserProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.feature_profile.domain.usecase.GetProfileInfoUseCase getProfileInfoUseCase = null;
    private final com.example.feature_profile.domain.usecase.UploadProfilePicUseCase uploadProfilePicUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userProfileInfo$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState profilePicUpload$delegate = null;
    
    @javax.inject.Inject
    public UserProfileViewModel(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.domain.usecase.GetProfileInfoUseCase getProfileInfoUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_profile.domain.usecase.UploadProfilePicUseCase uploadProfilePicUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_profile.presentation.viewmodel.state.UserProfileState getUserProfileInfo() {
        return null;
    }
    
    public final void setUserProfileInfo(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.presentation.viewmodel.state.UserProfileState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_profile.presentation.viewmodel.state.ProfilePicUploadState getProfilePicUpload() {
        return null;
    }
    
    public final void setProfilePicUpload(@org.jetbrains.annotations.NotNull
    com.example.feature_profile.presentation.viewmodel.state.ProfilePicUploadState p0) {
    }
    
    public final void getProfileDetail() {
    }
    
    public final void uploadProfilePic(@org.jetbrains.annotations.NotNull
    java.lang.String imageUri) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRealPathFromURI(@org.jetbrains.annotations.NotNull
    android.net.Uri contentURI, @org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver) {
        return null;
    }
}