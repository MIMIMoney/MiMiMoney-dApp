package com.alphawallet.app.di;

import com.google.gson.Gson;
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
public final class ToolsModule_ProvideGsonFactory implements Factory<Gson> {
  private final ToolsModule module;

  public ToolsModule_ProvideGsonFactory(ToolsModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson(module);
  }

  public static ToolsModule_ProvideGsonFactory create(ToolsModule module) {
    return new ToolsModule_ProvideGsonFactory(module);
  }

  public static Gson provideGson(ToolsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideGson());
  }
}
