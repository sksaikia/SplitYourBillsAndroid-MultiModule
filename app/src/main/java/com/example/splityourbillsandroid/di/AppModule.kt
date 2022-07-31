package com.example.splityourbillsandroid.di

import android.content.Context
import com.example.session.SessionManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesContext(@ApplicationContext context : Context)
        : Context = context

    @Provides
    @Singleton
    fun providesSessionManager(@ApplicationContext context: Context)
        : SessionManager {
        return SessionManager(context)
    }

}