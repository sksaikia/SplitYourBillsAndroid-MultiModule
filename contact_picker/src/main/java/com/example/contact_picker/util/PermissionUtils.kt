package com.example.contact_picker.util

import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat

object PermissionUtils {
    fun hasReadContactPermission(context: Context) =
        ContextCompat.checkSelfPermission(context, android.Manifest.permission.READ_CONTACTS) !=
                PackageManager.PERMISSION_GRANTED
}