package com.example.feature_space.presentation.viewmodel.all_members

sealed class  AllMembersForSpaceEvent{
    data class ShowErrorToast(val errorMesssage: String): AllMembersForSpaceEvent()
}