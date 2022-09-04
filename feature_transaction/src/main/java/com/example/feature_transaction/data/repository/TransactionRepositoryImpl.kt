package com.example.feature_transaction.data.repository

import com.example.feature_transaction.data.mapper.toDomainAllMembersForSpaceResponse
import com.example.feature_transaction.data.mapper.toDomainGetAllSpacesResponse
import com.example.feature_transaction.data.remote.TransactionService
import com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.RemoteDataSource
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TransactionRepositoryImpl @Inject constructor(
    private val api : TransactionService
) : TransactionRepository, RemoteDataSource() {

    override suspend fun getAllSpacesByUserId(userId: Int): Flow<Result<GetAllSpacesResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))

            safeApiCall( {
                val response = api.getAllSpacesByUserId(userId)
                emit(Result.Success(data = response.toDomainGetAllSpacesResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }

    override suspend fun getAllMembersBySpaceId(spaceid: Int): Flow<Result<AllMembersForSpaceResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.getAllMembersForSpecificSpaceId(spaceid)
                emit(Result.Success(data = response.toDomainAllMembersForSpaceResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })

        }
    }
}