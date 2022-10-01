package com.example.feature_transaction

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.compositions.UserEditableCard
import com.example.design.UnifyText
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel
import com.example.navigation.NavigationItem

@Composable
fun ManualBillSplitScreen(
    navigateTo: (String) -> Unit,
    transactionViewModel: TransactionViewModel = hiltViewModel()
) {
    val totalTxnAmount = 800

    LazyColumn() {
        item {
            totalAmount(totalTxnAmount, navigateTo)
        }
        items(9) { i ->
            UserEditableCard("AA 1", onValueChanged = {
                if (it.isNullOrEmpty()) {
                    transactionViewModel.setIndividualContriDetail(i, 0)
                } else {
                    transactionViewModel.setIndividualContriDetail(i, it.toIntOrNull() ?: 0)
                }
            })
        }
    }
}

@Composable
fun totalAmount( totalTxnAmount: Int, navigateTo: (String) -> Unit, transactionViewModel: TransactionViewModel = hiltViewModel()) {
    val individualContributionValuesList = transactionViewModel.individualContributionValues.collectAsState()
    val currentContributionAmount = transactionViewModel.currentContributionValue.collectAsState()

    Row(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(0.8f), horizontalArrangement = Arrangement.SpaceEvenly) {
            UnifyText(text = "Total Amount -", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            UnifyText(text = currentContributionAmount.value.toString(), fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            UnifyText(text = "/ $totalTxnAmount", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
        }
        Row(modifier = Modifier.weight(0.2f), verticalAlignment = Alignment.CenterVertically) {
            UnifyText(
                text = "Save",
                fontColor = if (currentContributionAmount.value == totalTxnAmount) Color.Blue else Color.Gray,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.clickable {
                    Log.d("EREN", "totalAmount: ${individualContributionValuesList.value}")
                    if (currentContributionAmount.value == totalTxnAmount) {
                        navigateTo(NavigationItem.TransactionScreen.route)
                    } else {
                        // TODO show Toaster
                    }
                }
            )
        }
    }
}
