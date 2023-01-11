package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.repository.SwapRepositoryType;
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
public final class SelectSwapProvidersViewModel_Factory implements Factory<SelectSwapProvidersViewModel> {
  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<SwapRepositoryType> swapRepositoryProvider;

  public SelectSwapProvidersViewModel_Factory(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<SwapRepositoryType> swapRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.swapRepositoryProvider = swapRepositoryProvider;
  }

  @Override
  public SelectSwapProvidersViewModel get() {
    return newInstance(preferenceRepositoryProvider.get(), swapRepositoryProvider.get());
  }

  public static SelectSwapProvidersViewModel_Factory create(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<SwapRepositoryType> swapRepositoryProvider) {
    return new SelectSwapProvidersViewModel_Factory(preferenceRepositoryProvider, swapRepositoryProvider);
  }

  public static SelectSwapProvidersViewModel newInstance(
      PreferenceRepositoryType preferenceRepository, SwapRepositoryType swapRepository) {
    return new SelectSwapProvidersViewModel(preferenceRepository, swapRepository);
  }
}
