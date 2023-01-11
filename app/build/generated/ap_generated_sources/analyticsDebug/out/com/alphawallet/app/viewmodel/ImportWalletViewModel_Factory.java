package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.ImportWalletInteract;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.KeyService;
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
public final class ImportWalletViewModel_Factory implements Factory<ImportWalletViewModel> {
  private final Provider<ImportWalletInteract> importWalletInteractProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public ImportWalletViewModel_Factory(Provider<ImportWalletInteract> importWalletInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.importWalletInteractProvider = importWalletInteractProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public ImportWalletViewModel get() {
    return newInstance(importWalletInteractProvider.get(), keyServiceProvider.get(), analyticsServiceProvider.get());
  }

  public static ImportWalletViewModel_Factory create(
      Provider<ImportWalletInteract> importWalletInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new ImportWalletViewModel_Factory(importWalletInteractProvider, keyServiceProvider, analyticsServiceProvider);
  }

  public static ImportWalletViewModel newInstance(ImportWalletInteract importWalletInteract,
      KeyService keyService, AnalyticsServiceType analyticsService) {
    return new ImportWalletViewModel(importWalletInteract, keyService, analyticsService);
  }
}
