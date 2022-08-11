package com.example.session

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.example.common.R

class SessionManager(context : Context) {

    //context.getString(R.string.app_name)
    private var prefs : SharedPreferences = context.getSharedPreferences("SplitYourBillsAndroid", Context.MODE_PRIVATE)

    fun saveAuthToken(token : String) {
        val editor = prefs.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }

    fun fetchAuthToken() : String? {
        Log.d("FATAL", "fetchAuthToken: ${prefs.getString(USER_TOKEN, null)}")
        return prefs.getString(USER_TOKEN, null)
    }

    companion object {
        const val USER_TOKEN = "bearer_token"
        const val USER_NAME = "user_name"
        const val USER_PHONE_NO = "user_phone"
    }

}