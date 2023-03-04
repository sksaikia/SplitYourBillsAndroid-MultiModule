package com.example.authentication.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/authentication/data/repository/AuthenticationRepositoryImpl;", "Lcom/example/authentication/domain/repository/AuthenticationRepository;", "Lcom/example/network/RemoteDataSource;", "api", "Lcom/example/authentication/data/remote/AuthenticationService;", "(Lcom/example/authentication/data/remote/AuthenticationService;)V", "loginUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/network/Result;", "Lcom/example/authentication/domain/model/response/login/LoginResponse;", "loginBody", "Lcom/example/authentication/domain/model/request/login/LoginBody;", "(Lcom/example/authentication/domain/model/request/login/LoginBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "Lcom/example/authentication/domain/model/response/registration/RegistrationResponse;", "registrationBody", "Lcom/example/authentication/domain/model/request/registration/RegistrationBody;", "(Lcom/example/authentication/domain/model/request/registration/RegistrationBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authentication_debug"})
@javax.inject.Singleton
public final class AuthenticationRepositoryImpl extends com.example.network.RemoteDataSource implements com.example.authentication.domain.repository.AuthenticationRepository {
    private final com.example.authentication.data.remote.AuthenticationService api = null;
    
    @javax.inject.Inject
    public AuthenticationRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.authentication.data.remote.AuthenticationService api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    com.example.authentication.domain.model.request.registration.RegistrationBody registrationBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.authentication.domain.model.response.registration.RegistrationResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    com.example.authentication.domain.model.request.login.LoginBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.network.Result<com.example.authentication.domain.model.response.login.LoginResponse>>> continuation) {
        return null;
    }
}