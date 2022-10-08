package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.design.UnifyButton
import com.example.design.UnifyEditText
import com.example.design.UnifyText
import com.example.feature_space.presentation.viewmodel.SpaceViewModel
import com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent
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

        spaceViewModel.getAllMembersForSpaceId(spaceId?.toInt() ?: 0)
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
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    if (specificSpaceDetailsState.isLoading) {
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
                    }
                    UnifyText(text = "Space Name", fontSize = 12.sp, fontWeight = FontWeight.Normal)
                    Spacer(modifier = Modifier.height(6.dp))
                    UnifyText(
                        text = specificSpaceDetailsState.data?.spacesResponse?.spaceName ?: "",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    UnifyText(
                        text = "Description",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    UnifyText(
                        text = specificSpaceDetailsState.data?.spacesResponse?.spaceDescription
                            ?: "",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    UnifyText(text = "Created By", fontSize = 12.sp, fontWeight = FontWeight.Normal)
                    Spacer(modifier = Modifier.height(6.dp))
                    UnifyText(
                        text = specificSpaceDetailsState.data?.spacesResponse?.userResponse?.username
                            ?: "",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UnifyButton(buttonText = "All Transactions")
                        UnifyButton(buttonText = "All members", onClickButton = {
                            shouldShowAllMembersForSpace = !shouldShowAllMembersForSpace
                        })
                    }

                    if (shouldShowAllMembersForSpace) {
                        LazyColumn() {
                            items(allMembersForSpaceState.data?.data?.totalTransactions ?: 0) { i ->
                                val memberData = allMembersForSpaceState.data?.data?.txnDetails?.get(i)



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
                    UnifyEditText(
                        headerText = "Space Name",
                        editText = specificSpaceDetailsState.data?.spacesResponse?.spaceName ?: "",
                        onValueChanged = {
                            spaceName = it
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    UnifyEditText(
                        headerText = "Space Description",
                        editText = specificSpaceDetailsState.data?.spacesResponse?.spaceDescription
                            ?: "",
                        onValueChanged = {
                            spaceDescription = it
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    UnifyButton(buttonText = "Save Details", onClickButton = {
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
fun composeAllMembersArea() {
}
