package com.alphawallet.app.di;

import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.repository.TokenRepositoryType;
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
public final class ViewModelModule_ProvideFetchTransactionsInteractFactory implements Factory<FetchTransactionsInteract> {
  private final ViewModelModule module;

  private final Provider<TransactionRepositoryType> transactionRepositoryProvider;

  private final Provider<TokenRepositoryType> tokenRepositoryTypeProvider;

  public ViewModelModule_ProvideFetchTransactionsInteractFactory(ViewModelModule module,
      Provider<TransactionRepositoryType> transactionRepositoryProvider,
      Provider<TokenRepositoryType> tokenRepositoryTypeProvider) {
    this.module = module;
    this.transactionRepositoryProvider = transactionRepositoryProvider;
    this.tokenRepositoryTypeProvider = tokenRepositoryTypeProvider;
  }

  @Override
  public FetchTransactionsInteract get() {
    return provideFetchTransactionsInteract(module, transactionRepositoryProvider.get(), tokenRepositoryTypeProvider.get());
  }

  public static ViewModelModule_ProvideFetchTransactionsInteractFactory create(
      ViewModelModule module, Provider<TransactionRepositoryType> transactionRepositoryProvider,
      Provider<TokenRepositoryType> tokenRepositoryTypeProvider) {
    return new ViewModelModule_ProvideFetchTransactionsInteractFactory(module, transactionRepositoryProvider, tokenRepositoryTypeProvider);
  }

  public static FetchTransactionsInteract provideFetchTransactionsInteract(ViewModelModule instance,
      TransactionRepositoryType transactionRepository, TokenRepositoryType tokenRepositoryType) {
    return Preconditions.checkNotNullFromProvides(instance.provideFetchTransactionsInteract(transactionRepository, tokenRepositoryType));
  }
}
