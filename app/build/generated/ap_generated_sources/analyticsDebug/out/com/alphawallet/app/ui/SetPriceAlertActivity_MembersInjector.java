package com.alphawallet.app.ui;

import com.alphawallet.app.service.TickerService;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class SetPriceAlertActivity_MembersInjector implements MembersInjector<SetPriceAlertActivity> {
  private final Provider<TickerService> tickerServiceProvider;

  public SetPriceAlertActivity_MembersInjector(Provider<TickerService> tickerServiceProvider) {
    this.tickerServiceProvider = tickerServiceProvider;
  }

  public static MembersInjector<SetPriceAlertActivity> create(
      Provider<TickerService> tickerServiceProvider) {
    return new SetPriceAlertActivity_MembersInjector(tickerServiceProvider);
  }

  @Override
  public void injectMembers(SetPriceAlertActivity instance) {
    injectTickerService(instance, tickerServiceProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.SetPriceAlertActivity.tickerService")
  public static void injectTickerService(SetPriceAlertActivity instance,
      TickerService tickerService) {
    instance.tickerService = tickerService;
  }
}
