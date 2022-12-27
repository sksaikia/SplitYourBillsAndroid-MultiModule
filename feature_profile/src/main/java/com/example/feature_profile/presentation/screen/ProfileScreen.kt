package com.example.feature_profile.presentation.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.design.PopButton
import com.example.design.PopText
import com.example.feature_profile.presentation.viewmodel.UserProfileViewModel
import com.example.navigation.NavigationItem

@Composable
fun ProfileScreen(
    navigateTo: (String) -> Unit,
    userProfileViewModel: UserProfileViewModel = hiltViewModel()
) {
    val userProfileState = userProfileViewModel.userProfileInfo

    LaunchedEffect(key1 = true) {
        userProfileViewModel.getProfileDetail()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PopText(text = " Name: ${userProfileState.response?.name ?: ""} ", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        PopText(text = " Phone No:  ${userProfileState.response?.phoneNo ?: ""}", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(20.dp))
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(userProfileState.response?.profilePic ?: "")
                .crossfade(true)
                .scale(Scale.FIT)
                .build(),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clickable {
                    //   checkedIndex = i
                }
                .border(width = 1.dp, color = Color.LightGray),
            contentScale = ContentScale.FillBounds
        )

        PopButton(buttonText = "Edit Profile Picture", onClickButton = {
            navigateTo(NavigationItem.MediaPickerScreen.route)
        }, modifier = Modifier.width(100.dp).height(50.dp))
    }

//   LazyColumn {
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
// //        UserEditableCard()
// //        UserEditableCard()
// //        UserEditableCard()
//        PopText(text = "Feature coming soon", fontSize = 20.sp, modifier = Modifier.padding(16.dp))
//        PopAnalogClock(
//            hour = hour,
//            minute = minute,
//            modifier = Modifier.fillMaxSize()
//        )
//
// //        mermaid()
//    }
}
