package com.alphawallet.app;

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
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<AWWalletConnectClient> awWalletConnectClientProvider;

  public App_MembersInjector(Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    this.awWalletConnectClientProvider = awWalletConnectClientProvider;
  }

  public static MembersInjector<App> create(
      Provider<AWWalletConnectClient> awWalletConnectClientProvider) {
    return new App_MembersInjector(awWalletConnectClientProvider);
  }

  @Override
  public void injectMembers(App instance) {
    injectAwWalletConnectClient(instance, awWalletConnectClientProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.App.awWalletConnectClient")
  public static void injectAwWalletConnectClient(App instance,
      AWWalletConnectClient awWalletConnectClient) {
    instance.awWalletConnectClient = awWalletConnectClient;
  }
}
