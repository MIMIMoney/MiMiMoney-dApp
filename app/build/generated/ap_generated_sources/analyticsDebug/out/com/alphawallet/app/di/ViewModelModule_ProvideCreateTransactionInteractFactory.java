package com.alphawallet.app.di;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.repository.TransactionRepositoryType;
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
public final class ViewModelModule_ProvideCreateTransactionInteractFactory implements Factory<CreateTransactionInteract> {
  private final ViewModelModule module;

  private final Provider<TransactionRepositoryType> transactionRepositoryProvider;

  public ViewModelModule_ProvideCreateTransactionInteractFactory(ViewModelModule module,
      Provider<TransactionRepositoryType> transactionRepositoryProvider) {
    this.module = module;
    this.transactionRepositoryProvider = transactionRepositoryProvider;
  }

  @Override
  public CreateTransactionInteract get() {
    return provideCreateTransactionInteract(module, transactionRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideCreateTransactionInteractFactory create(
      ViewModelModule module, Provider<TransactionRepositoryType> transactionRepositoryProvider) {
    return new ViewModelModule_ProvideCreateTransactionInteractFactory(module, transactionRepositoryProvider);
  }

  public static CreateTransactionInteract provideCreateTransactionInteract(ViewModelModule instance,
      TransactionRepositoryType transactionRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideCreateTransactionInteract(transactionRepository));
  }
}
