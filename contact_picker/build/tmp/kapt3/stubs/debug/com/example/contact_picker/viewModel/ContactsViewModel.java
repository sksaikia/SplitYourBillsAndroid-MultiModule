package com.example.contact_picker.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/example/contact_picker/viewModel/ContactsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "<set-?>", "Lcom/example/contact_picker/viewModel/ContactsState;", "contactsState", "getContactsState", "()Lcom/example/contact_picker/viewModel/ContactsState;", "setContactsState", "(Lcom/example/contact_picker/viewModel/ContactsState;)V", "contactsState$delegate", "Landroidx/compose/runtime/MutableState;", "fetchContactList", "", "contentResolver", "Landroid/content/ContentResolver;", "contact_picker_debug"})
public final class ContactsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState contactsState$delegate = null;
    
    @javax.inject.Inject
    public ContactsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.contact_picker.viewModel.ContactsState getContactsState() {
        return null;
    }
    
    public final void setContactsState(@org.jetbrains.annotations.NotNull
    com.example.contact_picker.viewModel.ContactsState p0) {
    }
    
    public final void fetchContactList(@org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver) {
    }
}