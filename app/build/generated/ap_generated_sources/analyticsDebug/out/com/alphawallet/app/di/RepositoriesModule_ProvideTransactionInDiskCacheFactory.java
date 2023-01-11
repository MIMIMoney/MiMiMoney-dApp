package com.alphawallet.app.di;

import com.alphawallet.app.repository.TransactionLocalSource;
import com.alphawallet.app.service.RealmManager;
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
public final class RepositoriesModule_ProvideTransactionInDiskCacheFactory implements Factory<TransactionLocalSource> {
  private final RepositoriesModule module;

  private final Provider<RealmManager> realmManagerProvider;

  public RepositoriesModule_ProvideTransactionInDiskCacheFactory(RepositoriesModule module,
      Provider<RealmManager> realmManagerProvider) {
    this.module = module;
    this.realmManagerProvider = realmManagerProvider;
  }

  @Override
  public TransactionLocalSource get() {
    return provideTransactionInDiskCache(module, realmManagerProvider.get());
  }

  public static RepositoriesModule_ProvideTransactionInDiskCacheFactory create(
      RepositoriesModule module, Provider<RealmManager> realmManagerProvider) {
    return new RepositoriesModule_ProvideTransactionInDiskCacheFactory(module, realmManagerProvider);
  }

  public static TransactionLocalSource provideTransactionInDiskCache(RepositoriesModule instance,
      RealmManager realmManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideTransactionInDiskCache(realmManager));
  }
}
