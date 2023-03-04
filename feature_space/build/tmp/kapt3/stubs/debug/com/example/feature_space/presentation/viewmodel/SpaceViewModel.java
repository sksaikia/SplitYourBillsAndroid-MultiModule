package com.example.feature_space.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010l\u001a\u00020m2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020p0oJ\u0018\u0010q\u001a\u00020m2\u0006\u0010c\u001a\u00020 2\u0006\u0010_\u001a\u00020 H\u0002J \u0010r\u001a\u00020m2\u0006\u0010c\u001a\u00020 2\u0006\u0010_\u001a\u00020 2\u0006\u0010s\u001a\u00020tH\u0002J\u000e\u0010u\u001a\u00020m2\u0006\u0010v\u001a\u00020tJ\u0006\u0010w\u001a\u00020mJ\u0010\u0010w\u001a\u00020m2\u0006\u0010x\u001a\u00020tH\u0002J\u000e\u0010y\u001a\u00020m2\u0006\u0010s\u001a\u00020tJ\u0006\u0010z\u001a\u00020mJ\u000e\u0010{\u001a\u00020m2\u0006\u0010v\u001a\u00020tJ\u000e\u0010|\u001a\u00020m2\u0006\u0010}\u001a\u00020\u001bJ\u000e\u0010~\u001a\u00020m2\u0006\u0010}\u001a\u00020\u001dJ\u000f\u0010\u007f\u001a\u00020m2\u0007\u0010\u0080\u0001\u001a\u00020 J\u0010\u0010\u0081\u0001\u001a\u00020m2\u0007\u0010\u0082\u0001\u001a\u00020 R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R+\u0010(\u001a\u00020\'2\u0006\u0010&\u001a\u00020\'8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00100\u001a\u00020/2\u0006\u0010&\u001a\u00020/8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b5\u0010.\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190#\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010%R+\u00109\u001a\u0002082\u0006\u0010&\u001a\u0002088F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b>\u0010.\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b0#\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010%R+\u0010B\u001a\u00020A2\u0006\u0010&\u001a\u00020A8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bG\u0010.\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0#\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010%R+\u0010K\u001a\u00020J2\u0006\u0010&\u001a\u00020J8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bP\u0010.\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010R\u001a\u00020Q2\u0006\u0010&\u001a\u00020Q8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bW\u0010.\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010Y\u001a\u00020X2\u0006\u0010&\u001a\u00020X8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b^\u0010.\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020 0`\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020 0`\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010bR+\u0010f\u001a\u00020e2\u0006\u0010&\u001a\u00020e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bk\u0010.\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j\u00a8\u0006\u0083\u0001"}, d2 = {"Lcom/example/feature_space/presentation/viewmodel/SpaceViewModel;", "Landroidx/lifecycle/ViewModel;", "createNewSpaceUseCase", "Lcom/example/feature_space/domain/usecase/CreateSpaceUseCase;", "getAllSpaceByUserIdUsecase", "Lcom/example/feature_space/domain/usecase/GetAllSpaceByUserIdUsecase;", "getSpecificSpaceDetailsBySpaceIdUseCase", "Lcom/example/feature_space/domain/usecase/GetSpecificSpaceDetailsBySpaceIdUseCase;", "editSpaceUseCase", "Lcom/example/feature_space/domain/usecase/EditSpaceUseCase;", "addMembersToSpaceUseCase", "Lcom/example/feature_space/domain/usecase/AddMembersToSpaceUseCase;", "getAllMembersForSpaceIdUseCase", "Lcom/example/feature_space/domain/usecase/GetAllMembersForSpaceIdUseCase;", "getTxnDetailsBySpaceIdUseCase", "Lcom/example/feature_space/domain/usecase/GetTxnDetailsBySpaceIdUseCase;", "getTxnbalanceUseCase", "Lcom/example/feature_space/domain/usecase/GetTxnBalanceUseCase;", "sessionManager", "Lcom/example/session/SessionManager;", "(Lcom/example/feature_space/domain/usecase/CreateSpaceUseCase;Lcom/example/feature_space/domain/usecase/GetAllSpaceByUserIdUsecase;Lcom/example/feature_space/domain/usecase/GetSpecificSpaceDetailsBySpaceIdUseCase;Lcom/example/feature_space/domain/usecase/EditSpaceUseCase;Lcom/example/feature_space/domain/usecase/AddMembersToSpaceUseCase;Lcom/example/feature_space/domain/usecase/GetAllMembersForSpaceIdUseCase;Lcom/example/feature_space/domain/usecase/GetTxnDetailsBySpaceIdUseCase;Lcom/example/feature_space/domain/usecase/GetTxnBalanceUseCase;Lcom/example/session/SessionManager;)V", "_addMembersEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/feature_space/presentation/viewmodel/add_members/AddMembersEvent;", "_allSpacesEventFlow", "Lcom/example/feature_space/presentation/viewmodel/all_spaces/AllSpacesEvent;", "_createSpaceEventFlow", "Lcom/example/feature_space/presentation/viewmodel/create_space/CreateSpaceEvent;", "_editSpaceEventFlow", "Lcom/example/feature_space/presentation/viewmodel/edit_space/EditSpaceEvent;", "_spaceDescription", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_spaceName", "addMembersEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getAddMembersEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "<set-?>", "Lcom/example/feature_space/presentation/viewmodel/add_members/AddMembersState;", "addMembersState", "getAddMembersState", "()Lcom/example/feature_space/presentation/viewmodel/add_members/AddMembersState;", "setAddMembersState", "(Lcom/example/feature_space/presentation/viewmodel/add_members/AddMembersState;)V", "addMembersState$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/example/feature_space/presentation/viewmodel/all_members/AllMembersForSpaceState;", "allMembersForSpaceState", "getAllMembersForSpaceState", "()Lcom/example/feature_space/presentation/viewmodel/all_members/AllMembersForSpaceState;", "setAllMembersForSpaceState", "(Lcom/example/feature_space/presentation/viewmodel/all_members/AllMembersForSpaceState;)V", "allMembersForSpaceState$delegate", "allSpacesEventFlow", "getAllSpacesEventFlow", "Lcom/example/feature_space/presentation/viewmodel/all_spaces/AllSpacesState;", "allSpacesState", "getAllSpacesState", "()Lcom/example/feature_space/presentation/viewmodel/all_spaces/AllSpacesState;", "setAllSpacesState", "(Lcom/example/feature_space/presentation/viewmodel/all_spaces/AllSpacesState;)V", "allSpacesState$delegate", "createSpaceEventFlow", "getCreateSpaceEventFlow", "Lcom/example/feature_space/presentation/viewmodel/create_space/CreateSpaceState;", "createSpaceState", "getCreateSpaceState", "()Lcom/example/feature_space/presentation/viewmodel/create_space/CreateSpaceState;", "setCreateSpaceState", "(Lcom/example/feature_space/presentation/viewmodel/create_space/CreateSpaceState;)V", "createSpaceState$delegate", "editSpaceEventFlow", "getEditSpaceEventFlow", "Lcom/example/feature_space/presentation/viewmodel/edit_space/EditSpaceState;", "editSpaceState", "getEditSpaceState", "()Lcom/example/feature_space/presentation/viewmodel/edit_space/EditSpaceState;", "setEditSpaceState", "(Lcom/example/feature_space/presentation/viewmodel/edit_space/EditSpaceState;)V", "editSpaceState$delegate", "Lcom/example/feature_space/presentation/viewmodel/get_txn_balance/GetTxnBalanceState;", "getTxnBalanceState", "getGetTxnBalanceState", "()Lcom/example/feature_space/presentation/viewmodel/get_txn_balance/GetTxnBalanceState;", "setGetTxnBalanceState", "(Lcom/example/feature_space/presentation/viewmodel/get_txn_balance/GetTxnBalanceState;)V", "getTxnBalanceState$delegate", "Lcom/example/feature_space/presentation/viewmodel/specific_space/SingleSpaceState;", "singleSpaceState", "getSingleSpaceState", "()Lcom/example/feature_space/presentation/viewmodel/specific_space/SingleSpaceState;", "setSingleSpaceState", "(Lcom/example/feature_space/presentation/viewmodel/specific_space/SingleSpaceState;)V", "singleSpaceState$delegate", "spaceDescription", "Lkotlinx/coroutines/flow/StateFlow;", "getSpaceDescription", "()Lkotlinx/coroutines/flow/StateFlow;", "spaceName", "getSpaceName", "Lcom/example/feature_space/presentation/viewmodel/specific_space/TxnDetailsBySpaceState;", "txnDetailsBySpaceState", "getTxnDetailsBySpaceState", "()Lcom/example/feature_space/presentation/viewmodel/specific_space/TxnDetailsBySpaceState;", "setTxnDetailsBySpaceState", "(Lcom/example/feature_space/presentation/viewmodel/specific_space/TxnDetailsBySpaceState;)V", "txnDetailsBySpaceState$delegate", "addMembersToSpace", "", "addedMembersBody", "", "Lcom/example/feature_space/domain/model/request/add_members/AddMembersBody;", "createNewSpace", "editSpaceDetails", "spaceId", "", "getAllMembersForSpaceId", "spaceid", "getAllSpaces", "userId", "getSpecificSpaceBySpaceId", "getTxnBalance", "getTxnDetailsBySpaceId", "onCreateNewSpaceEvent", "event", "onEditSpaceEvent", "setSpaceDescription", "description", "setSpaceName", "name", "feature_space_debug"})
public final class SpaceViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.feature_space.domain.usecase.CreateSpaceUseCase createNewSpaceUseCase = null;
    private final com.example.feature_space.domain.usecase.GetAllSpaceByUserIdUsecase getAllSpaceByUserIdUsecase = null;
    private final com.example.feature_space.domain.usecase.GetSpecificSpaceDetailsBySpaceIdUseCase getSpecificSpaceDetailsBySpaceIdUseCase = null;
    private final com.example.feature_space.domain.usecase.EditSpaceUseCase editSpaceUseCase = null;
    private final com.example.feature_space.domain.usecase.AddMembersToSpaceUseCase addMembersToSpaceUseCase = null;
    private final com.example.feature_space.domain.usecase.GetAllMembersForSpaceIdUseCase getAllMembersForSpaceIdUseCase = null;
    private final com.example.feature_space.domain.usecase.GetTxnDetailsBySpaceIdUseCase getTxnDetailsBySpaceIdUseCase = null;
    private final com.example.feature_space.domain.usecase.GetTxnBalanceUseCase getTxnbalanceUseCase = null;
    private final com.example.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState createSpaceState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState allSpacesState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState singleSpaceState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState editSpaceState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState addMembersState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState allMembersForSpaceState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState txnDetailsBySpaceState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState getTxnBalanceState$delegate = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent> _createSpaceEventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent> createSpaceEventFlow = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesEvent> _allSpacesEventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesEvent> allSpacesEventFlow = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent> _editSpaceEventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent> editSpaceEventFlow = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.feature_space.presentation.viewmodel.add_members.AddMembersEvent> _addMembersEventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.add_members.AddMembersEvent> addMembersEventFlow = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _spaceName = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> spaceName = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _spaceDescription = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> spaceDescription = null;
    
    @javax.inject.Inject
    public SpaceViewModel(@org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.CreateSpaceUseCase createNewSpaceUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.GetAllSpaceByUserIdUsecase getAllSpaceByUserIdUsecase, @org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.GetSpecificSpaceDetailsBySpaceIdUseCase getSpecificSpaceDetailsBySpaceIdUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.EditSpaceUseCase editSpaceUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.AddMembersToSpaceUseCase addMembersToSpaceUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.GetAllMembersForSpaceIdUseCase getAllMembersForSpaceIdUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.GetTxnDetailsBySpaceIdUseCase getTxnDetailsBySpaceIdUseCase, @org.jetbrains.annotations.NotNull
    com.example.feature_space.domain.usecase.GetTxnBalanceUseCase getTxnbalanceUseCase, @org.jetbrains.annotations.NotNull
    com.example.session.SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceState getCreateSpaceState() {
        return null;
    }
    
    public final void setCreateSpaceState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesState getAllSpacesState() {
        return null;
    }
    
    public final void setAllSpacesState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.specific_space.SingleSpaceState getSingleSpaceState() {
        return null;
    }
    
    public final void setSingleSpaceState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.specific_space.SingleSpaceState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceState getEditSpaceState() {
        return null;
    }
    
    public final void setEditSpaceState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.add_members.AddMembersState getAddMembersState() {
        return null;
    }
    
    public final void setAddMembersState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.add_members.AddMembersState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.all_members.AllMembersForSpaceState getAllMembersForSpaceState() {
        return null;
    }
    
    public final void setAllMembersForSpaceState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.all_members.AllMembersForSpaceState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.specific_space.TxnDetailsBySpaceState getTxnDetailsBySpaceState() {
        return null;
    }
    
    public final void setTxnDetailsBySpaceState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.specific_space.TxnDetailsBySpaceState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.feature_space.presentation.viewmodel.get_txn_balance.GetTxnBalanceState getGetTxnBalanceState() {
        return null;
    }
    
    public final void setGetTxnBalanceState(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.get_txn_balance.GetTxnBalanceState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent> getCreateSpaceEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.all_spaces.AllSpacesEvent> getAllSpacesEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent> getEditSpaceEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.feature_space.presentation.viewmodel.add_members.AddMembersEvent> getAddMembersEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSpaceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSpaceDescription() {
        return null;
    }
    
    public final void setSpaceName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void setSpaceDescription(@org.jetbrains.annotations.NotNull
    java.lang.String description) {
    }
    
    public final void getAllSpaces() {
    }
    
    public final void onCreateNewSpaceEvent(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.create_space.CreateSpaceEvent event) {
    }
    
    public final void onEditSpaceEvent(@org.jetbrains.annotations.NotNull
    com.example.feature_space.presentation.viewmodel.edit_space.EditSpaceEvent event) {
    }
    
    private final void createNewSpace(java.lang.String spaceName, java.lang.String spaceDescription) {
    }
    
    private final void getAllSpaces(int userId) {
    }
    
    public final void getSpecificSpaceBySpaceId(int spaceId) {
    }
    
    private final void editSpaceDetails(java.lang.String spaceName, java.lang.String spaceDescription, int spaceId) {
    }
    
    public final void addMembersToSpace(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.feature_space.domain.model.request.add_members.AddMembersBody> addedMembersBody) {
    }
    
    public final void getAllMembersForSpaceId(int spaceid) {
    }
    
    public final void getTxnDetailsBySpaceId(int spaceid) {
    }
    
    public final void getTxnBalance() {
    }
}