package com.example.feature_space.domain.repository

import com.example.feature_space.domain.model.request.add_members.AddMembersBody
import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.add_members.AddMembersResponse
import com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse
import com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse
import com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse
import com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

interface SpacesRepository {

    suspend fun createNewSpace(createSpaceBody: CreateSpaceBody): Flow<Result<CreateSpaceResponse>>

    suspend fun getAllSpacesByUserId(userId: Int): Flow<Result<GetAllSpacesResponse>>

    suspend fun getSpecificSpaceBySpaceId(spaceId: Int): Flow<Result<SingleSpaceDetailsResponse>>

    suspend fun editSpaceBySpaceId(createSpaceBody: CreateSpaceBody, spaceId: Int): Flow<Result<CreateSpaceResponse>>

    suspend fun addMembersToSpace(addedMembersBody: List<AddMembersBody>): Flow<Result<AddMembersResponse>>

    suspend fun getAllMembersBySpaceId(spaceid: Int): Flow<Result<AllMembersForSpaceResponse>>

    suspend fun getAllTxnDetailsBySpaceId(spaceId: Int): Flow<com.example.network.Result<TxnDetailsBySpaceResponse>>

}
