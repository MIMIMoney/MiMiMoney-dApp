package com.alphawallet.app.di;

import com.alphawallet.app.interact.FetchWalletsInteract;
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
public final class ViewModelModule_ProvideFetchWalletInteractFactory implements Factory<FetchWalletsInteract> {
  private final ViewModelModule module;

  private final Provider<WalletRepositoryType> walletRepositoryProvider;

  public ViewModelModule_ProvideFetchWalletInteractFactory(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    this.module = module;
    this.walletRepositoryProvider = walletRepositoryProvider;
  }

  @Override
  public FetchWalletsInteract get() {
    return provideFetchWalletInteract(module, walletRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideFetchWalletInteractFactory create(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    return new ViewModelModule_ProvideFetchWalletInteractFactory(module, walletRepositoryProvider);
  }

  public static FetchWalletsInteract provideFetchWalletInteract(ViewModelModule instance,
      WalletRepositoryType walletRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideFetchWalletInteract(walletRepository));
  }
}
