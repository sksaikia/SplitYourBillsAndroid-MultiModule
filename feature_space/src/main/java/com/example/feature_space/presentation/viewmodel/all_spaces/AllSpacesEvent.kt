package com.example.feature_space.presentation.viewmodel.all_spaces

sealed class AllSpacesEvent {
    data class ShowErrorToast(val errorMessage: String): AllSpacesEvent()
}
