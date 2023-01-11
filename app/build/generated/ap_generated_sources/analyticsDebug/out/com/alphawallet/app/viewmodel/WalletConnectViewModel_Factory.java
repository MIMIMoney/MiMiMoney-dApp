package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.interact.FindDefaultNetworkInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.interact.WalletConnectInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.GasService;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.RealmManager;
import com.alphawallet.app.service.TokensService;
import com.alphawallet.app.walletconnect.AWWalletConnectClient;
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
public final class WalletConnectViewModel_Factory implements Factory<WalletConnectViewModel> {
  private final Provider<KeyService> keyServiceProvider;

  private final Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider;

  private final Provider<FetchWalletsInteract> fetchWalletsInteractProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<WalletConnectInteract> walletConnectInteractProvider;

  private final Provider<RealmManager> realmManagerProvider;

  private final Provider<GasService> gasServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public WalletConnectViewModel_Factory(Provider<KeyService> keyServiceProvider,
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<WalletConnectInteract> walletConnectInteractProvider,
      Provider<RealmManager> realmManagerProvider, Provider<GasService> gasServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.keyServiceProvider = keyServiceProvider;
    this.findDefaultNetworkInteractProvider = findDefaultNetworkInteractProvider;
    this.fetchWalletsInteractProvider = fetchWalletsInteractProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.walletConnectInteractProvider = walletConnectInteractProvider;
    this.realmManagerProvider = realmManagerProvider;
    this.gasServiceProvider = gasServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  @Override
  public WalletConnectViewModel get() {
    return newInstance(keyServiceProvider.get(), findDefaultNetworkInteractProvider.get(), fetchWalletsInteractProvider.get(), createTransactionInteractProvider.get(), genericWalletInteractProvider.get(), walletConnectInteractProvider.get(), realmManagerProvider.get(), gasServiceProvider.get(), tokensServiceProvider.get(), analyticsServiceProvider.get(), ethereumNetworkRepositoryProvider.get(), awWalletConnectClientProvider.get());
  }

  public static WalletConnectViewModel_Factory create(Provider<KeyService> keyServiceProvider,
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<WalletConnectInteract> walletConnectInteractProvider,
      Provider<RealmManager> realmManagerProvider, Provider<GasService> gasServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new WalletConnectViewModel_Factory(keyServiceProvider, findDefaultNetworkInteractProvider, fetchWalletsInteractProvider, createTransactionInteractProvider, genericWalletInteractProvider, walletConnectInteractProvider, realmManagerProvider, gasServiceProvider, tokensServiceProvider, analyticsServiceProvider, ethereumNetworkRepositoryProvider, awWalletConnectClientProvider);
  }

  public static WalletConnectViewModel newInstance(KeyService keyService,
      FindDefaultNetworkInteract findDefaultNetworkInteract,
      FetchWalletsInteract fetchWalletsInteract,
      CreateTransactionInteract createTransactionInteract,
      GenericWalletInteract genericWalletInteract, WalletConnectInteract walletConnectInteract,
      RealmManager realmManager, GasService gasService, TokensService tokensService,
      AnalyticsServiceType analyticsService,
      EthereumNetworkRepositoryType ethereumNetworkRepository,
      AWWalletConnectClient awWalletConnectClient) {
    return new WalletConnectViewModel(keyService, findDefaultNetworkInteract, fetchWalletsInteract, createTransactionInteract, genericWalletInteract, walletConnectInteract, realmManager, gasService, tokensService, analyticsService, ethereumNetworkRepository, awWalletConnectClient);
  }
}
