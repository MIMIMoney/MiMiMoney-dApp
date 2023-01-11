package com.alphawallet.app.ui;

import com.alphawallet.app.repository.PreferenceRepositoryType;
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
public final class WalletsActivity_MembersInjector implements MembersInjector<WalletsActivity> {
  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  public WalletsActivity_MembersInjector(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<WalletsActivity> create(
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider) {
    return new WalletsActivity_MembersInjector(preferenceRepositoryProvider);
  }

  @Override
  public void injectMembers(WalletsActivity instance) {
    injectPreferenceRepository(instance, preferenceRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.ui.WalletsActivity.preferenceRepository")
  public static void injectPreferenceRepository(WalletsActivity instance,
      PreferenceRepositoryType preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
