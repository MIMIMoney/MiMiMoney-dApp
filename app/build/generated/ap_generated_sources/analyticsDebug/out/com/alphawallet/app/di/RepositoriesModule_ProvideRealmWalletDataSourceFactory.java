package com.alphawallet.app.di;

import com.alphawallet.app.repository.WalletDataRealmSource;
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
public final class RepositoriesModule_ProvideRealmWalletDataSourceFactory implements Factory<WalletDataRealmSource> {
  private final RepositoriesModule module;

  private final Provider<RealmManager> realmManagerProvider;

  public RepositoriesModule_ProvideRealmWalletDataSourceFactory(RepositoriesModule module,
      Provider<RealmManager> realmManagerProvider) {
    this.module = module;
    this.realmManagerProvider = realmManagerProvider;
  }

  @Override
  public WalletDataRealmSource get() {
    return provideRealmWalletDataSource(module, realmManagerProvider.get());
  }

  public static RepositoriesModule_ProvideRealmWalletDataSourceFactory create(
      RepositoriesModule module, Provider<RealmManager> realmManagerProvider) {
    return new RepositoriesModule_ProvideRealmWalletDataSourceFactory(module, realmManagerProvider);
  }

  public static WalletDataRealmSource provideRealmWalletDataSource(RepositoriesModule instance,
      RealmManager realmManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideRealmWalletDataSource(realmManager));
  }
}
