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
public final class WalletFragment_MembersInjector implements MembersInjector<WalletFragment> {
  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public WalletFragment_MembersInjector(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  public static MembersInjector<WalletFragment> create(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new WalletFragment_MembersInjector(awWalletConnectClientProvider);
  }

  @Override
  public void injectMembers(WalletFragment instance) {
    injectAwWalletConnectClient(instance, awWalletConnectClientProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.WalletFragment.awWalletConnectClient")
  public static void injectAwWalletConnectClient(WalletFragment instance,
      AWWalletConnectClient awWalletConnectClient) {
    instance.awWalletConnectClient = awWalletConnectClient;
  }
}
