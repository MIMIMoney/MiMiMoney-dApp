package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.CoinbasePayRepositoryType;
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
public final class CoinbasePayViewModel_Factory implements Factory<CoinbasePayViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<CoinbasePayRepositoryType> coinbasePayRepositoryProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public CoinbasePayViewModel_Factory(Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<CoinbasePayRepositoryType> coinbasePayRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.coinbasePayRepositoryProvider = coinbasePayRepositoryProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public CoinbasePayViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), coinbasePayRepositoryProvider.get(), analyticsServiceProvider.get());
  }

  public static CoinbasePayViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<CoinbasePayRepositoryType> coinbasePayRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new CoinbasePayViewModel_Factory(genericWalletInteractProvider, coinbasePayRepositoryProvider, analyticsServiceProvider);
  }

  public static CoinbasePayViewModel newInstance(GenericWalletInteract genericWalletInteract,
      CoinbasePayRepositoryType coinbasePayRepository, AnalyticsServiceType analyticsService) {
    return new CoinbasePayViewModel(genericWalletInteract, coinbasePayRepository, analyticsService);
  }
}
