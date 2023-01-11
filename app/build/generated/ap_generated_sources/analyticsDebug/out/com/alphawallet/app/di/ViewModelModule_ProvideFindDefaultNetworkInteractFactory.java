package com.alphawallet.app.di;

import com.alphawallet.app.interact.FindDefaultNetworkInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
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
public final class ViewModelModule_ProvideFindDefaultNetworkInteractFactory implements Factory<FindDefaultNetworkInteract> {
  private final ViewModelModule module;

  private final Provider<EthereumNetworkRepositoryType> networkRepositoryProvider;

  public ViewModelModule_ProvideFindDefaultNetworkInteractFactory(ViewModelModule module,
      Provider<EthereumNetworkRepositoryType> networkRepositoryProvider) {
    this.module = module;
    this.networkRepositoryProvider = networkRepositoryProvider;
  }

  @Override
  public FindDefaultNetworkInteract get() {
    return provideFindDefaultNetworkInteract(module, networkRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideFindDefaultNetworkInteractFactory create(
      ViewModelModule module, Provider<EthereumNetworkRepositoryType> networkRepositoryProvider) {
    return new ViewModelModule_ProvideFindDefaultNetworkInteractFactory(module, networkRepositoryProvider);
  }

  public static FindDefaultNetworkInteract provideFindDefaultNetworkInteract(
      ViewModelModule instance, EthereumNetworkRepositoryType networkRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideFindDefaultNetworkInteract(networkRepository));
  }
}
