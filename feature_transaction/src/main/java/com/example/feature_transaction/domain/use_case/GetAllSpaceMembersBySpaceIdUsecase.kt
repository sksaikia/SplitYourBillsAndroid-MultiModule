package com.example.feature_transaction.domain.use_case

import com.example.feature_transaction.domain.model.response.all_member_for_space.AllMembersForSpaceResponse
import com.example.feature_transaction.domain.repository.TransactionRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetAllSpaceMembersBySpaceIdUsecase(
    private val repository: TransactionRepository
) {

    suspend operator fun invoke(spaceId: Int): Flow<Result<AllMembersForSpaceResponse>> {
        return repository.getAllMembersBySpaceId(spaceId)
    }
}
