package com.example.feature_transaction.presentation.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a0\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a&\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\u0017"}, d2 = {"ManualBillSplitScreen", "", "navigateTo", "Lkotlin/Function1;", "", "spaceId", "transactionViewModel", "Lcom/example/feature_transaction/presentation/viewmodel/TransactionViewModel;", "createRequestBodyForSavingTxnLists", "", "Lcom/example/feature_transaction/domain/model/request/add_txn_list/AddTxnListBody;", "spaceMembersState", "Lcom/example/feature_transaction/presentation/viewmodel/all_space_members/SpaceMembersState;", "individualContributionValuesList", "Landroidx/compose/runtime/State;", "", "totalPayableAmount", "transactionId", "helperToEnableSaveButton", "", "currentContributionAmount", "totalAmount", "currentTotalPayableAmount", "feature_transaction_debug"})
public final class ManualBillSplitScreenKt {
    
    /**
     * activityViewModel is used because we have to share the viewModel between multiple screens.
     * doing hiltViewModel makes it attached to a single screen , so we can not share any variable
     * via the view model
     */
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"UnusedMaterialScaffoldPaddingParameter"})
    public static final void ManualBillSplitScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigateTo, @org.jetbrains.annotations.Nullable
    java.lang.String spaceId, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.TransactionViewModel transactionViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void totalAmount(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> navigateTo, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.TransactionViewModel transactionViewModel) {
    }
    
    public static final boolean helperToEnableSaveButton(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.State<java.lang.Integer> currentContributionAmount, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.State<java.lang.Integer> totalAmount, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.State<java.lang.Integer> currentTotalPayableAmount) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody> createRequestBodyForSavingTxnLists(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.all_space_members.SpaceMembersState spaceMembersState, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.State<? extends java.util.List<java.lang.Integer>> individualContributionValuesList, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.State<? extends java.util.List<java.lang.Integer>> totalPayableAmount, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.State<java.lang.Integer> transactionId) {
        return null;
    }
}