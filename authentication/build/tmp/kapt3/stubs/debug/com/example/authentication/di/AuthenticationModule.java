package com.example.authentication.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/authentication/di/AuthenticationModule;", "", "()V", "provideAuthenticationRepository", "Lcom/example/authentication/domain/repository/AuthenticationRepository;", "api", "Lcom/example/authentication/data/remote/AuthenticationService;", "provideAuthenticationService", "retrofit", "Lretrofit2/Retrofit;", "provideLoginUseCase", "Lcom/example/authentication/domain/usecase/LoginUseCase;", "repository", "provideRegistrationUseCase", "Lcom/example/authentication/domain/usecase/RegistrationUseCase;", "authentication_debug"})
@dagger.Module
public final class AuthenticationModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.authentication.di.AuthenticationModule INSTANCE = null;
    
    private AuthenticationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.authentication.data.remote.AuthenticationService provideAuthenticationService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.authentication.domain.usecase.RegistrationUseCase provideRegistrationUseCase(@org.jetbrains.annotations.NotNull
    com.example.authentication.domain.repository.AuthenticationRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.authentication.domain.repository.AuthenticationRepository provideAuthenticationRepository(@org.jetbrains.annotations.NotNull
    com.example.authentication.data.remote.AuthenticationService api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.authentication.domain.usecase.LoginUseCase provideLoginUseCase(@org.jetbrains.annotations.NotNull
    com.example.authentication.domain.repository.AuthenticationRepository repository) {
        return null;
    }
}