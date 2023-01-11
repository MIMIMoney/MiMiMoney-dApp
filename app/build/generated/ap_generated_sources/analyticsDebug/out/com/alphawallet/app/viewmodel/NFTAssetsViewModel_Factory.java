package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.OpenSeaService;
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
public final class NFTAssetsViewModel_Factory implements Factory<NFTAssetsViewModel> {
  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<OpenSeaService> openSeaServiceProvider;

  public NFTAssetsViewModel_Factory(
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<OpenSeaService> openSeaServiceProvider) {
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.openSeaServiceProvider = openSeaServiceProvider;
  }

  @Override
  public NFTAssetsViewModel get() {
    return newInstance(fetchTransactionsInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get(), openSeaServiceProvider.get());
  }

  public static NFTAssetsViewModel_Factory create(
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<OpenSeaService> openSeaServiceProvider) {
    return new NFTAssetsViewModel_Factory(fetchTransactionsInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider, openSeaServiceProvider);
  }

  public static NFTAssetsViewModel newInstance(FetchTransactionsInteract fetchTransactionsInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService,
      OpenSeaService openSeaService) {
    return new NFTAssetsViewModel(fetchTransactionsInteract, assetDefinitionService, tokensService, openSeaService);
  }
}
