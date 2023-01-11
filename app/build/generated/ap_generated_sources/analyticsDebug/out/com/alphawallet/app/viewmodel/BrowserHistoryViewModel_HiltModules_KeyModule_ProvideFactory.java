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
public final class BrowserHistoryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static BrowserHistoryViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(BrowserHistoryViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final BrowserHistoryViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new BrowserHistoryViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
