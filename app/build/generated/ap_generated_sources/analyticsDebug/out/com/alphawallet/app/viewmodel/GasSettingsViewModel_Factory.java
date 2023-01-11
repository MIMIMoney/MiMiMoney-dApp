package com.alphawallet.app.viewmodel;

import com.alphawallet.app.service.TokensService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class GasSettingsViewModel_Factory implements Factory<GasSettingsViewModel> {
  private final Provider<TokensService> svsProvider;

  public GasSettingsViewModel_Factory(Provider<TokensService> svsProvider) {
    this.svsProvider = svsProvider;
  }

  @Override
  public GasSettingsViewModel get() {
    return newInstance(svsProvider.get());
  }

  public static GasSettingsViewModel_Factory create(Provider<TokensService> svsProvider) {
    return new GasSettingsViewModel_Factory(svsProvider);
  }

  public static GasSettingsViewModel newInstance(TokensService svs) {
    return new GasSettingsViewModel(svs);
  }
}
