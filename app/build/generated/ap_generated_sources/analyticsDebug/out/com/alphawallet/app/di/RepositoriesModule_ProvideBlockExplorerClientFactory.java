package com.alphawallet.app.di;

import com.alphawallet.app.service.RealmManager;
import com.alphawallet.app.service.TransactionsNetworkClientType;
import com.google.gson.Gson;
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
public final class RepositoriesModule_ProvideBlockExplorerClientFactory implements Factory<TransactionsNetworkClientType> {
  private final RepositoriesModule module;

  private final Provider<OkHttpClient> httpClientProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<RealmManager> realmManagerProvider;

  public RepositoriesModule_ProvideBlockExplorerClientFactory(RepositoriesModule module,
      Provider<OkHttpClient> httpClientProvider, Provider<Gson> gsonProvider,
      Provider<RealmManager> realmManagerProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
    this.gsonProvider = gsonProvider;
    this.realmManagerProvider = realmManagerProvider;
  }

  @Override
  public TransactionsNetworkClientType get() {
    return provideBlockExplorerClient(module, httpClientProvider.get(), gsonProvider.get(), realmManagerProvider.get());
  }

  public static RepositoriesModule_ProvideBlockExplorerClientFactory create(
      RepositoriesModule module, Provider<OkHttpClient> httpClientProvider,
      Provider<Gson> gsonProvider, Provider<RealmManager> realmManagerProvider) {
    return new RepositoriesModule_ProvideBlockExplorerClientFactory(module, httpClientProvider, gsonProvider, realmManagerProvider);
  }

  public static TransactionsNetworkClientType provideBlockExplorerClient(
      RepositoriesModule instance, OkHttpClient httpClient, Gson gson, RealmManager realmManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideBlockExplorerClient(httpClient, gson, realmManager));
  }
}
