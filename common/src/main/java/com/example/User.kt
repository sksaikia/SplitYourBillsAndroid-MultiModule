package com.example

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class User(val firstName: String, val lastName: String): Parcelable