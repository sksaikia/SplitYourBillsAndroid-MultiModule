package com.example.contact_picker.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a0\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a,\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\"&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"mapOfContacts", "Ljava/util/HashMap;", "Lcom/example/contact_picker/entity/Contact;", "", "getMapOfContacts", "()Ljava/util/HashMap;", "setMapOfContacts", "(Ljava/util/HashMap;)V", "ContactPickerScreen", "", "navigateTo", "Lkotlin/Function1;", "", "navigateBackToScreenRoute", "Lcom/example/navigation/NavigationItem;", "contactsViewModel", "Lcom/example/contact_picker/viewModel/ContactsViewModel;", "ListItemView", "contact", "selectedStates", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "index", "contact_picker_debug"})
public final class ContactPickerScreenKt {
    @org.jetbrains.annotations.NotNull
    private static java.util.HashMap<com.example.contact_picker.entity.Contact, java.lang.Boolean> mapOfContacts;
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.HashMap<com.example.contact_picker.entity.Contact, java.lang.Boolean> getMapOfContacts() {
        return null;
    }
    
    public static final void setMapOfContacts(@org.jetbrains.annotations.NotNull
    java.util.HashMap<com.example.contact_picker.entity.Contact, java.lang.Boolean> p0) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.permissions.ExperimentalPermissionsApi.class})
    public static final void ContactPickerScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigateTo, @org.jetbrains.annotations.NotNull
    com.example.navigation.NavigationItem navigateBackToScreenRoute, @org.jetbrains.annotations.NotNull
    com.example.contact_picker.viewModel.ContactsViewModel contactsViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void ListItemView(@org.jetbrains.annotations.NotNull
    com.example.contact_picker.entity.Contact contact, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.Integer, java.lang.Boolean> selectedStates, int index) {
    }
}