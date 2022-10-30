package com.example.feature_transaction.presentation.viewmodel.get_all_txn

sealed class GetAllTxnEvent {
    data class ShowErrorToast(val errorMessage: String) : GetAllTxnEvent()
}
