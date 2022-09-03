package com.example.feature_transaction.presentation.screen

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.design.UnifyButton
import com.example.design.UnifyButtonSmallType
import com.example.design.UnifyDropDownMenu
import com.example.design.UnifyEditText
import com.example.design.UnifyText
import com.example.feature_transaction.domain.model.response.all_spaces.GetAllSpacesResponse
import com.example.feature_transaction.presentation.viewmodel.TransactionViewModel
import com.example.feature_transaction.presentation.viewmodel.all_spaces.CreateNewTxnEvent
import kotlinx.coroutines.flow.collectLatest
import java.util.*


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateNewTransactionScreen(navigateTo : (String) -> Unit,
   transactionViewModel: TransactionViewModel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()

    val allSpacesState = transactionViewModel.allSpacesState

    var showCalender by remember {
        mutableStateOf(false)
    }

    var mDate = remember { mutableStateOf("") }

    LaunchedEffect(key1 = true) {
        transactionViewModel.createNewTxnEventFlow.collectLatest { event ->
            when(event) {
                is CreateNewTxnEvent.ShowErrorToastForErrorInSpace -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.errorMessage
                    )
                }
            }
        }
    }

    var date by remember { mutableStateOf("")}

    Scaffold(scaffoldState = scaffoldState) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UnifyEditText(headerText = "Title" , onValueChanged = {

            })
            UnifyEditText(headerText = "Total Amount" , onValueChanged = {

            })
            Spacer(modifier = Modifier.height(20.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column() {
                    UnifyText(text = "When", modifier = Modifier
                        .align(Alignment.Start)
                        .padding(horizontal = 10.dp))

                    UnifyText(
                        text = mDate.value,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(horizontal = 10.dp))

                }
                IconButton(onClick = {
                    showCalender = !showCalender
                },
                    modifier = Modifier.padding(horizontal = 10.dp)
                    ) {
                    Icon(painter = painterResource(
                        id = com.example.common.R.drawable.ic_space ),
                        contentDescription = "Calender",
                        modifier = Modifier.width(30.dp).height(30.dp))
                }

                if (showCalender)
                    Calender(mDate)

            }


            Spacer(modifier = Modifier.height(20.dp))

            UnifyText(text = "Space", modifier = Modifier
                .align(Alignment.Start)
                .padding(horizontal = 10.dp))

            MenuSample(allSpacesState.getAllSpacesResponse?.spacesResponse?.spaceMembers ?: emptyList())

            
            UnifyEditText(headerText = "Note" , onValueChanged = {

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
fun MenuSample(spaceMembers: List<GetAllSpacesResponse.SpacesResponse.SingleSpaceMemberResponse>) {

    val billingPeriodItems =  mutableListOf<String>("No Spaces selected")
    spaceMembers.forEach {
        billingPeriodItems.add(it.spaceDetailsResponse.spaceName)
    }


    var billingPeriodExpanded by remember { mutableStateOf(false) }

    var selectedIndex by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        UnifyDropDownMenu(
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
fun Calender(mDate: MutableState<String>) {
    val localContext = LocalContext.current

    // Initializing a Calendar
    val mCalendar = Calendar.getInstance()

    // Fetching current year, month and day
    val year = mCalendar.get(Calendar.YEAR)
    val month = mCalendar.get(Calendar.MONTH)
    val day = mCalendar.get(Calendar.DAY_OF_MONTH)

    mCalendar.time = Date()

    // Declaring a string value to
    // store date in string format


    // Declaring DatePickerDialog and setting
    // initial values as current values (present year, month and day)
    val mDatePickerDialog = DatePickerDialog(
        localContext,
        { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
            mDate.value = "$mDayOfMonth/${mMonth+1}/$mYear"
        }, year, month, day
    )

    mDatePickerDialog.show()

}