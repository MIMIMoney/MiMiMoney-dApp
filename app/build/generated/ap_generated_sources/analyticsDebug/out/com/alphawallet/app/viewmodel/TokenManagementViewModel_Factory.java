package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.ChangeTokenEnableInteract;
import com.alphawallet.app.repository.TokenRepositoryType;
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
public final class TokenManagementViewModel_Factory implements Factory<TokenManagementViewModel> {
  private final Provider<TokenRepositoryType> tokenRepositoryProvider;

  private final Provider<ChangeTokenEnableInteract> changeTokenEnableInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public TokenManagementViewModel_Factory(Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<ChangeTokenEnableInteract> changeTokenEnableInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.tokenRepositoryProvider = tokenRepositoryProvider;
    this.changeTokenEnableInteractProvider = changeTokenEnableInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public TokenManagementViewModel get() {
    return newInstance(tokenRepositoryProvider.get(), changeTokenEnableInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get());
  }

  public static TokenManagementViewModel_Factory create(
      Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<ChangeTokenEnableInteract> changeTokenEnableInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new TokenManagementViewModel_Factory(tokenRepositoryProvider, changeTokenEnableInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider);
  }

  public static TokenManagementViewModel newInstance(TokenRepositoryType tokenRepository,
      ChangeTokenEnableInteract changeTokenEnableInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService) {
    return new TokenManagementViewModel(tokenRepository, changeTokenEnableInteract, assetDefinitionService, tokensService);
  }
}
