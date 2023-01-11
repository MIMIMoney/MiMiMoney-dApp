package com.alphawallet.app.viewmodel;

import com.alphawallet.app.service.AssetDefinitionService;
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
public final class TokenScriptManagementViewModel_Factory implements Factory<TokenScriptManagementViewModel> {
  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  public TokenScriptManagementViewModel_Factory(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
  }

  @Override
  public TokenScriptManagementViewModel get() {
    return newInstance(assetDefinitionServiceProvider.get());
  }

  public static TokenScriptManagementViewModel_Factory create(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    return new TokenScriptManagementViewModel_Factory(assetDefinitionServiceProvider);
  }

  public static TokenScriptManagementViewModel newInstance(
      AssetDefinitionService assetDefinitionService) {
    return new TokenScriptManagementViewModel(assetDefinitionService);
  }
}
