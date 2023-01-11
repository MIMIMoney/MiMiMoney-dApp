package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.service.AnalyticsServiceType;
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
public final class SelectNetworkFilterViewModel_Factory implements Factory<SelectNetworkFilterViewModel> {
  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public SelectNetworkFilterViewModel_Factory(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.ethereumNetworkRepositoryTypeProvider = ethereumNetworkRepositoryTypeProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public SelectNetworkFilterViewModel get() {
    return newInstance(ethereumNetworkRepositoryTypeProvider.get(), tokensServiceProvider.get(), preferenceRepositoryProvider.get(), analyticsServiceProvider.get());
  }

  public static SelectNetworkFilterViewModel_Factory create(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new SelectNetworkFilterViewModel_Factory(ethereumNetworkRepositoryTypeProvider, tokensServiceProvider, preferenceRepositoryProvider, analyticsServiceProvider);
  }

  public static SelectNetworkFilterViewModel newInstance(
      EthereumNetworkRepositoryType ethereumNetworkRepositoryType, TokensService tokensService,
      PreferenceRepositoryType preferenceRepository, AnalyticsServiceType analyticsService) {
    return new SelectNetworkFilterViewModel(ethereumNetworkRepositoryType, tokensService, preferenceRepository, analyticsService);
  }
}
