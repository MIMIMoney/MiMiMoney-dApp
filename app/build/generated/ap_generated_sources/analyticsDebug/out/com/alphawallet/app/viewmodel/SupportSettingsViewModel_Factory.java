package com.alphawallet.app.viewmodel;

import com.alphawallet.app.service.AnalyticsServiceType;
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
public final class SupportSettingsViewModel_Factory implements Factory<SupportSettingsViewModel> {
  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public SupportSettingsViewModel_Factory(Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public SupportSettingsViewModel get() {
    return newInstance(analyticsServiceProvider.get());
  }

  public static SupportSettingsViewModel_Factory create(
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new SupportSettingsViewModel_Factory(analyticsServiceProvider);
  }

  public static SupportSettingsViewModel newInstance(AnalyticsServiceType analyticsService) {
    return new SupportSettingsViewModel(analyticsService);
  }
}
