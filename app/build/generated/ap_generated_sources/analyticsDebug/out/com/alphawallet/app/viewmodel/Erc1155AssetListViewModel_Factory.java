package com.alphawallet.app.viewmodel;

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
public final class Erc1155AssetListViewModel_Factory implements Factory<Erc1155AssetListViewModel> {
  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public Erc1155AssetListViewModel_Factory(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public Erc1155AssetListViewModel get() {
    return newInstance(assetDefinitionServiceProvider.get(), tokensServiceProvider.get());
  }

  public static Erc1155AssetListViewModel_Factory create(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new Erc1155AssetListViewModel_Factory(assetDefinitionServiceProvider, tokensServiceProvider);
  }

  public static Erc1155AssetListViewModel newInstance(AssetDefinitionService assetDefinitionService,
      TokensService tokensService) {
    return new Erc1155AssetListViewModel(assetDefinitionService, tokensService);
  }
}
