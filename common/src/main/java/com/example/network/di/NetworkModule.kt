package com.example.network.di

import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.example.BuildConfig
import com.example.network.AuthInterceptor
import com.example.session.SessionManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    //Provide Authenticator and cache

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        authInterceptor: AuthInterceptor
    ): OkHttpClient {
        val client = OkHttpClient.Builder()
        client.addInterceptor(loggingInterceptor)
        client.addInterceptor(authInterceptor)
//
//        client.addInterceptor(Interceptor{ chain ->
//            val request = chain.request()
//            val response = chain.proceed(request)
//
//            if (response.code == 401){
//                Log.d("FATAL", "provideOkHttpClient: TATAKAE , ${response.body}")
//            }
//            response
//        }).build()

        return client.build()
    }

    @Provides
    @Singleton
    fun provideAuthInterceptor(sessionManager: SessionManager) : AuthInterceptor{
        return AuthInterceptor(sessionManager)
    }


    @Provides
    @Singleton
    fun provideNetwork(okHttpClient: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }
}