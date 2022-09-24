package com.example.session

import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {

    // context.getString(R.string.app_name)
    private var prefs: SharedPreferences = context.getSharedPreferences("SplitYourBillsAndroid", Context.MODE_PRIVATE)

    fun saveAuthToken(token: String) {
        val editor = prefs.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }

    fun saveUserName(name: String) {
        val editor = prefs.edit()
        editor.putString(USER_NAME, name)
        editor.apply()
    }

    fun saveUserId(userId: Int) {
        val editor = prefs.edit()
        editor.putInt(USER_ID, userId)
        editor.apply()
    }

    fun savePhoneNo(phoneNo: String) {
        val editor = prefs.edit()
        editor.putString(USER_PHONE_NO, phoneNo)
        editor.apply()
    }

    fun fetchAuthToken(): String? {
        return prefs.getString(USER_TOKEN, null)
    }

    fun fetchUserId(): Int {
        return prefs.getInt(USER_ID, -1)
    }

    fun fetchUserName(): String? {
        return prefs.getString(USER_NAME, null)
    }

    fun fetchPhoneNo(): String? {
        return prefs.getString(USER_PHONE_NO, null)
    }

    companion object {
        const val USER_TOKEN = "bearer_token"
        const val USER_NAME = "user_name"
        const val USER_PHONE_NO = "user_phone"
        const val USER_ID = "user_id"
    }
}
