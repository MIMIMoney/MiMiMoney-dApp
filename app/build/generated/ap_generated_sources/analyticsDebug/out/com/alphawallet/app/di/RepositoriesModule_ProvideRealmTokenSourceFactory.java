package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.TokenLocalSource;
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
public final class RepositoriesModule_ProvideRealmTokenSourceFactory implements Factory<TokenLocalSource> {
  private final RepositoriesModule module;

  private final Provider<RealmManager> realmManagerProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  public RepositoriesModule_ProvideRealmTokenSourceFactory(RepositoriesModule module,
      Provider<RealmManager> realmManagerProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider) {
    this.module = module;
    this.realmManagerProvider = realmManagerProvider;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
  }

  @Override
  public TokenLocalSource get() {
    return provideRealmTokenSource(module, realmManagerProvider.get(), ethereumNetworkRepositoryProvider.get());
  }

  public static RepositoriesModule_ProvideRealmTokenSourceFactory create(RepositoriesModule module,
      Provider<RealmManager> realmManagerProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider) {
    return new RepositoriesModule_ProvideRealmTokenSourceFactory(module, realmManagerProvider, ethereumNetworkRepositoryProvider);
  }

  public static TokenLocalSource provideRealmTokenSource(RepositoriesModule instance,
      RealmManager realmManager, EthereumNetworkRepositoryType ethereumNetworkRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideRealmTokenSource(realmManager, ethereumNetworkRepository));
  }
}
