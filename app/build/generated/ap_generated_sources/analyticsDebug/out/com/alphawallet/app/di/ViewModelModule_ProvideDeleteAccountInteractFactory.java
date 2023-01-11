package com.alphawallet.app.di;

import com.alphawallet.app.interact.DeleteWalletInteract;
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
public final class ViewModelModule_ProvideDeleteAccountInteractFactory implements Factory<DeleteWalletInteract> {
  private final ViewModelModule module;

  private final Provider<WalletRepositoryType> accountRepositoryProvider;

  public ViewModelModule_ProvideDeleteAccountInteractFactory(ViewModelModule module,
      Provider<WalletRepositoryType> accountRepositoryProvider) {
    this.module = module;
    this.accountRepositoryProvider = accountRepositoryProvider;
  }

  @Override
  public DeleteWalletInteract get() {
    return provideDeleteAccountInteract(module, accountRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideDeleteAccountInteractFactory create(ViewModelModule module,
      Provider<WalletRepositoryType> accountRepositoryProvider) {
    return new ViewModelModule_ProvideDeleteAccountInteractFactory(module, accountRepositoryProvider);
  }

  public static DeleteWalletInteract provideDeleteAccountInteract(ViewModelModule instance,
      WalletRepositoryType accountRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideDeleteAccountInteract(accountRepository));
  }
}
