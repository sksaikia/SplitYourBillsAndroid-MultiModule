package com.example.feature_profile.di

import com.example.feature_profile.data.remote.UserProfileService
import com.example.feature_profile.data.repository.UserProfileRepositoryImpl
import com.example.feature_profile.domain.repository.ProfileRepository
import com.example.feature_profile.domain.usecase.GetProfileInfoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class UserProfileModule {
    @Provides
    @Singleton
    fun provideProfileService(retrofit: Retrofit): UserProfileService = retrofit.create(
        UserProfileService::class.java
    )

    @Provides
    @Singleton
    fun provideProfileRepository(api: UserProfileService): ProfileRepository {
        return UserProfileRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideGetProfileInfoUseCase(repository: ProfileRepository): GetProfileInfoUseCase {
        return GetProfileInfoUseCase(repository)
    }

}
