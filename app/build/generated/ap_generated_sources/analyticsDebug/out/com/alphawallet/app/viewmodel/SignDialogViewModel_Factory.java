package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.TransactionRepositoryType;
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
public final class SignDialogViewModel_Factory implements Factory<SignDialogViewModel> {
  private final Provider<GenericWalletInteract> walletInteractProvider;

  private final Provider<TransactionRepositoryType> transactionRepositoryTypeProvider;

  private final Provider<KeyService> keyServiceProvider;

  public SignDialogViewModel_Factory(Provider<GenericWalletInteract> walletInteractProvider,
      Provider<TransactionRepositoryType> transactionRepositoryTypeProvider,
      Provider<KeyService> keyServiceProvider) {
    this.walletInteractProvider = walletInteractProvider;
    this.transactionRepositoryTypeProvider = transactionRepositoryTypeProvider;
    this.keyServiceProvider = keyServiceProvider;
  }

  @Override
  public SignDialogViewModel get() {
    return newInstance(walletInteractProvider.get(), transactionRepositoryTypeProvider.get(), keyServiceProvider.get());
  }

  public static SignDialogViewModel_Factory create(
      Provider<GenericWalletInteract> walletInteractProvider,
      Provider<TransactionRepositoryType> transactionRepositoryTypeProvider,
      Provider<KeyService> keyServiceProvider) {
    return new SignDialogViewModel_Factory(walletInteractProvider, transactionRepositoryTypeProvider, keyServiceProvider);
  }

  public static SignDialogViewModel newInstance(GenericWalletInteract walletInteract,
      TransactionRepositoryType transactionRepositoryType, KeyService keyService) {
    return new SignDialogViewModel(walletInteract, transactionRepositoryType, keyService);
  }
}
