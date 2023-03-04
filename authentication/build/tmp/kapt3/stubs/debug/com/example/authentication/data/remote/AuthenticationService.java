package com.example.authentication.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/authentication/data/remote/AuthenticationService;", "", "loginUser", "Lcom/example/authentication/data/remote/response/login/LoginResponse;", "loginBody", "Lcom/example/authentication/domain/model/request/login/LoginBody;", "(Lcom/example/authentication/domain/model/request/login/LoginBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/example/authentication/data/remote/response/registration/RegistrationResponse;", "registrationDTO", "Lcom/example/authentication/domain/model/request/registration/RegistrationBody;", "(Lcom/example/authentication/domain/model/request/registration/RegistrationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authentication_debug"})
public abstract interface AuthenticationService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "auth/register")
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.authentication.domain.model.request.registration.RegistrationBody registrationDTO, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.authentication.data.remote.response.registration.RegistrationResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "auth/login")
    public abstract java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.authentication.domain.model.request.login.LoginBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.authentication.data.remote.response.login.LoginResponse> continuation);
}