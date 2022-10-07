package com.example.feature_transaction.presentation.viewmodel.all_spaces

sealed class CreateNewTxnEvent {
    data class ShowErrorToastForErrorInSpace(val errorMessage: String) : CreateNewTxnEvent()
    data class ShowErrorToastForErrorInTransactionCreation(val errorMessage: String) : CreateNewTxnEvent()
    object SuccessCreateTransaction : CreateNewTxnEvent()
}
