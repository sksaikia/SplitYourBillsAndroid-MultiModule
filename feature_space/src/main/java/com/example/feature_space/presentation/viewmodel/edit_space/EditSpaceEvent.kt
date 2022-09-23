package com.example.feature_space.presentation.viewmodel.edit_space

sealed class EditSpaceEvent {
    data class OnSaveSpaceDetails(val spaceName: String, val spaceDescription: String, val spaceId: Int) : EditSpaceEvent()
    data class ShowErrorToast(val errorMessage: String) : EditSpaceEvent()
    data class ShowSuccessToast(val message: String) : EditSpaceEvent()
}
