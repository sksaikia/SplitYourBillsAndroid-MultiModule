package com.example.authentication.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/authentication/domain/repository/AuthenticationRepository;", "", "loginUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/authentication/domain/model/response/login/LoginResponse;", "loginBody", "Lcom/example/authentication/domain/model/request/login/LoginBody;", "(Lcom/example/authentication/domain/model/request/login/LoginBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/example/authentication/domain/model/response/registration/RegistrationResponse;", "registrationBody", "Lcom/example/authentication/domain/model/request/registration/RegistrationBody;", "(Lcom/example/authentication/domain/model/request/registration/RegistrationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authentication_debug"})
public abstract interface AuthenticationRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    com.example.authentication.domain.model.request.registration.RegistrationBody registrationBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.authentication.domain.model.response.registration.RegistrationResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    com.example.authentication.domain.model.request.login.LoginBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.authentication.domain.model.response.login.LoginResponse>>> continuation);
}