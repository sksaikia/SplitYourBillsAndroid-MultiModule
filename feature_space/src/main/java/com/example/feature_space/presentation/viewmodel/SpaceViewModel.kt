package com.example.feature_space.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_space.domain.usecase.CreateSpaceUseCase
import com.example.feature_space.domain.usecase.EditSpaceUseCase
import com.example.feature_space.domain.usecase.GetAllSpaceByUserIdUsecase
import com.example.feature_space.domain.usecase.GetSpecificSpaceDetailsBySpaceIdUseCase
import com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesEvent
import com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesState
import com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent
import com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceState
import com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent
import com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceState
import com.example.feature_space.presentation.viewmodel.specific_space.SingleSpaceState
import com.example.network.Result
import com.example.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SpaceViewModel @Inject constructor(
    private val createNewSpaceUseCase: CreateSpaceUseCase,
    private val getAllSpaceByUserIdUsecase: GetAllSpaceByUserIdUsecase,
    private val getSpecificSpaceDetailsBySpaceIdUseCase: GetSpecificSpaceDetailsBySpaceIdUseCase,
    private val editSpaceUseCase: EditSpaceUseCase,
    private val sessionManager: SessionManager
) : ViewModel() {

    var createSpaceState by mutableStateOf(CreateSpaceState())
    var allSpacesState by mutableStateOf(AllSpacesState())
    var singleSpaceState by mutableStateOf(SingleSpaceState())
    var editSpaceState by mutableStateOf(EditSpaceState())

    private val _createSpaceEventFlow = MutableSharedFlow<CreateSpaceEvent>()
    val createSpaceEventFlow = _createSpaceEventFlow.asSharedFlow()

    private val _allSpacesEventFlow = MutableSharedFlow<AllSpacesEvent>()
    val allSpacesEventFlow = _allSpacesEventFlow.asSharedFlow()

    private val _editSpaceEventFlow = MutableSharedFlow<EditSpaceEvent>()
    val editSpaceEventFlow = _editSpaceEventFlow.asSharedFlow()

    fun getAllSpaces() {
        getAllSpaces(sessionManager.fetchUserId())
    }

    fun onCreateNewSpaceEvent(event: CreateSpaceEvent) {
        when (event) {
            is CreateSpaceEvent.OnCreateSpaceClick -> {
                createNewSpace(event.spaceName, event.spaceDescription)
            }
        }
    }

    fun onEditSpaceEvent(event: EditSpaceEvent) {
        when (event) {
            is EditSpaceEvent.OnSaveSpaceDetails -> {
                editSpaceDetails(event.spaceName, event.spaceDescription, event.spaceId)
            }
        }
    }

    private fun createNewSpace(spaceName: String, spaceDescription: String) {
        viewModelScope.launch {
            createNewSpaceUseCase(spaceName, spaceDescription).collectLatest { result ->
                when (result) {
                    is Result.Success -> {
                        result.data?.let { createSpaceResponse ->
                            createSpaceState = createSpaceState.copy(
                                createSpaceResponse = createSpaceResponse
                            )

                            // TODO as of now Navigate to Share Space
                            _createSpaceEventFlow.emit(CreateSpaceEvent.ShowSuccessToast("Space is created with id ${createSpaceResponse.data.spaceId}"))
                        }
                    }
                    is Result.Error -> {
                        _createSpaceEventFlow.emit(CreateSpaceEvent.ShowErrorToast("${result.message}"))
                    }
                    is Result.Loading -> {
                        createSpaceState = createSpaceState.copy(isLoading = result.isLoading)
                    }
                }
            }
        }
    }

    private fun getAllSpaces(userId: Int) {
        viewModelScope.launch {
            getAllSpaceByUserIdUsecase(userId).collectLatest { result ->
                when (result) {
                    is Result.Success -> {
                        allSpacesState = allSpacesState.copy(
                            getAllSpacesResponse = result.data,
                            isLoading = false
                        )
                    }
                    is Result.Loading -> {
                        allSpacesState = allSpacesState.copy(
                            isLoading = true
                        )
                    }
                    is Result.Error -> {
                        allSpacesState = allSpacesState.copy(
                            getAllSpacesResponse = null,
                            isLoading = false
                        )
                    }
                }
            }
        }
    }

    fun getSpecificSpaceBySpaceId(spaceId: Int) {
        viewModelScope.launch {
            getSpecificSpaceDetailsBySpaceIdUseCase
                .invoke(spaceId)
                .collectLatest { result ->
                    when (result) {
                        is Result.Success -> {
                            singleSpaceState = singleSpaceState.copy(
                                isLoading = false,
                                data = result.data
                            )
                        }
                        is Result.Loading -> {
                            singleSpaceState = singleSpaceState.copy(
                                isLoading = true
                            )
                        }
                        is Result.Error -> {
                            singleSpaceState = singleSpaceState.copy(
                                isLoading = false,
                                data = null
                            )
                        }
                    }
                }
        }
    }

    private fun editSpaceDetails(spaceName: String, spaceDescription: String, spaceId: Int) {
        viewModelScope.launch {
            editSpaceUseCase.invoke(
                spaceName,
                spaceDescription,
                spaceId
            ).collectLatest { result ->
                when (result) {
                    is Result.Success -> {
                        editSpaceState = editSpaceState.copy(
                            isLoading = false,
                            editSpaceResponse = result.data
                        )
                        _editSpaceEventFlow.emit(EditSpaceEvent.ShowSuccessToast("Space Details is updated"))
                    }
                    is Result.Error -> {
                        editSpaceState = editSpaceState.copy(
                            isLoading = false,
                            editSpaceResponse = null
                        )
                        _editSpaceEventFlow.emit(EditSpaceEvent.ShowErrorToast("Space Details is updated"))
                    }
                    is Result.Loading -> {
                        editSpaceState = editSpaceState.copy(
                            isLoading = true
                        )
                    }
                }
            }
        }
    }
}
