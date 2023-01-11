package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.GasService;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.OpenSeaService;
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
public final class TokenFunctionViewModel_Factory implements Factory<TokenFunctionViewModel> {
  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<GasService> gasServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<OpenSeaService> openseaServiceProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public TokenFunctionViewModel_Factory(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<GasService> gasServiceProvider, Provider<TokensService> tokensServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<OpenSeaService> openseaServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.gasServiceProvider = gasServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.openseaServiceProvider = openseaServiceProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public TokenFunctionViewModel get() {
    return newInstance(assetDefinitionServiceProvider.get(), createTransactionInteractProvider.get(), gasServiceProvider.get(), tokensServiceProvider.get(), ethereumNetworkRepositoryProvider.get(), keyServiceProvider.get(), genericWalletInteractProvider.get(), openseaServiceProvider.get(), fetchTransactionsInteractProvider.get(), analyticsServiceProvider.get());
  }

  public static TokenFunctionViewModel_Factory create(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<GasService> gasServiceProvider, Provider<TokensService> tokensServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<OpenSeaService> openseaServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new TokenFunctionViewModel_Factory(assetDefinitionServiceProvider, createTransactionInteractProvider, gasServiceProvider, tokensServiceProvider, ethereumNetworkRepositoryProvider, keyServiceProvider, genericWalletInteractProvider, openseaServiceProvider, fetchTransactionsInteractProvider, analyticsServiceProvider);
  }

  public static TokenFunctionViewModel newInstance(AssetDefinitionService assetDefinitionService,
      CreateTransactionInteract createTransactionInteract, GasService gasService,
      TokensService tokensService, EthereumNetworkRepositoryType ethereumNetworkRepository,
      KeyService keyService, GenericWalletInteract genericWalletInteract,
      OpenSeaService openseaService, FetchTransactionsInteract fetchTransactionsInteract,
      AnalyticsServiceType analyticsService) {
    return new TokenFunctionViewModel(assetDefinitionService, createTransactionInteract, gasService, tokensService, ethereumNetworkRepository, keyService, genericWalletInteract, openseaService, fetchTransactionsInteract, analyticsService);
  }
}
