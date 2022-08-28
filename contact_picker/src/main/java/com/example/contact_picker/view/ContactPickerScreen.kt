package com.example.contact_picker.view

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.design.UnifyText
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.runtime.toMutableStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.contact_picker.entity.Contact
import com.example.contact_picker.util.PermissionUtils
import com.example.contact_picker.viewModel.ContactsViewModel
import com.example.design.UnifyButton
import com.example.navigation.NavigationItem

var mapOfContacts = HashMap<Contact, Boolean>()
@Composable
fun ContactPickerScreen(
    navigateTo : (String) -> Unit,
    navigateBackToScreenRoute : String = NavigationItem.CreateNewSpaceScreen.route,
    contactsViewModel: ContactsViewModel = hiltViewModel(),
) {

    var contactsState = contactsViewModel.contactsState

    if (PermissionUtils.hasReadContactPermission(LocalContext.current)) {
        //    showErrorText(context.getString(R.string.error_permission_not_found))
        return
    }
//    hideErrorText()
    contactsViewModel.fetchContactList(LocalContext.current.contentResolver)


    var listOfContacts = mutableListOf<Contact>()

    val selectedStates = remember {
        contactsState.contacts?.mapIndexed { index, _ -> index to false }?.toMutableStateMap()
    }

    Column(modifier = Modifier.fillMaxSize()) {

        UnifyButton(buttonText = "Test Button", {
            mapOfContacts.forEach { (key, value) ->
                if (value)
                    listOfContacts.add(key)
            }
            mapOfContacts.clear()
            listOfContacts.forEach {
                Log.d("Levi", "ContactPickerScreen: ${it.toString()}")
            }

            navigateTo(
                navigateBackToScreenRoute
            )

            listOfContacts.clear()
        }, modifier = Modifier.align(CenterHorizontally))

        LazyColumn(
            state = rememberLazyListState(),
            modifier = Modifier.fillMaxSize()
        ) {
            itemsIndexed(items = contactsState.contacts?: emptyList()) { index, contact ->
                if (selectedStates != null) {
                    ListItemView(contact, selectedStates, index)
                }
            }
        }
    }
}

@Composable
fun ListItemView(contact: Contact, selectedStates: SnapshotStateMap<Int, Boolean>, index: Int) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight()
            .padding(vertical = 6.dp, horizontal = 14.dp)
    ) {

        Row(modifier = Modifier.fillMaxSize() ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column() {
                UnifyText(
                    text = contact.name ?: "",
                    fontSize = if (selectedStates[index] == false) 24.sp else 12.sp,
                )

                UnifyText(
                    text = contact.phoneNo ?: "",
                    fontSize = if (selectedStates[index] == false) 24.sp else 12.sp,
                )

            }

            Checkbox(checked = selectedStates[index] == false,
                onCheckedChange = {
                    selectedStates[index] = !it
                    mapOfContacts[contact] = it
                }

                //        modifier = Modifier.align(Alignment.CenterEnd))

            )


        }
    }
}




//        isSelected = selectedStates[index] == true,
//        onSelected = {
//            selectedStates[index] = !it
//        }


