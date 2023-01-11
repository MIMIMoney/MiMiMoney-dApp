package com.alphawallet.app.di;

import com.alphawallet.app.interact.ExportWalletInteract;
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
public final class ViewModelModule_ProvideExportWalletInteractFactory implements Factory<ExportWalletInteract> {
  private final ViewModelModule module;

  private final Provider<WalletRepositoryType> walletRepositoryProvider;

  public ViewModelModule_ProvideExportWalletInteractFactory(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    this.module = module;
    this.walletRepositoryProvider = walletRepositoryProvider;
  }

  @Override
  public ExportWalletInteract get() {
    return provideExportWalletInteract(module, walletRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideExportWalletInteractFactory create(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    return new ViewModelModule_ProvideExportWalletInteractFactory(module, walletRepositoryProvider);
  }

  public static ExportWalletInteract provideExportWalletInteract(ViewModelModule instance,
      WalletRepositoryType walletRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideExportWalletInteract(walletRepository));
  }
}
