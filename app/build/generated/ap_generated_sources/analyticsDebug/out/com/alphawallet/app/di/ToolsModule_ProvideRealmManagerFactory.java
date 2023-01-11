package com.alphawallet.app.di;

import com.alphawallet.app.service.RealmManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ToolsModule_ProvideRealmManagerFactory implements Factory<RealmManager> {
  private final ToolsModule module;

  public ToolsModule_ProvideRealmManagerFactory(ToolsModule module) {
    this.module = module;
  }

  @Override
  public RealmManager get() {
    return provideRealmManager(module);
  }

  public static ToolsModule_ProvideRealmManagerFactory create(ToolsModule module) {
    return new ToolsModule_ProvideRealmManagerFactory(module);
  }

  public static RealmManager provideRealmManager(ToolsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRealmManager());
  }
}
