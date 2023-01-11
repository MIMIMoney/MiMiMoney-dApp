package com.alphawallet.app.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ToolsModule_OkHttpClientFactory implements Factory<OkHttpClient> {
  private final ToolsModule module;

  public ToolsModule_OkHttpClientFactory(ToolsModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return okHttpClient(module);
  }

  public static ToolsModule_OkHttpClientFactory create(ToolsModule module) {
    return new ToolsModule_OkHttpClientFactory(module);
  }

  public static OkHttpClient okHttpClient(ToolsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.okHttpClient());
  }
}
