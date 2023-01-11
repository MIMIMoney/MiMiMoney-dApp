package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.TokenLocalSource;
import com.alphawallet.app.repository.TokenRepositoryType;
import com.alphawallet.app.service.TickerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoriesModule_ProvideTokenRepositoryFactory implements Factory<TokenRepositoryType> {
  private final RepositoriesModule module;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<TokenLocalSource> tokenLocalSourceProvider;

  private final Provider<OkHttpClient> httpClientProvider;

  private final Provider<Context> contextProvider;

  private final Provider<TickerService> tickerServiceProvider;

  public RepositoriesModule_ProvideTokenRepositoryFactory(RepositoriesModule module,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokenLocalSource> tokenLocalSourceProvider,
      Provider<OkHttpClient> httpClientProvider, Provider<Context> contextProvider,
      Provider<TickerService> tickerServiceProvider) {
    this.module = module;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.tokenLocalSourceProvider = tokenLocalSourceProvider;
    this.httpClientProvider = httpClientProvider;
    this.contextProvider = contextProvider;
    this.tickerServiceProvider = tickerServiceProvider;
  }

  @Override
  public TokenRepositoryType get() {
    return provideTokenRepository(module, ethereumNetworkRepositoryProvider.get(), tokenLocalSourceProvider.get(), httpClientProvider.get(), contextProvider.get(), tickerServiceProvider.get());
  }

  public static RepositoriesModule_ProvideTokenRepositoryFactory create(RepositoriesModule module,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<TokenLocalSource> tokenLocalSourceProvider,
      Provider<OkHttpClient> httpClientProvider, Provider<Context> contextProvider,
      Provider<TickerService> tickerServiceProvider) {
    return new RepositoriesModule_ProvideTokenRepositoryFactory(module, ethereumNetworkRepositoryProvider, tokenLocalSourceProvider, httpClientProvider, contextProvider, tickerServiceProvider);
  }

  public static TokenRepositoryType provideTokenRepository(RepositoriesModule instance,
      EthereumNetworkRepositoryType ethereumNetworkRepository, TokenLocalSource tokenLocalSource,
      OkHttpClient httpClient, Context context, TickerService tickerService) {
    return Preconditions.checkNotNullFromProvides(instance.provideTokenRepository(ethereumNetworkRepository, tokenLocalSource, httpClient, context, tickerService));
  }
}
