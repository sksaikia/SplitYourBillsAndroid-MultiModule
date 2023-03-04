package com.example.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/session/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "fetchAuthToken", "", "fetchPhoneNo", "fetchUserId", "", "fetchUserName", "saveAuthToken", "", "token", "savePhoneNo", "", "phoneNo", "saveUserId", "userId", "saveUserName", "name", "Companion", "common_debug"})
public final class SessionManager {
    private android.content.SharedPreferences prefs;
    @org.jetbrains.annotations.NotNull
    public static final com.example.session.SessionManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_TOKEN = "bearer_token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_NAME = "user_name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_PHONE_NO = "user_phone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_ID = "user_id";
    
    public SessionManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    /**
     * commit is synchronous , it returns true or false
     * apply is faster i.e. async
     */
    public final boolean saveAuthToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return false;
    }
    
    public final void saveUserName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void saveUserId(int userId) {
    }
    
    public final void savePhoneNo(@org.jetbrains.annotations.NotNull
    java.lang.String phoneNo) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fetchAuthToken() {
        return null;
    }
    
    public final int fetchUserId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fetchUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fetchPhoneNo() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/session/SessionManager$Companion;", "", "()V", "USER_ID", "", "USER_NAME", "USER_PHONE_NO", "USER_TOKEN", "common_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}