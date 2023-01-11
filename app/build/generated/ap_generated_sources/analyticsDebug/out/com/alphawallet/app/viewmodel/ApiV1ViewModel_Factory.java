package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.service.KeyService;
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
public final class ApiV1ViewModel_Factory implements Factory<ApiV1ViewModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<KeyService> keyServiceProvider;

  public ApiV1ViewModel_Factory(Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<KeyService> keyServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.keyServiceProvider = keyServiceProvider;
  }

  @Override
  public ApiV1ViewModel get() {
    return newInstance(genericWalletInteractProvider.get(), createTransactionInteractProvider.get(), keyServiceProvider.get());
  }

  public static ApiV1ViewModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<KeyService> keyServiceProvider) {
    return new ApiV1ViewModel_Factory(genericWalletInteractProvider, createTransactionInteractProvider, keyServiceProvider);
  }

  public static ApiV1ViewModel newInstance(GenericWalletInteract genericWalletInteract,
      CreateTransactionInteract createTransactionInteract, KeyService keyService) {
    return new ApiV1ViewModel(genericWalletInteract, createTransactionInteract, keyService);
  }
}
