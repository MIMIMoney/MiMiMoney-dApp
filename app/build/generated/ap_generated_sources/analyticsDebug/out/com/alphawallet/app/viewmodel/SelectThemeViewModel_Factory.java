package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.PreferenceRepositoryType;
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
public final class SelectThemeViewModel_Factory implements Factory<SelectThemeViewModel> {
  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  public SelectThemeViewModel_Factory(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SelectThemeViewModel get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static SelectThemeViewModel_Factory create(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    return new SelectThemeViewModel_Factory(preferenceRepositoryProvider);
  }

  public static SelectThemeViewModel newInstance(PreferenceRepositoryType preferenceRepository) {
    return new SelectThemeViewModel(preferenceRepository);
  }
}
