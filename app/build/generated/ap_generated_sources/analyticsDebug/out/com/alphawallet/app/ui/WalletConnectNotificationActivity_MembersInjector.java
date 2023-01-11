package com.alphawallet.app.ui;

import com.alphawallet.app.interact.WalletConnectInteract;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class WalletConnectNotificationActivity_MembersInjector implements MembersInjector<WalletConnectNotificationActivity> {
  private final Provider<WalletConnectInteract> walletConnectInteractProvider;

  public WalletConnectNotificationActivity_MembersInjector(
      Provider<WalletConnectInteract> walletConnectInteractProvider) {
    this.walletConnectInteractProvider = walletConnectInteractProvider;
  }

  public static MembersInjector<WalletConnectNotificationActivity> create(
      Provider<WalletConnectInteract> walletConnectInteractProvider) {
    return new WalletConnectNotificationActivity_MembersInjector(walletConnectInteractProvider);
  }

  @Override
  public void injectMembers(WalletConnectNotificationActivity instance) {
    injectWalletConnectInteract(instance, walletConnectInteractProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.WalletConnectNotificationActivity.walletConnectInteract")
  public static void injectWalletConnectInteract(WalletConnectNotificationActivity instance,
      WalletConnectInteract walletConnectInteract) {
    instance.walletConnectInteract = walletConnectInteract;
  }
}
