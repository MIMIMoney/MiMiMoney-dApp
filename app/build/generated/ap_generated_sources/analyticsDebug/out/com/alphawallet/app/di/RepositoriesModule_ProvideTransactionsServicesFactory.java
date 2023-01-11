package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.TransactionLocalSource;
import com.alphawallet.app.service.TokensService;
import com.alphawallet.app.service.TransactionsNetworkClientType;
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
public final class RepositoriesModule_ProvideTransactionsServicesFactory implements Factory<TransactionsService> {
  private final RepositoriesModule module;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider;

  private final Provider<TransactionsNetworkClientType> transactionsNetworkClientTypeProvider;

  private final Provider<TransactionLocalSource> transactionLocalSourceProvider;

  public RepositoriesModule_ProvideTransactionsServicesFactory(RepositoriesModule module,
      Provider<TokensService> tokensServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TransactionsNetworkClientType> transactionsNetworkClientTypeProvider,
      Provider<TransactionLocalSource> transactionLocalSourceProvider) {
    this.module = module;
    this.tokensServiceProvider = tokensServiceProvider;
    this.ethereumNetworkRepositoryTypeProvider = ethereumNetworkRepositoryTypeProvider;
    this.transactionsNetworkClientTypeProvider = transactionsNetworkClientTypeProvider;
    this.transactionLocalSourceProvider = transactionLocalSourceProvider;
  }

  @Override
  public TransactionsService get() {
    return provideTransactionsServices(module, tokensServiceProvider.get(), ethereumNetworkRepositoryTypeProvider.get(), transactionsNetworkClientTypeProvider.get(), transactionLocalSourceProvider.get());
  }

  public static RepositoriesModule_ProvideTransactionsServicesFactory create(
      RepositoriesModule module, Provider<TokensService> tokensServiceProvider,
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider,
      Provider<TransactionsNetworkClientType> transactionsNetworkClientTypeProvider,
      Provider<TransactionLocalSource> transactionLocalSourceProvider) {
    return new RepositoriesModule_ProvideTransactionsServicesFactory(module, tokensServiceProvider, ethereumNetworkRepositoryTypeProvider, transactionsNetworkClientTypeProvider, transactionLocalSourceProvider);
  }

  public static TransactionsService provideTransactionsServices(RepositoriesModule instance,
      TokensService tokensService, EthereumNetworkRepositoryType ethereumNetworkRepositoryType,
      TransactionsNetworkClientType transactionsNetworkClientType,
      TransactionLocalSource transactionLocalSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideTransactionsServices(tokensService, ethereumNetworkRepositoryType, transactionsNetworkClientType, transactionLocalSource));
  }
}
