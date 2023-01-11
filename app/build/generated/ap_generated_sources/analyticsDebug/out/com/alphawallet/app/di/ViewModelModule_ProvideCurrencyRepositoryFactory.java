package com.alphawallet.app.di;

import com.alphawallet.app.repository.CurrencyRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ViewModelModule_ProvideCurrencyRepositoryFactory implements Factory<CurrencyRepositoryType> {
  private final ViewModelModule module;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  public ViewModelModule_ProvideCurrencyRepositoryFactory(ViewModelModule module,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    this.module = module;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public CurrencyRepositoryType get() {
    return provideCurrencyRepository(module, preferenceRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideCurrencyRepositoryFactory create(ViewModelModule module,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    return new ViewModelModule_ProvideCurrencyRepositoryFactory(module, preferenceRepositoryProvider);
  }

  public static CurrencyRepositoryType provideCurrencyRepository(ViewModelModule instance,
      PreferenceRepositoryType preferenceRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideCurrencyRepository(preferenceRepository));
  }
}
