package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.DeleteWalletInteract;
import com.alphawallet.app.interact.ExportWalletInteract;
import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.router.HomeRouter;
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
public final class WalletActionsViewModel_Factory implements Factory<WalletActionsViewModel> {
  private final Provider<HomeRouter> homeRouterProvider;

  private final Provider<DeleteWalletInteract> deleteWalletInteractProvider;

  private final Provider<ExportWalletInteract> exportWalletInteractProvider;

  private final Provider<FetchWalletsInteract> fetchWalletsInteractProvider;

  public WalletActionsViewModel_Factory(Provider<HomeRouter> homeRouterProvider,
      Provider<DeleteWalletInteract> deleteWalletInteractProvider,
      Provider<ExportWalletInteract> exportWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider) {
    this.homeRouterProvider = homeRouterProvider;
    this.deleteWalletInteractProvider = deleteWalletInteractProvider;
    this.exportWalletInteractProvider = exportWalletInteractProvider;
    this.fetchWalletsInteractProvider = fetchWalletsInteractProvider;
  }

  @Override
  public WalletActionsViewModel get() {
    return newInstance(homeRouterProvider.get(), deleteWalletInteractProvider.get(), exportWalletInteractProvider.get(), fetchWalletsInteractProvider.get());
  }

  public static WalletActionsViewModel_Factory create(Provider<HomeRouter> homeRouterProvider,
      Provider<DeleteWalletInteract> deleteWalletInteractProvider,
      Provider<ExportWalletInteract> exportWalletInteractProvider,
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider) {
    return new WalletActionsViewModel_Factory(homeRouterProvider, deleteWalletInteractProvider, exportWalletInteractProvider, fetchWalletsInteractProvider);
  }

  public static WalletActionsViewModel newInstance(HomeRouter homeRouter,
      DeleteWalletInteract deleteWalletInteract, ExportWalletInteract exportWalletInteract,
      FetchWalletsInteract fetchWalletsInteract) {
    return new WalletActionsViewModel(homeRouter, deleteWalletInteract, exportWalletInteract, fetchWalletsInteract);
  }
}
