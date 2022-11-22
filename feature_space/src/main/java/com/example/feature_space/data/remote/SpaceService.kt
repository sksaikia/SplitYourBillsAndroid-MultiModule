package com.example.feature_space.data.remote // ktlint-disable package-name

import com.example.feature_space.data.remote.request.add_members.AddMembersDTO
import com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO
import com.example.feature_space.data.remote.response.add_members.AddMembersResponse
import com.example.feature_space.data.remote.response.all_members_for_space.AllMembersForSpaceResponse
import com.example.feature_space.data.remote.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse
import com.example.feature_space.data.remote.response.space_details.SingleSpaceDetailsResponse
import com.example.feature_space.data.remote.response.txn_balance.TxnBalanceResponse
import com.example.feature_space.data.remote.response.txn_details_by_space.TxnDetailsBySpaceResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryName

interface SpaceService {

    @POST("spaces/add")
    suspend fun createNewSpace(@Body createNewSpace: CreateSpaceDTO): CreateSpaceResponse

    @GET("spaces/member/getallspaces")
    suspend fun getAllSpacesByUserId(@Query(value = "userId") userId: Int): GetAllSpacesResponse

    @GET("spaces/{spaceId}")
    suspend fun getSpecificSpaceById(@Path(value = "spaceId") spaceId: Int): SingleSpaceDetailsResponse

    // Same response in create and edit new space
    @PUT("spaces/{spaceId}")
    suspend fun editSpaceDetailsById(
        @Body createNewSpace: CreateSpaceDTO,
        @Path(value = "spaceId") spaceId: Int
    ): CreateSpaceResponse

    @POST("spaces/member/add")
    suspend fun addMembersToSpaces(
        @Body contactList: List<AddMembersDTO>
    ): AddMembersResponse

    @GET("spaces/member/{spaceId}")
    suspend fun getAllMembersForSpecificSpaceId(@Path(value = "spaceId") spaceId: Int): AllMembersForSpaceResponse

    @GET("transaction/details")
    suspend fun getAllTxnDetailsBySpaceId(@Query(value = "spaceId") spaceId: Int) : TxnDetailsBySpaceResponse

    @GET("/api/transaction/details/balance")
    suspend fun getTxnDetailsBalance(
        @Query(value = "userId") userId: Int
    ): TxnBalanceResponse
}
