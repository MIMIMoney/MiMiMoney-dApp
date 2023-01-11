package com.alphawallet.app.di;

import com.alphawallet.app.service.OpenSeaService;
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
public final class RepositoriesModule_ProvideOpenseaServiceFactory implements Factory<OpenSeaService> {
  private final RepositoriesModule module;

  public RepositoriesModule_ProvideOpenseaServiceFactory(RepositoriesModule module) {
    this.module = module;
  }

  @Override
  public OpenSeaService get() {
    return provideOpenseaService(module);
  }

  public static RepositoriesModule_ProvideOpenseaServiceFactory create(RepositoriesModule module) {
    return new RepositoriesModule_ProvideOpenseaServiceFactory(module);
  }

  public static OpenSeaService provideOpenseaService(RepositoriesModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideOpenseaService());
  }
}
