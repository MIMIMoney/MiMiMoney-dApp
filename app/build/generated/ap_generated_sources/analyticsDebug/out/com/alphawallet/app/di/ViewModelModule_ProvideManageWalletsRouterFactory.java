package com.alphawallet.app.di;

import com.alphawallet.app.router.ManageWalletsRouter;
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
public final class ViewModelModule_ProvideManageWalletsRouterFactory implements Factory<ManageWalletsRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideManageWalletsRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public ManageWalletsRouter get() {
    return provideManageWalletsRouter(module);
  }

  public static ViewModelModule_ProvideManageWalletsRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideManageWalletsRouterFactory(module);
  }

  public static ManageWalletsRouter provideManageWalletsRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideManageWalletsRouter());
  }
}
