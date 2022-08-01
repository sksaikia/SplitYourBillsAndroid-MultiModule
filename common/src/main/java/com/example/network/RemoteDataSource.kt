package com.example.network

import android.security.keystore.UserNotAuthenticatedException
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.Retrofit
import java.io.IOException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

open class RemoteDataSource() {

    open suspend fun <T> safeApiCall(apiCall : suspend () -> T, error : suspend (String) -> Unit) : Unit {
        return withContext(Dispatchers.IO) {
            try {
                val response = apiCall.invoke()
                Log.d("FATAL", "safeApiCall response: $response")
            } catch (e : Throwable) {
              //  Log.d("FATAL", "safeApiCall error: ${(e as BaseErrorResponse).s}")
                when(e) {
                    is HttpException -> {
                        if (e.code()==401) {
                            Log.d("FATAL", "safeApiCall: Auth exception")
                            error("Code :  ${e.code()} , Unauthorized")
                        }
                        if (e.code() == 409) {
                            Log.d("FATAL", "safeApiCall: ")
                            error("Code : ${e.code()} , Phone no. already exists")
                        }
                    }
//                    is SocketTimeoutException -> error("Socket Exception with code ${e.message}")
//                    is IOException -> error("Io Exception with code ${e.message}")
//                    is UnknownHostException -> error("Unknown Exception with code }")
//                    is HttpException -> error("Http Exception with code : ${e.code()}")
//                    else -> error("Http Exception with code }")
                    else -> error("Unknown error occured")
                }
            }
        }
    }

}