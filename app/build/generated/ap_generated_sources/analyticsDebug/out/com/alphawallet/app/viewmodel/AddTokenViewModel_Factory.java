package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
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
public final class AddTokenViewModel_Factory implements Factory<AddTokenViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public AddTokenViewModel_Factory(Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public AddTokenViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), ethereumNetworkRepositoryProvider.get(), fetchTransactionsInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get());
  }

  public static AddTokenViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new AddTokenViewModel_Factory(genericWalletInteractProvider, ethereumNetworkRepositoryProvider, fetchTransactionsInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider);
  }

  public static AddTokenViewModel newInstance(GenericWalletInteract genericWalletInteract,
      EthereumNetworkRepositoryType ethereumNetworkRepository,
      FetchTransactionsInteract fetchTransactionsInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService) {
    return new AddTokenViewModel(genericWalletInteract, ethereumNetworkRepository, fetchTransactionsInteract, assetDefinitionService, tokensService);
  }
}
