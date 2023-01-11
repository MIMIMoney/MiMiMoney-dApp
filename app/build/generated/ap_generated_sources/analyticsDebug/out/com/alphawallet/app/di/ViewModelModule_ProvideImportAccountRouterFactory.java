package com.alphawallet.app.di;

import com.alphawallet.app.router.ImportWalletRouter;
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
public final class ViewModelModule_ProvideImportAccountRouterFactory implements Factory<ImportWalletRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideImportAccountRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public ImportWalletRouter get() {
    return provideImportAccountRouter(module);
  }

  public static ViewModelModule_ProvideImportAccountRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideImportAccountRouterFactory(module);
  }

  public static ImportWalletRouter provideImportAccountRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideImportAccountRouter());
  }
}
