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
public final class ServiceModule_ProvideTokenDetailRouterFactory implements Factory<TokenDetailRouter> {
  private final ServiceModule module;

  public ServiceModule_ProvideTokenDetailRouterFactory(ServiceModule module) {
    this.module = module;
  }

  @Override
  public TokenDetailRouter get() {
    return provideTokenDetailRouter(module);
  }

  public static ServiceModule_ProvideTokenDetailRouterFactory create(ServiceModule module) {
    return new ServiceModule_ProvideTokenDetailRouterFactory(module);
  }

  public static TokenDetailRouter provideTokenDetailRouter(ServiceModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTokenDetailRouter());
  }
}
