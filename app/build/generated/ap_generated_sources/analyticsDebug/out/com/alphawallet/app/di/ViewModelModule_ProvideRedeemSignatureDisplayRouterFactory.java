package com.alphawallet.app.di;

import com.alphawallet.app.router.RedeemSignatureDisplayRouter;
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
public final class ViewModelModule_ProvideRedeemSignatureDisplayRouterFactory implements Factory<RedeemSignatureDisplayRouter> {
  private final ViewModelModule module;

  public ViewModelModule_ProvideRedeemSignatureDisplayRouterFactory(ViewModelModule module) {
    this.module = module;
  }

  @Override
  public RedeemSignatureDisplayRouter get() {
    return provideRedeemSignatureDisplayRouter(module);
  }

  public static ViewModelModule_ProvideRedeemSignatureDisplayRouterFactory create(
      ViewModelModule module) {
    return new ViewModelModule_ProvideRedeemSignatureDisplayRouterFactory(module);
  }

  public static RedeemSignatureDisplayRouter provideRedeemSignatureDisplayRouter(
      ViewModelModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRedeemSignatureDisplayRouter());
  }
}
