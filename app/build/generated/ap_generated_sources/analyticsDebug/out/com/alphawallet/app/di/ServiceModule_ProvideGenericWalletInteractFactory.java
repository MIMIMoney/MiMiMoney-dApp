package com.alphawallet.app.di;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.WalletRepositoryType;
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
public final class ServiceModule_ProvideGenericWalletInteractFactory implements Factory<GenericWalletInteract> {
  private final ServiceModule module;

  private final Provider<WalletRepositoryType> walletRepositoryProvider;

  public ServiceModule_ProvideGenericWalletInteractFactory(ServiceModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    this.module = module;
    this.walletRepositoryProvider = walletRepositoryProvider;
  }

  @Override
  public GenericWalletInteract get() {
    return provideGenericWalletInteract(module, walletRepositoryProvider.get());
  }

  public static ServiceModule_ProvideGenericWalletInteractFactory create(ServiceModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    return new ServiceModule_ProvideGenericWalletInteractFactory(module, walletRepositoryProvider);
  }

  public static GenericWalletInteract provideGenericWalletInteract(ServiceModule instance,
      WalletRepositoryType walletRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideGenericWalletInteract(walletRepository));
  }
}
