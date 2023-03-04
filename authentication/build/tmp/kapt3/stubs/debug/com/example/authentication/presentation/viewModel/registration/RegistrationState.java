package com.example.authentication.presentation.viewModel.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/example/authentication/presentation/viewModel/registration/RegistrationState;", "", "registration", "Lcom/example/authentication/domain/model/response/registration/RegistrationResponse;", "isLoading", "", "(Lcom/example/authentication/domain/model/response/registration/RegistrationResponse;Z)V", "()Z", "getRegistration", "()Lcom/example/authentication/domain/model/response/registration/RegistrationResponse;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "authentication_debug"})
public final class RegistrationState {
    @org.jetbrains.annotations.Nullable
    private final com.example.authentication.domain.model.response.registration.RegistrationResponse registration = null;
    private final boolean isLoading = false;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.authentication.presentation.viewModel.registration.RegistrationState copy(@org.jetbrains.annotations.Nullable
    com.example.authentication.domain.model.response.registration.RegistrationResponse registration, boolean isLoading) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public RegistrationState() {
        super();
    }
    
    public RegistrationState(@org.jetbrains.annotations.Nullable
    com.example.authentication.domain.model.response.registration.RegistrationResponse registration, boolean isLoading) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.authentication.domain.model.response.registration.RegistrationResponse component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.authentication.domain.model.response.registration.RegistrationResponse getRegistration() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
}