package com.example.feature_transaction.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010f\u001a\u00020g2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020j0iJ\u001e\u0010k\u001a\u00020g2\u0006\u0010Y\u001a\u00020 2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020mJ\u0010\u0010o\u001a\u00020g2\u0006\u0010p\u001a\u00020 H\u0002J\u000e\u0010q\u001a\u00020g2\u0006\u0010r\u001a\u00020 J\u0006\u0010s\u001a\u00020gJ\u000e\u0010t\u001a\u00020g2\u0006\u0010Y\u001a\u00020 J\u0006\u0010u\u001a\u00020gJ\u000e\u0010v\u001a\u00020g2\u0006\u0010w\u001a\u00020mJ\u0016\u0010x\u001a\u00020g2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020 0iH\u0002J\u0016\u0010z\u001a\u00020g2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020 0iH\u0002J\u0016\u0010{\u001a\u00020g2\u0006\u0010|\u001a\u00020 2\u0006\u0010}\u001a\u00020 J\u0016\u0010~\u001a\u00020g2\u0006\u0010|\u001a\u00020 2\u0006\u0010}\u001a\u00020 J\u000e\u0010\u007f\u001a\u00020g2\u0006\u0010Y\u001a\u00020 R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0(0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0(0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0-\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00102\u001a\u0002012\u0006\u00100\u001a\u0002018F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020 0:\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\"0-\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020 0:\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010<R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020 0:\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010D\u001a\u00020C2\u0006\u00100\u001a\u00020C8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bI\u00108\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010J\u001a\u00020C2\u0006\u00100\u001a\u00020C8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bM\u00108\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020&0-\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010Q\u001a\u00020P2\u0006\u00100\u001a\u00020P8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bV\u00108\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0(0:\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010<R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020 0:\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010<R+\u0010\\\u001a\u00020[2\u0006\u00100\u001a\u00020[8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\ba\u00108\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001d\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0(0:\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010<R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020 0:\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010<R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0080\u0001"}, d2 = {"Lcom/example/feature_transaction/presentation/viewmodel/TransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllSpaceByUserIdUsecase", "Lcom/example/feature_transaction/domain/use_case/GetAllSpaceByUserIdUsecase;", "getAllSpaceMembersBySpaceIdUsecase", "Lcom/example/feature_transaction/domain/use_case/GetAllSpaceMembersBySpaceIdUsecase;", "createTransactionUseCase", "Lcom/example/feature_transaction/domain/use_case/CreateTransactionUseCase;", "deleteTransactionUseCase", "Lcom/example/feature_transaction/domain/use_case/DeleteTransactionUseCase;", "addTxnListUseCase", "Lcom/example/feature_transaction/domain/use_case/AddTxnListUseCase;", "getAllTxnDetailsByTxnIdUseCase", "Lcom/example/feature_transaction/domain/use_case/GetAllTxnDetailsByTxnIdUseCase;", "getSingleTxnDetailsByTxnDetailsIdUsecase", "Lcom/example/feature_transaction/domain/use_case/GetSingleTxnDetailsByTxnDetailsIdUsecase;", "deleteTransactionDetailsByTxnDetailsIdUseCase", "Lcom/example/feature_transaction/domain/use_case/DeleteTransactionDetailsByTxnDetailsIdUseCase;", "updateSingleTxnDetailsByTxnIdUseCase", "Lcom/example/feature_transaction/domain/use_case/UpdateSingleTxnDetailsByTxnIdUseCase;", "getAllTxnDetailsByUserIdUseCase", "Lcom/example/feature_transaction/domain/use_case/GetAllTxnDetailsByUserIdUseCase;", "getTxnbalanceUseCase", "Lcom/example/feature_transaction/domain/use_case/GetTxnBalanceUseCase;", "sessionManager", "Lcom/example/session/SessionManager;", "(Lcom/example/feature_transaction/domain/use_case/GetAllSpaceByUserIdUsecase;Lcom/example/feature_transaction/domain/use_case/GetAllSpaceMembersBySpaceIdUsecase;Lcom/example/feature_transaction/domain/use_case/CreateTransactionUseCase;Lcom/example/feature_transaction/domain/use_case/DeleteTransactionUseCase;Lcom/example/feature_transaction/domain/use_case/AddTxnListUseCase;Lcom/example/feature_transaction/domain/use_case/GetAllTxnDetailsByTxnIdUseCase;Lcom/example/feature_transaction/domain/use_case/GetSingleTxnDetailsByTxnDetailsIdUsecase;Lcom/example/feature_transaction/domain/use_case/DeleteTransactionDetailsByTxnDetailsIdUseCase;Lcom/example/feature_transaction/domain/use_case/UpdateSingleTxnDetailsByTxnIdUseCase;Lcom/example/feature_transaction/domain/use_case/GetAllTxnDetailsByUserIdUseCase;Lcom/example/feature_transaction/domain/use_case/GetTxnBalanceUseCase;Lcom/example/session/SessionManager;)V", "_addTxnDetailsListEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/feature_transaction/presentation/viewmodel/add_txn_details_list/AddTxnDetailsListEvent;", "_amount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_createNewTxnEventFlow", "Lcom/example/feature_transaction/presentation/viewmodel/all_spaces/CreateNewTxnEvent;", "_currentContributionValue", "_currentTotalPayableAmount", "_getAllTxnEvent", "Lcom/example/feature_transaction/presentation/viewmodel/get_all_txn/GetAllTxnEvent;", "_individualContributionValues", "", "_spaceId", "_totalPayableAmountValuesList", "_transactionId", "addTxnDetailsListEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getAddTxnDetailsListEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "<set-?>", "Lcom/example/feature_transaction/presentation/viewmodel/all_spaces/AllSpacesState;", "allSpacesState", "getAllSpacesState", "()Lcom/example/feature_transaction/presentation/viewmodel/all_spaces/AllSpacesState;", "setAllSpacesState", "(Lcom/example/feature_transaction/presentation/viewmodel/all_spaces/AllSpacesState;)V", "allSpacesState$delegate", "Landroidx/compose/runtime/MutableState;", "amount", "Lkotlinx/coroutines/flow/StateFlow;", "getAmount", "()Lkotlinx/coroutines/flow/StateFlow;", "createNewTxnEventFlow", "getCreateNewTxnEventFlow", "currentContributionValue", "getCurrentContributionValue", "currentTotalPayableAmount", "getCurrentTotalPayableAmount", "Lcom/example/feature_transaction/presentation/viewmodel/all_txn_details/AllTxnDetailsState;", "getAllTxnDetailsByTxnIdState", "getGetAllTxnDetailsByTxnIdState", "()Lcom/example/feature_transaction/presentation/viewmodel/all_txn_details/AllTxnDetailsState;", "setGetAllTxnDetailsByTxnIdState", "(Lcom/example/feature_transaction/presentation/viewmodel/all_txn_details/AllTxnDetailsState;)V", "getAllTxnDetailsByTxnIdState$delegate", "getAllTxnDetailsState", "getGetAllTxnDetailsState", "setGetAllTxnDetailsState", "getAllTxnDetailsState$delegate", "getAllTxnEvent", "getGetAllTxnEvent", "Lcom/example/feature_transaction/presentation/viewmodel/get_txn_balance/GetTxnBalanceState;", "getTxnBalanceState", "getGetTxnBalanceState", "()Lcom/example/feature_transaction/presentation/viewmodel/get_txn_balance/GetTxnBalanceState;", "setGetTxnBalanceState", "(Lcom/example/feature_transaction/presentation/viewmodel/get_txn_balance/GetTxnBalanceState;)V", "getTxnBalanceState$delegate", "individualContributionValues", "getIndividualContributionValues", "spaceId", "getSpaceId", "Lcom/example/feature_transaction/presentation/viewmodel/all_space_members/SpaceMembersState;", "spaceMembersState", "getSpaceMembersState", "()Lcom/example/feature_transaction/presentation/viewmodel/all_space_members/SpaceMembersState;", "setSpaceMembersState", "(Lcom/example/feature_transaction/presentation/viewmodel/all_space_members/SpaceMembersState;)V", "spaceMembersState$delegate", "totalPayableAmountValuesList", "getTotalPayableAmountValuesList", "transactionId", "getTransactionId", "addAllTxnList", "", "txnList", "", "Lcom/example/feature_transaction/domain/model/request/add_txn_list/AddTxnListBody;", "createANewTransaction", "transactionName", "", "transactionDescription", "getAllSpaces", "userId", "getAllTxnDetailsByTxnId", "txnId", "getAllTxnDetailsByUserId", "getSpaceMembersBySpaceId", "getTxnBalance", "setAmount", "currentAmount", "setCurrentContributionValue", "list", "setCurrentTotalPayableValue", "setIndividualContriDetail", "index", "value", "setIndividualPayableAmount", "setSpaceId", "feature_transaction_debug"})
public final class TransactionViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.feature_transaction.domain.use_case.GetAllSpaceByUserIdUsecase getAllSpaceByUserIdUsecase = null;
    private final com.example.feature_transaction.domain.use_case.GetAllSpaceMembersBySpaceIdUsecase getAllSpaceMembersBySpaceIdUsecase = null;
    private final com.example.feature_transaction.domain.use_case.CreateTransactionUseCase createTransactionUseCase = null;
    private final com.example.feature_transaction.domain.use_case.DeleteTransactionUseCase deleteTransactionUseCase = null;
    private final com.example.feature_transaction.domain.use_case.AddTxnListUseCase addTxnListUseCase = null;
    private final com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByTxnIdUseCase getAllTxnDetailsByTxnIdUseCase = null;
    private final com.example.feature_transaction.domain.use_case.GetSingleTxnDetailsByTxnDetailsIdUsecase getSingleTxnDetailsByTxnDetailsIdUsecase = null;
    private final com.example.feature_transaction.domain.use_case.DeleteTransactionDetailsByTxnDetailsIdUseCase deleteTransactionDetailsByTxnDetailsIdUseCase = null;
    private final com.example.feature_transaction.domain.use_case.UpdateSingleTxnDetailsByTxnIdUseCase updateSingleTxnDetailsByTxnIdUseCase = null;
    private final com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByUserIdUseCase getAllTxnDetailsByUserIdUseCase = null;
    private final com.example.feature_transaction.domain.use_case.GetTxnBalanceUseCase getTxnbalanceUseCase = null;
    private final com.example.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState allSpacesState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState spaceMembersState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState getAllTxnDetailsState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState getAllTxnDetailsByTxnIdState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState getTxnBalanceState$delegate = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feature_transaction.presentation.viewmodel.all_spaces.CreateNewTxnEvent> _createNewTxnEventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.feature_transaction.presentation.viewmodel.all_spaces.CreateNewTxnEvent> createNewTxnEventFlow = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feature_transaction.presentation.viewmodel.add_txn_details_list.AddTxnDetailsListEvent> _addTxnDetailsListEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.feature_transaction.presentation.viewmodel.add_txn_details_list.AddTxnDetailsListEvent> addTxnDetailsListEvent = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feature_transaction.presentation.viewmodel.get_all_txn.GetAllTxnEvent> _getAllTxnEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.feature_transaction.presentation.viewmodel.get_all_txn.GetAllTxnEvent> getAllTxnEvent = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> _individualContributionValues;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.Integer>> individualContributionValues = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _currentContributionValue = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> currentContributionValue = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> _totalPayableAmountValuesList;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.Integer>> totalPayableAmountValuesList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _currentTotalPayableAmount = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> currentTotalPayableAmount = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _amount = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> amount = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _transactionId = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> transactionId = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _spaceId = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> spaceId = null;
    
    @javax.inject.Inject
    public TransactionViewModel(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.GetAllSpaceByUserIdUsecase getAllSpaceByUserIdUsecase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.GetAllSpaceMembersBySpaceIdUsecase getAllSpaceMembersBySpaceIdUsecase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.CreateTransactionUseCase createTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.DeleteTransactionUseCase deleteTransactionUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.AddTxnListUseCase addTxnListUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByTxnIdUseCase getAllTxnDetailsByTxnIdUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.GetSingleTxnDetailsByTxnDetailsIdUsecase getSingleTxnDetailsByTxnDetailsIdUsecase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.DeleteTransactionDetailsByTxnDetailsIdUseCase deleteTransactionDetailsByTxnDetailsIdUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.UpdateSingleTxnDetailsByTxnIdUseCase updateSingleTxnDetailsByTxnIdUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.GetAllTxnDetailsByUserIdUseCase getAllTxnDetailsByUserIdUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_transaction.domain.use_case.GetTxnBalanceUseCase getTxnbalanceUseCase, @org.jetbrains.annotations.NotNull
    com.example.session.SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.presentation.viewmodel.all_spaces.AllSpacesState getAllSpacesState() {
        return null;
    }
    
    public final void setAllSpacesState(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.all_spaces.AllSpacesState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.presentation.viewmodel.all_space_members.SpaceMembersState getSpaceMembersState() {
        return null;
    }
    
    public final void setSpaceMembersState(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.all_space_members.SpaceMembersState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.presentation.viewmodel.all_txn_details.AllTxnDetailsState getGetAllTxnDetailsState() {
        return null;
    }
    
    public final void setGetAllTxnDetailsState(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.all_txn_details.AllTxnDetailsState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.presentation.viewmodel.all_txn_details.AllTxnDetailsState getGetAllTxnDetailsByTxnIdState() {
        return null;
    }
    
    public final void setGetAllTxnDetailsByTxnIdState(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.all_txn_details.AllTxnDetailsState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_transaction.presentation.viewmodel.get_txn_balance.GetTxnBalanceState getGetTxnBalanceState() {
        return null;
    }
    
    public final void setGetTxnBalanceState(@org.jetbrains.annotations.NotNull
    com.example.feature_transaction.presentation.viewmodel.get_txn_balance.GetTxnBalanceState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.feature_transaction.presentation.viewmodel.all_spaces.CreateNewTxnEvent> getCreateNewTxnEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.feature_transaction.presentation.viewmodel.add_txn_details_list.AddTxnDetailsListEvent> getAddTxnDetailsListEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.feature_transaction.presentation.viewmodel.get_all_txn.GetAllTxnEvent> getGetAllTxnEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.Integer>> getIndividualContributionValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getCurrentContributionValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.Integer>> getTotalPayableAmountValuesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getCurrentTotalPayableAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getTransactionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSpaceId() {
        return null;
    }
    
    public final void setSpaceId(int spaceId) {
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull
    java.lang.String currentAmount) {
    }
    
    public final void setIndividualContriDetail(int index, int value) {
    }
    
    public final void setIndividualPayableAmount(int index, int value) {
    }
    
    private final void setCurrentTotalPayableValue(java.util.List<java.lang.Integer> list) {
    }
    
    private final void setCurrentContributionValue(java.util.List<java.lang.Integer> list) {
    }
    
    private final void getAllSpaces(int userId) {
    }
    
    public final void getSpaceMembersBySpaceId(int spaceId) {
    }
    
    public final void createANewTransaction(int spaceId, @org.jetbrains.annotations.NotNull
    java.lang.String transactionName, @org.jetbrains.annotations.NotNull
    java.lang.String transactionDescription) {
    }
    
    public final void addAllTxnList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_transaction.domain.model.request.add_txn_list.AddTxnListBody> txnList) {
    }
    
    public final void getAllTxnDetailsByUserId() {
    }
    
    public final void getAllTxnDetailsByTxnId(int txnId) {
    }
    
    public final void getTxnBalance() {
    }
}