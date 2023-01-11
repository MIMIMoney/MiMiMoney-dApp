package com.alphawallet.app.di;

import com.alphawallet.app.router.ImportTokenRouter;
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
public final class ViewModelModule_ProvideImportTokenRouterFactory implements Factory<ImportTokenRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideImportTokenRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public ImportTokenRouter get() {
    return provideImportTokenRouter(module);
  }

  public static ViewModelModule_ProvideImportTokenRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideImportTokenRouterFactory(module);
  }

  public static ImportTokenRouter provideImportTokenRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideImportTokenRouter());
  }
}
