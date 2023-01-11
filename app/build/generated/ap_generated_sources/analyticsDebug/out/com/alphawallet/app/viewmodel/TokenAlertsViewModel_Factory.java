package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.service.TickerService;
import com.alphawallet.app.service.TokensService;
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
public final class TokenAlertsViewModel_Factory implements Factory<TokenAlertsViewModel> {
  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<TickerService> tickerServiceProvider;

  public TokenAlertsViewModel_Factory(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<TickerService> tickerServiceProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.tickerServiceProvider = tickerServiceProvider;
  }

  @Override
  public TokenAlertsViewModel get() {
    return newInstance(preferenceRepositoryProvider.get(), tokensServiceProvider.get(), tickerServiceProvider.get());
  }

  public static TokenAlertsViewModel_Factory create(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<TickerService> tickerServiceProvider) {
    return new TokenAlertsViewModel_Factory(preferenceRepositoryProvider, tokensServiceProvider, tickerServiceProvider);
  }

  public static TokenAlertsViewModel newInstance(PreferenceRepositoryType preferenceRepository,
      TokensService tokensService, TickerService tickerService) {
    return new TokenAlertsViewModel(preferenceRepository, tokensService, tickerService);
  }
}
