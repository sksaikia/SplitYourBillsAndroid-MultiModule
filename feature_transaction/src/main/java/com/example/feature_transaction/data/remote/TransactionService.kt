package com.example.feature_transaction.data.remote

import com.example.feature_transaction.data.remote.response.all_spaces.GetAllSpacesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TransactionService {

    @GET("spaces/member/getallspaces")
    suspend fun getAllSpacesByUserId(@Query(value = "userId") userId : Int) : GetAllSpacesResponse

}