package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.interact.FindDefaultNetworkInteract;
import com.alphawallet.app.repository.TokenRepositoryType;
import com.alphawallet.app.router.ExternalBrowserRouter;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.GasService;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.TokensService;
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
public final class TransactionDetailViewModel_Factory implements Factory<TransactionDetailViewModel> {
  private final Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider;

  private final Provider<ExternalBrowserRouter> externalBrowserRouterProvider;

  private final Provider<TokenRepositoryType> tokenRepositoryProvider;

  private final Provider<TokensService> tokenServiceProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<GasService> gasServiceProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public TransactionDetailViewModel_Factory(
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<ExternalBrowserRouter> externalBrowserRouterProvider,
      Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<TokensService> tokenServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<KeyService> keyServiceProvider, Provider<GasService> gasServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.findDefaultNetworkInteractProvider = findDefaultNetworkInteractProvider;
    this.externalBrowserRouterProvider = externalBrowserRouterProvider;
    this.tokenRepositoryProvider = tokenRepositoryProvider;
    this.tokenServiceProvider = tokenServiceProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.gasServiceProvider = gasServiceProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public TransactionDetailViewModel get() {
    return newInstance(findDefaultNetworkInteractProvider.get(), externalBrowserRouterProvider.get(), tokenRepositoryProvider.get(), tokenServiceProvider.get(), fetchTransactionsInteractProvider.get(), keyServiceProvider.get(), gasServiceProvider.get(), createTransactionInteractProvider.get(), analyticsServiceProvider.get());
  }

  public static TransactionDetailViewModel_Factory create(
      Provider<FindDefaultNetworkInteract> findDefaultNetworkInteractProvider,
      Provider<ExternalBrowserRouter> externalBrowserRouterProvider,
      Provider<TokenRepositoryType> tokenRepositoryProvider,
      Provider<TokensService> tokenServiceProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<KeyService> keyServiceProvider, Provider<GasService> gasServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new TransactionDetailViewModel_Factory(findDefaultNetworkInteractProvider, externalBrowserRouterProvider, tokenRepositoryProvider, tokenServiceProvider, fetchTransactionsInteractProvider, keyServiceProvider, gasServiceProvider, createTransactionInteractProvider, analyticsServiceProvider);
  }

  public static TransactionDetailViewModel newInstance(
      FindDefaultNetworkInteract findDefaultNetworkInteract,
      ExternalBrowserRouter externalBrowserRouter, TokenRepositoryType tokenRepository,
      TokensService tokenService, FetchTransactionsInteract fetchTransactionsInteract,
      KeyService keyService, GasService gasService,
      CreateTransactionInteract createTransactionInteract, AnalyticsServiceType analyticsService) {
    return new TransactionDetailViewModel(findDefaultNetworkInteract, externalBrowserRouter, tokenRepository, tokenService, fetchTransactionsInteract, keyService, gasService, createTransactionInteract, analyticsService);
  }
}
