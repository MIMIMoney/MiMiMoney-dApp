package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.service.AnalyticsServiceType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoriesModule_ProvideAnalyticsServiceFactory implements Factory<AnalyticsServiceType> {
  private final RepositoriesModule module;

  private final Provider<Context> ctxProvider;

  public RepositoriesModule_ProvideAnalyticsServiceFactory(RepositoriesModule module,
      Provider<Context> ctxProvider) {
    this.module = module;
    this.ctxProvider = ctxProvider;
  }

  @Override
  public AnalyticsServiceType get() {
    return provideAnalyticsService(module, ctxProvider.get());
  }

  public static RepositoriesModule_ProvideAnalyticsServiceFactory create(RepositoriesModule module,
      Provider<Context> ctxProvider) {
    return new RepositoriesModule_ProvideAnalyticsServiceFactory(module, ctxProvider);
  }

  public static AnalyticsServiceType provideAnalyticsService(RepositoriesModule instance,
      Context ctx) {
    return Preconditions.checkNotNullFromProvides(instance.provideAnalyticsService(ctx));
  }
}
