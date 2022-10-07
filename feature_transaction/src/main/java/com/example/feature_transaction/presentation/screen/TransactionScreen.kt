package com.example.feature_transaction.presentation.screen

import android.annotation.SuppressLint
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.UnifyText
import com.example.feature_transaction.R
import com.example.feature_transaction.presentation.ui_compositions.SpaceTrxCard
import com.example.feature_transaction.TotalBalanceCard
import com.example.feature_transaction.presentation.ui_compositions.TransactionHomeComponent
import com.example.navigation.NavigationItem

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TransactionScreen(navigateTo: (String) -> Unit) {
    val scaffoldState = rememberScaffoldState()

    //  val allSpacesState = spaceViewModel.allSpacesState

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
        scaffoldState = scaffoldState,

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

            items(8) {
                TransactionHomeComponent()
            }

//            Row {
//                SpaceTrxCard(headerText = "Total In" , amount = "10000")
//                SpaceTrxCard(headerText = "Total Out", amount = "5000")
//            }
        }
    }
}
