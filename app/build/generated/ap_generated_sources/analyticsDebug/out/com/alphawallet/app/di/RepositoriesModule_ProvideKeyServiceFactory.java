package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.KeyService;
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
public final class RepositoriesModule_ProvideKeyServiceFactory implements Factory<KeyService> {
  private final RepositoriesModule module;

  private final Provider<Context> ctxProvider;

  private final Provider<AnalyticsServiceType> analyticsServiceProvider;

  public RepositoriesModule_ProvideKeyServiceFactory(RepositoriesModule module,
      Provider<Context> ctxProvider, Provider<AnalyticsServiceType> analyticsServiceProvider) {
    this.module = module;
    this.ctxProvider = ctxProvider;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public KeyService get() {
    return provideKeyService(module, ctxProvider.get(), analyticsServiceProvider.get());
  }

  public static RepositoriesModule_ProvideKeyServiceFactory create(RepositoriesModule module,
      Provider<Context> ctxProvider, Provider<AnalyticsServiceType> analyticsServiceProvider) {
    return new RepositoriesModule_ProvideKeyServiceFactory(module, ctxProvider, analyticsServiceProvider);
  }

  public static KeyService provideKeyService(RepositoriesModule instance, Context ctx,
      AnalyticsServiceType analyticsService) {
    return Preconditions.checkNotNullFromProvides(instance.provideKeyService(ctx, analyticsService));
  }
}
