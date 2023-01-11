package com.alphawallet.app.service;

import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.repository.TokenLocalSource;
import com.alphawallet.app.router.TokenDetailRouter;
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
public final class PriceAlertsService_MembersInjector implements MembersInjector<PriceAlertsService> {
  private final Provider<TokenLocalSource> localSourceProvider;

  private final Provider<PreferenceRepositoryType> preferenceRepositoryProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<TickerService> tickerServiceProvider;

  private final Provider<NotificationService> notificationServiceProvider;

  private final Provider<TokenDetailRouter> tokenDetailRouterProvider;

  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  public PriceAlertsService_MembersInjector(Provider<TokenLocalSource> localSourceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<TokensService> tokensServiceProvider, Provider<TickerService> tickerServiceProvider,
      Provider<NotificationService> notificationServiceProvider,
      Provider<TokenDetailRouter> tokenDetailRouterProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    this.localSourceProvider = localSourceProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.tickerServiceProvider = tickerServiceProvider;
    this.notificationServiceProvider = notificationServiceProvider;
    this.tokenDetailRouterProvider = tokenDetailRouterProvider;
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
  }

  public static MembersInjector<PriceAlertsService> create(
      Provider<TokenLocalSource> localSourceProvider,
      Provider<PreferenceRepositoryType> preferenceRepositoryProvider,
      Provider<TokensService> tokensServiceProvider, Provider<TickerService> tickerServiceProvider,
      Provider<NotificationService> notificationServiceProvider,
      Provider<TokenDetailRouter> tokenDetailRouterProvider,
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    return new PriceAlertsService_MembersInjector(localSourceProvider, preferenceRepositoryProvider, tokensServiceProvider, tickerServiceProvider, notificationServiceProvider, tokenDetailRouterProvider, genericWalletInteractProvider, assetDefinitionServiceProvider);
  }

  @Override
  public void injectMembers(PriceAlertsService instance) {
    injectLocalSource(instance, localSourceProvider.get());
    injectPreferenceRepository(instance, preferenceRepositoryProvider.get());
    injectTokensService(instance, tokensServiceProvider.get());
    injectTickerService(instance, tickerServiceProvider.get());
    injectNotificationService(instance, notificationServiceProvider.get());
    injectTokenDetailRouter(instance, tokenDetailRouterProvider.get());
    injectGenericWalletInteract(instance, genericWalletInteractProvider.get());
    injectAssetDefinitionService(instance, assetDefinitionServiceProvider.get());
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.localSource")
  public static void injectLocalSource(PriceAlertsService instance, TokenLocalSource localSource) {
    instance.localSource = localSource;
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.preferenceRepository")
  public static void injectPreferenceRepository(PriceAlertsService instance,
      PreferenceRepositoryType preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.tokensService")
  public static void injectTokensService(PriceAlertsService instance, TokensService tokensService) {
    instance.tokensService = tokensService;
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.tickerService")
  public static void injectTickerService(PriceAlertsService instance, TickerService tickerService) {
    instance.tickerService = tickerService;
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.notificationService")
  public static void injectNotificationService(PriceAlertsService instance,
      NotificationService notificationService) {
    instance.notificationService = notificationService;
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.tokenDetailRouter")
  public static void injectTokenDetailRouter(PriceAlertsService instance,
      TokenDetailRouter tokenDetailRouter) {
    instance.tokenDetailRouter = tokenDetailRouter;
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.genericWalletInteract")
  public static void injectGenericWalletInteract(PriceAlertsService instance,
      GenericWalletInteract genericWalletInteract) {
    instance.genericWalletInteract = genericWalletInteract;
  }

  @InjectedFieldSignature("com.alphawallet.app.service.PriceAlertsService.assetDefinitionService")
  public static void injectAssetDefinitionService(PriceAlertsService instance,
      AssetDefinitionService assetDefinitionService) {
    instance.assetDefinitionService = assetDefinitionService;
  }
}
