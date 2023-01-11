package com.alphawallet.app.di;

import android.content.Context;
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
public final class RepositoriesModule_ProvidePreferenceRepositoryFactory implements Factory<PreferenceRepositoryType> {
  private final RepositoriesModule module;

  private final Provider<Context> contextProvider;

  public RepositoriesModule_ProvidePreferenceRepositoryFactory(RepositoriesModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceRepositoryType get() {
    return providePreferenceRepository(module, contextProvider.get());
  }

  public static RepositoriesModule_ProvidePreferenceRepositoryFactory create(
      RepositoriesModule module, Provider<Context> contextProvider) {
    return new RepositoriesModule_ProvidePreferenceRepositoryFactory(module, contextProvider);
  }

  public static PreferenceRepositoryType providePreferenceRepository(RepositoriesModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providePreferenceRepository(context));
  }
}
