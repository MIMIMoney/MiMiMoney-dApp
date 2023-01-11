package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.router.MyAddressRouter;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.GasService;
import com.alphawallet.app.service.KeyService;
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
public final class SendViewModel_Factory implements Factory<SendViewModel> {
  private final Provider<MyAddressRouter> myAddressRouterProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<GasService> gasServiceProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public SendViewModel_Factory(Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<GasService> gasServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.myAddressRouterProvider = myAddressRouterProvider;
    this.ethereumNetworkRepositoryTypeProvider = ethereumNetworkRepositoryTypeProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.gasServiceProvider = gasServiceProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public SendViewModel get() {
    return newInstance(myAddressRouterProvider.get(), ethereumNetworkRepositoryTypeProvider.get(), tokensServiceProvider.get(), fetchTransactionsInteractProvider.get(), createTransactionInteractProvider.get(), gasServiceProvider.get(), assetDefinitionServiceProvider.get(), keyServiceProvider.get(), analyticsServiceProvider.get());
  }

  public static SendViewModel_Factory create(Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<GasService> gasServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new SendViewModel_Factory(myAddressRouterProvider, ethereumNetworkRepositoryTypeProvider, tokensServiceProvider, fetchTransactionsInteractProvider, createTransactionInteractProvider, gasServiceProvider, assetDefinitionServiceProvider, keyServiceProvider, analyticsServiceProvider);
  }

  public static SendViewModel newInstance(MyAddressRouter myAddressRouter,
      EthereumNetworkRepositoryType ethereumNetworkRepositoryType, TokensService tokensService,
      FetchTransactionsInteract fetchTransactionsInteract,
      CreateTransactionInteract createTransactionInteract, GasService gasService,
      AssetDefinitionService assetDefinitionService, KeyService keyService,
      AnalyticsServiceType analyticsService) {
    return new SendViewModel(myAddressRouter, ethereumNetworkRepositoryType, tokensService, fetchTransactionsInteract, createTransactionInteract, gasService, assetDefinitionService, keyService, analyticsService);
  }
}
