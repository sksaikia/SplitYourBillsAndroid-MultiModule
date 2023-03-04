package com.example.authentication.presentation.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0002J\u000e\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u000bJ\u000e\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\rJ \u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\'2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u001d8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/authentication/presentation/viewModel/AuthenticationViewModel;", "Landroidx/lifecycle/ViewModel;", "registrationUseCase", "Lcom/example/authentication/domain/usecase/RegistrationUseCase;", "loginUseCase", "Lcom/example/authentication/domain/usecase/LoginUseCase;", "sessionManager", "Lcom/example/session/SessionManager;", "(Lcom/example/authentication/domain/usecase/RegistrationUseCase;Lcom/example/authentication/domain/usecase/LoginUseCase;Lcom/example/session/SessionManager;)V", "_loginEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/authentication/presentation/viewModel/login/LoginEvent;", "_registrationEventFlow", "Lcom/example/authentication/presentation/viewModel/registration/RegistrationEvent;", "loginEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getLoginEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "<set-?>", "Lcom/example/authentication/presentation/viewModel/login/LoginState;", "loginState", "getLoginState", "()Lcom/example/authentication/presentation/viewModel/login/LoginState;", "setLoginState", "(Lcom/example/authentication/presentation/viewModel/login/LoginState;)V", "loginState$delegate", "Landroidx/compose/runtime/MutableState;", "registrationEventFlow", "getRegistrationEventFlow", "Lcom/example/authentication/presentation/viewModel/registration/RegistrationState;", "registrationState", "getRegistrationState", "()Lcom/example/authentication/presentation/viewModel/registration/RegistrationState;", "setRegistrationState", "(Lcom/example/authentication/presentation/viewModel/registration/RegistrationState;)V", "registrationState$delegate", "loginUser", "", "phoneNo", "", "password", "onLoginEvent", "event", "onRegistrationEvent", "registerUser", "userName", "authentication_debug"})
public final class AuthenticationViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.authentication.domain.usecase.RegistrationUseCase registrationUseCase = null;
    private final com.example.authentication.domain.usecase.LoginUseCase loginUseCase = null;
    private final com.example.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState registrationState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState loginState$delegate = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.authentication.presentation.viewModel.login.LoginEvent> _loginEventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.authentication.presentation.viewModel.login.LoginEvent> loginEventFlow = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.authentication.presentation.viewModel.registration.RegistrationEvent> _registrationEventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.authentication.presentation.viewModel.registration.RegistrationEvent> registrationEventFlow = null;
    
    @javax.inject.Inject
    public AuthenticationViewModel(@org.jetbrains.annotations.NotNull
    com.example.authentication.domain.usecase.RegistrationUseCase registrationUseCase, @org.jetbrains.annotations.NotNull
    com.example.authentication.domain.usecase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull
    com.example.session.SessionManager sessionManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.authentication.presentation.viewModel.registration.RegistrationState getRegistrationState() {
        return null;
    }
    
    public final void setRegistrationState(@org.jetbrains.annotations.NotNull
    com.example.authentication.presentation.viewModel.registration.RegistrationState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.authentication.presentation.viewModel.login.LoginState getLoginState() {
        return null;
    }
    
    public final void setLoginState(@org.jetbrains.annotations.NotNull
    com.example.authentication.presentation.viewModel.login.LoginState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.authentication.presentation.viewModel.login.LoginEvent> getLoginEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.authentication.presentation.viewModel.registration.RegistrationEvent> getRegistrationEventFlow() {
        return null;
    }
    
    public final void onRegistrationEvent(@org.jetbrains.annotations.NotNull
    com.example.authentication.presentation.viewModel.registration.RegistrationEvent event) {
    }
    
    public final void onLoginEvent(@org.jetbrains.annotations.NotNull
    com.example.authentication.presentation.viewModel.login.LoginEvent event) {
    }
    
    private final void registerUser(java.lang.String userName, java.lang.String phoneNo, java.lang.String password) {
    }
    
    private final void loginUser(java.lang.String phoneNo, java.lang.String password) {
    }
}