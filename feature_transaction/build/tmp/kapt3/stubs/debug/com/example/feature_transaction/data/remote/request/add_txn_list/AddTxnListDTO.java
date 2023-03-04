package com.example.feature_transaction.data.remote.request.add_txn_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/example/feature_transaction/data/remote/request/add_txn_list/AddTxnListDTO;", "", "transactionId", "", "personId", "inviteId", "amount", "payableAmount", "", "(IIIIJ)V", "getAmount", "()I", "getInviteId", "getPayableAmount", "()J", "getPersonId", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "feature_transaction_debug"})
public final class AddTxnListDTO {
    @com.google.gson.annotations.SerializedName(value = "transactionId")
    private final int transactionId = 0;
    @com.google.gson.annotations.SerializedName(value = "personId")
    private final int personId = 0;
    @com.google.gson.annotations.SerializedName(value = "inviteId")
    private final int inviteId = 0;
    @com.google.gson.annotations.SerializedName(value = "amount")
    private final int amount = 0;
    @com.google.gson.annotations.SerializedName(value = "payableAmount")
    private final long payableAmount = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.data.remote.request.add_txn_list.AddTxnListDTO copy(int transactionId, int personId, int inviteId, int amount, long payableAmount) {
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
    
    public AddTxnListDTO(int transactionId, int personId, int inviteId, int amount, long payableAmount) {
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
    
    public final int getPersonId() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getInviteId() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getPayableAmount() {
        return 0L;
    }
}