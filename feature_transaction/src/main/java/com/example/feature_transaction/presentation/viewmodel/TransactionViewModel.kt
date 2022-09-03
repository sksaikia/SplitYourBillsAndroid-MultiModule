package com.example.feature_transaction.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_transaction.domain.use_case.GetAllSpaceByUserIdUsecase
import com.example.feature_transaction.presentation.viewmodel.all_spaces.AllSpacesState
import com.example.network.Result
import com.example.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TransactionViewModel @Inject constructor(
    private val getAllSpaceByUserIdUsecase: GetAllSpaceByUserIdUsecase,
    private val sessionManager: SessionManager
) : ViewModel() {

    var allSpacesState by mutableStateOf(AllSpacesState())

    init {
        getAllSpaces(sessionManager.fetchUserId())
    }

    private fun getAllSpaces(userId : Int) {
        viewModelScope.launch {
            getAllSpaceByUserIdUsecase(userId).collectLatest { result ->
                when(result) {
                    is Result.Success -> {
                        allSpacesState = allSpacesState.copy(
                            getAllSpacesResponse = result.data
                        )
                    }
                    is Result.Loading -> {

                    }
                    is Result.Error -> {

                    }
                }
            }
        }
    }


}