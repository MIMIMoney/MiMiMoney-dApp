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
public final class NFTInfoViewModel_Factory implements Factory<NFTInfoViewModel> {
  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public NFTInfoViewModel_Factory(
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public NFTInfoViewModel get() {
    return newInstance(fetchTransactionsInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get());
  }

  public static NFTInfoViewModel_Factory create(
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new NFTInfoViewModel_Factory(fetchTransactionsInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider);
  }

  public static NFTInfoViewModel newInstance(FetchTransactionsInteract fetchTransactionsInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService) {
    return new NFTInfoViewModel(fetchTransactionsInteract, assetDefinitionService, tokensService);
  }
}
