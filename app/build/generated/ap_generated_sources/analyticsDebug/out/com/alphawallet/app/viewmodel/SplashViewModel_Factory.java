package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.KeyService;
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
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<FetchWalletsInteract> fetchWalletsInteractProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public SplashViewModel_Factory(Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.fetchWalletsInteractProvider = fetchWalletsInteractProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(fetchWalletsInteractProvider.get(), preferenceRepositoryProvider.get(), keyServiceProvider.get(), analyticsServiceProvider.get());
  }

  public static SplashViewModel_Factory create(
      Provider<FetchWalletsInteract> fetchWalletsInteractProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new SplashViewModel_Factory(fetchWalletsInteractProvider, preferenceRepositoryProvider, keyServiceProvider, analyticsServiceProvider);
  }

  public static SplashViewModel newInstance(FetchWalletsInteract fetchWalletsInteract,
      PreferenceRepositoryType preferenceRepository, KeyService keyService,
      AnalyticsServiceType analyticsService) {
    return new SplashViewModel(fetchWalletsInteract, preferenceRepository, keyService, analyticsService);
  }
}
