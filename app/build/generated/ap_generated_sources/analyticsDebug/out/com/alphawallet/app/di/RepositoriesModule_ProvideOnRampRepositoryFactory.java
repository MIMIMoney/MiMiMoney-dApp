package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.repository.OnRampRepositoryType;
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
public final class RepositoriesModule_ProvideOnRampRepositoryFactory implements Factory<OnRampRepositoryType> {
  private final RepositoriesModule module;

  private final Provider<Context> contextProvider;

  public RepositoriesModule_ProvideOnRampRepositoryFactory(RepositoriesModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public OnRampRepositoryType get() {
    return provideOnRampRepository(module, contextProvider.get());
  }

  public static RepositoriesModule_ProvideOnRampRepositoryFactory create(RepositoriesModule module,
      Provider<Context> contextProvider) {
    return new RepositoriesModule_ProvideOnRampRepositoryFactory(module, contextProvider);
  }

  public static OnRampRepositoryType provideOnRampRepository(RepositoriesModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideOnRampRepository(context));
  }
}
