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
public final class AddEditDappViewModel_Factory implements Factory<AddEditDappViewModel> {
  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public AddEditDappViewModel_Factory(Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public AddEditDappViewModel get() {
    return newInstance(analyticsServiceProvider.get());
  }

  public static AddEditDappViewModel_Factory create(
      Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new AddEditDappViewModel_Factory(analyticsServiceProvider);
  }

  public static AddEditDappViewModel newInstance(AnalyticsServiceType analyticsService) {
    return new AddEditDappViewModel(analyticsService);
  }
}
