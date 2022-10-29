package com.example.feature_transaction.di

import com.example.feature_transaction.data.remote.TransactionService
import com.example.feature_transaction.data.repository.TransactionRepositoryImpl
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.feature_transaction.domain.use_case.AddTxnListUseCase
import com.example.feature_transaction.domain.use_case.CreateTransactionUseCase
import com.example.feature_transaction.domain.use_case.DeleteTransactionDetailsByTxnDetailsIdUseCase
import com.example.feature_transaction.domain.use_case.DeleteTransactionUseCase
import com.example.feature_transaction.domain.use_case.GetAllSpaceByUserIdUsecase
import com.example.feature_transaction.domain.use_case.GetAllSpaceMembersBySpaceIdUsecase
import com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByInviteIdUseCase
import com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByTxnIdUseCase
import com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByUserIdUseCase
import com.example.feature_transaction.domain.use_case.GetSingleTxnDetailsByTxnDetailsIdUsecase
import com.example.feature_transaction.domain.use_case.UpdateSingleTxnDetailsByTxnIdUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit

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

    @Provides
    @Singleton
    fun provideDeleteTransactionUsecase(repository: TransactionRepository): DeleteTransactionUseCase {
        return DeleteTransactionUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideAddTxnListUseCase(repository: TransactionRepository): AddTxnListUseCase {
        return AddTxnListUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetAllTxnDetailsByUserIdUseCase(repository: TransactionRepository): GetAllTxnDetailsByUserIdUseCase {
        return GetAllTxnDetailsByUserIdUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetAllTxnDetailsByInviteIdUseCase(repository: TransactionRepository): GetAllTxnDetailsByInviteIdUseCase {
        return GetAllTxnDetailsByInviteIdUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetAllTxnDetailsByTxnIdUseCase(repository: TransactionRepository): GetAllTxnDetailsByTxnIdUseCase {
        return GetAllTxnDetailsByTxnIdUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetSingleTxnDetailsByTxnDetailsIdUseCase(repository: TransactionRepository): GetSingleTxnDetailsByTxnDetailsIdUsecase {
        return GetSingleTxnDetailsByTxnDetailsIdUsecase(repository)
    }

    @Provides
    @Singleton
    fun provideDeleteTransactionDetailsByTxnDetailsIdUseCase(repository: TransactionRepository): DeleteTransactionDetailsByTxnDetailsIdUseCase {
        return DeleteTransactionDetailsByTxnDetailsIdUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideUpdateSingleTxnDetailsByTxnIdUseCase(repository: TransactionRepository): UpdateSingleTxnDetailsByTxnIdUseCase {
        return UpdateSingleTxnDetailsByTxnIdUseCase(repository)
    }
}
