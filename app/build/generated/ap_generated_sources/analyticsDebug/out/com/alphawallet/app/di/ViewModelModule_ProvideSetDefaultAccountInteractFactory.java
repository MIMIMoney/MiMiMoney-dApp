package com.alphawallet.app.di;

import com.alphawallet.app.interact.SetDefaultWalletInteract;
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
public final class ViewModelModule_ProvideSetDefaultAccountInteractFactory implements Factory<SetDefaultWalletInteract> {
  private final ViewModelModule module;

  private final Provider<WalletRepositoryType> accountRepositoryProvider;

  public ViewModelModule_ProvideSetDefaultAccountInteractFactory(ViewModelModule module,
      Provider<WalletRepositoryType> accountRepositoryProvider) {
    this.module = module;
    this.accountRepositoryProvider = accountRepositoryProvider;
  }

  @Override
  public SetDefaultWalletInteract get() {
    return provideSetDefaultAccountInteract(module, accountRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideSetDefaultAccountInteractFactory create(
      ViewModelModule module, Provider<WalletRepositoryType> accountRepositoryProvider) {
    return new ViewModelModule_ProvideSetDefaultAccountInteractFactory(module, accountRepositoryProvider);
  }

  public static SetDefaultWalletInteract provideSetDefaultAccountInteract(ViewModelModule instance,
      WalletRepositoryType accountRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideSetDefaultAccountInteract(accountRepository));
  }
}
