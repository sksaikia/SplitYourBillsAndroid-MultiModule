package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.compositions.ShimmerAnimation
import com.example.design.UnifyText
import com.example.feature_space.R
import com.example.feature_space.presentation.ui_composition.SpaceCard
import com.example.feature_space.presentation.ui_composition.SpaceTrxCard
import com.example.feature_space.presentation.ui_composition.TotalBalanceCard
import com.example.feature_space.presentation.viewmodel.SpaceViewModel
import com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesEvent
import com.example.navigation.NavigationItem
import com.example.util.DateHelper.formatDateOnly
import kotlinx.coroutines.flow.collectLatest

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SpacesScreen(
    navigateTo: (String) -> Unit,
    spaceViewModel: SpaceViewModel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()

    val allSpacesState = spaceViewModel.allSpacesState
    val txnBalanceState = spaceViewModel.getTxnBalanceState

    LaunchedEffect(key1 = true) {
        spaceViewModel.getAllSpaces()
        spaceViewModel.getTxnBalance()
        spaceViewModel.allSpacesEventFlow.collectLatest { event ->
            when (event) {
                is AllSpacesEvent.ShowErrorToast -> {
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
                    navigateTo(
                        NavigationItem.CreateNewSpaceScreen.withArgs(
                            "A"
                        )
                    )
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Note")
            }
        },
        scaffoldState = scaffoldState

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            if (txnBalanceState.isLoading) {
                TotalBalanceLoader()
            } else {

                TotalBalanceCard(amount = (
                        txnBalanceState.response?.data?.totalOut?.minus(
                            txnBalanceState.response.data.totalIn
                        ) ?: 0
                        ).toString())

                val listOfTrxCard = mutableListOf<Triple<String, String, Int>>(
                    Triple("Total In", (txnBalanceState.response?.data?.totalIn ?: "0").toString(), R.drawable.trx_in),
                    Triple("Total Out", (txnBalanceState.response?.data?.totalOut ?: "0").toString(), R.drawable.trx_out)
                )

                LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                    items(listOfTrxCard.size) { i ->
                        SpaceTrxCard(
                            headerText = listOfTrxCard[i].first,
                            amount = listOfTrxCard[i].second,
                            icon = listOfTrxCard[i].third
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                UnifyText(
                    text = "All Spaces",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )

            }
            Spacer(modifier = Modifier.height(10.dp))

            if (allSpacesState.isLoading) {
                LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                    items(10) {
                        ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(90.dp))
                    }
                }
            }

            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(allSpacesState.getAllSpacesResponse?.spacesResponse?.spaceMembers?.size ?: 0) { i ->
                    val spaceMember = allSpacesState.getAllSpacesResponse?.spacesResponse?.spaceMembers?.get(i)
                    SpaceCard(
                        spaceName = (spaceMember?.spaceDetailsResponse?.spaceName ?: 0).toString(),
                        date = (spaceMember?.spaceDetailsResponse?.lastUpdated?.formatDateOnly() ?: ""),
                        otherUserCount = 3,
                        amount = 1170,
                        modifier = Modifier.clickable {
                            navigateTo(
                                NavigationItem.SpaceDetailsScreen.withArgs(
                                    (spaceMember?.spaceId ?: 0).toString()
                                )
                            )
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun TotalBalanceLoader() {
    ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(100.dp))
    ShimmerAnimation(modifier = Modifier.fillMaxWidth().height(100.dp))
    ShimmerAnimation(modifier = Modifier.width(160.dp).height(30.dp))
}
