package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FindDefaultNetworkInteract;
import com.alphawallet.app.router.SellDetailRouter;
import com.alphawallet.app.service.AssetDefinitionService;
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
public final class SellDetailViewModel_Factory implements Factory<SellDetailViewModel> {
  private final Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<SellDetailRouter> sellDetailRouterProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  public SellDetailViewModel_Factory(
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<SellDetailRouter> sellDetailRouterProvider, Provider<KeyService> keyServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    this.findDefaultNetworkInteractProvider = findDefaultNetworkInteractProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.sellDetailRouterProvider = sellDetailRouterProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
  }

  @Override
  public SellDetailViewModel get() {
    return newInstance(findDefaultNetworkInteractProvider.get(), tokensServiceProvider.get(), createTransactionInteractProvider.get(), sellDetailRouterProvider.get(), keyServiceProvider.get(), assetDefinitionServiceProvider.get());
  }

  public static SellDetailViewModel_Factory create(
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<SellDetailRouter> sellDetailRouterProvider, Provider<KeyService> keyServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    return new SellDetailViewModel_Factory(findDefaultNetworkInteractProvider, tokensServiceProvider, createTransactionInteractProvider, sellDetailRouterProvider, keyServiceProvider, assetDefinitionServiceProvider);
  }

  public static SellDetailViewModel newInstance(
      FindDefaultNetworkInteract findDefaultNetworkInteract, TokensService tokensService,
      CreateTransactionInteract createTransactionInteract, SellDetailRouter sellDetailRouter,
      KeyService keyService, AssetDefinitionService assetDefinitionService) {
    return new SellDetailViewModel(findDefaultNetworkInteract, tokensService, createTransactionInteract, sellDetailRouter, keyService, assetDefinitionService);
  }
}
