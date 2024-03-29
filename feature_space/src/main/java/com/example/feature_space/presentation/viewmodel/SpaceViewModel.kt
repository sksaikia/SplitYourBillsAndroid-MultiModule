package com.example.feature_space.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_space.domain.model.request.add_members.AddMembersBody
import com.example.feature_space.domain.usecase.AddMembersToSpaceUseCase
import com.example.feature_space.domain.usecase.CreateSpaceUseCase
import com.example.feature_space.domain.usecase.EditSpaceUseCase
import com.example.feature_space.domain.usecase.GetAllMembersForSpaceIdUseCase
import com.example.feature_space.domain.usecase.GetAllSpaceByUserIdUsecase
import com.example.feature_space.domain.usecase.GetSpecificSpaceDetailsBySpaceIdUseCase
import com.example.feature_space.domain.usecase.GetTxnBalanceUseCase
import com.example.feature_space.domain.usecase.GetTxnDetailsBySpaceIdUseCase
import com.example.feature_space.presentation.viewmodel.add_members.AddMembersEvent
import com.example.feature_space.presentation.viewmodel.add_members.AddMembersState
import com.example.feature_space.presentation.viewmodel.all_members.AllMembersForSpaceState
import com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesEvent
import com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesState
import com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent
import com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceState
import com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent
import com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceState
import com.example.feature_space.presentation.viewmodel.get_txn_balance.GetTxnBalanceState
import com.example.feature_space.presentation.viewmodel.specific_space.SingleSpaceState
import com.example.feature_space.presentation.viewmodel.specific_space.TxnDetailsBySpaceState
import com.example.network.Result
import com.example.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SpaceViewModel @Inject constructor(
    private val createNewSpaceUseCase: CreateSpaceUseCase,
    private val getAllSpaceByUserIdUsecase: GetAllSpaceByUserIdUsecase,
    private val getSpecificSpaceDetailsBySpaceIdUseCase: GetSpecificSpaceDetailsBySpaceIdUseCase,
    private val editSpaceUseCase: EditSpaceUseCase,
    private val addMembersToSpaceUseCase: AddMembersToSpaceUseCase,
    private val getAllMembersForSpaceIdUseCase: GetAllMembersForSpaceIdUseCase,
    private val getTxnDetailsBySpaceIdUseCase: GetTxnDetailsBySpaceIdUseCase,
    private val getTxnbalanceUseCase: GetTxnBalanceUseCase,
    private val sessionManager: SessionManager
) : ViewModel() {

    var createSpaceState by mutableStateOf(CreateSpaceState())
    var allSpacesState by mutableStateOf(AllSpacesState())
    var singleSpaceState by mutableStateOf(SingleSpaceState())
    var editSpaceState by mutableStateOf(EditSpaceState())
    var addMembersState by mutableStateOf(AddMembersState())
    var allMembersForSpaceState by mutableStateOf(AllMembersForSpaceState())
    var txnDetailsBySpaceState by mutableStateOf(TxnDetailsBySpaceState())
    var getTxnBalanceState by mutableStateOf(GetTxnBalanceState())

    private val _createSpaceEventFlow = MutableSharedFlow<CreateSpaceEvent>()
    val createSpaceEventFlow = _createSpaceEventFlow.asSharedFlow()

    private val _allSpacesEventFlow = MutableSharedFlow<AllSpacesEvent>()
    val allSpacesEventFlow = _allSpacesEventFlow.asSharedFlow()

    private val _editSpaceEventFlow = MutableSharedFlow<EditSpaceEvent>()
    val editSpaceEventFlow = _editSpaceEventFlow.asSharedFlow()

    private val _addMembersEventFlow = MutableSharedFlow<AddMembersEvent>()
    val addMembersEventFlow = _addMembersEventFlow.asSharedFlow()

    private val _spaceName = MutableStateFlow<String>("")
    val spaceName = _spaceName.asStateFlow()
    private val _spaceDescription = MutableStateFlow<String>("")
    val spaceDescription = _spaceDescription.asStateFlow()

    fun setSpaceName(name: String) {
        _spaceName.value = name
    }

    fun setSpaceDescription(description: String) {
        _spaceDescription.value = description
    }

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
                            _createSpaceEventFlow.emit(CreateSpaceEvent.ShowSuccessToast("Space is created with id ${createSpaceResponse.data.spaceId}", createSpaceResponse.data.spaceId.toString()))
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
                        _allSpacesEventFlow.emit(AllSpacesEvent.ShowErrorToast("${result.message}"))
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

    fun addMembersToSpace(addedMembersBody: List<AddMembersBody>) {
        viewModelScope.launch {
            addMembersToSpaceUseCase(addedMembersBody)
                .collectLatest { result ->
                    when(result) {
                        is com.example.network.Result.Success -> {
                            addMembersState = addMembersState.copy(
                                isLoading = false,
                                response = result.data
                            )
                            _addMembersEventFlow.emit(AddMembersEvent.ShowSuccessToast("Successfully added members "))
                        }

                        is com.example.network.Result.Error -> {
                            addMembersState = addMembersState.copy(
                                isLoading = false,
                                response = null
                            )
                        }
                        is com.example.network.Result.Loading -> {
                            addMembersState = addMembersState.copy(
                                isLoading = true
                            )
                        }
                    }
                }
        }
    }

    fun getAllMembersForSpaceId(spaceid: Int) {
        viewModelScope.launch {
            getAllMembersForSpaceIdUseCase(spaceid)
                .collectLatest { result ->
                    when(result) {
                        is com.example.network.Result.Success -> {
                            allMembersForSpaceState = allMembersForSpaceState.copy(
                                isLoading = false,
                                data = result.data
                            )
                        }
                        is com.example.network.Result.Loading -> {
                            allMembersForSpaceState = allMembersForSpaceState.copy(
                                isLoading = true
                            )
                        }
                        is com.example.network.Result.Error -> {
                            allMembersForSpaceState = allMembersForSpaceState.copy(
                                isLoading = false,
                                data = null
                            )
                        }
                    }
                }
        }
    }

    fun getTxnDetailsBySpaceId(spaceid: Int) {
        viewModelScope.launch {
            getTxnDetailsBySpaceIdUseCase(spaceid)
                .collectLatest { result ->
                    when(result) {
                        is com.example.network.Result.Success -> {
                            txnDetailsBySpaceState = txnDetailsBySpaceState.copy(
                                isLoading = false,
                                data = result.data
                            )
                        }
                        is com.example.network.Result.Loading -> {
                            txnDetailsBySpaceState = txnDetailsBySpaceState.copy(
                                isLoading = true
                            )
                        }
                        is com.example.network.Result.Error -> {
                            txnDetailsBySpaceState = txnDetailsBySpaceState.copy(
                                isLoading = false,
                                data = null
                            )
                        }
                    }
                }
        }
    }

    fun getTxnBalance() {
        viewModelScope.launch {
            getTxnbalanceUseCase.invoke(sessionManager.fetchUserId())
                .collectLatest { result ->
                    when (result) {
                        is com.example.network.Result.Success -> {
                            getTxnBalanceState = getTxnBalanceState.copy(
                                isLoading = false,
                                response = result.data
                            )
                        }
                        is com.example.network.Result.Error -> {
                            getTxnBalanceState = getTxnBalanceState.copy(
                                isLoading = false,
                                response = null
                            )
                        }
                        is com.example.network.Result.Loading -> {
                            getTxnBalanceState = getTxnBalanceState.copy(
                                isLoading = true
                            )
                        }
                    }
                }
        }
    }

}
