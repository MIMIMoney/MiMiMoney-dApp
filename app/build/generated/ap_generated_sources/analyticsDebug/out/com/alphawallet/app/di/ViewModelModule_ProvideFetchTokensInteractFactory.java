package com.alphawallet.app.di;

import com.alphawallet.app.interact.FetchTokensInteract;
import com.alphawallet.app.repository.TokenRepositoryType;
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
public final class ViewModelModule_ProvideFetchTokensInteractFactory implements Factory<FetchTokensInteract> {
  private final ViewModelModule module;

  private final Provider<TokenRepositoryType> tokenRepositoryProvider;

  public ViewModelModule_ProvideFetchTokensInteractFactory(ViewModelModule module,
      Provider<TokenRepositoryType> tokenRepositoryProvider) {
    this.module = module;
    this.tokenRepositoryProvider = tokenRepositoryProvider;
  }

  @Override
  public FetchTokensInteract get() {
    return provideFetchTokensInteract(module, tokenRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideFetchTokensInteractFactory create(ViewModelModule module,
      Provider<TokenRepositoryType> tokenRepositoryProvider) {
    return new ViewModelModule_ProvideFetchTokensInteractFactory(module, tokenRepositoryProvider);
  }

  public static FetchTokensInteract provideFetchTokensInteract(ViewModelModule instance,
      TokenRepositoryType tokenRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideFetchTokensInteract(tokenRepository));
  }
}
