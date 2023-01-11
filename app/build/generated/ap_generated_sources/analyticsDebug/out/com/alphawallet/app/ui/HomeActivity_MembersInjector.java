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
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public HomeActivity_MembersInjector(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  public static MembersInjector<HomeActivity> create(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new HomeActivity_MembersInjector(awWalletConnectClientProvider);
  }

  @Override
  public void injectMembers(HomeActivity instance) {
    injectAwWalletConnectClient(instance, awWalletConnectClientProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.HomeActivity.awWalletConnectClient")
  public static void injectAwWalletConnectClient(HomeActivity instance,
      AWWalletConnectClient awWalletConnectClient) {
    instance.awWalletConnectClient = awWalletConnectClient;
  }
}
