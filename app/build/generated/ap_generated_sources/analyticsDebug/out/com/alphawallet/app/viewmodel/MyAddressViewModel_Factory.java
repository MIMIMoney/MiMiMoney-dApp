package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
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
public final class MyAddressViewModel_Factory implements Factory<MyAddressViewModel> {
  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  public MyAddressViewModel_Factory(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
  }

  @Override
  public MyAddressViewModel get() {
    return newInstance(ethereumNetworkRepositoryProvider.get(), tokensServiceProvider.get(), assetDefinitionServiceProvider.get());
  }

  public static MyAddressViewModel_Factory create(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    return new MyAddressViewModel_Factory(ethereumNetworkRepositoryProvider, tokensServiceProvider, assetDefinitionServiceProvider);
  }

  public static MyAddressViewModel newInstance(
      EthereumNetworkRepositoryType ethereumNetworkRepository, TokensService tokensService,
      AssetDefinitionService assetDefinitionService) {
    return new MyAddressViewModel(ethereumNetworkRepository, tokensService, assetDefinitionService);
  }
}
