package com.example.feature_transaction.presentation.screen

import androidx.compose.runtime.Composable
import com.example.ViewModelHelper.activityViewModel
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel

@Composable
fun TransactionDetailsScreen(
    navigateTo: (String) -> Unit,
    txnId: String? = null,
    transactionViewModel: TransactionViewModel = activityViewModel()
) {
}
