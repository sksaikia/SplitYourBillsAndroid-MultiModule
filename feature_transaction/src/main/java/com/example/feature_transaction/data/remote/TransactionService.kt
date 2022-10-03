package com.example.feature_transaction.data.remote

import com.example.feature_transaction.data.remote.request.add_txn_list.AddTxnListDTO
import com.example.feature_transaction.data.remote.request.create_transaction.CreateTransactionDTO
import com.example.feature_transaction.data.remote.response.add_txn_list.AddTxnListResponse
import com.example.feature_transaction.data.remote.response.all_members_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.data.remote.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse
import com.example.feature_transaction.data.remote.response.delete_transaction.DeleteTransactionResponse
import com.example.feature_transaction.data.remote.response.get_single_txn_details.GetSingleTxnDetailsResponse
import com.example.feature_transaction.data.remote.response.get_txn_list.GetTxnListResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TransactionService {

    @GET("spaces/member/getallspaces")
    suspend fun getAllSpacesByUserId(@Query(value = "userId") userId: Int): GetAllSpacesResponse

    @GET("spaces/member/{spaceId}")
    suspend fun getAllMembersForSpecificSpaceId(@Path(value = "spaceId") spaceId: Int): AllMembersForSpaceResponse

    @POST("transaction/add")
    suspend fun createTransaction(@Body createTransactionDTO: CreateTransactionDTO) : CreateTransactionResponse

    @DELETE("transaction")
    suspend fun deleteTransactionById(@Query(value = "transactionId") transactionId: Int): DeleteTransactionResponse

    @POST("transaction/details/add")
    suspend fun addTxnList(@Body txnList: AddTxnListDTO): AddTxnListResponse

    @GET("transaction/details/invites")
    suspend fun getTxnListForInviteId(@Query(value = "userInviteId") userInviteId: Int): GetTxnListResponse

    @GET("transaction/details/user")
    suspend fun getTxnListForUserId(@Query(value = "userId") userId: Int): GetTxnListResponse

    @GET("transaction/details/single/txn")
    suspend fun getTxnListForTxnId(@Query(value = "txnId") txnId: Int): GetTxnListResponse

    @GET("transaction/details/single/details")
    suspend fun getTxnListForTxnDetailsId(@Query(value = "txnDetailsId") txnDetailsId: Int): GetSingleTxnDetailsResponse

}
