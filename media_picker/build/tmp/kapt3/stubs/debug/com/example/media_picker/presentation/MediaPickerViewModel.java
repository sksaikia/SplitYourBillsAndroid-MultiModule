package com.example.media_picker.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/example/media_picker/presentation/MediaPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "imageList", "", "Landroid/net/Uri;", "getImageList", "()Ljava/util/List;", "setImageList", "(Ljava/util/List;)V", "<set-?>", "Lcom/example/media_picker/presentation/MediaPickerState;", "listState", "getListState", "()Lcom/example/media_picker/presentation/MediaPickerState;", "setListState", "(Lcom/example/media_picker/presentation/MediaPickerState;)V", "listState$delegate", "Landroidx/compose/runtime/MutableState;", "queryImageStorage", "", "contentResolver", "Landroid/content/ContentResolver;", "media_picker_debug"})
public final class MediaPickerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState listState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<android.net.Uri> imageList;
    
    @javax.inject.Inject
    public MediaPickerViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.media_picker.presentation.MediaPickerState getListState() {
        return null;
    }
    
    public final void setListState(@org.jetbrains.annotations.NotNull
    com.example.media_picker.presentation.MediaPickerState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<android.net.Uri> getImageList() {
        return null;
    }
    
    public final void setImageList(@org.jetbrains.annotations.NotNull
    java.util.List<android.net.Uri> p0) {
    }
    
    public final void queryImageStorage(@org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver) {
    }
}