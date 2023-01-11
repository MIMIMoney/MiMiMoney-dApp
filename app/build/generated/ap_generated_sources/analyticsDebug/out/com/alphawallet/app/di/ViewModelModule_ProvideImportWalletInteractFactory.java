package com.alphawallet.app.di;

import com.alphawallet.app.interact.ImportWalletInteract;
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
public final class ViewModelModule_ProvideImportWalletInteractFactory implements Factory<ImportWalletInteract> {
  private final ViewModelModule module;

  private final Provider<WalletRepositoryType> walletRepositoryProvider;

  public ViewModelModule_ProvideImportWalletInteractFactory(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    this.module = module;
    this.walletRepositoryProvider = walletRepositoryProvider;
  }

  @Override
  public ImportWalletInteract get() {
    return provideImportWalletInteract(module, walletRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideImportWalletInteractFactory create(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    return new ViewModelModule_ProvideImportWalletInteractFactory(module, walletRepositoryProvider);
  }

  public static ImportWalletInteract provideImportWalletInteract(ViewModelModule instance,
      WalletRepositoryType walletRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideImportWalletInteract(walletRepository));
  }
}
