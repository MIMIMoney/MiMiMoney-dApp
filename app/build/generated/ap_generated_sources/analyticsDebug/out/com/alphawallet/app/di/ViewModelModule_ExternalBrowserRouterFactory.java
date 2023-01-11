package com.alphawallet.app.di;

import com.alphawallet.app.router.ExternalBrowserRouter;
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
public final class ViewModelModule_ExternalBrowserRouterFactory implements Factory<ExternalBrowserRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ExternalBrowserRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public ExternalBrowserRouter get() {
    return externalBrowserRouter(module);
  }

  public static ViewModelModule_ExternalBrowserRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ExternalBrowserRouterFactory(module);
  }

  public static ExternalBrowserRouter externalBrowserRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.externalBrowserRouter());
  }
}
