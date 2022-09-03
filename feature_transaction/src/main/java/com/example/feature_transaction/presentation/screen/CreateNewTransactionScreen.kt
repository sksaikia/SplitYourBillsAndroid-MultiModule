package com.example.feature_transaction

import android.annotation.SuppressLint
import androidx.annotation.Dimension
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension.Companion.fillToConstraints
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.design.UnifyButton
import com.example.design.UnifyButtonSmallType
import com.example.design.UnifyEditText
import com.example.design.UnifyText
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel
import com.example.navigation.NavigationItem
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.flow.collectLatest


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateNewTransactionScreen(navigateTo : (String) -> Unit,
   transactionViewModel: TransactionViewModel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {

    }

    var spaceName by remember { mutableStateOf("") }
    var spaceDescription by remember { mutableStateOf("") }

    Scaffold(scaffoldState = scaffoldState) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UnifyEditText(headerText = "Title" , onValueChanged = {
                spaceName = it
            })
            UnifyEditText(headerText = "Total Amount" , onValueChanged = {
                spaceDescription = it
            })
            Spacer(modifier = Modifier.height(20.dp))

            UnifyEditText(headerText = "When" , onValueChanged = {
                spaceDescription = it
            })
            Spacer(modifier = Modifier.height(20.dp))

            UnifyText(text = "Space", modifier = Modifier
                .align(Alignment.Start)
                .padding(horizontal = 10.dp))

            MenuSample()

            Spacer(modifier = Modifier.height(20.dp))
            
            UnifyEditText(headerText = "Note" , onValueChanged = {
                spaceDescription = it
            })
            
            Spacer(modifier = Modifier.height(20.dp))

            UnifyText(text = "Select Contribution type", modifier =
            Modifier
                .align(Alignment.Start)
                .padding(horizontal = 10.dp))

            val listOfTxnSplits = mutableListOf<String>(
                "Everyone paid equally", "You paid, split Equally",
                "Manually split the bill"
            )
            
            LazyRow(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                
                items(listOfTxnSplits.size) { i ->
                    UnifyButtonSmallType(buttonText = listOfTxnSplits[i])
                }
                
            }
            
            UnifyButton(buttonText = "Save TXN")

            UnifyText(text = "All contributions", modifier =
            Modifier
                .align(Alignment.Start)
                .padding(horizontal = 10.dp))


        }
    }
}

@Composable
fun MenuSample(){

    val billingPeriodItems = listOf("Billing Period", "Annual", "Monthly", "One-Time Payment")

    var billingPeriodExpanded by remember { mutableStateOf(false) }

    var selectedIndex by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        ComposeMenu(
            menuItems = billingPeriodItems,
            menuExpandedState = billingPeriodExpanded,
            seletedIndex = selectedIndex,
            updateMenuExpandStatus = {
                billingPeriodExpanded = true
            },
            onDismissMenuView = {
                billingPeriodExpanded = false
            },
            onMenuItemclick = { index->
                selectedIndex = index
                billingPeriodExpanded = false
            }
        )
    }
}

@Composable
fun ComposeMenu(
    menuItems: List<String>,
    menuExpandedState: Boolean,
    seletedIndex : Int,
    updateMenuExpandStatus : () -> Unit,
    onDismissMenuView : () -> Unit,
    onMenuItemclick : (Int) -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.TopStart)
            .padding(top = 10.dp)
            .border(0.5.dp, MaterialTheme.colors.onSurface.copy(alpha = 0.5f))
            .clickable(
                onClick = {
                    updateMenuExpandStatus()
                },
            ),

        ) {

        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            val (lable, iconView) = createRefs()

            Text(
                text = menuItems[seletedIndex],
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(lable) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(iconView.start)
                        width = androidx.constraintlayout.compose.Dimension.fillToConstraints
                    }
            )

            val displayIcon: Painter = painterResource(
                id = com.example.common.R.drawable.ic_space
            )

            Icon(
                painter = displayIcon,
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp, 20.dp)
                    .constrainAs(iconView) {
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    },
                tint = MaterialTheme.colors.onSurface
            )

            DropdownMenu(
                expanded = menuExpandedState,
                onDismissRequest = { onDismissMenuView() },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.surface)
            ) {
                menuItems.forEachIndexed { index, title ->
                    DropdownMenuItem(
                        onClick = {
                            if (index != 0) {
                                onMenuItemclick(index)
                            }
                        }) {
                        Text(text = title)
                    }
                }
            }
        }
    }
}