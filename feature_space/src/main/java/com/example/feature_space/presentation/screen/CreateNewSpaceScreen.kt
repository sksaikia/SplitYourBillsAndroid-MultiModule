package com.example.feature_space.presentation.screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
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
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.contact_picker.entity.ListOfContact
import com.example.design.UnifyButton
import com.example.design.UnifyEditText
import com.example.design.UnifyText
import com.example.feature_space.domain.model.request.add_members.AddMembersBody
import com.example.compositions.UserCard
import com.example.feature_space.presentation.viewmodel.SpaceViewModel
import com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent
import com.example.navigation.NavigationItem
import com.google.gson.GsonBuilder
import kotlinx.coroutines.flow.collectLatest

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CreateNewSpaceScreen(
    navigateTo: (String) -> Unit,
    contactList: String? = "",
    spaceViewModel: SpaceViewModel = hiltViewModel()
) {
    val scaffoldState = rememberScaffoldState()
    var selectedContactList: ListOfContact? by remember {
        mutableStateOf(null)
    }
    var addedMembersList = mutableListOf<AddMembersBody>()

    var createSpaceState = spaceViewModel.createSpaceState
    var allMembersState = spaceViewModel.allMembersState

    LaunchedEffect(key1 = true) {
        spaceViewModel.createSpaceEventFlow.collectLatest { event ->
            when (event) {
                is CreateSpaceEvent.ShowErrorToast -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.errorMessage
                    )
                }
                is CreateSpaceEvent.ShowSuccessToast -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.message
                    )

                    selectedContactList?.list?.forEach {
                        addedMembersList.add(AddMembersBody(event.spaceId, it.name.toString(), it.phoneNo.toString()))
                    }

                    spaceViewModel.addMembersToSpace(addedMembersList)
                    addedMembersList.clear()
                }
            }
        }
    }

    try {
        if (!contactList.equals("A")) {
            val obj = GsonBuilder().create()
                .fromJson<ListOfContact>(
                    contactList,
                    ListOfContact::class.java
                )
            selectedContactList = obj
            Log.d("Eren", "CreateNewSpaceScreen: ${obj.list.size}")
        }
    } catch (e: Exception) {
        Log.d("Eren", "CreateNewSpaceScreen: $e")
    }

    var spaceName by remember { mutableStateOf("") }
    var spaceDescription by remember { mutableStateOf("") }

    Scaffold(scaffoldState = scaffoldState) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            item {

                if (allMembersState.isLoading) {
                    CircularProgressIndicator()
                } else if (allMembersState.response != null) {
                    navigateTo(NavigationItem.ShareSpaceScreen.route)
                }

                UnifyEditText(headerText = "Name", onValueChanged = {
                    spaceName = it
                })
                UnifyEditText(headerText = "Description (Optional)", onValueChanged = {
                    spaceDescription = it
                })
                Spacer(modifier = Modifier.height(20.dp))
                UnifyText(
                    text = "Note: Once you have created a space, you will be able to invite other people too.... ",
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    UnifyButton(buttonText = "Invite Members", {
                        navigateTo(
                            NavigationItem.ContactPickerScreen.route
                        )
                    })

                    UnifyButton(buttonText = "Save Space", {
                        spaceViewModel.onCreateNewSpaceEvent(
                            CreateSpaceEvent.OnCreateSpaceClick(spaceName, spaceDescription)
                        )
                        // TODO for testing
                        //  navigateTo(NavigationItem.ShareSpaceScreen.route)
                    })
                }
            }

            items(selectedContactList?.list?.size ?: 0) { i ->
                UserCard(name = selectedContactList?.list?.get(i)?.name ?: "")
            }
        }
    }
}
