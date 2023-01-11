package com.alphawallet.app.interact;

import com.alphawallet.app.service.RealmManager;
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
public final class WalletConnectInteract_Factory implements Factory<WalletConnectInteract> {
  private final Provider<RealmManager> realmManagerProvider;

  public WalletConnectInteract_Factory(Provider<RealmManager> realmManagerProvider) {
    this.realmManagerProvider = realmManagerProvider;
  }

  @Override
  public WalletConnectInteract get() {
    return newInstance(realmManagerProvider.get());
  }

  public static WalletConnectInteract_Factory create(Provider<RealmManager> realmManagerProvider) {
    return new WalletConnectInteract_Factory(realmManagerProvider);
  }

  public static WalletConnectInteract newInstance(RealmManager realmManager) {
    return new WalletConnectInteract(realmManager);
  }
}
