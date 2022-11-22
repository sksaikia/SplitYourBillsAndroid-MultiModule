package com.example.feature_space.data.repository

import android.util.Log
import com.example.feature_space.data.mapper.convertToCreateSpaceBodyData
import com.example.feature_space.data.mapper.convertToCreateSpaceResponseBodyData
import com.example.feature_space.data.mapper.toDataAddMembersBody
import com.example.feature_space.data.mapper.toDomainAddMembersResponse
import com.example.feature_space.data.mapper.toDomainAllMembersForSpaceResponse
import com.example.feature_space.data.mapper.toDomainGetAllSpacesResponse
import com.example.feature_space.data.mapper.toDomainSingleSpaceMemberResponse
import com.example.feature_space.data.mapper.toDomainTxnBalanceResponse
import com.example.feature_space.data.mapper.toDomainTxnDetailsBySpaceResponse
import com.example.feature_space.data.remote.SpaceService
import com.example.feature_space.domain.model.request.add_members.AddMembersBody
import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.add_members.AddMembersResponse
import com.example.feature_space.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse
import com.example.feature_space.domain.model.response.space_details.SingleSpaceDetailsResponse
import com.example.feature_space.domain.model.response.txn_balance.TxnBalanceResponse
import com.example.feature_space.domain.model.response.txn_details_by_space.TxnDetailsBySpaceResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.RemoteDataSource
import com.example.network.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SpaceRepositoryImpl @Inject constructor(
    private val api: SpaceService
) : SpacesRepository, RemoteDataSource() {

    override suspend fun createNewSpace(createSpaceBody: CreateSpaceBody): Flow<Result<CreateSpaceResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))
            // Domain to Data
            safeApiCall({
                val response = api.createNewSpace(createSpaceBody.convertToCreateSpaceBodyData())
                emit(Result.Success(data = response.convertToCreateSpaceResponseBodyData()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }

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

    override suspend fun getSpecificSpaceBySpaceId(spaceId: Int): Flow<Result<SingleSpaceDetailsResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.getSpecificSpaceById(spaceId)
                emit(Result.Success(data = response.toDomainSingleSpaceMemberResponse()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }

    override suspend fun editSpaceBySpaceId(
        createSpaceBody: CreateSpaceBody,
        spaceId: Int
    ): Flow<Result<CreateSpaceResponse>> {
        return flow {
            emit(Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.editSpaceDetailsById(
                    createSpaceBody.convertToCreateSpaceBodyData(),
                    spaceId
                )
                emit(Result.Success(data = response.convertToCreateSpaceResponseBodyData()))
            }, { exception ->
                emit(Result.Error(exception))
            })
        }
    }

    override suspend fun addMembersToSpace(addedMembersBody: List<AddMembersBody>): Flow<Result<AddMembersResponse>> {
        return flow { emit(Result.Loading(isLoading = true))

            safeApiCall(
                {
                    val response = api.addMembersToSpaces(addedMembersBody.toDataAddMembersBody())
                    emit(com.example.network.Result.Success(data = response.toDomainAddMembersResponse()))
                },
                { exception ->
                    emit(Result.Error(exception))
                }
            )
        }
    }

    override suspend fun getAllMembersBySpaceId(spaceid: Int): Flow<Result<com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse>> {
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

    override suspend fun getAllTxnDetailsBySpaceId(spaceId: Int): Flow<Result<TxnDetailsBySpaceResponse>> {
        return flow {
            emit(com.example.network.Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.getAllTxnDetailsBySpaceId(spaceId)
                emit(com.example.network.Result.Success(response.toDomainTxnDetailsBySpaceResponse()))

            }, { exception ->
                emit(com.example.network.Result.Error(exception))
            })

        }
    }

    override suspend fun getTxnDetailsBalance(userId: Int): Flow<Result<TxnBalanceResponse>> {
        return flow {
            emit(com.example.network.Result.Loading(isLoading = true))

            safeApiCall({
                val response = api.getTxnDetailsBalance(userId)
                emit(com.example.network.Result.Success(data = response.toDomainTxnBalanceResponse()))
            }, { exception ->
                emit(com.example.network.Result.Error(exception))
            })
        }
    }
}
