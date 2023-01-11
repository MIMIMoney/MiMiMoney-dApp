package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.CurrencyRepositoryType;
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
public final class SetPriceAlertViewModel_Factory implements Factory<SetPriceAlertViewModel> {
  private final Provider<CurrencyRepositoryType> currencyRepositoryProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public SetPriceAlertViewModel_Factory(Provider<CurrencyRepositoryType> currencyRepositoryProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.currencyRepositoryProvider = currencyRepositoryProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public SetPriceAlertViewModel get() {
    return newInstance(currencyRepositoryProvider.get(), tokensServiceProvider.get());
  }

  public static SetPriceAlertViewModel_Factory create(
      Provider<CurrencyRepositoryType> currencyRepositoryProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new SetPriceAlertViewModel_Factory(currencyRepositoryProvider, tokensServiceProvider);
  }

  public static SetPriceAlertViewModel newInstance(CurrencyRepositoryType currencyRepository,
      TokensService tokensService) {
    return new SetPriceAlertViewModel(currencyRepository, tokensService);
  }
}
