package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.RealmManager;
import com.alphawallet.app.service.TokensService;
import com.alphawallet.app.service.TransactionsService;
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
public final class ActivityViewModel_Factory implements Factory<ActivityViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<TransactionsService> transactionsServiceProvider;

  private final Provider<RealmManager> realmManagerProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public ActivityViewModel_Factory(Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<TransactionsService> transactionsServiceProvider,
      Provider<RealmManager> realmManagerProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.fetchTransactionsInteractProvider = fetchTransactionsInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.transactionsServiceProvider = transactionsServiceProvider;
    this.realmManagerProvider = realmManagerProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public ActivityViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), fetchTransactionsInteractProvider.get(), assetDefinitionServiceProvider.get(), tokensServiceProvider.get(), transactionsServiceProvider.get(), realmManagerProvider.get(), analyticsServiceProvider.get());
  }

  public static ActivityViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<FetchTransactionsInteract> fetchTransactionsInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<TransactionsService> transactionsServiceProvider,
      Provider<RealmManager> realmManagerProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new ActivityViewModel_Factory(genericWalletInteractProvider, fetchTransactionsInteractProvider, assetDefinitionServiceProvider, tokensServiceProvider, transactionsServiceProvider, realmManagerProvider, analyticsServiceProvider);
  }

  public static ActivityViewModel newInstance(GenericWalletInteract genericWalletInteract,
      FetchTransactionsInteract fetchTransactionsInteract,
      AssetDefinitionService assetDefinitionService, TokensService tokensService,
      TransactionsService transactionsService, RealmManager realmManager,
      AnalyticsServiceType analyticsService) {
    return new ActivityViewModel(genericWalletInteract, fetchTransactionsInteract, assetDefinitionService, tokensService, transactionsService, realmManager, analyticsService);
  }
}
