package com.example.authentication.di

import com.example.authentication.data.remote.AuthenticationService
import com.example.authentication.data.repository.AuthenticationRepositoryImpl
import com.example.authentication.domain.repository.AuthenticationRepository
import com.example.authentication.domain.usecase.RegistrationUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthenticationModule {

    //Does custom scopes work on hilt
    @Provides
    @Singleton
    fun provideAuthenticationService(retrofit : Retrofit) : AuthenticationService = retrofit.create(
        AuthenticationService::class.java)

    @Provides
    @Singleton
    fun provideRegistrationUseCase(repository: AuthenticationRepository) : RegistrationUseCase {
        return RegistrationUseCase(repository)
    }

    //TODO move this to @binds method
    @Provides
    @Singleton
    fun provideAuthenticationRepository(api : AuthenticationService) : AuthenticationRepository {
        return AuthenticationRepositoryImpl(api)
    }
}