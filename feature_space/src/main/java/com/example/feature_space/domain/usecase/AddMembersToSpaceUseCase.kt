package com.example.feature_space.domain.usecase

import com.example.feature_space.domain.model.request.add_members.AddMembersBody
import com.example.feature_space.domain.model.response.add_members.AddMembersResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class AddMembersToSpaceUseCase(
    private val repository: SpacesRepository
) {

    suspend operator fun invoke(addedMembersBody: List<AddMembersBody>): Flow<Result<AddMembersResponse>> {
        return repository.addMembersToSpace(addedMembersBody)
    }
}
