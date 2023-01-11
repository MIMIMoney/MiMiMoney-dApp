package com.alphawallet.app.viewmodel;

import android.content.Context;
import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.interact.FindDefaultNetworkInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.interact.SetDefaultWalletInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.repository.TokenRepositoryType;
import com.alphawallet.app.router.HomeRouter;
import com.alphawallet.app.router.ImportWalletRouter;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.TickerService;
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
public final class WalletsViewModel_Factory implements Factory<WalletsViewModel> {
  private final Provider<SetDefaultWalletInteract> setDefaultWalletInteractProvider;

  private final Provider<FetchWalletsInteract> fetchWalletsInteractProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<ImportWalletRouter> importWalletRouterProvider;

  private final Provider<HomeRouter> homeRouterProvider;

  private final Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<TokenRepositoryType> tokenRepositoryProvider;

  private final Provider<TickerService> tickerServiceProvider;

  private final Provider<AssetDefinitionService> assetServiceProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<Context> contextProvider;

  public WalletsViewModel_Factory(
      Provider<SetDefaultWalletInteract> setDefaultWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<ImportWalletRouter> importWalletRouterProvider,
      Provider<HomeRouter> homeRouterProvider,
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<TickerService> tickerServiceProvider,
      Provider<AssetDefinitionService> assetServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<Context> contextProvider) {
    this.setDefaultWalletInteractProvider = setDefaultWalletInteractProvider;
    this.fetchWalletsInteractProvider = fetchWalletsInteractProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.importWalletRouterProvider = importWalletRouterProvider;
    this.homeRouterProvider = homeRouterProvider;
    this.findDefaultNetworkInteractProvider = findDefaultNetworkInteractProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.tokenRepositoryProvider = tokenRepositoryProvider;
    this.tickerServiceProvider = tickerServiceProvider;
    this.assetServiceProvider = assetServiceProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public WalletsViewModel get() {
    return newInstance(setDefaultWalletInteractProvider.get(), fetchWalletsInteractProvider.get(), genericWalletInteractProvider.get(), importWalletRouterProvider.get(), homeRouterProvider.get(), findDefaultNetworkInteractProvider.get(), keyServiceProvider.get(), ethereumNetworkRepositoryProvider.get(), tokenRepositoryProvider.get(), tickerServiceProvider.get(), assetServiceProvider.get(), preferenceRepositoryProvider.get(), contextProvider.get());
  }

  public static WalletsViewModel_Factory create(
      Provider<SetDefaultWalletInteract> setDefaultWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<ImportWalletRouter> importWalletRouterProvider,
      Provider<HomeRouter> homeRouterProvider,
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<TickerService> tickerServiceProvider,
      Provider<AssetDefinitionService> assetServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<Context> contextProvider) {
    return new WalletsViewModel_Factory(setDefaultWalletInteractProvider, fetchWalletsInteractProvider, genericWalletInteractProvider, importWalletRouterProvider, homeRouterProvider, findDefaultNetworkInteractProvider, keyServiceProvider, ethereumNetworkRepositoryProvider, tokenRepositoryProvider, tickerServiceProvider, assetServiceProvider, preferenceRepositoryProvider, contextProvider);
  }

  public static WalletsViewModel newInstance(SetDefaultWalletInteract setDefaultWalletInteract,
      FetchWalletsInteract fetchWalletsInteract, GenericWalletInteract genericWalletInteract,
      ImportWalletRouter importWalletRouter, HomeRouter homeRouter,
      FindDefaultNetworkInteract findDefaultNetworkInteract, KeyService keyService,
      EthereumNetworkRepositoryType ethereumNetworkRepository, TokenRepositoryType tokenRepository,
      TickerService tickerService, AssetDefinitionService assetService,
      PreferenceRepositoryType preferenceRepository, Context context) {
    return new WalletsViewModel(setDefaultWalletInteract, fetchWalletsInteract, genericWalletInteract, importWalletRouter, homeRouter, findDefaultNetworkInteract, keyService, ethereumNetworkRepository, tokenRepository, tickerService, assetService, preferenceRepository, context);
  }
}
