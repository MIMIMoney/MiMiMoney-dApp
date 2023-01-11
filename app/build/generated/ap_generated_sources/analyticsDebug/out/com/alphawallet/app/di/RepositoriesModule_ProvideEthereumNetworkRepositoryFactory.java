package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
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
public final class RepositoriesModule_ProvideEthereumNetworkRepositoryFactory implements Factory<EthereumNetworkRepositoryType> {
  private final RepositoriesModule module;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<Context> contextProvider;

  public RepositoriesModule_ProvideEthereumNetworkRepositoryFactory(RepositoriesModule module,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<Context> contextProvider) {
    this.module = module;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public EthereumNetworkRepositoryType get() {
    return provideEthereumNetworkRepository(module, preferenceRepositoryProvider.get(), contextProvider.get());
  }

  public static RepositoriesModule_ProvideEthereumNetworkRepositoryFactory create(
      RepositoriesModule module, Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<Context> contextProvider) {
    return new RepositoriesModule_ProvideEthereumNetworkRepositoryFactory(module, preferenceRepositoryProvider, contextProvider);
  }

  public static EthereumNetworkRepositoryType provideEthereumNetworkRepository(
      RepositoriesModule instance, PreferenceRepositoryType preferenceRepository, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideEthereumNetworkRepository(preferenceRepository, context));
  }
}
