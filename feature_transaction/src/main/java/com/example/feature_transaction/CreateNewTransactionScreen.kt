package com.example.feature_transaction

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.design.UnifyButton
import com.example.design.UnifyButtonSmallType
import com.example.design.UnifyEditText
import com.example.design.UnifyText
import com.example.navigation.NavigationItem
import kotlinx.coroutines.flow.collectLatest


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateNewTransactionScreen(navigateTo : (String) -> Unit) {
    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {

    }

    var spaceName by remember { mutableStateOf("") }
    var spaceDescription by remember { mutableStateOf("") }

    Scaffold(scaffoldState = scaffoldState) {
        Column(modifier = Modifier.fillMaxSize(),
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