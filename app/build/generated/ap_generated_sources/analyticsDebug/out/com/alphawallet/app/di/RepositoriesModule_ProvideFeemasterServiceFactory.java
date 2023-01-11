package com.alphawallet.app.di;

import com.alphawallet.app.repository.TransactionRepositoryType;
import com.alphawallet.app.service.AlphaWalletService;
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
public final class RepositoriesModule_ProvideFeemasterServiceFactory implements Factory<AlphaWalletService> {
  private final RepositoriesModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<TransactionRepositoryType> transactionRepositoryProvider;

  private final Provider<Gson> gsonProvider;

  public RepositoriesModule_ProvideFeemasterServiceFactory(RepositoriesModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<TransactionRepositoryType> transactionRepositoryProvider,
      Provider<Gson> gsonProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.transactionRepositoryProvider = transactionRepositoryProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public AlphaWalletService get() {
    return provideFeemasterService(module, okHttpClientProvider.get(), transactionRepositoryProvider.get(), gsonProvider.get());
  }

  public static RepositoriesModule_ProvideFeemasterServiceFactory create(RepositoriesModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<TransactionRepositoryType> transactionRepositoryProvider,
      Provider<Gson> gsonProvider) {
    return new RepositoriesModule_ProvideFeemasterServiceFactory(module, okHttpClientProvider, transactionRepositoryProvider, gsonProvider);
  }

  public static AlphaWalletService provideFeemasterService(RepositoriesModule instance,
      OkHttpClient okHttpClient, TransactionRepositoryType transactionRepository, Gson gson) {
    return Preconditions.checkNotNullFromProvides(instance.provideFeemasterService(okHttpClient, transactionRepository, gson));
  }
}
