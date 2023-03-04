// Generated by Dagger (https://dagger.dev).
package com.example.authentication.data.repository;

import com.example.authentication.data.remote.AuthenticationService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthenticationRepositoryImpl_Factory implements Factory<AuthenticationRepositoryImpl> {
  private final Provider<AuthenticationService> apiProvider;

  public AuthenticationRepositoryImpl_Factory(Provider<AuthenticationService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public AuthenticationRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static AuthenticationRepositoryImpl_Factory create(
      Provider<AuthenticationService> apiProvider) {
    return new AuthenticationRepositoryImpl_Factory(apiProvider);
  }

  public static AuthenticationRepositoryImpl newInstance(AuthenticationService api) {
    return new AuthenticationRepositoryImpl(api);
  }
}
