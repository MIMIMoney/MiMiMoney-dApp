package com.alphawallet.app.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TokenManagementViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static TokenManagementViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(TokenManagementViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final TokenManagementViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TokenManagementViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
