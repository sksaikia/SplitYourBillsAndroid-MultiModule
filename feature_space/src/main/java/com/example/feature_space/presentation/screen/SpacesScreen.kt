package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.design.UnifyChip
import com.example.design.UnifyLabel
import com.example.design.UnifyText
import com.example.feature_space.R
import com.example.feature_space.presentation.ui_composition.SpaceCard
import com.example.feature_space.presentation.ui_composition.SpaceTrxCard
import com.example.feature_space.presentation.ui_composition.TotalBalanceCard
import com.example.feature_space.presentation.viewmodel.SpaceViewModel
import com.example.navigation.NavigationItem

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SpacesScreen(
    navigateTo : (String) -> Unit,
    spaceViewModel: SpaceViewModel = hiltViewModel()
) {

    val scaffoldState = rememberScaffoldState()

    val allSpacesState = spaceViewModel.allSpacesState

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {
                navigateTo(NavigationItem.CreateNewSpaceScreen.route)
            },
            backgroundColor = MaterialTheme.colors.primary
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add Note")
        }
    },
        scaffoldState = scaffoldState,
        modifier =  Modifier.padding(bottom = 50.dp)

    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            TotalBalanceCard(amount = "₹ 5000.00")

//            Row {
//                SpaceTrxCard(headerText = "Total In" , amount = "10000")
//                SpaceTrxCard(headerText = "Total Out", amount = "5000")
//            }

            val listOfTrxCard = mutableListOf<Triple<String, String, Int>>(
                Triple("Total In" , "10000", R.drawable.trx_in),
                Triple("Total Out", "5000", R.drawable.trx_out)
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
            
            Spacer(modifier = Modifier.height(10.dp))
            
            LazyVerticalGrid(columns = GridCells.Fixed(2)){
                items(allSpacesState.getAllSpacesResponse?.spacesResponse?.spaceMembers?.size ?: 0) { i->
                    val spaceMember = allSpacesState.getAllSpacesResponse?.spacesResponse?.spaceMembers?.get(i)
                    SpaceCard(
                        spaceName = (spaceMember?.spaceDetailsResponse?.spaceName ?: 0).toString(),
                        date = "28 - Jan",
                        otherUserCount = 3,
                        amount = 1170
                    )
                }
            }
        }
    }
}