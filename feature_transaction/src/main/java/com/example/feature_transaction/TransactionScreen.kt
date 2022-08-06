package com.example.feature_transaction

import androidx.compose.runtime.Composable
import com.example.design.UnifyText

@Composable
fun TransactionScreen(navigateTo : (String) -> Unit) {
    UnifyText(text = "Transaction")
}