package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchTransactionsInteract;
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
public final class Erc1155AssetSelectViewModel_Factory implements Factory<Erc1155AssetSelectViewModel> {
  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public Erc1155AssetSelectViewModel_Factory(
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public Erc1155AssetSelectViewModel get() {
    return newInstance(fetchTransactionsInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get());
  }

  public static Erc1155AssetSelectViewModel_Factory create(
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new Erc1155AssetSelectViewModel_Factory(fetchTransactionsInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider);
  }

  public static Erc1155AssetSelectViewModel newInstance(
      FetchTransactionsInteract fetchTransactionsInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService) {
    return new Erc1155AssetSelectViewModel(fetchTransactionsInteract, assetDefinitionService, tokensService);
  }
}
