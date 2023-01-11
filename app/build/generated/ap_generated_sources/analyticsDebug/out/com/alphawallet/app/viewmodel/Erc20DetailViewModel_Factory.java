package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.repository.OnRampRepositoryType;
import com.alphawallet.app.router.MyAddressRouter;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
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
public final class Erc20DetailViewModel_Factory implements Factory<Erc20DetailViewModel> {
  private final Provider<MyAddressRouter> myAddressRouterProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<OnRampRepositoryType> onRampRepositoryProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public Erc20DetailViewModel_Factory(Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<OnRampRepositoryType> onRampRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.myAddressRouterProvider = myAddressRouterProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.onRampRepositoryProvider = onRampRepositoryProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public Erc20DetailViewModel get() {
    return newInstance(myAddressRouterProvider.get(), fetchTransactionsInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get(), onRampRepositoryProvider.get(), analyticsServiceProvider.get());
  }

  public static Erc20DetailViewModel_Factory create(
      Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<OnRampRepositoryType> onRampRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new Erc20DetailViewModel_Factory(myAddressRouterProvider, fetchTransactionsInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider, onRampRepositoryProvider, analyticsServiceProvider);
  }

  public static Erc20DetailViewModel newInstance(MyAddressRouter myAddressRouter,
      FetchTransactionsInteract fetchTransactionsInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService,
      OnRampRepositoryType onRampRepository, AnalyticsServiceType analyticsService) {
    return new Erc20DetailViewModel(myAddressRouter, fetchTransactionsInteract, assetDefinitionService, tokensService, onRampRepository, analyticsService);
  }
}
