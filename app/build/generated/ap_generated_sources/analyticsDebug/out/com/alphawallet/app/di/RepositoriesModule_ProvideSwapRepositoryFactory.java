package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.repository.SwapRepositoryType;
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
public final class RepositoriesModule_ProvideSwapRepositoryFactory implements Factory<SwapRepositoryType> {
  private final RepositoriesModule module;

  private final Provider<Context> contextProvider;

  public RepositoriesModule_ProvideSwapRepositoryFactory(RepositoriesModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SwapRepositoryType get() {
    return provideSwapRepository(module, contextProvider.get());
  }

  public static RepositoriesModule_ProvideSwapRepositoryFactory create(RepositoriesModule module,
      Provider<Context> contextProvider) {
    return new RepositoriesModule_ProvideSwapRepositoryFactory(module, contextProvider);
  }

  public static SwapRepositoryType provideSwapRepository(RepositoriesModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideSwapRepository(context));
  }
}
