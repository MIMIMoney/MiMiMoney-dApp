package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.CurrencyRepositoryType;
import com.alphawallet.app.repository.LocaleRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.router.ManageWalletsRouter;
import com.alphawallet.app.router.MyAddressRouter;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.TickerService;
import com.alphawallet.app.service.TransactionsService;
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
public final class NewSettingsViewModel_Factory implements Factory<NewSettingsViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<MyAddressRouter> myAddressRouterProvider;

  private final Provider<ManageWalletsRouter> manageWalletsRouterProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<LocaleRepositoryType> localeRepositoryProvider;

  private final Provider<CurrencyRepositoryType> currencyRepositoryProvider;

  private final Provider<TransactionsService> transactionsServiceProvider;

  private final Provider<TickerService> tickerServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public NewSettingsViewModel_Factory(Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<ManageWalletsRouter> manageWalletsRouterProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<LocaleRepositoryType> localeRepositoryProvider,
      Provider<CurrencyRepositoryType> currencyRepositoryProvider,
      Provider<TransactionsService> transactionsServiceProvider,
      Provider<TickerService> tickerServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.myAddressRouterProvider = myAddressRouterProvider;
    this.manageWalletsRouterProvider = manageWalletsRouterProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.localeRepositoryProvider = localeRepositoryProvider;
    this.currencyRepositoryProvider = currencyRepositoryProvider;
    this.transactionsServiceProvider = transactionsServiceProvider;
    this.tickerServiceProvider = tickerServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public NewSettingsViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), myAddressRouterProvider.get(), manageWalletsRouterProvider.get(), preferenceRepositoryProvider.get(), localeRepositoryProvider.get(), currencyRepositoryProvider.get(), transactionsServiceProvider.get(), tickerServiceProvider.get(), analyticsServiceProvider.get());
  }

  public static NewSettingsViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<ManageWalletsRouter> manageWalletsRouterProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<LocaleRepositoryType> localeRepositoryProvider,
      Provider<CurrencyRepositoryType> currencyRepositoryProvider,
      Provider<TransactionsService> transactionsServiceProvider,
      Provider<TickerService> tickerServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new NewSettingsViewModel_Factory(genericWalletInteractProvider, myAddressRouterProvider, manageWalletsRouterProvider, preferenceRepositoryProvider, localeRepositoryProvider, currencyRepositoryProvider, transactionsServiceProvider, tickerServiceProvider, analyticsServiceProvider);
  }

  public static NewSettingsViewModel newInstance(GenericWalletInteract genericWalletInteract,
      MyAddressRouter myAddressRouter, ManageWalletsRouter manageWalletsRouter,
      PreferenceRepositoryType preferenceRepository, LocaleRepositoryType localeRepository,
      CurrencyRepositoryType currencyRepository, TransactionsService transactionsService,
      TickerService tickerService, AnalyticsServiceType analyticsService) {
    return new NewSettingsViewModel(genericWalletInteract, myAddressRouter, manageWalletsRouter, preferenceRepository, localeRepository, currencyRepository, transactionsService, tickerService, analyticsService);
  }
}
