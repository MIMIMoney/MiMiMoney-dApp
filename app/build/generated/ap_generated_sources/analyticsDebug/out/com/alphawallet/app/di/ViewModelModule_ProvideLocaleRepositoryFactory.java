package com.alphawallet.app.di;

import com.alphawallet.app.repository.LocaleRepositoryType;
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
public final class ViewModelModule_ProvideLocaleRepositoryFactory implements Factory<LocaleRepositoryType> {
  private final ViewModelModule module;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  public ViewModelModule_ProvideLocaleRepositoryFactory(ViewModelModule module,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    this.module = module;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public LocaleRepositoryType get() {
    return provideLocaleRepository(module, preferenceRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideLocaleRepositoryFactory create(ViewModelModule module,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    return new ViewModelModule_ProvideLocaleRepositoryFactory(module, preferenceRepositoryProvider);
  }

  public static LocaleRepositoryType provideLocaleRepository(ViewModelModule instance,
      PreferenceRepositoryType preferenceRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideLocaleRepository(preferenceRepository));
  }
}
