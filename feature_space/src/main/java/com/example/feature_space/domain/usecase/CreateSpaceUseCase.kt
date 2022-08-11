package com.example.feature_space.domain.usecase

import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse
import com.example.feature_space.domain.repository.SpacesRepository
import com.example.network.Result
import kotlinx.coroutines.flow.Flow

class CreateSpaceUseCase(
    private val repository : SpacesRepository
) {

    suspend operator fun invoke(spaceName : String, spaceDescription : String)
        : Flow<Result<CreateSpaceResponse>> {
        val createSpaceBody = CreateSpaceBody(spaceName, spaceDescription)
        return repository.createNewSpace(createSpaceBody)
    }

}