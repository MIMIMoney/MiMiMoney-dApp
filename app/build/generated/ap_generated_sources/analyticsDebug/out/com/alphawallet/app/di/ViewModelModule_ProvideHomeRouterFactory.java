package com.alphawallet.app.di;

import com.alphawallet.app.router.HomeRouter;
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
public final class ViewModelModule_ProvideHomeRouterFactory implements Factory<HomeRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideHomeRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public HomeRouter get() {
    return provideHomeRouter(module);
  }

  public static ViewModelModule_ProvideHomeRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideHomeRouterFactory(module);
  }

  public static HomeRouter provideHomeRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHomeRouter());
  }
}
