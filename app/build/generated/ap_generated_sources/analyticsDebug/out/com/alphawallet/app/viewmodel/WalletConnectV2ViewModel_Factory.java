package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
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
public final class WalletConnectV2ViewModel_Factory implements Factory<WalletConnectV2ViewModel> {
  private final Provider<FetchWalletsInteract> fetchWalletsInteractProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  public WalletConnectV2ViewModel_Factory(
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider) {
    this.fetchWalletsInteractProvider = fetchWalletsInteractProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
  }

  @Override
  public WalletConnectV2ViewModel get() {
    return newInstance(fetchWalletsInteractProvider.get(), genericWalletInteractProvider.get());
  }

  public static WalletConnectV2ViewModel_Factory create(
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider) {
    return new WalletConnectV2ViewModel_Factory(fetchWalletsInteractProvider, genericWalletInteractProvider);
  }

  public static WalletConnectV2ViewModel newInstance(FetchWalletsInteract fetchWalletsInteract,
      GenericWalletInteract genericWalletInteract) {
    return new WalletConnectV2ViewModel(fetchWalletsInteract, genericWalletInteract);
  }
}
