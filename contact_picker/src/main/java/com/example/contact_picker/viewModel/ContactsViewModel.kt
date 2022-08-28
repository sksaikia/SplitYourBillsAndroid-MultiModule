package com.example.contact_picker.viewModel

import android.content.ContentResolver
import android.provider.ContactsContract
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contact_picker.entity.Contact
import com.example.contact_picker.util.convertNumber
import com.example.contact_picker.util.get
import com.example.contact_picker.util.launchMain
import com.example.network.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ContactsViewModel @Inject constructor()
    : ViewModel(){

    var contactsState by mutableStateOf(ContactsState())

//    private val _contactsLiveData : MutableLiveData<Result<List<Contact>>> = MutableLiveData()
//    val contactsLiveData: LiveData<Result<List<Contact>>> = _contactsLiveData


    fun fetchContactList(contentResolver : ContentResolver) {
        viewModelScope.launch(Dispatchers.IO) {

            launchMain {
                contactsState = contactsState.copy(
                    isLoading = true
                )
          //      _contactsLiveData.value = Result.Loading(isLoading = true)
            }

            val list = mutableListOf<Contact>()

            val uri = ContactsContract.Contacts.CONTENT_URI
            val sort = ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME
            val cursor = contentResolver.query(uri, null, null, null , sort)

            if (cursor == null || cursor.count == 0) {
                cursor?.close()

                launchMain {
                    contactsState = if (cursor == null){
                        contactsState.copy(
                            isLoading = false,
                            error = "Internal Error"
                        )
                    } else {
                        contactsState.copy(
                            isLoading = false,
                            contacts = emptyList()
                        )
                    }
//                    _contactsLiveData.value =
//                        if (cursor == null ) Result.Error(
//                            message = "Internal Error"
//                        ) else
//                            Result.Success(emptyList())
                }
                return@launch
            }

            while (cursor.moveToNext()) {
                val id = cursor get ContactsContract.Contacts._ID
                val name = cursor get ContactsContract.Contacts.DISPLAY_NAME
                val phoneCursor = contentResolver.query(
                    ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                    null,
                    ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=?",
                    arrayOf(id),
                    null
                )

                if (phoneCursor == null || !phoneCursor.moveToNext()){
                    continue
                }

                val number = phoneCursor get ContactsContract.CommonDataKinds.Phone.NUMBER

                var updatedNumber = ""

                number?.forEach {
                    updatedNumber += it.convertNumber()
                }

                if (name != null && number!= null) {
                    val contact = Contact(name, updatedNumber)
                    list.add(contact)
                }

                phoneCursor.close()

            }

            cursor.close()
            launchMain {
                contactsState = contactsState.copy(
                    contacts = list
                )
         //       _contactsLiveData.value = Result.Success(list)
            }

        }
    }
}
