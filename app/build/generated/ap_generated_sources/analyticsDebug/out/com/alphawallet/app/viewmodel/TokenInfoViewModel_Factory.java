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
public final class TokenInfoViewModel_Factory implements Factory<TokenInfoViewModel> {
  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public TokenInfoViewModel_Factory(Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public TokenInfoViewModel get() {
    return newInstance(assetDefinitionServiceProvider.get(), tokensServiceProvider.get());
  }

  public static TokenInfoViewModel_Factory create(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new TokenInfoViewModel_Factory(assetDefinitionServiceProvider, tokensServiceProvider);
  }

  public static TokenInfoViewModel newInstance(AssetDefinitionService assetDefinitionService,
      TokensService tokensService) {
    return new TokenInfoViewModel(assetDefinitionService, tokensService);
  }
}
