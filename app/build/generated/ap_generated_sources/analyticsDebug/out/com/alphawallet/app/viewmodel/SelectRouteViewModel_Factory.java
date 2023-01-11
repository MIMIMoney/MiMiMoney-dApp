package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.service.SwapService;
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
public final class SelectRouteViewModel_Factory implements Factory<SelectRouteViewModel> {
  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<SwapService> swapServiceProvider;

  public SelectRouteViewModel_Factory(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<SwapService> swapServiceProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.swapServiceProvider = swapServiceProvider;
  }

  @Override
  public SelectRouteViewModel get() {
    return newInstance(preferenceRepositoryProvider.get(), swapServiceProvider.get());
  }

  public static SelectRouteViewModel_Factory create(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<SwapService> swapServiceProvider) {
    return new SelectRouteViewModel_Factory(preferenceRepositoryProvider, swapServiceProvider);
  }

  public static SelectRouteViewModel newInstance(PreferenceRepositoryType preferenceRepository,
      SwapService swapService) {
    return new SelectRouteViewModel(preferenceRepository, swapService);
  }
}
