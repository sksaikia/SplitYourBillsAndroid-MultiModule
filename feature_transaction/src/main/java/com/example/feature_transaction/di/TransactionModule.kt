package com.example.feature_transaction.di

import com.example.feature_transaction.data.remote.TransactionService
import com.example.feature_transaction.data.repository.TransactionRepositoryImpl
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.feature_transaction.domain.use_case.CreateTransactionUseCase
import com.example.feature_transaction.domain.use_case.GetAllSpaceByUserIdUsecase
import com.example.feature_transaction.domain.use_case.GetAllSpaceMembersBySpaceIdUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TransactionModule {
    @Provides
    @Singleton
    fun provideSpaceService(retrofit: Retrofit): TransactionService = retrofit.create(
        TransactionService::class.java
    )

    @Provides
    @Singleton
    fun provideSpaceRepository(api: TransactionService): TransactionRepository {
        return TransactionRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideGetAllSpacesByUserIdUsecase(repository: TransactionRepository): GetAllSpaceByUserIdUsecase {
        return GetAllSpaceByUserIdUsecase(repository)
    }

    @Provides
    @Singleton
    fun provideGetAllSpaceMembersBySpaceIdUsecase(repository: TransactionRepository): GetAllSpaceMembersBySpaceIdUsecase {
        return GetAllSpaceMembersBySpaceIdUsecase(repository)
    }

    @Provides
    @Singleton
    fun provideCreateTransactionUsecase(repository: TransactionRepository): CreateTransactionUseCase {
        return CreateTransactionUseCase(repository)
    }
}
