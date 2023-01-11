package com.alphawallet.app.di;

import com.alphawallet.app.router.CoinbasePayRouter;
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
public final class ViewModelModule_ProvideCoinbasePayRouterFactory implements Factory<CoinbasePayRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideCoinbasePayRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public CoinbasePayRouter get() {
    return provideCoinbasePayRouter(module);
  }

  public static ViewModelModule_ProvideCoinbasePayRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideCoinbasePayRouterFactory(module);
  }

  public static CoinbasePayRouter provideCoinbasePayRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCoinbasePayRouter());
  }
}
