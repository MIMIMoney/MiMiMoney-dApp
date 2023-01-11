package com.alphawallet.app.di;

import com.alphawallet.app.interact.ChangeTokenEnableInteract;
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
public final class ViewModelModule_ProvideChangeTokenEnableInteractFactory implements Factory<ChangeTokenEnableInteract> {
  private final ViewModelModule module;

  private final Provider<TokenRepositoryType> tokenRepositoryProvider;

  public ViewModelModule_ProvideChangeTokenEnableInteractFactory(ViewModelModule module,
      Provider<TokenRepositoryType> tokenRepositoryProvider) {
    this.module = module;
    this.tokenRepositoryProvider = tokenRepositoryProvider;
  }

  @Override
  public ChangeTokenEnableInteract get() {
    return provideChangeTokenEnableInteract(module, tokenRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideChangeTokenEnableInteractFactory create(
      ViewModelModule module, Provider<TokenRepositoryType> tokenRepositoryProvider) {
    return new ViewModelModule_ProvideChangeTokenEnableInteractFactory(module, tokenRepositoryProvider);
  }

  public static ChangeTokenEnableInteract provideChangeTokenEnableInteract(ViewModelModule instance,
      TokenRepositoryType tokenRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideChangeTokenEnableInteract(tokenRepository));
  }
}
