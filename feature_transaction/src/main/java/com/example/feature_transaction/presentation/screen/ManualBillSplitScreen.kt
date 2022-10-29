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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ViewModelHelper.activityViewModel
import com.example.compositions.UserEditableCard
import com.example.design.UnifyText
import com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel
import com.example.feature_transaction.presentation.viewmodel.all_space_members.SpaceMembersState

@Composable
fun ManualBillSplitScreen(
    navigateTo: (String) -> Unit,
    spaceId: String? = "0",
    transactionViewModel: TransactionViewModel = activityViewModel()
) {
    val spaceMembersState = transactionViewModel.spaceMembersState

    val totalAmount = transactionViewModel.amount.collectAsState()
    val transactionId = transactionViewModel.transactionId.collectAsState()

    Log.d("LEVI", "Fragment totalAmount: ${totalAmount.value}")
    Log.d("LEVI", "transactionId: ${transactionId.value}")

    LaunchedEffect(true) {
        transactionViewModel.getSpaceMembersBySpaceId(spaceId?.toInt() ?: 0)
    }

    LazyColumn() {
        item {
            totalAmount(navigateTo)
        }
        items(spaceMembersState.allSpaceMembers?.data?.totalMembers ?: 0) { i ->
            val memberData =
                spaceMembersState.allSpaceMembers?.data?.spaceMemberResponse?.get(i)

            if (memberData?.userDetails == null) {
                UserEditableCard(
                    name = memberData?.inviteDetails?.inviteName ?: "",
                    onValueChanged = {
                        if (it.isEmpty()) {
                            transactionViewModel.setIndividualContriDetail(i, 0)
                        } else {
                            transactionViewModel.setIndividualContriDetail(i, it.toIntOrNull() ?: 0)
                        }
                    }
                )
            } else {
                UserEditableCard(
                    name = memberData.userDetails.username,
                    onValueChanged = {
                        if (it.isEmpty()) {
                            transactionViewModel.setIndividualContriDetail(i, 0)
                        } else {
                            transactionViewModel.setIndividualContriDetail(i, it.toIntOrNull() ?: 0)
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun totalAmount(
    navigateTo: (String) -> Unit,
    transactionViewModel: TransactionViewModel = activityViewModel()
) {
    val spaceMembersState = transactionViewModel.spaceMembersState
    val individualContributionValuesList =
        transactionViewModel.individualContributionValues.collectAsState()
    val currentContributionAmount = transactionViewModel.currentContributionValue.collectAsState()
    val totalAmount = transactionViewModel.amount.collectAsState()
    val transactionId = transactionViewModel.transactionId.collectAsState()

    Log.d("LEVI", "Fragment totalAmount: ${totalAmount.value}")
    Log.d("LEVI", "transactionId: ${transactionId.value}")

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
                        val list = createRequestBodyForSavingTxnLists(
                            spaceMembersState,
                            individualContributionValuesList,
                            transactionId
                        )
                        transactionViewModel.addAllTxnList(list)
                        //     navigateTo(NavigationItem.TransactionScreen.route)
                    } else {
                        // TODO show Toaster
                    }
                }.padding(end = 10.dp)
            )
        }
    }
}

fun createRequestBodyForSavingTxnLists(
    spaceMembersState: SpaceMembersState,
    individualContributionValuesList: State<MutableList<Int>>,
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
                individualContributionValuesList.value[i]
            )
        )
        i++
    }
    return list
}
