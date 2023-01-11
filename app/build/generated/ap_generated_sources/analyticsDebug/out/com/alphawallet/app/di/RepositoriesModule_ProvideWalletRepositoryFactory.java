package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.repository.WalletDataRealmSource;
import com.alphawallet.app.repository.WalletRepositoryType;
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
public final class RepositoriesModule_ProvideWalletRepositoryFactory implements Factory<WalletRepositoryType> {
  private final RepositoriesModule module;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryTypeProvider;

  private final Provider<AccountKeystoreService> accountKeystoreServiceProvider;

  private final Provider<EthereumNetworkRepositoryType> networkRepositoryProvider;

  private final Provider<WalletDataRealmSource> walletDataRealmSourceProvider;

  private final Provider<KeyService> keyServiceProvider;

  public RepositoriesModule_ProvideWalletRepositoryFactory(RepositoriesModule module,
      Provider<PreferenceRepositoryType> preferenceRepositoryTypeProvider,
      Provider<AccountKeystoreService> accountKeystoreServiceProvider,
      Provider<EthereumNetworkRepositoryType> networkRepositoryProvider,
      Provider<WalletDataRealmSource> walletDataRealmSourceProvider,
      Provider<KeyService> keyServiceProvider) {
    this.module = module;
    this.preferenceRepositoryTypeProvider = preferenceRepositoryTypeProvider;
    this.accountKeystoreServiceProvider = accountKeystoreServiceProvider;
    this.networkRepositoryProvider = networkRepositoryProvider;
    this.walletDataRealmSourceProvider = walletDataRealmSourceProvider;
    this.keyServiceProvider = keyServiceProvider;
  }

  @Override
  public WalletRepositoryType get() {
    return provideWalletRepository(module, preferenceRepositoryTypeProvider.get(), accountKeystoreServiceProvider.get(), networkRepositoryProvider.get(), walletDataRealmSourceProvider.get(), keyServiceProvider.get());
  }

  public static RepositoriesModule_ProvideWalletRepositoryFactory create(RepositoriesModule module,
      Provider<PreferenceRepositoryType> preferenceRepositoryTypeProvider,
      Provider<AccountKeystoreService> accountKeystoreServiceProvider,
      Provider<EthereumNetworkRepositoryType> networkRepositoryProvider,
      Provider<WalletDataRealmSource> walletDataRealmSourceProvider,
      Provider<KeyService> keyServiceProvider) {
    return new RepositoriesModule_ProvideWalletRepositoryFactory(module, preferenceRepositoryTypeProvider, accountKeystoreServiceProvider, networkRepositoryProvider, walletDataRealmSourceProvider, keyServiceProvider);
  }

  public static WalletRepositoryType provideWalletRepository(RepositoriesModule instance,
      PreferenceRepositoryType preferenceRepositoryType,
      AccountKeystoreService accountKeystoreService,
      EthereumNetworkRepositoryType networkRepository, WalletDataRealmSource walletDataRealmSource,
      KeyService keyService) {
    return Preconditions.checkNotNullFromProvides(instance.provideWalletRepository(preferenceRepositoryType, accountKeystoreService, networkRepository, walletDataRealmSource, keyService));
  }
}
