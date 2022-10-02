package com.example.feature_transaction.domain.repository

import com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody
import com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {
    suspend fun getAllSpacesByUserId(userId: Int): Flow<Result<GetAllSpacesResponse>>

    suspend fun getAllMembersBySpaceId(spaceid: Int): Flow<Result<AllMembersForSpaceResponse>>

    suspend fun createTransaction(createTransactionBody: CreateTransactionBody): Flow<Result<CreateTransactionResponse>>

    suspend fun deleteTransactionById(transactionId: Int): Flow<Result<DeleteTransactionResponse>>
}
