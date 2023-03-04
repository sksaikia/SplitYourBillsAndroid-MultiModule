package com.example.feature_transaction.domain.model.response.single_txn_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0011H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u000fH\u00c6\u0003Jq\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00063"}, d2 = {"Lcom/example/feature_transaction/domain/model/response/single_txn_details/TransactionDetailsResponse;", "", "trasnactionDetailId", "", "transactionId", "transaction", "Lcom/example/feature_transaction/domain/model/response/create_transaction/CreateTransactionResponse$CreatedTransactionResponse;", "personId", "userDetails", "Lcom/example/feature_transaction/domain/model/response/SingleSpaceMemberResponse$UserDetails;", "inviteId", "inviteDetails", "Lcom/example/feature_transaction/domain/model/response/SingleSpaceMemberResponse$InviteDetails;", "amount", "lastUpdated", "", "payableAmount", "", "(IILcom/example/feature_transaction/domain/model/response/create_transaction/CreateTransactionResponse$CreatedTransactionResponse;ILcom/example/feature_transaction/domain/model/response/SingleSpaceMemberResponse$UserDetails;ILcom/example/feature_transaction/domain/model/response/SingleSpaceMemberResponse$InviteDetails;ILjava/lang/String;J)V", "getAmount", "()I", "getInviteDetails", "()Lcom/example/feature_transaction/domain/model/response/SingleSpaceMemberResponse$InviteDetails;", "getInviteId", "getLastUpdated", "()Ljava/lang/String;", "getPayableAmount", "()J", "getPersonId", "getTransaction", "()Lcom/example/feature_transaction/domain/model/response/create_transaction/CreateTransactionResponse$CreatedTransactionResponse;", "getTransactionId", "getTrasnactionDetailId", "getUserDetails", "()Lcom/example/feature_transaction/domain/model/response/SingleSpaceMemberResponse$UserDetails;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "feature_transaction_debug"})
public final class TransactionDetailsResponse {
    private final int trasnactionDetailId = 0;
    private final int transactionId = 0;
    @org.jetbrains.annotations.NotNull
    private final com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse transaction = null;
    private final int personId = 0;
    @org.jetbrains.annotations.Nullable
    private final com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails userDetails = null;
    private final int inviteId = 0;
    @org.jetbrains.annotations.Nullable
    private final com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.InviteDetails inviteDetails = null;
    private final int amount = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastUpdated = null;
    private final long payableAmount = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.domain.model.response.single_txn_details.TransactionDetailsResponse copy(int trasnactionDetailId, int transactionId, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse transaction, int personId, @org.jetbrains.annotations.Nullable
    com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails userDetails, int inviteId, @org.jetbrains.annotations.Nullable
    com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.InviteDetails inviteDetails, int amount, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, long payableAmount) {
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
    
    public TransactionDetailsResponse(int trasnactionDetailId, int transactionId, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse transaction, int personId, @org.jetbrains.annotations.Nullable
    com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails userDetails, int inviteId, @org.jetbrains.annotations.Nullable
    com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.InviteDetails inviteDetails, int amount, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, long payableAmount) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTrasnactionDetailId() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTransactionId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.domain.model.response.create_transaction.CreateTransactionResponse.CreatedTransactionResponse getTransaction() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPersonId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.UserDetails getUserDetails() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getInviteId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.InviteDetails component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.feature_transaction.domain.model.response.SingleSpaceMemberResponse.InviteDetails getInviteDetails() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final long getPayableAmount() {
        return 0L;
    }
}