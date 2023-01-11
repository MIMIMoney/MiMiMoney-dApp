package com.alphawallet.app.di;

import com.alphawallet.app.router.TokenDetailRouter;
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
public final class ViewModelModule_ProvideErc20DetailRouterRouterFactory implements Factory<TokenDetailRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideErc20DetailRouterRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public TokenDetailRouter get() {
    return provideErc20DetailRouterRouter(module);
  }

  public static ViewModelModule_ProvideErc20DetailRouterRouterFactory create(
      ViewModelModule module) {
    return new ViewModelModule_ProvideErc20DetailRouterRouterFactory(module);
  }

  public static TokenDetailRouter provideErc20DetailRouterRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideErc20DetailRouterRouter());
  }
}
