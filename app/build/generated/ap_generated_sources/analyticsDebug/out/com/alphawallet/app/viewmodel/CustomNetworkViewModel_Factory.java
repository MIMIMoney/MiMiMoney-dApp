package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.service.AnalyticsServiceType;
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
public final class CustomNetworkViewModel_Factory implements Factory<CustomNetworkViewModel> {
  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public CustomNetworkViewModel_Factory(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public CustomNetworkViewModel get() {
    return newInstance(ethereumNetworkRepositoryProvider.get(), analyticsServiceProvider.get());
  }

  public static CustomNetworkViewModel_Factory create(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new CustomNetworkViewModel_Factory(ethereumNetworkRepositoryProvider, analyticsServiceProvider);
  }

  public static CustomNetworkViewModel newInstance(
      EthereumNetworkRepositoryType ethereumNetworkRepository,
      AnalyticsServiceType analyticsService) {
    return new CustomNetworkViewModel(ethereumNetworkRepository, analyticsService);
  }
}
