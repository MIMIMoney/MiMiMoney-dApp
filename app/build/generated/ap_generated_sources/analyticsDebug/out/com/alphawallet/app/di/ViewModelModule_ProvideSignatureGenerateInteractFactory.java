package com.alphawallet.app.di;

import com.alphawallet.app.interact.SignatureGenerateInteract;
import com.alphawallet.app.repository.WalletRepositoryType;
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
public final class ViewModelModule_ProvideSignatureGenerateInteractFactory implements Factory<SignatureGenerateInteract> {
  private final ViewModelModule module;

  private final Provider<WalletRepositoryType> walletRepositoryProvider;

  public ViewModelModule_ProvideSignatureGenerateInteractFactory(ViewModelModule module,
      Provider<WalletRepositoryType> walletRepositoryProvider) {
    this.module = module;
    this.walletRepositoryProvider = walletRepositoryProvider;
  }

  @Override
  public SignatureGenerateInteract get() {
    return provideSignatureGenerateInteract(module, walletRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideSignatureGenerateInteractFactory create(
      ViewModelModule module, Provider<WalletRepositoryType> walletRepositoryProvider) {
    return new ViewModelModule_ProvideSignatureGenerateInteractFactory(module, walletRepositoryProvider);
  }

  public static SignatureGenerateInteract provideSignatureGenerateInteract(ViewModelModule instance,
      WalletRepositoryType walletRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideSignatureGenerateInteract(walletRepository));
  }
}
