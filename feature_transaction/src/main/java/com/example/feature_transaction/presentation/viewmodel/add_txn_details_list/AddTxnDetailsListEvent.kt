package com.example.feature_transaction.presentation.viewmodel.add_txn_details_list

sealed class AddTxnDetailsListEvent {
    data class ShowErrorToast(val errorMessage: String) : AddTxnDetailsListEvent()
    object SuccessForAddTxnDetailsList : AddTxnDetailsListEvent()
}
