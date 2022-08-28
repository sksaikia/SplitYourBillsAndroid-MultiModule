package com.example.contact_picker.viewModel

import com.example.contact_picker.entity.Contact

data class ContactsState(
    var contacts : List<Contact>? = emptyList(),
    val isLoading : Boolean = false,
    val error : String? = null
)
