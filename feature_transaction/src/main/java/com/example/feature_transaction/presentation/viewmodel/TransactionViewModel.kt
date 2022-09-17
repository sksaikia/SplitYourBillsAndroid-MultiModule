package com.example.feature_transaction.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_transaction.domain.use_case.GetAllSpaceByUserIdUsecase
import com.example.feature_transaction.domain.use_case.GetAllSpaceMembersBySpaceIdUsecase
import com.example.feature_transaction.presentation.viewmodel.all_space_members.SpaceMembersState
import com.example.feature_transaction.presentation.viewmodel.all_spaces.AllSpacesState
import com.example.feature_transaction.presentation.viewmodel.all_spaces.CreateNewTxnEvent
import com.example.network.Result
import com.example.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TransactionViewModel @Inject constructor(
    private val getAllSpaceByUserIdUsecase: GetAllSpaceByUserIdUsecase,
    private val getAllSpaceMembersBySpaceIdUsecase: GetAllSpaceMembersBySpaceIdUsecase,
    private val sessionManager: SessionManager
) : ViewModel() {

    var allSpacesState by mutableStateOf(AllSpacesState())
    var spaceMembersState by mutableStateOf(SpaceMembersState())

    private val _createNewTxnEventFlow = MutableSharedFlow<CreateNewTxnEvent>()
    val createNewTxnEventFlow = _createNewTxnEventFlow.asSharedFlow()

    init {
        getAllSpaces(sessionManager.fetchUserId())
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
                        _createNewTxnEventFlow.emit(CreateNewTxnEvent.ShowErrorToastForErrorInSpace("${result.message}"))
                    }
                }
            }
        }
    }

    fun getSpaceMembersBySpaceId(spaceId: Int) {
        viewModelScope.launch {
            getAllSpaceMembersBySpaceIdUsecase(spaceId).collectLatest { result ->
                when (result) {
                    is Result.Success -> {
                        spaceMembersState = spaceMembersState.copy(
                            allSpaceMembers = result.data,
                            isLoading = false
                        )
                    }
                    is Result.Loading -> {
                        spaceMembersState = spaceMembersState.copy(
                            isLoading = true
                        )
                    }
                    is Result.Error -> {
                        spaceMembersState = spaceMembersState.copy(
                            isLoading = false
                        )
                        // Show Error Toast
                    }
                }
            }
        }
    }
}
