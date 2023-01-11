package com.alphawallet.app.di;

import com.alphawallet.app.router.MyAddressRouter;
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
public final class ViewModelModule_ProvideMyAddressRouterFactory implements Factory<MyAddressRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideMyAddressRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public MyAddressRouter get() {
    return provideMyAddressRouter(module);
  }

  public static ViewModelModule_ProvideMyAddressRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideMyAddressRouterFactory(module);
  }

  public static MyAddressRouter provideMyAddressRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMyAddressRouter());
  }
}
