package com.example.feature_transaction.data.remote.response.create_transaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/feature_transaction/data/remote/response/create_transaction/CreateTransactionResponse;", "", "success", "", "data", "Lcom/example/feature_transaction/data/remote/response/create_transaction/CreateTransactionResponse$CreatedTransactionResponse;", "(ZLcom/example/feature_transaction/data/remote/response/create_transaction/CreateTransactionResponse$CreatedTransactionResponse;)V", "getData", "()Lcom/example/feature_transaction/data/remote/response/create_transaction/CreateTransactionResponse$CreatedTransactionResponse;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "CreatedTransactionResponse", "feature_transaction_debug"})
public final class CreateTransactionResponse {
    @com.google.gson.annotations.SerializedName(value = "success")
    private final boolean success = false;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "data")
    private final com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse data = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse copy(boolean success, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse data) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CreateTransactionResponse(boolean success, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse data) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse getData() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/feature_transaction/data/remote/response/create_transaction/CreateTransactionResponse$CreatedTransactionResponse;", "", "transactionId", "", "spaceId", "transactionName", "", "transactionDescription", "lastUpdated", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLastUpdated", "()Ljava/lang/String;", "getSpaceId", "()I", "getTransactionDescription", "getTransactionId", "getTransactionName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature_transaction_debug"})
    public static final class CreatedTransactionResponse {
        @com.google.gson.annotations.SerializedName(value = "transactionId")
        private final int transactionId = 0;
        @com.google.gson.annotations.SerializedName(value = "spaceId")
        private final int spaceId = 0;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "transactionName")
        private final java.lang.String transactionName = null;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "transactionDescription")
        private final java.lang.String transactionDescription = null;
        @org.jetbrains.annotations.NotNull
        @com.google.gson.annotations.SerializedName(value = "lastUpdated")
        private final java.lang.String lastUpdated = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.feature_transaction.data.remote.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse copy(int transactionId, int spaceId, @org.jetbrains.annotations.NotNull
        java.lang.String transactionName, @org.jetbrains.annotations.NotNull
        java.lang.String transactionDescription, @org.jetbrains.annotations.NotNull
        java.lang.String lastUpdated) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public CreatedTransactionResponse(int transactionId, int spaceId, @org.jetbrains.annotations.NotNull
        java.lang.String transactionName, @org.jetbrains.annotations.NotNull
        java.lang.String transactionDescription, @org.jetbrains.annotations.NotNull
        java.lang.String lastUpdated) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTransactionId() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getSpaceId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTransactionName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTransactionDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLastUpdated() {
            return null;
        }
    }
}