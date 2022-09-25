package com.example.feature_space.presentation.viewmodel.add_members

import com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent

sealed class AddMembersEvent {
    data class ShowSuccessToast(val message: String) : AddMembersEvent()
}