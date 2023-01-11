package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
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
public final class DappBrowserViewModel_Factory implements Factory<DappBrowserViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<GasService> gasServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public DappBrowserViewModel_Factory(Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<KeyService> keyServiceProvider, Provider<GasService> gasServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.gasServiceProvider = gasServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public DappBrowserViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), assetDefinitionServiceProvider.get(), createTransactionInteractProvider.get(), tokensServiceProvider.get(), ethereumNetworkRepositoryProvider.get(), keyServiceProvider.get(), gasServiceProvider.get(), analyticsServiceProvider.get());
  }

  public static DappBrowserViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<KeyService> keyServiceProvider, Provider<GasService> gasServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new DappBrowserViewModel_Factory(genericWalletInteractProvider, assetDefinitionServiceProvider, createTransactionInteractProvider, tokensServiceProvider, ethereumNetworkRepositoryProvider, keyServiceProvider, gasServiceProvider, analyticsServiceProvider);
  }

  public static DappBrowserViewModel newInstance(GenericWalletInteract genericWalletInteract,
      AssetDefinitionService assetDefinitionService,
      CreateTransactionInteract createTransactionInteract, TokensService tokensService,
      EthereumNetworkRepositoryType ethereumNetworkRepository, KeyService keyService,
      GasService gasService, AnalyticsServiceType analyticsService) {
    return new DappBrowserViewModel(genericWalletInteract, assetDefinitionService, createTransactionInteract, tokensService, ethereumNetworkRepository, keyService, gasService, analyticsService);
  }
}
