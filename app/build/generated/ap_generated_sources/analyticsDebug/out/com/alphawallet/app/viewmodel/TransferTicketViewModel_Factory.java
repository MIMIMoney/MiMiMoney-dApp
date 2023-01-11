package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.router.TransferTicketDetailRouter;
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
public final class TransferTicketViewModel_Factory implements Factory<TransferTicketViewModel> {
  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<TransferTicketDetailRouter> transferTicketDetailRouterProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  public TransferTicketViewModel_Factory(Provider<TokensService> tokensServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<TransferTicketDetailRouter> transferTicketDetailRouterProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    this.tokensServiceProvider = tokensServiceProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.transferTicketDetailRouterProvider = transferTicketDetailRouterProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
  }

  @Override
  public TransferTicketViewModel get() {
    return newInstance(tokensServiceProvider.get(), genericWalletInteractProvider.get(), transferTicketDetailRouterProvider.get(), assetDefinitionServiceProvider.get());
  }

  public static TransferTicketViewModel_Factory create(
      Provider<TokensService> tokensServiceProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<TransferTicketDetailRouter> transferTicketDetailRouterProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    return new TransferTicketViewModel_Factory(tokensServiceProvider, genericWalletInteractProvider, transferTicketDetailRouterProvider, assetDefinitionServiceProvider);
  }

  public static TransferTicketViewModel newInstance(TokensService tokensService,
      GenericWalletInteract genericWalletInteract,
      TransferTicketDetailRouter transferTicketDetailRouter,
      AssetDefinitionService assetDefinitionService) {
    return new TransferTicketViewModel(tokensService, genericWalletInteract, transferTicketDetailRouter, assetDefinitionService);
  }
}
