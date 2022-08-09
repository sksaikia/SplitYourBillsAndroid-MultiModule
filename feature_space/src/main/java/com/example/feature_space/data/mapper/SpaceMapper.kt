package com.example.feature_space.data.mapper

import com.example.feature_space.data.remote.request.create_space.CreateSpaceDTO
import com.example.feature_space.domain.model.request.create_space.CreateSpaceBody

fun CreateSpaceBody.convertToCreateSpaceBodyData() : CreateSpaceDTO {
    return CreateSpaceDTO(
        this.spaceName,
        this.spaceDescription
    )
}