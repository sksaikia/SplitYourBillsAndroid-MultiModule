package com.example.feature_space.data.mapper

import com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO
import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody
import com.example.feature_space.domain.model.response.create_space.CreateSpaceResponse

fun CreateSpaceBody.convertToCreateSpaceBodyData() : CreateSpaceDTO {
    return CreateSpaceDTO(
        this.spaceName,
        this.spaceDescription
    )
}

fun com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse.convertToCreateSpaceResponseBodyData() : CreateSpaceResponse {
    return CreateSpaceResponse(
        success =  this.success,
        data = this.data.toSpaceDetailsResponseDomain()
    )
}

fun com.example.feature_space.data.remote.response.create_space.CreateSpaceResponse.SpaceDetailsResponse.toSpaceDetailsResponseDomain() : CreateSpaceResponse.SpaceDetailsResponse {
    return CreateSpaceResponse.SpaceDetailsResponse (
        this.spaceId,
        this.personId,
        this.spaceName,
        this.spaceDescription,
        this.lastUpdated,
        this.active
    )
}