package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.CurrencyRepositoryType;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.LocaleRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.router.ExternalBrowserRouter;
import com.alphawallet.app.router.ImportTokenRouter;
import com.alphawallet.app.router.MyAddressRouter;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.RealmManager;
import com.alphawallet.app.service.TransactionsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<LocaleRepositoryType> localeRepositoryProvider;

  private final Provider<ImportTokenRouter> importTokenRouterProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<FetchWalletsInteract> fetchWalletsInteractProvider;

  private final Provider<CurrencyRepositoryType> currencyRepositoryProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<MyAddressRouter> myAddressRouterProvider;

  private final Provider<TransactionsService> transactionsServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  private final Provider<ExternalBrowserRouter> externalBrowserRouterProvider;

  private final Provider<OkHttpClient> httpClientProvider;

  private final Provider<RealmManager> realmManagerProvider;

  public HomeViewModel_Factory(Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<LocaleRepositoryType> localeRepositoryProvider,
      Provider<ImportTokenRouter> importTokenRouterProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<CurrencyRepositoryType> currencyRepositoryProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<TransactionsService> transactionsServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<ExternalBrowserRouter> externalBrowserRouterProvider,
      Provider<OkHttpClient> httpClientProvider, Provider<RealmManager> realmManagerProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.localeRepositoryProvider = localeRepositoryProvider;
    this.importTokenRouterProvider = importTokenRouterProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.fetchWalletsInteractProvider = fetchWalletsInteractProvider;
    this.currencyRepositoryProvider = currencyRepositoryProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.myAddressRouterProvider = myAddressRouterProvider;
    this.transactionsServiceProvider = transactionsServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
    this.externalBrowserRouterProvider = externalBrowserRouterProvider;
    this.httpClientProvider = httpClientProvider;
    this.realmManagerProvider = realmManagerProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(preferenceRepositoryProvider.get(), localeRepositoryProvider.get(), importTokenRouterProvider.get(), assetDefinitionServiceProvider.get(), genericWalletInteractProvider.get(), fetchWalletsInteractProvider.get(), currencyRepositoryProvider.get(), ethereumNetworkRepositoryProvider.get(), myAddressRouterProvider.get(), transactionsServiceProvider.get(), analyticsServiceProvider.get(), externalBrowserRouterProvider.get(), httpClientProvider.get(), realmManagerProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<LocaleRepositoryType> localeRepositoryProvider,
      Provider<ImportTokenRouter> importTokenRouterProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<CurrencyRepositoryType> currencyRepositoryProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<TransactionsService> transactionsServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<ExternalBrowserRouter> externalBrowserRouterProvider,
      Provider<OkHttpClient> httpClientProvider, Provider<RealmManager> realmManagerProvider) {
    return new HomeViewModel_Factory(preferenceRepositoryProvider, localeRepositoryProvider, importTokenRouterProvider, assetDefinitionServiceProvider, genericWalletInteractProvider, fetchWalletsInteractProvider, currencyRepositoryProvider, ethereumNetworkRepositoryProvider, myAddressRouterProvider, transactionsServiceProvider, analyticsServiceProvider, externalBrowserRouterProvider, httpClientProvider, realmManagerProvider);
  }

  public static HomeViewModel newInstance(PreferenceRepositoryType preferenceRepository,
      LocaleRepositoryType localeRepository, ImportTokenRouter importTokenRouter,
      AssetDefinitionService assetDefinitionService, GenericWalletInteract genericWalletInteract,
      FetchWalletsInteract fetchWalletsInteract, CurrencyRepositoryType currencyRepository,
      EthereumNetworkRepositoryType ethereumNetworkRepository, MyAddressRouter myAddressRouter,
      TransactionsService transactionsService, AnalyticsServiceType analyticsService,
      ExternalBrowserRouter externalBrowserRouter, OkHttpClient httpClient,
      RealmManager realmManager) {
    return new HomeViewModel(preferenceRepository, localeRepository, importTokenRouter, assetDefinitionService, genericWalletInteract, fetchWalletsInteract, currencyRepository, ethereumNetworkRepository, myAddressRouter, transactionsService, analyticsService, externalBrowserRouter, httpClient, realmManager);
  }
}
