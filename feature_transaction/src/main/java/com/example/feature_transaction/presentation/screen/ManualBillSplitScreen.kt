package com.example.feature_transaction.presentation.screen

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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
    LazyColumn() {
        item {
            totalAmount(navigateTo)
        }
        items(9) { i ->
            UserEditableCard("AA 1", onValueChanged = {
                if (it.isEmpty()) {
                    transactionViewModel.setIndividualContriDetail(i, 0)
                } else {
                    transactionViewModel.setIndividualContriDetail(i, it.toIntOrNull() ?: 0)
                }
            })
        }
    }
}

@Composable
fun totalAmount(
    navigateTo: (String) -> Unit,
    transactionViewModel: TransactionViewModel = hiltViewModel()
) {
    val individualContributionValuesList =
        transactionViewModel.individualContributionValues.collectAsState()
    val currentContributionAmount = transactionViewModel.currentContributionValue.collectAsState()
    val totalAmount = transactionViewModel.amount.collectAsState()
    Log.d("LEVI", "Fragment totalAmount: ${totalAmount.value}")

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RectangleShape)
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(modifier = Modifier.weight(0.8f), horizontalArrangement = Arrangement.SpaceEvenly) {
            UnifyText(text = "Total Amount -", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            UnifyText(
                text = currentContributionAmount.value.toString(),
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
            UnifyText(
                text = "/ ${totalAmount.value}",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
        Row(
            modifier = Modifier.weight(0.2f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            UnifyText(
                text = "Save",
                fontColor = if (currentContributionAmount.value == totalAmount.value) Color.Blue else Color.Gray,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 18.sp,
                modifier = Modifier.clickable {
                    Log.d("EREN", "totalAmount: ${individualContributionValuesList.value}")
                    if (currentContributionAmount.value == totalAmount.value) {
                        navigateTo(NavigationItem.TransactionScreen.route)
                    } else {
                        // TODO show Toaster
                    }
                }.padding(end = 10.dp)
            )
        }
    }
}
