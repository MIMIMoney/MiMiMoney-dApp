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
public final class ViewModelModule_ProvideGenericWalletInteractFactory implements Factory<GenericWalletInteract> {
  private final ViewModelModule module;

  private final Provider<WalletRepositoryType> walletRepositoryProvider;

  public ViewModelModule_ProvideGenericWalletInteractFactory(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    this.module = module;
    this.walletRepositoryProvider = walletRepositoryProvider;
  }

  @Override
  public GenericWalletInteract get() {
    return provideGenericWalletInteract(module, walletRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideGenericWalletInteractFactory create(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    return new ViewModelModule_ProvideGenericWalletInteractFactory(module, walletRepositoryProvider);
  }

  public static GenericWalletInteract provideGenericWalletInteract(ViewModelModule instance,
      WalletRepositoryType walletRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideGenericWalletInteract(walletRepository));
  }
}
