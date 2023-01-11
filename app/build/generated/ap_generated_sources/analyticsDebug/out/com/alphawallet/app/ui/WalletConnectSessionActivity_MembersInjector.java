package com.alphawallet.app.ui;

import com.alphawallet.app.walletconnect.AWWalletConnectClient;
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
public final class WalletConnectSessionActivity_MembersInjector implements MembersInjector<WalletConnectSessionActivity> {
  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public WalletConnectSessionActivity_MembersInjector(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  public static MembersInjector<WalletConnectSessionActivity> create(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new WalletConnectSessionActivity_MembersInjector(awWalletConnectClientProvider);
  }

  @Override
  public void injectMembers(WalletConnectSessionActivity instance) {
    injectAwWalletConnectClient(instance, awWalletConnectClientProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.WalletConnectSessionActivity.awWalletConnectClient")
  public static void injectAwWalletConnectClient(WalletConnectSessionActivity instance,
      AWWalletConnectClient awWalletConnectClient) {
    instance.awWalletConnectClient = awWalletConnectClient;
  }
}
