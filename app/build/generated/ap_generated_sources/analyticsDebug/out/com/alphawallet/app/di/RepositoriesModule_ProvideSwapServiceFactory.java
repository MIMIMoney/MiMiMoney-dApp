package com.alphawallet.app.di;

import com.alphawallet.app.service.SwapService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoriesModule_ProvideSwapServiceFactory implements Factory<SwapService> {
  private final RepositoriesModule module;

  public RepositoriesModule_ProvideSwapServiceFactory(RepositoriesModule module) {
    this.module = module;
  }

  @Override
  public SwapService get() {
    return provideSwapService(module);
  }

  public static RepositoriesModule_ProvideSwapServiceFactory create(RepositoriesModule module) {
    return new RepositoriesModule_ProvideSwapServiceFactory(module);
  }

  public static SwapService provideSwapService(RepositoriesModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSwapService());
  }
}
