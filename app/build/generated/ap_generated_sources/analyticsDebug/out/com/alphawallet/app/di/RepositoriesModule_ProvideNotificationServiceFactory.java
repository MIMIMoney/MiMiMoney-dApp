package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.service.NotificationService;
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
public final class RepositoriesModule_ProvideNotificationServiceFactory implements Factory<NotificationService> {
  private final RepositoriesModule module;

  private final Provider<Context> ctxProvider;

  public RepositoriesModule_ProvideNotificationServiceFactory(RepositoriesModule module,
      Provider<Context> ctxProvider) {
    this.module = module;
    this.ctxProvider = ctxProvider;
  }

  @Override
  public NotificationService get() {
    return provideNotificationService(module, ctxProvider.get());
  }

  public static RepositoriesModule_ProvideNotificationServiceFactory create(
      RepositoriesModule module, Provider<Context> ctxProvider) {
    return new RepositoriesModule_ProvideNotificationServiceFactory(module, ctxProvider);
  }

  public static NotificationService provideNotificationService(RepositoriesModule instance,
      Context ctx) {
    return Preconditions.checkNotNullFromProvides(instance.provideNotificationService(ctx));
  }
}
