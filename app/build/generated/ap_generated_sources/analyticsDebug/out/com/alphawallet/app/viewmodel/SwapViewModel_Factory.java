package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.repository.SwapRepositoryType;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.SwapService;
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
public final class SwapViewModel_Factory implements Factory<SwapViewModel> {
  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<SwapRepositoryType> swapRepositoryProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<SwapService> swapServiceProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public SwapViewModel_Factory(Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<SwapRepositoryType> swapRepositoryProvider,
      Provider<TokensService> tokensServiceProvider, Provider<SwapService> swapServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.swapRepositoryProvider = swapRepositoryProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.swapServiceProvider = swapServiceProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public SwapViewModel get() {
    return newInstance(assetDefinitionServiceProvider.get(), preferenceRepositoryProvider.get(), swapRepositoryProvider.get(), tokensServiceProvider.get(), swapServiceProvider.get(), createTransactionInteractProvider.get(), keyServiceProvider.get(), analyticsServiceProvider.get());
  }

  public static SwapViewModel_Factory create(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<SwapRepositoryType> swapRepositoryProvider,
      Provider<TokensService> tokensServiceProvider, Provider<SwapService> swapServiceProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new SwapViewModel_Factory(assetDefinitionServiceProvider, preferenceRepositoryProvider, swapRepositoryProvider, tokensServiceProvider, swapServiceProvider, createTransactionInteractProvider, keyServiceProvider, analyticsServiceProvider);
  }

  public static SwapViewModel newInstance(AssetDefinitionService assetDefinitionService,
      PreferenceRepositoryType preferenceRepository, SwapRepositoryType swapRepository,
      TokensService tokensService, SwapService swapService,
      CreateTransactionInteract createTransactionInteract, KeyService keyService,
      AnalyticsServiceType analyticsService) {
    return new SwapViewModel(assetDefinitionService, preferenceRepository, swapRepository, tokensService, swapService, createTransactionInteract, keyService, analyticsService);
  }
}
