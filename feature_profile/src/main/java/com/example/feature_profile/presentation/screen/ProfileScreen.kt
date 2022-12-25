package com.example.feature_profile.presentation.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.feature_profile.presentation.viewmodel.UserProfileViewModel

@Composable
fun ProfileScreen(navigateTo: (String) -> Unit,
                  userProfileViewModel: UserProfileViewModel = hiltViewModel()) {



//    LazyColumn {
//
//        items(10) { i ->
//            UserEditableCard("ABC $i")
//
//       }
//    }
//    navigateTo(
//        NavigationItem.ManualBillSplitScreen.withArgs(
//            "1".toString()
//        )
//    )
//    UserEditableCard(
//        onValueChangedForPayableAmount = {
//            Log.d("FATAL", "Payable: $it")
//        },
//        onValueChangedForContribution = {
//            Log.d("FATAL", "Contri: $it")
//        }
//    )

//    var hour by remember {
//        mutableStateOf(0)
//    }
//
//    var minute by remember {
//        mutableStateOf(0)
//    }
//
//    LaunchedEffect(true) {
//        while (true) {
//            if ((minute + 1) > 59) {
//                hour++
//                minute = 0
//            } else {
//                minute++
//            }
//            delay(15)
//        }
//    }
//
//    Column(modifier = Modifier.fillMaxSize()) {
////        UserEditableCard()
////        UserEditableCard()
////        UserEditableCard()
//        PopText(text = "Feature coming soon", fontSize = 20.sp, modifier = Modifier.padding(16.dp))
//        PopAnalogClock(
//            hour = hour,
//            minute = minute,
//            modifier = Modifier.fillMaxSize()
//        )
//
////        mermaid()
//    }
}
