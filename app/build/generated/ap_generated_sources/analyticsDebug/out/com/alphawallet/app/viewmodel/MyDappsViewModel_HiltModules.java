package com.alphawallet.app.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated("dagger.hilt.android.processor.internal.viewmodel.ViewModelProcessor")
@OriginatingElement(
    topLevelClass = MyDappsViewModel.class
)
public final class MyDappsViewModel_HiltModules {
  private MyDappsViewModel_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("com.alphawallet.app.viewmodel.MyDappsViewModel")
    @HiltViewModelMap
    public abstract ViewModel binds(MyDappsViewModel vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "com.alphawallet.app.viewmodel.MyDappsViewModel";
    }
  }
}
