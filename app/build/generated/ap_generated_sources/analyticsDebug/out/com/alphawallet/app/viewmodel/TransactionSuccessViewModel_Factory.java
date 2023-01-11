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
public final class TransactionSuccessViewModel_Factory implements Factory<TransactionSuccessViewModel> {
  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  public TransactionSuccessViewModel_Factory(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public TransactionSuccessViewModel get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static TransactionSuccessViewModel_Factory create(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    return new TransactionSuccessViewModel_Factory(preferenceRepositoryProvider);
  }

  public static TransactionSuccessViewModel newInstance(
      PreferenceRepositoryType preferenceRepository) {
    return new TransactionSuccessViewModel(preferenceRepository);
  }
}
