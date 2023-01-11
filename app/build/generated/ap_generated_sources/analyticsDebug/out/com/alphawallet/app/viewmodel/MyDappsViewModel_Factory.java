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
public final class MyDappsViewModel_Factory implements Factory<MyDappsViewModel> {
  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public MyDappsViewModel_Factory(Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public MyDappsViewModel get() {
    return newInstance(analyticsServiceProvider.get());
  }

  public static MyDappsViewModel_Factory create(
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new MyDappsViewModel_Factory(analyticsServiceProvider);
  }

  public static MyDappsViewModel newInstance(AnalyticsServiceType analyticsService) {
    return new MyDappsViewModel(analyticsService);
  }
}
