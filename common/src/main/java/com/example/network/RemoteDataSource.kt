package com.example.network

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

open class RemoteDataSource() {

    open suspend fun <T> safeApiCall(apiCall : suspend () -> T, error : suspend (String) -> Unit) : Unit {
        return withContext(Dispatchers.IO) {
            try {
                apiCall.invoke()
            } catch (e : Exception) {
                Log.d("FATAL", "safeApiCall: ${e.printStackTrace()}")
                when(e) {
                    is HttpException -> error("Http Exception with code : ${e.code()}")
                    is SocketTimeoutException -> error("Socket Exception with code ${e.message}")
                    is IOException -> error("Io Exception with code ${e.message}")
                    is UnknownHostException -> error("Unknown Exception with code }")
                    else -> error("Http Exception with code }")
                }
            }
        }
    }

}