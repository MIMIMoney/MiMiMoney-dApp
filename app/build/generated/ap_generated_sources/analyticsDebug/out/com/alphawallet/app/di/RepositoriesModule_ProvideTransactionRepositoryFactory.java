package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.TransactionLocalSource;
import com.alphawallet.app.repository.TransactionRepositoryType;
import com.alphawallet.app.service.AccountKeystoreService;
import com.alphawallet.app.service.TransactionsService;
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
public final class RepositoriesModule_ProvideTransactionRepositoryFactory implements Factory<TransactionRepositoryType> {
  private final RepositoriesModule module;

  private final Provider<EthereumNetworkRepositoryType> networkRepositoryProvider;

  private final Provider<AccountKeystoreService> accountKeystoreServiceProvider;

  private final Provider<TransactionLocalSource> inDiskCacheProvider;

  private final Provider<TransactionsService> transactionsServiceProvider;

  public RepositoriesModule_ProvideTransactionRepositoryFactory(RepositoriesModule module,
      Provider<EthereumNetworkRepositoryType> networkRepositoryProvider,
      Provider<AccountKeystoreService> accountKeystoreServiceProvider,
      Provider<TransactionLocalSource> inDiskCacheProvider,
      Provider<TransactionsService> transactionsServiceProvider) {
    this.module = module;
    this.networkRepositoryProvider = networkRepositoryProvider;
    this.accountKeystoreServiceProvider = accountKeystoreServiceProvider;
    this.inDiskCacheProvider = inDiskCacheProvider;
    this.transactionsServiceProvider = transactionsServiceProvider;
  }

  @Override
  public TransactionRepositoryType get() {
    return provideTransactionRepository(module, networkRepositoryProvider.get(), accountKeystoreServiceProvider.get(), inDiskCacheProvider.get(), transactionsServiceProvider.get());
  }

  public static RepositoriesModule_ProvideTransactionRepositoryFactory create(
      RepositoriesModule module, Provider<EthereumNetworkRepositoryType> networkRepositoryProvider,
      Provider<AccountKeystoreService> accountKeystoreServiceProvider,
      Provider<TransactionLocalSource> inDiskCacheProvider,
      Provider<TransactionsService> transactionsServiceProvider) {
    return new RepositoriesModule_ProvideTransactionRepositoryFactory(module, networkRepositoryProvider, accountKeystoreServiceProvider, inDiskCacheProvider, transactionsServiceProvider);
  }

  public static TransactionRepositoryType provideTransactionRepository(RepositoriesModule instance,
      EthereumNetworkRepositoryType networkRepository,
      AccountKeystoreService accountKeystoreService, TransactionLocalSource inDiskCache,
      TransactionsService transactionsService) {
    return Preconditions.checkNotNullFromProvides(instance.provideTransactionRepository(networkRepository, accountKeystoreService, inDiskCache, transactionsService));
  }
}
