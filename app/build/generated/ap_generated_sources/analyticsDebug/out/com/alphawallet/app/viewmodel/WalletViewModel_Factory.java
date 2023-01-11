package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.ChangeTokenEnableInteract;
import com.alphawallet.app.interact.FetchTokensInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.OnRampRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.router.CoinbasePayRouter;
import com.alphawallet.app.router.ManageWalletsRouter;
import com.alphawallet.app.router.MyAddressRouter;
import com.alphawallet.app.router.TokenDetailRouter;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
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
public final class WalletViewModel_Factory implements Factory<WalletViewModel> {
  private final Provider<FetchTokensInteract> fetchTokensInteractProvider;

  private final Provider<TokenDetailRouter> tokenDetailRouterProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<ChangeTokenEnableInteract> changeTokenEnableInteractProvider;

  private final Provider<MyAddressRouter> myAddressRouterProvider;

  private final Provider<CoinbasePayRouter> coinbasePayRouterProvider;

  private final Provider<ManageWalletsRouter> manageWalletsRouterProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<RealmManager> realmManagerProvider;

  private final Provider<OnRampRepositoryType> onRampRepositoryProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public WalletViewModel_Factory(Provider<FetchTokensInteract> fetchTokensInteractProvider,
      Provider<TokenDetailRouter> tokenDetailRouterProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<ChangeTokenEnableInteract> changeTokenEnableInteractProvider,
      Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<CoinbasePayRouter> coinbasePayRouterProvider,
      Provider<ManageWalletsRouter> manageWalletsRouterProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<RealmManager> realmManagerProvider,
      Provider<OnRampRepositoryType> onRampRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.fetchTokensInteractProvider = fetchTokensInteractProvider;
    this.tokenDetailRouterProvider = tokenDetailRouterProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.changeTokenEnableInteractProvider = changeTokenEnableInteractProvider;
    this.myAddressRouterProvider = myAddressRouterProvider;
    this.coinbasePayRouterProvider = coinbasePayRouterProvider;
    this.manageWalletsRouterProvider = manageWalletsRouterProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.realmManagerProvider = realmManagerProvider;
    this.onRampRepositoryProvider = onRampRepositoryProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  @Override
  public WalletViewModel get() {
    return newInstance(fetchTokensInteractProvider.get(), tokenDetailRouterProvider.get(), genericWalletInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get(), changeTokenEnableInteractProvider.get(), myAddressRouterProvider.get(), coinbasePayRouterProvider.get(), manageWalletsRouterProvider.get(), preferenceRepositoryProvider.get(), realmManagerProvider.get(), onRampRepositoryProvider.get(), analyticsServiceProvider.get(), awWalletConnectClientProvider.get());
  }

  public static WalletViewModel_Factory create(
      Provider<FetchTokensInteract> fetchTokensInteractProvider,
      Provider<TokenDetailRouter> tokenDetailRouterProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<ChangeTokenEnableInteract> changeTokenEnableInteractProvider,
      Provider<MyAddressRouter> myAddressRouterProvider,
      Provider<CoinbasePayRouter> coinbasePayRouterProvider,
      Provider<ManageWalletsRouter> manageWalletsRouterProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<RealmManager> realmManagerProvider,
      Provider<OnRampRepositoryType> onRampRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new WalletViewModel_Factory(fetchTokensInteractProvider, tokenDetailRouterProvider, genericWalletInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider, changeTokenEnableInteractProvider, myAddressRouterProvider, coinbasePayRouterProvider, manageWalletsRouterProvider, preferenceRepositoryProvider, realmManagerProvider, onRampRepositoryProvider, analyticsServiceProvider, awWalletConnectClientProvider);
  }

  public static WalletViewModel newInstance(FetchTokensInteract fetchTokensInteract,
      TokenDetailRouter tokenDetailRouter, GenericWalletInteract genericWalletInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService,
      ChangeTokenEnableInteract changeTokenEnableInteract, MyAddressRouter myAddressRouter,
      CoinbasePayRouter coinbasePayRouter, ManageWalletsRouter manageWalletsRouter,
      PreferenceRepositoryType preferenceRepository, RealmManager realmManager,
      OnRampRepositoryType onRampRepository, AnalyticsServiceType analyticsService,
      AWWalletConnectClient awWalletConnectClient) {
    return new WalletViewModel(fetchTokensInteract, tokenDetailRouter, genericWalletInteract, assetDefinitionService, tokensService, changeTokenEnableInteract, myAddressRouter, coinbasePayRouter, manageWalletsRouter, preferenceRepository, realmManager, onRampRepository, analyticsService, awWalletConnectClient);
  }
}
