package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.compositions.ShimmerAnimation
import com.example.compositions.UserCard
import com.example.design.PopButton
import com.example.design.PopEditText
import com.example.design.PopText
import com.example.feature_space.presentation.ui_composition.TransactionHomeComponent
import com.example.feature_space.presentation.viewmodel.SpaceViewModel
import com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent
import com.example.navigation.NavigationItem
import com.example.util.DateHelper.formatDate
import kotlinx.coroutines.flow.collectLatest

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SpaceDetailsScreen(
    navigateTo: (String) -> Unit,
    spaceId: String? = "0",
    spaceViewModel: SpaceViewModel = hiltViewModel()
) {
    val specificSpaceDetailsState = spaceViewModel.singleSpaceState
    val editSpaceState = spaceViewModel.editSpaceState
    val allMembersForSpaceState = spaceViewModel.allMembersForSpaceState
    val txnDetailsBySpaceState = spaceViewModel.txnDetailsBySpaceState

    val scaffoldState = rememberScaffoldState()
    var shouldEdit by remember {
        mutableStateOf(false)
    }
    var shouldShowAllMembersForSpace by remember {
        mutableStateOf(false)
    }

    var shouldShowAllTxnDetailsForSpace by remember {
        mutableStateOf(false)
    }

    var spaceName by remember { mutableStateOf("") }
    var spaceDescription by remember { mutableStateOf("") }

//    spaceViewModel.getSpecificSpaceBySpaceId(spaceId?.toInt() ?: 0)

    LaunchedEffect(key1 = true) {
        spaceViewModel.getSpecificSpaceBySpaceId(spaceId?.toInt() ?: 0)
        spaceViewModel.getAllMembersForSpaceId(spaceId?.toInt() ?: 0)
        spaceViewModel.getTxnDetailsBySpaceId(spaceId?.toInt() ?: 0)
        spaceViewModel.editSpaceEventFlow.collectLatest { event ->
            when (event) {
                is EditSpaceEvent.OnSaveSpaceDetails -> {
                }
                is EditSpaceEvent.ShowSuccessToast -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.message
                    )
                    shouldEdit = false
                    spaceViewModel.getSpecificSpaceBySpaceId(spaceId?.toInt() ?: 0)
                }
                is EditSpaceEvent.ShowErrorToast -> {
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
                    shouldEdit = !shouldEdit
                    // navigateTo(NavigationItem.CreateNewSpaceScreen.route)
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(imageVector = Icons.Default.Edit, contentDescription = "Add Note")
            }
        },
        scaffoldState = scaffoldState

    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            if (!shouldEdit) {
                if (specificSpaceDetailsState.isLoading) {
                    SpaceDetailsLoaderView()
                } else {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        PopText(
                            text = "Space Name",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        PopText(
                            text = specificSpaceDetailsState.data?.spacesResponse?.spaceName ?: "",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        PopText(
                            text = "Description",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        PopText(
                            text = specificSpaceDetailsState.data?.spacesResponse?.spaceDescription
                                ?: "",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        PopText(
                            text = "Created By",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        PopText(
                            text = specificSpaceDetailsState.data?.spacesResponse?.userResponse?.username
                                ?: "",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            PopButton(buttonText = "All Transactions", onClickButton = {
                                shouldShowAllTxnDetailsForSpace = !shouldShowAllTxnDetailsForSpace
                                shouldShowAllMembersForSpace = false
                            })
                            PopButton(buttonText = "All members", onClickButton = {
                                shouldShowAllMembersForSpace = !shouldShowAllMembersForSpace
                                shouldShowAllTxnDetailsForSpace = false
                            })
                        }

                        if (shouldShowAllMembersForSpace) {
                            LazyColumn {
                                items(allMembersForSpaceState.data?.data?.totalMembers ?: 0) { i ->
                                    val memberData =
                                        allMembersForSpaceState.data?.data?.spaceMemberResponse?.get(
                                            i
                                        )

                                    if (memberData?.userDetails == null) {
                                        UserCard(
                                            name = memberData?.inviteDetails?.inviteName ?: "",
                                            shouldShowContributionAmount = false,
                                            modifier = Modifier.padding(horizontal = 20.dp)
                                        )
                                    } else {
                                        UserCard(
                                            name = memberData.userDetails.username,
                                            shouldShowContributionAmount = false,
                                            modifier = Modifier.padding(horizontal = 20.dp)
                                        )
                                    }
                                }
                            }
                        }

                        if (shouldShowAllTxnDetailsForSpace) {
                            LazyColumn {
                                items(
                                    txnDetailsBySpaceState.data?.data?.totalTransactions ?: 0

                                ) { i ->
                                    val txnDetail =
                                        txnDetailsBySpaceState.data?.data?.txnDetails?.get(
                                            i
                                        )
                                    if (txnDetail?.personId != -1) {
                                        TransactionHomeComponent(
                                            txnName = txnDetail?.transactionName ?: "",
                                            userName = txnDetail?.userName ?: "",
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
                                            txnName = txnDetail?.transactionName,
                                            userName = txnDetail.inviteName ?: "",
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
                            }
                        }
                    }
                }
            } else {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (editSpaceState.isLoading) {
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
                    }
                    PopEditText(
                        headerText = "Space Name",
                        editText = specificSpaceDetailsState.data?.spacesResponse?.spaceName ?: "",
                        onValueChanged = {
                            spaceName = it
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PopEditText(
                        headerText = "Space Description",
                        editText = specificSpaceDetailsState.data?.spacesResponse?.spaceDescription
                            ?: "",
                        onValueChanged = {
                            spaceDescription = it
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PopButton(buttonText = "Save Details", onClickButton = {
                        spaceViewModel.onEditSpaceEvent(
                            EditSpaceEvent.OnSaveSpaceDetails(
                                if (spaceName == "") specificSpaceDetailsState.data?.spacesResponse?.spaceName!! else spaceName,
                                if (spaceDescription == "") specificSpaceDetailsState.data?.spacesResponse?.spaceDescription!! else spaceDescription,
                                Integer.parseInt(spaceId)
                            )
                        )
                    })
                }
            }
        }
    }
}

@Composable
fun SpaceDetailsLoaderView() {
    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 15.dp)) {
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(120.dp).height(26.dp))
        ShimmerAnimation(modifier = Modifier.width(80.dp).height(26.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            ShimmerAnimation(modifier = Modifier.width(160.dp).height(50.dp))
            ShimmerAnimation(modifier = Modifier.width(160.dp).height(50.dp))
        }
    }
}
