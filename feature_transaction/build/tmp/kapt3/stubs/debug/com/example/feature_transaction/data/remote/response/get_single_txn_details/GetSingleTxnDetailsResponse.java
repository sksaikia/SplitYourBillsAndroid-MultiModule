package com.example.feature_transaction.data.remote.response.get_single_txn_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/feature_transaction/data/remote/response/get_single_txn_details/GetSingleTxnDetailsResponse;", "", "success", "", "data", "Lcom/example/feature_transaction/data/remote/response/single_txn_details/TransactionDetailsResponse;", "(ZLcom/example/feature_transaction/data/remote/response/single_txn_details/TransactionDetailsResponse;)V", "getData", "()Lcom/example/feature_transaction/data/remote/response/single_txn_details/TransactionDetailsResponse;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature_transaction_debug"})
public final class GetSingleTxnDetailsResponse {
    @com.google.gson.annotations.SerializedName(value = "success")
    private final boolean success = false;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "data")
    private final com.example.feature_transaction.data.remote.response.single_txn_details.TransactionDetailsResponse data = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.data.remote.response.get_single_txn_details.GetSingleTxnDetailsResponse copy(boolean success, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.data.remote.response.single_txn_details.TransactionDetailsResponse data) {
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
    
    public GetSingleTxnDetailsResponse(boolean success, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.data.remote.response.single_txn_details.TransactionDetailsResponse data) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.data.remote.response.single_txn_details.TransactionDetailsResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.data.remote.response.single_txn_details.TransactionDetailsResponse getData() {
        return null;
    }
}