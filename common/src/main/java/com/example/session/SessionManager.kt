package com.example.session

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener

class SessionManager(context: Context) {

    // context.getString(R.string.app_name)
    private var prefs: SharedPreferences = context.getSharedPreferences("SplitYourBillsAndroid", Context.MODE_PRIVATE)

    /**
     * commit is synchronous , it returns true or false
     * apply is faster i.e. async
     * */
    fun saveAuthToken(token: String): Boolean {
        val editor = prefs.edit()
        editor.putString(USER_TOKEN, token)
        return editor.commit()
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
