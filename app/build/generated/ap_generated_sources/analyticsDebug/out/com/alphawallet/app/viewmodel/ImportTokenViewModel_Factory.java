package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FetchTokensInteract;
import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.service.AlphaWalletService;
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
public final class ImportTokenViewModel_Factory implements Factory<ImportTokenViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<FetchTokensInteract> fetchTokensInteractProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<AlphaWalletService> alphaWalletServiceProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<GasService> gasServiceProvider;

  private final Provider<KeyService> keyServiceProvider;

  public ImportTokenViewModel_Factory(Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<FetchTokensInteract> fetchTokensInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AlphaWalletService> alphaWalletServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<GasService> gasServiceProvider, Provider<KeyService> keyServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.fetchTokensInteractProvider = fetchTokensInteractProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.alphaWalletServiceProvider = alphaWalletServiceProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.gasServiceProvider = gasServiceProvider;
    this.keyServiceProvider = keyServiceProvider;
  }

  @Override
  public ImportTokenViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), createTransactionInteractProvider.get(), fetchTokensInteractProvider.get(), tokensServiceProvider.get(), alphaWalletServiceProvider.get(), ethereumNetworkRepositoryProvider.get(), assetDefinitionServiceProvider.get(), fetchTransactionsInteractProvider.get(), gasServiceProvider.get(), keyServiceProvider.get());
  }

  public static ImportTokenViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<FetchTokensInteract> fetchTokensInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AlphaWalletService> alphaWalletServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<GasService> gasServiceProvider, Provider<KeyService> keyServiceProvider) {
    return new ImportTokenViewModel_Factory(genericWalletInteractProvider, createTransactionInteractProvider, fetchTokensInteractProvider, tokensServiceProvider, alphaWalletServiceProvider, ethereumNetworkRepositoryProvider, assetDefinitionServiceProvider, fetchTransactionsInteractProvider, gasServiceProvider, keyServiceProvider);
  }

  public static ImportTokenViewModel newInstance(GenericWalletInteract genericWalletInteract,
      CreateTransactionInteract createTransactionInteract, FetchTokensInteract fetchTokensInteract,
      TokensService tokensService, AlphaWalletService alphaWalletService,
      EthereumNetworkRepositoryType ethereumNetworkRepository,
      AssetDefinitionService assetDefinitionService,
      FetchTransactionsInteract fetchTransactionsInteract, GasService gasService,
      KeyService keyService) {
    return new ImportTokenViewModel(genericWalletInteract, createTransactionInteract, fetchTokensInteract, tokensService, alphaWalletService, ethereumNetworkRepository, assetDefinitionService, fetchTransactionsInteract, gasService, keyService);
  }
}
