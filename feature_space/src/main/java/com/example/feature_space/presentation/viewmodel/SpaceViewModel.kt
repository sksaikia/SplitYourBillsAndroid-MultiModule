package com.example.feature_space.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_space.domain.usecase.CreateSpaceUseCase
import com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent
import com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceState
import com.example.network.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SpaceViewModel @Inject constructor(
    private val createNewSpaceUseCase : CreateSpaceUseCase
) : ViewModel() {

    var createSpaceState by mutableStateOf(CreateSpaceState())

    private val _createSpaceEventFlow = MutableSharedFlow<CreateSpaceEvent>()
    val createSpaceEventFlow = _createSpaceEventFlow.asSharedFlow()

    fun onCreateNewSpaceEvent(event : CreateSpaceEvent) {
        when(event) {
            is CreateSpaceEvent.OnCreateSpaceClick -> {
                createNewSpace(event.spaceName, event.spaceDescription)
            }
        }
    }

    private fun createNewSpace(spaceName: String, spaceDescription: String) {
        viewModelScope.launch {
            createNewSpaceUseCase(spaceName, spaceDescription).collectLatest { result ->
                when(result) {
                    is Result.Success -> {
                        result.data?.let { createSpaceResponse ->
                            createSpaceState = createSpaceState.copy(
                                createSpaceResponse = createSpaceResponse
                            )

                            //TODO as of now Navigate to Share Space
                            _createSpaceEventFlow.emit(CreateSpaceEvent.NavigateToShareSpace)

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

}