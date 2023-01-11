package com.alphawallet.app.viewmodel;

import android.content.Context;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.service.AnalyticsServiceType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NameThisWalletViewModel_Factory implements Factory<NameThisWalletViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<Context> contextProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public NameThisWalletViewModel_Factory(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<Context> contextProvider, Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.contextProvider = contextProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public NameThisWalletViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), contextProvider.get(), analyticsServiceProvider.get());
  }

  public static NameThisWalletViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<Context> contextProvider, Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new NameThisWalletViewModel_Factory(genericWalletInteractProvider, contextProvider, analyticsServiceProvider);
  }

  public static NameThisWalletViewModel newInstance(GenericWalletInteract genericWalletInteract,
      Context context, AnalyticsServiceType analyticsService) {
    return new NameThisWalletViewModel(genericWalletInteract, context, analyticsService);
  }
}
