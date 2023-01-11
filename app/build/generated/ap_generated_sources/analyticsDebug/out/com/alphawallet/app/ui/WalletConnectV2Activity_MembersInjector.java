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
public final class WalletConnectV2Activity_MembersInjector implements MembersInjector<WalletConnectV2Activity> {
  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public WalletConnectV2Activity_MembersInjector(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  public static MembersInjector<WalletConnectV2Activity> create(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new WalletConnectV2Activity_MembersInjector(awWalletConnectClientProvider);
  }

  @Override
  public void injectMembers(WalletConnectV2Activity instance) {
    injectAwWalletConnectClient(instance, awWalletConnectClientProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.WalletConnectV2Activity.awWalletConnectClient")
  public static void injectAwWalletConnectClient(WalletConnectV2Activity instance,
      AWWalletConnectClient awWalletConnectClient) {
    instance.awWalletConnectClient = awWalletConnectClient;
  }
}
