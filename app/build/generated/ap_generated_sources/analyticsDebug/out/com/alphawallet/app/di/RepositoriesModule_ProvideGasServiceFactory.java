package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.service.GasService;
import com.alphawallet.app.service.RealmManager;
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
public final class RepositoriesModule_ProvideGasServiceFactory implements Factory<GasService> {
  private final RepositoriesModule module;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<RealmManager> realmManagerProvider;

  public RepositoriesModule_ProvideGasServiceFactory(RepositoriesModule module,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<OkHttpClient> clientProvider, Provider<RealmManager> realmManagerProvider) {
    this.module = module;
    this.ethereumNetworkRepositoryProvider = ethereumNetworkRepositoryProvider;
    this.clientProvider = clientProvider;
    this.realmManagerProvider = realmManagerProvider;
  }

  @Override
  public GasService get() {
    return provideGasService(module, ethereumNetworkRepositoryProvider.get(), clientProvider.get(), realmManagerProvider.get());
  }

  public static RepositoriesModule_ProvideGasServiceFactory create(RepositoriesModule module,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryProvider,
      Provider<OkHttpClient> clientProvider, Provider<RealmManager> realmManagerProvider) {
    return new RepositoriesModule_ProvideGasServiceFactory(module, ethereumNetworkRepositoryProvider, clientProvider, realmManagerProvider);
  }

  public static GasService provideGasService(RepositoriesModule instance,
      EthereumNetworkRepositoryType ethereumNetworkRepository, OkHttpClient client,
      RealmManager realmManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideGasService(ethereumNetworkRepository, client, realmManager));
  }
}
