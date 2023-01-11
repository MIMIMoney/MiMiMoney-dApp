package com.alphawallet.app.di;

import com.alphawallet.app.router.TransferTicketDetailRouter;
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
public final class ViewModelModule_ProvideTransferTicketRouterFactory implements Factory<TransferTicketDetailRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideTransferTicketRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public TransferTicketDetailRouter get() {
    return provideTransferTicketRouter(module);
  }

  public static ViewModelModule_ProvideTransferTicketRouterFactory create(ViewModelModule module) {
    return new ViewModelModule_ProvideTransferTicketRouterFactory(module);
  }

  public static TransferTicketDetailRouter provideTransferTicketRouter(ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTransferTicketRouter());
  }
}
