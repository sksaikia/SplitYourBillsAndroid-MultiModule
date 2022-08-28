package com.example.contact_picker.util

import android.annotation.SuppressLint
import android.database.Cursor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@SuppressLint("Range")
infix fun Cursor.get(columnName: String): String? {
    return getString(getColumnIndex(columnName))
}

fun Char.convertNumber() : String{
    val list = mutableListOf<Char>('0','1','2','3','4','5','6','7','8','9')
    if (list.contains(this)){
        return this.toString()
    }
    return ""
}

suspend fun launchMain(block: suspend CoroutineScope.() -> Unit) = withContext(Dispatchers.Main, block)
