package com.example.feature_space.domain.usecase

import com.example.feature_space.domain.model.response.all_member_for_space.AllMembersForSpaceResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class GetAllMembersForSpaceIdUseCase(
    private val repository: SpacesRepository
) {

    suspend operator fun invoke(spaceId: Int): Flow<Result<AllMembersForSpaceResponse>> {
        return repository.getAllMembersBySpaceId(spaceId)
    }
}
