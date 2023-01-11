package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.TokenRepositoryType;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.OpenSeaService;
import com.alphawallet.app.service.TickerService;
import com.alphawallet.app.service.TokensService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoriesModule_ProvideTokensServicesFactory implements Factory<TokensService> {
  private final RepositoriesModule module;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<TokenRepositoryType> tokenRepositoryProvider;

  private final Provider<TickerService> tickerServiceProvider;

  private final Provider<OpenSeaService> openseaServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public RepositoriesModule_ProvideTokensServicesFactory(RepositoriesModule module,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<TickerService> tickerServiceProvider,
      Provider<OpenSeaService> openseaServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.module = module;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.tokenRepositoryProvider = tokenRepositoryProvider;
    this.tickerServiceProvider = tickerServiceProvider;
    this.openseaServiceProvider = openseaServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public TokensService get() {
    return provideTokensServices(module, ethereumNetworkRepositoryProvider.get(), tokenRepositoryProvider.get(), tickerServiceProvider.get(), openseaServiceProvider.get(), analyticsServiceProvider.get());
  }

  public static RepositoriesModule_ProvideTokensServicesFactory create(RepositoriesModule module,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<TickerService> tickerServiceProvider,
      Provider<OpenSeaService> openseaServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new RepositoriesModule_ProvideTokensServicesFactory(module, ethereumNetworkRepositoryProvider, tokenRepositoryProvider, tickerServiceProvider, openseaServiceProvider, analyticsServiceProvider);
  }

  public static TokensService provideTokensServices(RepositoriesModule instance,
      EthereumNetworkRepositoryType ethereumNetworkRepository, TokenRepositoryType tokenRepository,
      TickerService tickerService, OpenSeaService openseaService,
      AnalyticsServiceType analyticsService) {
    return Preconditions.checkNotNullFromProvides(instance.provideTokensServices(ethereumNetworkRepository, tokenRepository, tickerService, openseaService, analyticsService));
  }
}
