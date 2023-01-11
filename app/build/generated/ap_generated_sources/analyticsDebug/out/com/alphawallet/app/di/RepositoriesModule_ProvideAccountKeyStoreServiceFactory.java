package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.service.AccountKeystoreService;
import com.alphawallet.app.service.KeyService;
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
public final class RepositoriesModule_ProvideAccountKeyStoreServiceFactory implements Factory<AccountKeystoreService> {
  private final RepositoriesModule module;

  private final Provider<Context> contextProvider;

  private final Provider<KeyService> keyServiceProvider;

  public RepositoriesModule_ProvideAccountKeyStoreServiceFactory(RepositoriesModule module,
      Provider<Context> contextProvider, Provider<KeyService> keyServiceProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.keyServiceProvider = keyServiceProvider;
  }

  @Override
  public AccountKeystoreService get() {
    return provideAccountKeyStoreService(module, contextProvider.get(), keyServiceProvider.get());
  }

  public static RepositoriesModule_ProvideAccountKeyStoreServiceFactory create(
      RepositoriesModule module, Provider<Context> contextProvider,
      Provider<KeyService> keyServiceProvider) {
    return new RepositoriesModule_ProvideAccountKeyStoreServiceFactory(module, contextProvider, keyServiceProvider);
  }

  public static AccountKeystoreService provideAccountKeyStoreService(RepositoriesModule instance,
      Context context, KeyService keyService) {
    return Preconditions.checkNotNullFromProvides(instance.provideAccountKeyStoreService(context, keyService));
  }
}
