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
public final class QrScannerViewModel_Factory implements Factory<QrScannerViewModel> {
  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public QrScannerViewModel_Factory(Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public QrScannerViewModel get() {
    return newInstance(analyticsServiceProvider.get());
  }

  public static QrScannerViewModel_Factory create(
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new QrScannerViewModel_Factory(analyticsServiceProvider);
  }

  public static QrScannerViewModel newInstance(AnalyticsServiceType analyticsService) {
    return new QrScannerViewModel(analyticsService);
  }
}
