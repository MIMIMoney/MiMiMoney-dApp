package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.service.AssetDefinitionService;
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
public final class AdvancedSettingsViewModel_Factory implements Factory<AdvancedSettingsViewModel> {
  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<TransactionsService> transactionsServiceProvider;

  public AdvancedSettingsViewModel_Factory(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<TransactionsService> transactionsServiceProvider) {
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.transactionsServiceProvider = transactionsServiceProvider;
  }

  @Override
  public AdvancedSettingsViewModel get() {
    return newInstance(assetDefinitionServiceProvider.get(), preferenceRepositoryProvider.get(), transactionsServiceProvider.get());
  }

  public static AdvancedSettingsViewModel_Factory create(
      Provider<AssetDefinitionService> assetDefinitionServiceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<TransactionsService> transactionsServiceProvider) {
    return new AdvancedSettingsViewModel_Factory(assetDefinitionServiceProvider, preferenceRepositoryProvider, transactionsServiceProvider);
  }

  public static AdvancedSettingsViewModel newInstance(AssetDefinitionService assetDefinitionService,
      PreferenceRepositoryType preferenceRepository, TransactionsService transactionsService) {
    return new AdvancedSettingsViewModel(assetDefinitionService, preferenceRepository, transactionsService);
  }
}
