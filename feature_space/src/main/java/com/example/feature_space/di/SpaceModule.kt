package com.example.feature_space.di

import com.example.feature_space.data.remote.SpaceService
import com.example.feature_space.data.repository.SpaceRepositoryImpl
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.feature_space.domain.usecase.CreateSpaceUseCase
import com.example.feature_space.domain.usecase.GetAllSpaceByUserIdUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SpaceModule {

    @Provides
    @Singleton
    fun provideSpaceService(retrofit : Retrofit) : SpaceService = retrofit.create(
        SpaceService::class.java)

    @Provides
    @Singleton
    fun provideSpaceRepository(api : SpaceService) : SpacesRepository {
        return SpaceRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideCreateSpaceUsecase(repository : SpacesRepository) : CreateSpaceUseCase {
        return CreateSpaceUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetAllSpacesByUserIdUsecase(repository : SpacesRepository) : GetAllSpaceByUserIdUsecase {
        return GetAllSpaceByUserIdUsecase(repository)
    }


}