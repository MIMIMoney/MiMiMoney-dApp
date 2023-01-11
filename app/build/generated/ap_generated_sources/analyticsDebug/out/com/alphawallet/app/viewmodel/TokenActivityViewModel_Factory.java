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
public final class TokenActivityViewModel_Factory implements Factory<TokenActivityViewModel> {
  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public TokenActivityViewModel_Factory(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public TokenActivityViewModel get() {
    return newInstance(assetDefinitionServiceProvider.get(), fetchTransactionsInteractProvider.get(), tokensServiceProvider.get());
  }

  public static TokenActivityViewModel_Factory create(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new TokenActivityViewModel_Factory(assetDefinitionServiceProvider, fetchTransactionsInteractProvider, tokensServiceProvider);
  }

  public static TokenActivityViewModel newInstance(AssetDefinitionService assetDefinitionService,
      FetchTransactionsInteract fetchTransactionsInteract, TokensService tokensService) {
    return new TokenActivityViewModel(assetDefinitionService, fetchTransactionsInteract, tokensService);
  }
}
