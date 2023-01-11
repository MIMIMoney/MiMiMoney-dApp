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
public final class BrowserHistoryViewModel_Factory implements Factory<BrowserHistoryViewModel> {
  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public BrowserHistoryViewModel_Factory(Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public BrowserHistoryViewModel get() {
    return newInstance(analyticsServiceProvider.get());
  }

  public static BrowserHistoryViewModel_Factory create(
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new BrowserHistoryViewModel_Factory(analyticsServiceProvider);
  }

  public static BrowserHistoryViewModel newInstance(AnalyticsServiceType analyticsService) {
    return new BrowserHistoryViewModel(analyticsService);
  }
}
