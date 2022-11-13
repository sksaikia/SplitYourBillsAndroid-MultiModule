package com.example.feature_transaction.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ViewModelHelper.activityViewModel
import com.example.compositions.ShimmerAnimation
import com.example.compositions.UserCard
import com.example.design.UnifyText
import com.example.feature_transaction.domain.model.response.single_txn_details.TransactionDetailsResponse
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel
import com.example.util.DateHelper.formatDate

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TransactionDetailsScreen(
    navigateTo: (String) -> Unit,
    txnId: String? = null,
    transactionViewModel: TransactionViewModel = activityViewModel()
) {
    val scaffoldState = rememberScaffoldState()
    val getAllTxnDetailsByTxnIdState = transactionViewModel.getAllTxnDetailsByTxnIdState

    LaunchedEffect(true) {
        if (txnId != null) {
            transactionViewModel.getAllTxnDetailsByTxnId(txnId.toInt())
        }
    }

    Scaffold(scaffoldState = scaffoldState) {
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            if (getAllTxnDetailsByTxnIdState.isLoading) {
                item {
                    TransactionDetailsLoaderView()
                }
            } else {
                if ((getAllTxnDetailsByTxnIdState.allTxnDetails?.data?.totalTransactions ?: 0) > 0) {
                    item {
                        val data =
                            getAllTxnDetailsByTxnIdState.allTxnDetails?.data?.transactionDetailsResponse?.get(
                                0
                            )
                        val totalAmount =
                            calculateTotalAmount(getAllTxnDetailsByTxnIdState.allTxnDetails?.data?.transactionDetailsResponse)
                        UnifyText(text = "Title", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                        Spacer(modifier = Modifier.height(6.dp))
                        UnifyText(
                            text = data?.transaction?.transactionName ?: "",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        UnifyText(
                            text = "Amount(Your contribution)",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        UnifyText(
                            text = "₹ ${data?.amount} " ?: "",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        UnifyText(text = "When", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                        Spacer(modifier = Modifier.height(6.dp))
                        UnifyText(
                            text = data?.lastUpdated?.formatDate() ?: "",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        UnifyText(text = "Note", fontSize = 14.sp, fontWeight = FontWeight.Normal)
                        Spacer(modifier = Modifier.height(6.dp))
                        UnifyText(
                            text = data?.transaction?.transactionDescription ?: "",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        UnifyText(
                            text = "Total Amount",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        UnifyText(
                            text = "₹ $totalAmount",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        UnifyText(
                            text = "Contributors",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }

                    items(getAllTxnDetailsByTxnIdState.allTxnDetails?.data?.transactionDetailsResponse?.size ?: 0) { i ->
                        val memberData =
                            getAllTxnDetailsByTxnIdState.allTxnDetails?.data?.transactionDetailsResponse?.get(i)
                        if (memberData?.userDetails == null) {
                            UserCard(
                                name = memberData?.inviteDetails?.inviteName ?: "",
                                shouldShowContributionAmount = true,
                                amount = memberData?.amount ?: 0
                            )
                        } else {
                            UserCard(
                                name = memberData.userDetails.username,
                                shouldShowContributionAmount = true,
                                amount = memberData?.amount ?: 0
                            )
                        }
                    }
                }
            }
        }
    }
}

private fun calculateTotalAmount(transactionDetailsResponse: List<TransactionDetailsResponse>?): String {
    var total = 0
    transactionDetailsResponse?.forEach {
        total += it.amount
    }
    return total.toString()
}

@Composable
fun TransactionDetailsLoaderView() {
    Column(modifier = Modifier.fillMaxWidth()) {
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(40.dp))
        ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(40.dp))
        ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(40.dp))
        ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(40.dp))
        ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(40.dp))
    }
}
