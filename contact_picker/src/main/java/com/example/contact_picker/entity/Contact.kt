package com.example.contact_picker.entity

import androidx.annotation.DrawableRes
import androidx.compose.runtime.MutableState

data class Contact(
    val name: String? = null,
    val phoneNo: String? = null,
    @DrawableRes val image: Int? = null,
)
