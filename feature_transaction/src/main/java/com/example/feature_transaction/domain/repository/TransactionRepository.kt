package com.example.feature_transaction.domain.repository

import com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {
    suspend fun getAllSpacesByUserId(userId : Int)
            : Flow<Result<GetAllSpacesResponse>>

}