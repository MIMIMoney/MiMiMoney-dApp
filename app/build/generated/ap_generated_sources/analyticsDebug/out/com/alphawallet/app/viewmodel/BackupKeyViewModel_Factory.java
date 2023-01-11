package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.ExportWalletInteract;
import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.service.KeyService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class BackupKeyViewModel_Factory implements Factory<BackupKeyViewModel> {
  private final Provider<KeyService> keyServiceProvider;

  private final Provider<ExportWalletInteract> exportWalletInteractProvider;

  private final Provider<FetchWalletsInteract> fetchWalletsInteractProvider;

  public BackupKeyViewModel_Factory(Provider<KeyService> keyServiceProvider,
      Provider<ExportWalletInteract> exportWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider) {
    this.keyServiceProvider = keyServiceProvider;
    this.exportWalletInteractProvider = exportWalletInteractProvider;
    this.fetchWalletsInteractProvider = fetchWalletsInteractProvider;
  }

  @Override
  public BackupKeyViewModel get() {
    return newInstance(keyServiceProvider.get(), exportWalletInteractProvider.get(), fetchWalletsInteractProvider.get());
  }

  public static BackupKeyViewModel_Factory create(Provider<KeyService> keyServiceProvider,
      Provider<ExportWalletInteract> exportWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider) {
    return new BackupKeyViewModel_Factory(keyServiceProvider, exportWalletInteractProvider, fetchWalletsInteractProvider);
  }

  public static BackupKeyViewModel newInstance(KeyService keyService,
      ExportWalletInteract exportWalletInteract, FetchWalletsInteract fetchWalletsInteract) {
    return new BackupKeyViewModel(keyService, exportWalletInteract, fetchWalletsInteract);
  }
}
