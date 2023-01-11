package com.alphawallet.app.di;

import android.content.Context;
import com.alphawallet.app.repository.TokenLocalSource;
import com.alphawallet.app.service.AlphaWalletService;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.IPFSServiceType;
import com.alphawallet.app.service.NotificationService;
import com.alphawallet.app.service.RealmManager;
import com.alphawallet.app.service.TokensService;
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
public final class RepositoriesModule_ProvidingAssetDefinitionServicesFactory implements Factory<AssetDefinitionService> {
  private final RepositoriesModule module;

  private final Provider<IPFSServiceType> ipfsServiceProvider;

  private final Provider<Context> ctxProvider;

  private final Provider<NotificationService> notificationServiceProvider;

  private final Provider<RealmManager> realmManagerProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<TokenLocalSource> tlsProvider;

  private final Provider<AlphaWalletService> alphaServiceProvider;

  public RepositoriesModule_ProvidingAssetDefinitionServicesFactory(RepositoriesModule module,
      Provider<IPFSServiceType> ipfsServiceProvider, Provider<Context> ctxProvider,
      Provider<NotificationService> notificationServiceProvider,
      Provider<RealmManager> realmManagerProvider, Provider<TokensService> tokensServiceProvider,
      Provider<TokenLocalSource> tlsProvider, Provider<AlphaWalletService> alphaServiceProvider) {
    this.module = module;
    this.ipfsServiceProvider = ipfsServiceProvider;
    this.ctxProvider = ctxProvider;
    this.notificationServiceProvider = notificationServiceProvider;
    this.realmManagerProvider = realmManagerProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.tlsProvider = tlsProvider;
    this.alphaServiceProvider = alphaServiceProvider;
  }

  @Override
  public AssetDefinitionService get() {
    return providingAssetDefinitionServices(module, ipfsServiceProvider.get(), ctxProvider.get(), notificationServiceProvider.get(), realmManagerProvider.get(), tokensServiceProvider.get(), tlsProvider.get(), alphaServiceProvider.get());
  }

  public static RepositoriesModule_ProvidingAssetDefinitionServicesFactory create(
      RepositoriesModule module, Provider<IPFSServiceType> ipfsServiceProvider,
      Provider<Context> ctxProvider, Provider<NotificationService> notificationServiceProvider,
      Provider<RealmManager> realmManagerProvider, Provider<TokensService> tokensServiceProvider,
      Provider<TokenLocalSource> tlsProvider, Provider<AlphaWalletService> alphaServiceProvider) {
    return new RepositoriesModule_ProvidingAssetDefinitionServicesFactory(module, ipfsServiceProvider, ctxProvider, notificationServiceProvider, realmManagerProvider, tokensServiceProvider, tlsProvider, alphaServiceProvider);
  }

  public static AssetDefinitionService providingAssetDefinitionServices(RepositoriesModule instance,
      IPFSServiceType ipfsService, Context ctx, NotificationService notificationService,
      RealmManager realmManager, TokensService tokensService, TokenLocalSource tls,
      AlphaWalletService alphaService) {
    return Preconditions.checkNotNullFromProvides(instance.providingAssetDefinitionServices(ipfsService, ctx, notificationService, realmManager, tokensService, tls, alphaService));
  }
}
