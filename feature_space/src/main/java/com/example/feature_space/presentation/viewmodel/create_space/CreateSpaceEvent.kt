package com.example.feature_space.presentation.viewmodel.create_space

sealed class CreateSpaceEvent {
    data class OnCreateSpaceClick(val spaceName : String, val spaceDescription : String) : CreateSpaceEvent()
    object NavigateToShareSpace : CreateSpaceEvent()
    object NavigateToInviteMembers : CreateSpaceEvent()
    data class ShowErrorToast(val errorMessage : String) : CreateSpaceEvent()
}