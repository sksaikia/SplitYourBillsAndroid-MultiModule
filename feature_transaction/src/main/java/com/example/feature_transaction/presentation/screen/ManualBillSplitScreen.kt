package com.example.feature_transaction.presentation.screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ViewModelHelper.activityViewModel
import com.example.compositions.UserEditableCard
import com.example.design.PopText
import com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel
import com.example.feature_transaction.presentation.viewmodel.add_txn_details_list.AddTxnDetailsListEvent
import com.example.feature_transaction.presentation.viewmodel.all_space_members.SpaceMembersState
import com.example.navigation.NavigationItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest

/**
 * activityViewModel is used because we have to share the viewModel between multiple screens.
 * doing hiltViewModel makes it attached to a single screen , so we can not share any variable
 * via the view model
 * **/
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ManualBillSplitScreen(
    navigateTo: (String) -> Unit,
    spaceId: String? = "0",
    transactionViewModel: TransactionViewModel = activityViewModel()
) {
    val spaceMembersState = transactionViewModel.spaceMembersState
    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(true) {
        transactionViewModel.getSpaceMembersBySpaceId(spaceId?.toInt() ?: 0)

        transactionViewModel.addTxnDetailsListEvent.collectLatest { event ->
            when (event) {
                is AddTxnDetailsListEvent.ShowErrorToast -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.errorMessage
                    )
                }
                is AddTxnDetailsListEvent.SuccessForAddTxnDetailsList -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = "Successfully added TXNs"
                    )
                    delay(1000L)
                    navigateTo(NavigationItem.TransactionScreen.route)
                }
            }
        }
    }

    Scaffold(scaffoldState = scaffoldState) {
        LazyColumn {
            item {
                totalAmount(navigateTo)
            }
            items(spaceMembersState.allSpaceMembers?.data?.totalMembers ?: 0) { i ->
                val memberData =
                    spaceMembersState.allSpaceMembers?.data?.spaceMemberResponse?.get(i)

                if (memberData?.userDetails == null) {
                    UserEditableCard(
                        name = memberData?.inviteDetails?.inviteName ?: "",
                        onValueChangedForContribution = {
                            if (it.isEmpty()) {
                                transactionViewModel.setIndividualContriDetail(i, 0)
                            } else {
                                transactionViewModel.setIndividualContriDetail(
                                    i,
                                    it.toIntOrNull() ?: 0
                                )
                            }
                        },
                        onValueChangedForPayableAmount = {
                            if (it.isEmpty()) {
                                transactionViewModel.setIndividualPayableAmount(i, 0)
                            } else {
                                transactionViewModel.setIndividualPayableAmount(
                                    i,
                                    it.toIntOrNull() ?: 0
                                )
                            }
                        }
                    )
                } else {
                    UserEditableCard(
                        name = memberData.userDetails.username,
                        onValueChangedForContribution = {
                            if (it.isEmpty()) {
                                transactionViewModel.setIndividualContriDetail(i, 0)
                            } else {
                                transactionViewModel.setIndividualContriDetail(
                                    i,
                                    it.toIntOrNull() ?: 0
                                )
                            }
                        },
                        onValueChangedForPayableAmount = {
                            if (it.isEmpty()) {
                                transactionViewModel.setIndividualPayableAmount(i, 0)
                            } else {
                                transactionViewModel.setIndividualPayableAmount(
                                    i,
                                    it.toIntOrNull() ?: 0
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}

// Total Amount and Payable Amount
@Composable
fun totalAmount(
    navigateTo: (String) -> Unit,
    transactionViewModel: TransactionViewModel = activityViewModel()
) {
    val spaceMembersState = transactionViewModel.spaceMembersState
    val individualContributionValuesList =
        transactionViewModel.individualContributionValues.collectAsState()
    var totalPayableAmountValuesList = transactionViewModel.totalPayableAmountValuesList.collectAsState()
    val currentContributionAmount = transactionViewModel.currentContributionValue.collectAsState()
    val currentTotalPayableAmount = transactionViewModel.currentTotalPayableAmount.collectAsState()
    val totalAmount = transactionViewModel.amount.collectAsState()
    val transactionId = transactionViewModel.transactionId.collectAsState()

    Column(Modifier.padding(10.dp)) {
        // TOTAL PAYABLE AMOUNT

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)
                .border(width = 1.dp, color = Color.Black, shape = RectangleShape)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(modifier = Modifier.weight(0.8f), horizontalArrangement = Arrangement.SpaceEvenly) {
                PopText(text = "Total Payable Amount -", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                PopText(
                    text = currentTotalPayableAmount.value.toString(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                PopText(
                    text = "/ ${totalAmount.value}",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }

        // TOTAL AMOUNT

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)
                .border(width = 1.dp, color = Color.Black, shape = RectangleShape)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(modifier = Modifier.weight(0.8f), horizontalArrangement = Arrangement.SpaceEvenly) {
                PopText(text = "Total Amount -", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                PopText(
                    text = currentContributionAmount.value.toString(),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                PopText(
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
                PopText(
                    text = "Save",
                    fontColor = if (helperToEnableSaveButton(currentContributionAmount, totalAmount, currentTotalPayableAmount)) Color.Blue else Color.Gray,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp,
                    modifier = Modifier.clickable {
                        Log.d("EREN", "totalAmount: ${individualContributionValuesList.value}")
                        if (helperToEnableSaveButton(currentContributionAmount, totalAmount, currentTotalPayableAmount)) {
                            val list = createRequestBodyForSavingTxnLists(
                                spaceMembersState,
                                individualContributionValuesList,
                                totalPayableAmountValuesList,
                                transactionId
                            )
                            transactionViewModel.addAllTxnList(list)
                            //     navigateTo(NavigationItem.TransactionScreen.route)
                        } else {
                        }
                    }.padding(end = 10.dp)
                )
            }
        }
    }
}

fun helperToEnableSaveButton(
    currentContributionAmount: State<Int>,
    totalAmount: State<Int>,
    currentTotalPayableAmount: State<Int>
): Boolean {
    if (currentContributionAmount.value == totalAmount.value && currentTotalPayableAmount.value == totalAmount.value) {
        return true
    }
    return false
}

fun createRequestBodyForSavingTxnLists(
    spaceMembersState: SpaceMembersState,
    individualContributionValuesList: State<MutableList<Int>>,
    totalPayableAmount: State<MutableList<Int>>,
    transactionId: State<Int>
): MutableList<AddTxnListBody> {
    val list = mutableListOf<AddTxnListBody>()
    var i = 0
    spaceMembersState.allSpaceMembers?.data?.spaceMemberResponse?.forEach {
        list.add(
            AddTxnListBody(
                transactionId.value,
                it.personId,
                it.inviteId,
                individualContributionValuesList.value[i],
                // TODO change here
                totalPayableAmount.value[i].toLong()
            )
        )
        i++
    }
    return list
}
