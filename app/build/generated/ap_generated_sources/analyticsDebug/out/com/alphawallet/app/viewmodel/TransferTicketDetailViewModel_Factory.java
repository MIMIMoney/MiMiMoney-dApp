package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
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
public final class TransferTicketDetailViewModel_Factory implements Factory<TransferTicketDetailViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<GasService> gasServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  public TransferTicketDetailViewModel_Factory(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<GasService> gasServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.gasServiceProvider = gasServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
  }

  @Override
  public TransferTicketDetailViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), keyServiceProvider.get(), createTransactionInteractProvider.get(), fetchTransactionsInteractProvider.get(), assetDefinitionServiceProvider.get(), gasServiceProvider.get(), analyticsServiceProvider.get(), tokensServiceProvider.get());
  }

  public static TransferTicketDetailViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<GasService> gasServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider,
      Provider<TokensService> tokensServiceProvider) {
    return new TransferTicketDetailViewModel_Factory(genericWalletInteractProvider, keyServiceProvider, createTransactionInteractProvider, fetchTransactionsInteractProvider, assetDefinitionServiceProvider, gasServiceProvider, analyticsServiceProvider, tokensServiceProvider);
  }

  public static TransferTicketDetailViewModel newInstance(
      GenericWalletInteract genericWalletInteract, KeyService keyService,
      CreateTransactionInteract createTransactionInteract,
      FetchTransactionsInteract fetchTransactionsInteract,
      AssetDefinitionService assetDefinitionService, GasService gasService,
      AnalyticsServiceType analyticsService, TokensService tokensService) {
    return new TransferTicketDetailViewModel(genericWalletInteract, keyService, createTransactionInteract, fetchTransactionsInteract, assetDefinitionService, gasService, analyticsService, tokensService);
  }
}
