package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.interact.WalletConnectInteract;
import com.alphawallet.app.walletconnect.AWWalletConnectClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ToolsModule_ProvideAWWalletConnectClientFactory implements Factory<AWWalletConnectClient> {
  private final ToolsModule module;

  private final Provider<Context> contextProvider;

  private final Provider<WalletConnectInteract> walletConnectInteractProvider;

  public ToolsModule_ProvideAWWalletConnectClientFactory(ToolsModule module,
      Provider<Context> contextProvider,
      Provider<WalletConnectInteract> walletConnectInteractProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.walletConnectInteractProvider = walletConnectInteractProvider;
  }

  @Override
  public AWWalletConnectClient get() {
    return provideAWWalletConnectClient(module, contextProvider.get(), walletConnectInteractProvider.get());
  }

  public static ToolsModule_ProvideAWWalletConnectClientFactory create(ToolsModule module,
      Provider<Context> contextProvider,
      Provider<WalletConnectInteract> walletConnectInteractProvider) {
    return new ToolsModule_ProvideAWWalletConnectClientFactory(module, contextProvider, walletConnectInteractProvider);
  }

  public static AWWalletConnectClient provideAWWalletConnectClient(ToolsModule instance,
      Context context, WalletConnectInteract walletConnectInteract) {
    return Preconditions.checkNotNullFromProvides(instance.provideAWWalletConnectClient(context, walletConnectInteract));
  }
}
