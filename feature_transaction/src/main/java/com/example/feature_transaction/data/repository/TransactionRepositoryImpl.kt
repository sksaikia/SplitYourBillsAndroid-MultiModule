package com.example.feature_transaction.data.repository

import android.util.Log
import com.example.feature_transaction.data.mapper.toAddTxnListDTO
import com.example.feature_transaction.data.mapper.toCreateTransactionDTO
import com.example.feature_transaction.data.mapper.toDomainAddTxnListResponse
import com.example.feature_transaction.data.mapper.toDomainAllMembersForSpaceResponse
import com.example.feature_transaction.data.mapper.toDomainCreateTransactionResponse
import com.example.feature_transaction.data.mapper.toDomainDeleteTransactionResponse
import com.example.feature_transaction.data.mapper.toDomainGetAllSpacesResponse
import com.example.feature_transaction.data.remote.TransactionService
import com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody
import com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody
import com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse
import com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.RemoteDataSource
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TransactionRepositoryImpl @Inject constructor(
    private val api: TransactionService
) : TransactionRepository, RemoteDataSource() {

    override suspend fun getAllSpacesByUserId(userId: Int): Flow<Result<GetAllSpacesResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))

            safeApiCall({
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
                Log.d(
                    "FATAL",
                    "getSpaceMembersBySpaceId: Repository  : ${response.data?.totalMembers} and " +
                        "${response.data?.spaceMemberResponse?.getOrNull(0)?.spaceId}"
                )
                emit(Result.Success(data = response.toDomainAllMembersForSpaceResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }

    override suspend fun createTransaction(createTransactionBody: CreateTransactionBody): Flow<Result<CreateTransactionResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.createTransaction(createTransactionBody.toCreateTransactionDTO())
                emit(Result.Success(data = response.toDomainCreateTransactionResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }

    override suspend fun deleteTransactionById(transactionId: Int): Flow<Result<com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))
            safeApiCall({
                val response = api.deleteTransactionById(transactionId)
                emit(Result.Success(data = response.toDomainDeleteTransactionResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }

    override suspend fun addTxnList(txnList: AddTxnListBody): Flow<Result<AddTxnListResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))
            safeApiCall({
                val response = api.addTxnList(txnList.toAddTxnListDTO())
                emit(Result.Success(data = response.toDomainAddTxnListResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }
}
