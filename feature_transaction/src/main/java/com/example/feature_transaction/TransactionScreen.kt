package com.example.feature_transaction

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.UnifyButton
import com.example.design.UnifyText
import com.example.navigation.NavigationItem

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TransactionScreen(navigateTo : (String) -> Unit) {
    val scaffoldState = rememberScaffoldState()

  //  val allSpacesState = spaceViewModel.allSpacesState

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {
                navigateTo(NavigationItem.CreateNewTransactionScreen.route)
            },
            backgroundColor = MaterialTheme.colors.primary
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add Note")
        }
    },
        scaffoldState = scaffoldState,
        modifier =  Modifier.padding(bottom = 50.dp)

    ) {
        Column(modifier = Modifier
            .fillMaxSize()) {

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
                text = "Recent Transactions",
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(horizontal = 10.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))



        }
    }
}