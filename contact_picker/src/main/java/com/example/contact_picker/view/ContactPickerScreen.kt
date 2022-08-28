package com.example.contact_picker.view

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.design.UnifyText
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.runtime.toMutableStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.contact_picker.entity.Contact
import com.example.contact_picker.util.PermissionUtils
import com.example.contact_picker.viewModel.ContactsViewModel
import com.example.design.UnifyButton

//
//@Composable
//fun ContactPickerScreen(
//    navigateTo : (String) -> Unit,
//    contactsViewModel: ContactsViewModel = hiltViewModel()
//) {
//
//    var contactsState = contactsViewModel.contactsState
//
//    if (PermissionUtils.hasReadContactPermission(LocalContext.current)) {
//        //    showErrorText(context.getString(R.string.error_permission_not_found))
//        return
//    }
////    hideErrorText()
//    contactsViewModel.fetchContactList(LocalContext.current.contentResolver)
//
//    var mapOfContacts = HashMap<Contact, Boolean>()
//    var listOfContacts = mutableListOf<Contact>()
//
//    Column(modifier = Modifier.fillMaxSize()) {
//
//        UnifyButton(buttonText = "Test Button", {
//            mapOfContacts.forEach { (key, value) ->
//                if (value)
//                    listOfContacts.add(key)
//            }
//            mapOfContacts.clear()
//            listOfContacts.forEach{
//                Log.d("Levi", "ContactPickerScreen: ${it.toString()}")
//            }
//            listOfContacts.clear()
//        })
//
//        LazyColumn {
//            items(contactsState.contacts?.size ?: 0) { i ->
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .clickable {
//                            contactsState.contacts = contactsState.contacts?.toMutableList().also {
//                                it?.set(i, it[i].copy(isSelected = !it[i].isSelected))
//                                mapOfContacts[it?.get(i)!!] = it[i]?.isSelected
//                            }
//
////                            contactsState.contacts = contactsState.contacts?.mapIndexed { j, item ->
////                                if (i == j) {
////                                    mapOfContacts[item] = !item.isSelected
////                                    item.copy(isSelected = !item.isSelected)
////                                } else
////                                    item
////                            }
//                        }
//                        .padding(16.dp),
//                    horizontalArrangement = Arrangement.SpaceBetween,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    UnifyText(text = contactsState.contacts?.get(i)?.name ?: "")
//              //      UnifyText(text = contactsState.contacts?.get(i)?.phoneNo ?: "")
//                    if (contactsState.contacts?.get(i)?.isSelected == true) {
//                        Icon(
//                            imageVector = Icons.Default.Check,
//                            contentDescription = "",
//                            tint = Color.Green,
//                            modifier = Modifier.size(20.dp)
//                        )
//                    }
//                }
//            }
//        }
//    }
//}

var mapOfContacts = HashMap<Contact, Boolean>()
@Composable
fun ContactPickerScreen(
    navigateTo : (String) -> Unit,
    contactsViewModel: ContactsViewModel = hiltViewModel()
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
            listOfContacts.clear()
        })

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

        UnifyText(
            text = contact.name ?: "",
            fontSize = if (selectedStates[index]==false) 24.sp else 12.sp,
            modifier = Modifier.align(Alignment.CenterStart)
        )

//        isSelected = selectedStates[index] == true,
//        onSelected = {
//            selectedStates[index] = !it
//        }

        Checkbox(checked = selectedStates[index] == false,
            onCheckedChange = {
                selectedStates[index] = !it
                mapOfContacts[contact] = it
            },

            modifier = Modifier.align(Alignment.CenterEnd))
//        Checkbox(checked = contact.isSelected.value,
//            onCheckedChange = {
//                contact.toggle()
//            },
//            colors = CheckboxDefaults.colors(
//                checkedColor = Color.Black,
//                uncheckedColor = Color.Green
//            ),
//            modifier = Modifier.align(Alignment.CenterEnd)
//        )

    }
}


//
//@Composable
//fun ContactPickerScreen(
//    navigateTo: (String) -> Unit,
//    contactsViewModel: ContactsViewModel = hiltViewModel()
//) {
////    var items by remember {
////        mutableStateOf(
////            (1..20).map {
////                Contact(
////                    name = "Name :  $it"
////                )
////            }
////        )
////    }
//
//    var contactsState = contactsViewModel.contactsState
//
//    if (PermissionUtils.hasReadContactPermission(LocalContext.current)) {
//        //    showErrorText(context.getString(R.string.error_permission_not_found))
//        return
//    }
////    hideErrorText()
//    contactsViewModel.fetchContactList(LocalContext.current.contentResolver)
//
//    var mapOfContacts = HashMap<Contact, Boolean>()
//    var listOfContacts = mutableListOf<Contact>()
//
//    Column(modifier = Modifier.fillMaxSize()) {
//
//        UnifyButton(buttonText = "Test Button", {
//            mapOfContacts.forEach { (key, value) ->
//                if (value)
//                    listOfContacts.add(key)
//            }
//            listOfContacts.forEach {
//                Log.d("Contact", "ContactPickerScreen: ${it.name}")
//            }
//        })
//
//        LazyColumn {
//            itemsIndexed(
//                items = contactsState.contacts ?: emptyList()
//            ) { index: Int, contactItem: Contact ->
//                Test(contactItem, index)
//            }
////            items(contactsState.contacts?.size ?: 0) { i ->
////                Row(
////                    modifier = Modifier
////                        .fillMaxSize()
////                        .clickable {
////                            contactsState.contacts =  contactsState.contacts?.mapIndexed { j, item ->
////                                if (i == j) {
////                                    mapOfContacts[item] = !item.isSelected
////                                    item.copy(isSelected = !item.isSelected)
////                                } else
////                                    item
////                            }
////                        }
////                        .padding(16.dp),
////                    horizontalArrangement = Arrangement.SpaceBetween,
////                    verticalAlignment = Alignment.CenterVertically
////                ) {
////                    UnifyText(text = contactsState.contacts?.get(i)?.name ?: "")
////                    UnifyText(text = contactsState.contacts?.get(i)?.phoneNo ?: "")
////                    if (contactsState.contacts?.get(i)?.isSelected == true) {
////                        Icon(
////                            imageVector = Icons.Default.Check,
////                            contentDescription = "",
////                            tint = Color.Green,
////                            modifier = Modifier.size(20.dp)
////                        )
////                    }
////                }
////            }
////        }
//        }
//    }
//}