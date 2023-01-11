package com.alphawallet.app.di;

import com.alphawallet.app.repository.CoinbasePayRepositoryType;
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
public final class RepositoriesModule_ProvideCoinbasePayRepositoryFactory implements Factory<CoinbasePayRepositoryType> {
  private final RepositoriesModule module;

  public RepositoriesModule_ProvideCoinbasePayRepositoryFactory(RepositoriesModule module) {
    this.module = module;
  }

  @Override
  public CoinbasePayRepositoryType get() {
    return provideCoinbasePayRepository(module);
  }

  public static RepositoriesModule_ProvideCoinbasePayRepositoryFactory create(
      RepositoriesModule module) {
    return new RepositoriesModule_ProvideCoinbasePayRepositoryFactory(module);
  }

  public static CoinbasePayRepositoryType provideCoinbasePayRepository(
      RepositoriesModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCoinbasePayRepository());
  }
}
