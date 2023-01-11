package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.router.RedeemSignatureDisplayRouter;
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
public final class RedeemAssetSelectViewModel_Factory implements Factory<RedeemAssetSelectViewModel> {
  private final Provider<RedeemSignatureDisplayRouter> redeemSignatureDisplayRouterProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  public RedeemAssetSelectViewModel_Factory(
      Provider<RedeemSignatureDisplayRouter> redeemSignatureDisplayRouterProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider) {
    this.redeemSignatureDisplayRouterProvider = redeemSignatureDisplayRouterProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
  }

  @Override
  public RedeemAssetSelectViewModel get() {
    return newInstance(redeemSignatureDisplayRouterProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get(), genericWalletInteractProvider.get());
  }

  public static RedeemAssetSelectViewModel_Factory create(
      Provider<RedeemSignatureDisplayRouter> redeemSignatureDisplayRouterProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider) {
    return new RedeemAssetSelectViewModel_Factory(redeemSignatureDisplayRouterProvider, assetDefinitionServiceProvider, tokensServiceProvider, genericWalletInteractProvider);
  }

  public static RedeemAssetSelectViewModel newInstance(
      RedeemSignatureDisplayRouter redeemSignatureDisplayRouter,
      AssetDefinitionService assetDefinitionService, TokensService tokensService,
      GenericWalletInteract genericWalletInteract) {
    return new RedeemAssetSelectViewModel(redeemSignatureDisplayRouter, assetDefinitionService, tokensService, genericWalletInteract);
  }
}
