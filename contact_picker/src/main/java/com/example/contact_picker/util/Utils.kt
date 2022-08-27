package com.example.contact_picker.util

import android.annotation.SuppressLint
import android.database.Cursor

@SuppressLint("Range")
infix fun Cursor.get(columnName: String): String? {
    return getString(getColumnIndex(columnName))
}