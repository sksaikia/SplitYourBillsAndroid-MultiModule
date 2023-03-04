package com.example.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0011\"\u00020\u0003\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u0082\u0001\u0010#$%&\'()*+,-./012\u00a8\u00063"}, d2 = {"Lcom/example/navigation/NavigationItem;", "", "route", "", "title", "icon", "", "navBack", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getIcon", "()I", "getNavBack", "()Ljava/lang/String;", "getRoute", "getTitle", "withArgs", "args", "", "([Ljava/lang/String;)Ljava/lang/String;", "AuthenticationSelectionScreen", "ContactPickerScreen", "CreateNewSpaceScreen", "CreateNewTransactionScreen", "HomeScreen", "LoginScreen", "ManualBillSplitScreen", "MediaPickerScreen", "ProfileScreen", "RegistrationScreen", "ShareSpaceScreen", "SpaceDetailsScreen", "SpacesScreen", "SpendAnalyzerScreen", "TransactionDetailsScreen", "TransactionScreen", "Lcom/example/navigation/NavigationItem$AuthenticationSelectionScreen;", "Lcom/example/navigation/NavigationItem$LoginScreen;", "Lcom/example/navigation/NavigationItem$RegistrationScreen;", "Lcom/example/navigation/NavigationItem$HomeScreen;", "Lcom/example/navigation/NavigationItem$SpacesScreen;", "Lcom/example/navigation/NavigationItem$SpendAnalyzerScreen;", "Lcom/example/navigation/NavigationItem$TransactionScreen;", "Lcom/example/navigation/NavigationItem$ProfileScreen;", "Lcom/example/navigation/NavigationItem$CreateNewSpaceScreen;", "Lcom/example/navigation/NavigationItem$ShareSpaceScreen;", "Lcom/example/navigation/NavigationItem$SpaceDetailsScreen;", "Lcom/example/navigation/NavigationItem$ContactPickerScreen;", "Lcom/example/navigation/NavigationItem$ManualBillSplitScreen;", "Lcom/example/navigation/NavigationItem$CreateNewTransactionScreen;", "Lcom/example/navigation/NavigationItem$TransactionDetailsScreen;", "Lcom/example/navigation/NavigationItem$MediaPickerScreen;", "common_debug"})
public abstract class NavigationItem {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final int icon = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String navBack = null;
    
    private NavigationItem(java.lang.String route, java.lang.String title, int icon, java.lang.String navBack) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNavBack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String withArgs(@org.jetbrains.annotations.NotNull
    java.lang.String... args) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$AuthenticationSelectionScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class AuthenticationSelectionScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.AuthenticationSelectionScreen INSTANCE = null;
        
        private AuthenticationSelectionScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$LoginScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class LoginScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.LoginScreen INSTANCE = null;
        
        private LoginScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$RegistrationScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class RegistrationScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.RegistrationScreen INSTANCE = null;
        
        private RegistrationScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$HomeScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class HomeScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.HomeScreen INSTANCE = null;
        
        private HomeScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$SpacesScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class SpacesScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.SpacesScreen INSTANCE = null;
        
        private SpacesScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$SpendAnalyzerScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class SpendAnalyzerScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.SpendAnalyzerScreen INSTANCE = null;
        
        private SpendAnalyzerScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$TransactionScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class TransactionScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.TransactionScreen INSTANCE = null;
        
        private TransactionScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$ProfileScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class ProfileScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.ProfileScreen INSTANCE = null;
        
        private ProfileScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$CreateNewSpaceScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class CreateNewSpaceScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.CreateNewSpaceScreen INSTANCE = null;
        
        private CreateNewSpaceScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$ShareSpaceScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class ShareSpaceScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.ShareSpaceScreen INSTANCE = null;
        
        private ShareSpaceScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$SpaceDetailsScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class SpaceDetailsScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.SpaceDetailsScreen INSTANCE = null;
        
        private SpaceDetailsScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$ContactPickerScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class ContactPickerScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.ContactPickerScreen INSTANCE = null;
        
        private ContactPickerScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$ManualBillSplitScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class ManualBillSplitScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.ManualBillSplitScreen INSTANCE = null;
        
        private ManualBillSplitScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$CreateNewTransactionScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class CreateNewTransactionScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.CreateNewTransactionScreen INSTANCE = null;
        
        private CreateNewTransactionScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$TransactionDetailsScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class TransactionDetailsScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.TransactionDetailsScreen INSTANCE = null;
        
        private TransactionDetailsScreen() {
            super(null, null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/navigation/NavigationItem$MediaPickerScreen;", "Lcom/example/navigation/NavigationItem;", "()V", "common_debug"})
    public static final class MediaPickerScreen extends com.example.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull
        public static final com.example.navigation.NavigationItem.MediaPickerScreen INSTANCE = null;
        
        private MediaPickerScreen() {
            super(null, null, 0, null);
        }
    }
}