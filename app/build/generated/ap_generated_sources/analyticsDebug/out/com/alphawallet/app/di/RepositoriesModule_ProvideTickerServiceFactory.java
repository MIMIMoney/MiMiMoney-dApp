package com.alphawallet.app.di;

import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.repository.TokenLocalSource;
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
public final class RepositoriesModule_ProvideTickerServiceFactory implements Factory<TickerService> {
  private final RepositoriesModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  private final Provider<PreferenceRepositoryType> sharedPrefsProvider;

  private final Provider<TokenLocalSource> localSourceProvider;

  public RepositoriesModule_ProvideTickerServiceFactory(RepositoriesModule module,
      Provider<OkHttpClient> httpClientProvider,
      Provider<PreferenceRepositoryType> sharedPrefsProvider,
      Provider<TokenLocalSource> localSourceProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
    this.sharedPrefsProvider = sharedPrefsProvider;
    this.localSourceProvider = localSourceProvider;
  }

  @Override
  public TickerService get() {
    return provideTickerService(module, httpClientProvider.get(), sharedPrefsProvider.get(), localSourceProvider.get());
  }

  public static RepositoriesModule_ProvideTickerServiceFactory create(RepositoriesModule module,
      Provider<OkHttpClient> httpClientProvider,
      Provider<PreferenceRepositoryType> sharedPrefsProvider,
      Provider<TokenLocalSource> localSourceProvider) {
    return new RepositoriesModule_ProvideTickerServiceFactory(module, httpClientProvider, sharedPrefsProvider, localSourceProvider);
  }

  public static TickerService provideTickerService(RepositoriesModule instance,
      OkHttpClient httpClient, PreferenceRepositoryType sharedPrefs, TokenLocalSource localSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideTickerService(httpClient, sharedPrefs, localSource));
  }
}
