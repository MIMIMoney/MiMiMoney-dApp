package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
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
public final class SelectNetworkViewModel_Factory implements Factory<SelectNetworkViewModel> {
  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  public SelectNetworkViewModel_Factory(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    this.ethereumNetworkRepositoryTypeProvider = ethereumNetworkRepositoryTypeProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SelectNetworkViewModel get() {
    return newInstance(ethereumNetworkRepositoryTypeProvider.get(), tokensServiceProvider.get(), preferenceRepositoryProvider.get());
  }

  public static SelectNetworkViewModel_Factory create(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    return new SelectNetworkViewModel_Factory(ethereumNetworkRepositoryTypeProvider, tokensServiceProvider, preferenceRepositoryProvider);
  }

  public static SelectNetworkViewModel newInstance(
      EthereumNetworkRepositoryType ethereumNetworkRepositoryType, TokensService tokensService,
      PreferenceRepositoryType preferenceRepository) {
    return new SelectNetworkViewModel(ethereumNetworkRepositoryType, tokensService, preferenceRepository);
  }
}
