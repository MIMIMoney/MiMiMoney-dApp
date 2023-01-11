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
public final class WalletConnectActivity_MembersInjector implements MembersInjector<WalletConnectActivity> {
  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public WalletConnectActivity_MembersInjector(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  public static MembersInjector<WalletConnectActivity> create(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new WalletConnectActivity_MembersInjector(awWalletConnectClientProvider);
  }

  @Override
  public void injectMembers(WalletConnectActivity instance) {
    injectAwWalletConnectClient(instance, awWalletConnectClientProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.WalletConnectActivity.awWalletConnectClient")
  public static void injectAwWalletConnectClient(WalletConnectActivity instance,
      AWWalletConnectClient awWalletConnectClient) {
    instance.awWalletConnectClient = awWalletConnectClient;
  }
}
