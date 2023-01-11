package com.alphawallet.app.di;

import com.alphawallet.app.interact.MemPoolInteract;
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
public final class ViewModelModule_ProvideMemPoolInteractFactory implements Factory<MemPoolInteract> {
  private final ViewModelModule module;

  private final Provider<TokenRepositoryType> tokenRepositoryProvider;

  public ViewModelModule_ProvideMemPoolInteractFactory(ViewModelModule module,
      Provider<TokenRepositoryType> tokenRepositoryProvider) {
    this.module = module;
    this.tokenRepositoryProvider = tokenRepositoryProvider;
  }

  @Override
  public MemPoolInteract get() {
    return provideMemPoolInteract(module, tokenRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideMemPoolInteractFactory create(ViewModelModule module,
      Provider<TokenRepositoryType> tokenRepositoryProvider) {
    return new ViewModelModule_ProvideMemPoolInteractFactory(module, tokenRepositoryProvider);
  }

  public static MemPoolInteract provideMemPoolInteract(ViewModelModule instance,
      TokenRepositoryType tokenRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideMemPoolInteract(tokenRepository));
  }
}
