package com.example.feature_transaction.domain.repository

import com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody
import com.example.feature_transaction.domain.model.request.create_transaction.CreateTransactionBody
import com.example.feature_transaction.domain.model.response.add_txn_list.AddTxnListResponse
import com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.domain.model.response.delete_transaction.DeleteTransactionResponse
import com.example.feature_transaction.domain.model.response.get_single_txn_details.GetSingleTxnDetailsResponse
import com.example.feature_transaction.domain.model.response.get_txn_list.GetTxnListResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {
    suspend fun getAllSpacesByUserId(userId: Int): Flow<Result<GetAllSpacesResponse>>

    suspend fun getAllMembersBySpaceId(spaceid: Int): Flow<Result<AllMembersForSpaceResponse>>

    suspend fun createTransaction(createTransactionBody: CreateTransactionBody): Flow<Result<CreateTransactionResponse>>

    suspend fun deleteTransactionById(transactionId: Int): Flow<Result<DeleteTransactionResponse>>

    suspend fun addTxnList(txnList: AddTxnListBody): Flow<Result<AddTxnListResponse>>

    suspend fun getTxnDetailsByUserId(userId: Int): Flow<Result<GetTxnListResponse>>

    suspend fun getTxnDetailsByInviteId(inviteId: Int): Flow<Result<GetTxnListResponse>>

    suspend fun getTxnDetailsByTxnId(txnId: Int): Flow<Result<GetTxnListResponse>>

    suspend fun getTxnDetailsByTxnDetailsId(txnId: Int): Flow<Result<GetSingleTxnDetailsResponse>>
}
