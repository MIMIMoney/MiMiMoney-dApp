package com.alphawallet.app.di;

import com.alphawallet.app.service.IPFSServiceType;
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
public final class RepositoriesModule_ProvideIPFSServiceFactory implements Factory<IPFSServiceType> {
  private final RepositoriesModule module;

  private final Provider<OkHttpClient> clientProvider;

  public RepositoriesModule_ProvideIPFSServiceFactory(RepositoriesModule module,
      Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public IPFSServiceType get() {
    return provideIPFSService(module, clientProvider.get());
  }

  public static RepositoriesModule_ProvideIPFSServiceFactory create(RepositoriesModule module,
      Provider<OkHttpClient> clientProvider) {
    return new RepositoriesModule_ProvideIPFSServiceFactory(module, clientProvider);
  }

  public static IPFSServiceType provideIPFSService(RepositoriesModule instance,
      OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(instance.provideIPFSService(client));
  }
}
