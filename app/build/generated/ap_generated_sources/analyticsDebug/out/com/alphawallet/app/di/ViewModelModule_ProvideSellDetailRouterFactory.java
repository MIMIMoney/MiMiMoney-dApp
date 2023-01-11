package com.alphawallet.app.di;

import com.alphawallet.app.router.SellDetailRouter;
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
public final class ViewModelModule_ProvideSellDetailRouterFactory implements Factory<SellDetailRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideSellDetailRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public SellDetailRouter get() {
    return provideSellDetailRouter(module);
  }

  public static ViewModelModule_ProvideSellDetailRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideSellDetailRouterFactory(module);
  }

  public static SellDetailRouter provideSellDetailRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSellDetailRouter());
  }
}
