// Generated by Dagger (https://dagger.dev).
package com.example.authentication.di;

import com.example.authentication.data.remote.AuthenticationService;
import com.example.authentication.domain.repository.AuthenticationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthenticationModule_ProvideAuthenticationRepositoryFactory implements Factory<AuthenticationRepository> {
  private final Provider<AuthenticationService> apiProvider;

  public AuthenticationModule_ProvideAuthenticationRepositoryFactory(
      Provider<AuthenticationService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public AuthenticationRepository get() {
    return provideAuthenticationRepository(apiProvider.get());
  }

  public static AuthenticationModule_ProvideAuthenticationRepositoryFactory create(
      Provider<AuthenticationService> apiProvider) {
    return new AuthenticationModule_ProvideAuthenticationRepositoryFactory(apiProvider);
  }

  public static AuthenticationRepository provideAuthenticationRepository(
      AuthenticationService api) {
    return Preconditions.checkNotNullFromProvides(AuthenticationModule.INSTANCE.provideAuthenticationRepository(api));
  }
}
