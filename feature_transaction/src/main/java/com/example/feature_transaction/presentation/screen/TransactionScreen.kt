package com.example.feature_transaction.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ViewModelHelper.activityViewModel
import com.example.compositions.ShimmerAnimation
import com.example.design.UnifyText
import com.example.feature_transaction.R
import com.example.feature_transaction.TotalBalanceCard
import com.example.feature_transaction.presentation.ui_compositions.SpaceTrxCard
import com.example.feature_transaction.presentation.ui_compositions.TransactionHomeComponent
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel
import com.example.feature_transaction.presentation.viewmodel.get_all_txn.GetAllTxnEvent
import com.example.navigation.NavigationItem
import com.example.util.DateHelper.formatDate
import kotlinx.coroutines.flow.collectLatest

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TransactionScreen(
    navigateTo: (String) -> Unit,
    transactionViewModel: TransactionViewModel = activityViewModel()
) {
    val scaffoldState = rememberScaffoldState()

    val getAllTxnDetailsState = transactionViewModel.getAllTxnDetailsState

    LaunchedEffect(true) {
        transactionViewModel.getAllTxnDetailsByUserId()
        transactionViewModel.getAllTxnEvent.collectLatest { event ->
            when (event) {
                is GetAllTxnEvent.ShowErrorToast -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.errorMessage
                    )
                }
            }
        }
    }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navigateTo(NavigationItem.CreateNewTransactionScreen.route)
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Note")
            }
        },
        scaffoldState = scaffoldState

    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            item {
                TotalBalanceCard(amount = "₹ 5000.00")

                val listOfTrxCard = mutableListOf<Triple<String, String, Int>>(
                    Triple("Total In", "10000", R.drawable.trx_in),
                    Triple("Total Out", "5000", R.drawable.trx_out)
                )

                Row(modifier = Modifier.fillMaxWidth()) {
                    SpaceTrxCard(
                        headerText = listOfTrxCard[0].first,
                        amount = listOfTrxCard[0].second,
                        icon = listOfTrxCard[0].third,
                        modifier = Modifier.weight(0.5f)
                    )
                    SpaceTrxCard(
                        headerText = listOfTrxCard[1].first,
                        amount = listOfTrxCard[1].second,
                        icon = listOfTrxCard[1].third,
                        modifier = Modifier.weight(0.5f)
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                UnifyText(
                    text = "Recent Transactions",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))
            }

            item {
                if (getAllTxnDetailsState.isLoading) {
                    TransactionListLoaderView()
                }
            }

            items(getAllTxnDetailsState.allTxnDetails?.data?.totalTransactions ?: 0) { i ->
                val txnDetail = getAllTxnDetailsState.allTxnDetails?.data?.transactionDetailsResponse?.get(i)
                if (txnDetail?.userDetails == null) {
                    TransactionHomeComponent(
                        txnName = txnDetail?.transaction?.transactionName ?: "",
                        userName = txnDetail?.inviteDetails?.inviteName ?: "",
                        txnAmount = "₹ ${txnDetail?.amount}",
                        txnDate = txnDetail?.lastUpdated?.formatDate() ?: "",
                        modifier = Modifier.clickable {
                            navigateTo(
                                NavigationItem.TransactionDetailsScreen.withArgs(
                                    txnDetail?.transactionId.toString()
                                )
                            )
                        }
                    )
                } else {
                    TransactionHomeComponent(
                        txnName = txnDetail.transaction.transactionName,
                        userName = txnDetail.userDetails.username,
                        txnAmount = "₹ ${txnDetail.amount}",
                        txnDate = txnDetail.lastUpdated.formatDate(),
                        modifier = Modifier.clickable {
                            navigateTo(
                                NavigationItem.TransactionDetailsScreen.withArgs(
                                    txnDetail.transactionId.toString()
                                )
                            )
                        }
                    )
                }
            }

//            Row {
//                SpaceTrxCard(headerText = "Total In" , amount = "10000")
//                SpaceTrxCard(headerText = "Total Out", amount = "5000")
//            }
        }
    }
}

@Composable
fun TransactionListLoaderView() {
    repeat(7) {
        ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(60.dp))
    }
}
