package com.alphawallet.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.alphawallet.app.di.RepositoriesModule;
import com.alphawallet.app.di.RepositoriesModule_ProvideAccountKeyStoreServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideAnalyticsServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideBlockExplorerClientFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideCoinbasePayRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideEthereumNetworkRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideFeemasterServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideGasServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideIPFSServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideKeyServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideNotificationServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideOnRampRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideOpenseaServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvidePreferenceRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideRealmTokenSourceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideRealmWalletDataSourceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideSwapRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideSwapServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideTickerServiceFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideTokenRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideTokensServicesFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideTransactionInDiskCacheFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideTransactionRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideTransactionsServicesFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvideWalletRepositoryFactory;
import com.alphawallet.app.di.RepositoriesModule_ProvidingAssetDefinitionServicesFactory;
import com.alphawallet.app.di.ServiceModule;
import com.alphawallet.app.di.ServiceModule_ProvideGenericWalletInteractFactory;
import com.alphawallet.app.di.ServiceModule_ProvideTokenDetailRouterFactory;
import com.alphawallet.app.di.ToolsModule;
import com.alphawallet.app.di.ToolsModule_OkHttpClientFactory;
import com.alphawallet.app.di.ToolsModule_ProvideAWWalletConnectClientFactory;
import com.alphawallet.app.di.ToolsModule_ProvideGsonFactory;
import com.alphawallet.app.di.ToolsModule_ProvideRealmManagerFactory;
import com.alphawallet.app.di.ViewModelModule;
import com.alphawallet.app.di.ViewModelModule_ExternalBrowserRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideChangeTokenEnableInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideCoinbasePayRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideCreateTransactionInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideCurrencyRepositoryFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideDeleteAccountInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideErc20DetailRouterRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideExportWalletInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideFetchTokensInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideFetchTransactionsInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideFetchWalletInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideFindDefaultNetworkInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideGenericWalletInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideHomeRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideImportAccountRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideImportTokenRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideImportWalletInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideLocaleRepositoryFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideManageWalletsRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideMemPoolInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideMyAddressRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideRedeemSignatureDisplayRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideSellDetailRouterFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideSetDefaultAccountInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideSignatureGenerateInteractFactory;
import com.alphawallet.app.di.ViewModelModule_ProvideTransferTicketRouterFactory;
import com.alphawallet.app.interact.ChangeTokenEnableInteract;
import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.DeleteWalletInteract;
import com.alphawallet.app.interact.ExportWalletInteract;
import com.alphawallet.app.interact.FetchTokensInteract;
import com.alphawallet.app.interact.FetchTransactionsInteract;
import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.interact.FindDefaultNetworkInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.interact.ImportWalletInteract;
import com.alphawallet.app.interact.MemPoolInteract;
import com.alphawallet.app.interact.SetDefaultWalletInteract;
import com.alphawallet.app.interact.SignatureGenerateInteract;
import com.alphawallet.app.interact.WalletConnectInteract;
import com.alphawallet.app.repository.CoinbasePayRepositoryType;
import com.alphawallet.app.repository.CurrencyRepositoryType;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.LocaleRepositoryType;
import com.alphawallet.app.repository.OnRampRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.repository.SwapRepositoryType;
import com.alphawallet.app.repository.TokenLocalSource;
import com.alphawallet.app.repository.TokenRepositoryType;
import com.alphawallet.app.repository.TransactionLocalSource;
import com.alphawallet.app.repository.TransactionRepositoryType;
import com.alphawallet.app.repository.WalletDataRealmSource;
import com.alphawallet.app.repository.WalletRepositoryType;
import com.alphawallet.app.service.AccountKeystoreService;
import com.alphawallet.app.service.AlphaWalletService;
import com.alphawallet.app.service.AnalyticsServiceType;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.GasService;
import com.alphawallet.app.service.IPFSServiceType;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.NotificationService;
import com.alphawallet.app.service.OpenSeaService;
import com.alphawallet.app.service.PriceAlertsService;
import com.alphawallet.app.service.PriceAlertsService_MembersInjector;
import com.alphawallet.app.service.RealmManager;
import com.alphawallet.app.service.SwapService;
import com.alphawallet.app.service.TickerService;
import com.alphawallet.app.service.TokensService;
import com.alphawallet.app.service.TransactionsNetworkClientType;
import com.alphawallet.app.service.TransactionsService;
import com.alphawallet.app.service.WalletConnectV2Service;
import com.alphawallet.app.ui.ActivityFragment;
import com.alphawallet.app.ui.AddCustomRPCNetworkActivity;
import com.alphawallet.app.ui.AddEditDappActivity;
import com.alphawallet.app.ui.AddTokenActivity;
import com.alphawallet.app.ui.AdvancedSettingsActivity;
import com.alphawallet.app.ui.ApiV1Activity;
import com.alphawallet.app.ui.AssetDisplayActivity;
import com.alphawallet.app.ui.BackupFlowActivity;
import com.alphawallet.app.ui.BackupKeyActivity;
import com.alphawallet.app.ui.BaseFragment;
import com.alphawallet.app.ui.BrowserHistoryFragment;
import com.alphawallet.app.ui.CoinbasePayActivity;
import com.alphawallet.app.ui.DappBrowserFragment;
import com.alphawallet.app.ui.DiscoverDappsFragment;
import com.alphawallet.app.ui.EditTokensVisibilityActivity;
import com.alphawallet.app.ui.Erc1155AssetListActivity;
import com.alphawallet.app.ui.Erc1155AssetSelectActivity;
import com.alphawallet.app.ui.Erc20DetailActivity;
import com.alphawallet.app.ui.FunctionActivity;
import com.alphawallet.app.ui.GasSettingsActivity;
import com.alphawallet.app.ui.HomeActivity;
import com.alphawallet.app.ui.HomeActivity_MembersInjector;
import com.alphawallet.app.ui.ImportKeystoreFragment;
import com.alphawallet.app.ui.ImportPrivateKeyFragment;
import com.alphawallet.app.ui.ImportSeedFragment;
import com.alphawallet.app.ui.ImportTokenActivity;
import com.alphawallet.app.ui.ImportWalletActivity;
import com.alphawallet.app.ui.MyAddressActivity;
import com.alphawallet.app.ui.MyDappsFragment;
import com.alphawallet.app.ui.NFTActivity;
import com.alphawallet.app.ui.NFTAssetDetailActivity;
import com.alphawallet.app.ui.NFTAssetsFragment;
import com.alphawallet.app.ui.NFTInfoFragment;
import com.alphawallet.app.ui.NameThisWalletActivity;
import com.alphawallet.app.ui.NewSettingsFragment;
import com.alphawallet.app.ui.NodeStatusActivity;
import com.alphawallet.app.ui.QRScanning.QRScannerActivity;
import com.alphawallet.app.ui.RedeemAssetSelectActivity;
import com.alphawallet.app.ui.RedeemSignatureDisplayActivity;
import com.alphawallet.app.ui.ScammerWarningActivity;
import com.alphawallet.app.ui.SearchActivity;
import com.alphawallet.app.ui.SelectCurrencyActivity;
import com.alphawallet.app.ui.SelectLocaleActivity;
import com.alphawallet.app.ui.SelectNetworkActivity;
import com.alphawallet.app.ui.SelectNetworkFilterActivity;
import com.alphawallet.app.ui.SelectRouteActivity;
import com.alphawallet.app.ui.SelectSwapProvidersActivity;
import com.alphawallet.app.ui.SelectThemeActivity;
import com.alphawallet.app.ui.SellDetailActivity;
import com.alphawallet.app.ui.SendActivity;
import com.alphawallet.app.ui.SetPriceAlertActivity;
import com.alphawallet.app.ui.SetPriceAlertActivity_MembersInjector;
import com.alphawallet.app.ui.SetWatchWalletFragment;
import com.alphawallet.app.ui.SignDetailActivity;
import com.alphawallet.app.ui.SplashActivity;
import com.alphawallet.app.ui.SupportSettingsActivity;
import com.alphawallet.app.ui.SwapActivity;
import com.alphawallet.app.ui.TokenActivity;
import com.alphawallet.app.ui.TokenActivityFragment;
import com.alphawallet.app.ui.TokenAlertsFragment;
import com.alphawallet.app.ui.TokenDetailActivity;
import com.alphawallet.app.ui.TokenFunctionActivity;
import com.alphawallet.app.ui.TokenInfoFragment;
import com.alphawallet.app.ui.TokenManagementActivity;
import com.alphawallet.app.ui.TokenScriptManagementActivity;
import com.alphawallet.app.ui.TransactionDetailActivity;
import com.alphawallet.app.ui.TransactionSuccessActivity;
import com.alphawallet.app.ui.TransferNFTActivity;
import com.alphawallet.app.ui.TransferTicketDetailActivity;
import com.alphawallet.app.ui.WalletActionsActivity;
import com.alphawallet.app.ui.WalletConnectActivity;
import com.alphawallet.app.ui.WalletConnectActivity_MembersInjector;
import com.alphawallet.app.ui.WalletConnectNotificationActivity;
import com.alphawallet.app.ui.WalletConnectNotificationActivity_MembersInjector;
import com.alphawallet.app.ui.WalletConnectSessionActivity;
import com.alphawallet.app.ui.WalletConnectSessionActivity_MembersInjector;
import com.alphawallet.app.ui.WalletConnectV2Activity;
import com.alphawallet.app.ui.WalletConnectV2Activity_MembersInjector;
import com.alphawallet.app.ui.WalletDiagnosticActivity;
import com.alphawallet.app.ui.WalletFragment;
import com.alphawallet.app.ui.WalletFragment_MembersInjector;
import com.alphawallet.app.ui.WalletTestFragment;
import com.alphawallet.app.ui.WalletsActivity;
import com.alphawallet.app.ui.WalletsActivity_MembersInjector;
import com.alphawallet.app.viewmodel.ActivityViewModel;
import com.alphawallet.app.viewmodel.ActivityViewModel_Factory;
import com.alphawallet.app.viewmodel.ActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.AddEditDappViewModel;
import com.alphawallet.app.viewmodel.AddEditDappViewModel_Factory;
import com.alphawallet.app.viewmodel.AddEditDappViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.AddTokenViewModel;
import com.alphawallet.app.viewmodel.AddTokenViewModel_Factory;
import com.alphawallet.app.viewmodel.AddTokenViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.AdvancedSettingsViewModel;
import com.alphawallet.app.viewmodel.AdvancedSettingsViewModel_Factory;
import com.alphawallet.app.viewmodel.AdvancedSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.ApiV1ViewModel;
import com.alphawallet.app.viewmodel.ApiV1ViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.BackupKeyViewModel;
import com.alphawallet.app.viewmodel.BackupKeyViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.BrowserHistoryViewModel;
import com.alphawallet.app.viewmodel.BrowserHistoryViewModel_Factory;
import com.alphawallet.app.viewmodel.BrowserHistoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.CoinbasePayViewModel;
import com.alphawallet.app.viewmodel.CoinbasePayViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.CustomNetworkViewModel;
import com.alphawallet.app.viewmodel.CustomNetworkViewModel_Factory;
import com.alphawallet.app.viewmodel.CustomNetworkViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.DappBrowserViewModel;
import com.alphawallet.app.viewmodel.DappBrowserViewModel_Factory;
import com.alphawallet.app.viewmodel.DappBrowserViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.Erc1155AssetListViewModel;
import com.alphawallet.app.viewmodel.Erc1155AssetListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.Erc1155AssetSelectViewModel;
import com.alphawallet.app.viewmodel.Erc1155AssetSelectViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.Erc20DetailViewModel;
import com.alphawallet.app.viewmodel.Erc20DetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.GasSettingsViewModel;
import com.alphawallet.app.viewmodel.GasSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.HomeViewModel;
import com.alphawallet.app.viewmodel.HomeViewModel_Factory;
import com.alphawallet.app.viewmodel.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.ImportTokenViewModel;
import com.alphawallet.app.viewmodel.ImportTokenViewModel_Factory;
import com.alphawallet.app.viewmodel.ImportTokenViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.ImportWalletViewModel;
import com.alphawallet.app.viewmodel.ImportWalletViewModel_Factory;
import com.alphawallet.app.viewmodel.ImportWalletViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.MyAddressViewModel;
import com.alphawallet.app.viewmodel.MyAddressViewModel_Factory;
import com.alphawallet.app.viewmodel.MyAddressViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.MyDappsViewModel;
import com.alphawallet.app.viewmodel.MyDappsViewModel_Factory;
import com.alphawallet.app.viewmodel.MyDappsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.NFTAssetsViewModel;
import com.alphawallet.app.viewmodel.NFTAssetsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.NFTViewModel;
import com.alphawallet.app.viewmodel.NFTViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.NameThisWalletViewModel;
import com.alphawallet.app.viewmodel.NameThisWalletViewModel_Factory;
import com.alphawallet.app.viewmodel.NameThisWalletViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.NewSettingsViewModel;
import com.alphawallet.app.viewmodel.NewSettingsViewModel_Factory;
import com.alphawallet.app.viewmodel.NewSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.NodeStatusViewModel;
import com.alphawallet.app.viewmodel.NodeStatusViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.QrScannerViewModel;
import com.alphawallet.app.viewmodel.QrScannerViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.RedeemAssetSelectViewModel;
import com.alphawallet.app.viewmodel.RedeemAssetSelectViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.RedeemSignatureDisplayModel;
import com.alphawallet.app.viewmodel.RedeemSignatureDisplayModel_Factory;
import com.alphawallet.app.viewmodel.RedeemSignatureDisplayModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SelectNetworkFilterViewModel;
import com.alphawallet.app.viewmodel.SelectNetworkFilterViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SelectNetworkViewModel;
import com.alphawallet.app.viewmodel.SelectNetworkViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SelectRouteViewModel;
import com.alphawallet.app.viewmodel.SelectRouteViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SelectSwapProvidersViewModel;
import com.alphawallet.app.viewmodel.SelectSwapProvidersViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SelectThemeViewModel;
import com.alphawallet.app.viewmodel.SelectThemeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SellDetailViewModel;
import com.alphawallet.app.viewmodel.SellDetailViewModel_Factory;
import com.alphawallet.app.viewmodel.SellDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SendViewModel;
import com.alphawallet.app.viewmodel.SendViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SetPriceAlertViewModel;
import com.alphawallet.app.viewmodel.SetPriceAlertViewModel_Factory;
import com.alphawallet.app.viewmodel.SetPriceAlertViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SignDialogViewModel;
import com.alphawallet.app.viewmodel.SignDialogViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SplashViewModel;
import com.alphawallet.app.viewmodel.SplashViewModel_Factory;
import com.alphawallet.app.viewmodel.SplashViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SupportSettingsViewModel;
import com.alphawallet.app.viewmodel.SupportSettingsViewModel_Factory;
import com.alphawallet.app.viewmodel.SupportSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.SwapViewModel;
import com.alphawallet.app.viewmodel.SwapViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TokenActivityViewModel;
import com.alphawallet.app.viewmodel.TokenActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TokenAlertsViewModel;
import com.alphawallet.app.viewmodel.TokenAlertsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TokenFunctionViewModel;
import com.alphawallet.app.viewmodel.TokenFunctionViewModel_Factory;
import com.alphawallet.app.viewmodel.TokenFunctionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TokenInfoViewModel;
import com.alphawallet.app.viewmodel.TokenInfoViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TokenManagementViewModel;
import com.alphawallet.app.viewmodel.TokenManagementViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TokenScriptManagementViewModel;
import com.alphawallet.app.viewmodel.TokenScriptManagementViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TransactionDetailViewModel;
import com.alphawallet.app.viewmodel.TransactionDetailViewModel_Factory;
import com.alphawallet.app.viewmodel.TransactionDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TransactionSuccessViewModel;
import com.alphawallet.app.viewmodel.TransactionSuccessViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TransferTicketDetailViewModel;
import com.alphawallet.app.viewmodel.TransferTicketDetailViewModel_Factory;
import com.alphawallet.app.viewmodel.TransferTicketDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.TransferTicketViewModel;
import com.alphawallet.app.viewmodel.TransferTicketViewModel_Factory;
import com.alphawallet.app.viewmodel.TransferTicketViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.WalletActionsViewModel;
import com.alphawallet.app.viewmodel.WalletActionsViewModel_Factory;
import com.alphawallet.app.viewmodel.WalletActionsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.WalletConnectV2ViewModel;
import com.alphawallet.app.viewmodel.WalletConnectV2ViewModel_Factory;
import com.alphawallet.app.viewmodel.WalletConnectV2ViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.WalletConnectViewModel;
import com.alphawallet.app.viewmodel.WalletConnectViewModel_Factory;
import com.alphawallet.app.viewmodel.WalletConnectViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.WalletViewModel;
import com.alphawallet.app.viewmodel.WalletViewModel_Factory;
import com.alphawallet.app.viewmodel.WalletViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.viewmodel.WalletsViewModel;
import com.alphawallet.app.viewmodel.WalletsViewModel_Factory;
import com.alphawallet.app.viewmodel.WalletsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.alphawallet.app.walletconnect.AWWalletConnectClient;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final ToolsModule toolsModule;

  private final ApplicationContextModule applicationContextModule;

  private final RepositoriesModule repositoriesModule;

  private final DaggerApp_HiltComponents_SingletonC singletonC = this;

  private Provider<RealmManager> provideRealmManagerProvider;

  private Provider<AWWalletConnectClient> provideAWWalletConnectClientProvider;

  private Provider<OkHttpClient> okHttpClientProvider;

  private Provider<PreferenceRepositoryType> providePreferenceRepositoryProvider;

  private Provider<EthereumNetworkRepositoryType> provideEthereumNetworkRepositoryProvider;

  private Provider<TokenLocalSource> provideRealmTokenSourceProvider;

  private Provider<TickerService> provideTickerServiceProvider;

  private Provider<AnalyticsServiceType> provideAnalyticsServiceProvider;

  private Provider<KeyService> provideKeyServiceProvider;

  private Provider<AccountKeystoreService> provideAccountKeyStoreServiceProvider;

  private Provider<WalletDataRealmSource> provideRealmWalletDataSourceProvider;

  private Provider<WalletRepositoryType> provideWalletRepositoryProvider;

  private Provider<TransactionLocalSource> provideTransactionInDiskCacheProvider;

  private Provider<TokenRepositoryType> provideTokenRepositoryProvider;

  private Provider<OpenSeaService> provideOpenseaServiceProvider;

  private Provider<TokensService> provideTokensServicesProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<TransactionsNetworkClientType> provideBlockExplorerClientProvider;

  private Provider<TransactionsService> provideTransactionsServicesProvider;

  private Provider<TransactionRepositoryType> provideTransactionRepositoryProvider;

  private Provider<IPFSServiceType> provideIPFSServiceProvider;

  private Provider<NotificationService> provideNotificationServiceProvider;

  private Provider<AlphaWalletService> provideFeemasterServiceProvider;

  private Provider<AssetDefinitionService> providingAssetDefinitionServicesProvider;

  private Provider<CoinbasePayRepositoryType> provideCoinbasePayRepositoryProvider;

  private Provider<GasService> provideGasServiceProvider;

  private Provider<OnRampRepositoryType> provideOnRampRepositoryProvider;

  private Provider<SwapService> provideSwapServiceProvider;

  private Provider<SwapRepositoryType> provideSwapRepositoryProvider;

  private DaggerApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam,
      RepositoriesModule repositoriesModuleParam, ToolsModule toolsModuleParam) {
    this.toolsModule = toolsModuleParam;
    this.applicationContextModule = applicationContextModuleParam;
    this.repositoriesModule = repositoriesModuleParam;
    initialize(applicationContextModuleParam, repositoriesModuleParam, toolsModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private WalletConnectInteract walletConnectInteract() {
    return new WalletConnectInteract(provideRealmManagerProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam,
      final RepositoriesModule repositoriesModuleParam, final ToolsModule toolsModuleParam) {
    this.provideRealmManagerProvider = DoubleCheck.provider(new SwitchingProvider<RealmManager>(singletonC, 1));
    this.provideAWWalletConnectClientProvider = DoubleCheck.provider(new SwitchingProvider<AWWalletConnectClient>(singletonC, 0));
    this.okHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 3));
    this.providePreferenceRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<PreferenceRepositoryType>(singletonC, 4));
    this.provideEthereumNetworkRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<EthereumNetworkRepositoryType>(singletonC, 6));
    this.provideRealmTokenSourceProvider = DoubleCheck.provider(new SwitchingProvider<TokenLocalSource>(singletonC, 5));
    this.provideTickerServiceProvider = DoubleCheck.provider(new SwitchingProvider<TickerService>(singletonC, 2));
    this.provideAnalyticsServiceProvider = DoubleCheck.provider(new SwitchingProvider<AnalyticsServiceType>(singletonC, 10));
    this.provideKeyServiceProvider = DoubleCheck.provider(new SwitchingProvider<KeyService>(singletonC, 9));
    this.provideAccountKeyStoreServiceProvider = DoubleCheck.provider(new SwitchingProvider<AccountKeystoreService>(singletonC, 8));
    this.provideRealmWalletDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<WalletDataRealmSource>(singletonC, 11));
    this.provideWalletRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<WalletRepositoryType>(singletonC, 7));
    this.provideTransactionInDiskCacheProvider = DoubleCheck.provider(new SwitchingProvider<TransactionLocalSource>(singletonC, 13));
    this.provideTokenRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<TokenRepositoryType>(singletonC, 16));
    this.provideOpenseaServiceProvider = DoubleCheck.provider(new SwitchingProvider<OpenSeaService>(singletonC, 17));
    this.provideTokensServicesProvider = DoubleCheck.provider(new SwitchingProvider<TokensService>(singletonC, 15));
    this.provideGsonProvider = DoubleCheck.provider(new SwitchingProvider<Gson>(singletonC, 19));
    this.provideBlockExplorerClientProvider = DoubleCheck.provider(new SwitchingProvider<TransactionsNetworkClientType>(singletonC, 18));
    this.provideTransactionsServicesProvider = DoubleCheck.provider(new SwitchingProvider<TransactionsService>(singletonC, 14));
    this.provideTransactionRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<TransactionRepositoryType>(singletonC, 12));
    this.provideIPFSServiceProvider = DoubleCheck.provider(new SwitchingProvider<IPFSServiceType>(singletonC, 21));
    this.provideNotificationServiceProvider = DoubleCheck.provider(new SwitchingProvider<NotificationService>(singletonC, 22));
    this.provideFeemasterServiceProvider = DoubleCheck.provider(new SwitchingProvider<AlphaWalletService>(singletonC, 23));
    this.providingAssetDefinitionServicesProvider = DoubleCheck.provider(new SwitchingProvider<AssetDefinitionService>(singletonC, 20));
    this.provideCoinbasePayRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<CoinbasePayRepositoryType>(singletonC, 24));
    this.provideGasServiceProvider = DoubleCheck.provider(new SwitchingProvider<GasService>(singletonC, 25));
    this.provideOnRampRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<OnRampRepositoryType>(singletonC, 26));
    this.provideSwapServiceProvider = DoubleCheck.provider(new SwitchingProvider<SwapService>(singletonC, 27));
    this.provideSwapRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<SwapRepositoryType>(singletonC, 28));
  }

  @Override
  public void injectApp(App app) {
    injectApp2(app);
  }

  @Override
  public Set<Boolean> getDisableFragmentGetContextFix() {
    return ImmutableSet.<Boolean>of();
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  @CanIgnoreReturnValue
  private App injectApp2(App instance) {
    App_MembersInjector.injectAwWalletConnectClient(instance, provideAWWalletConnectClientProvider.get());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private RepositoriesModule repositoriesModule;

    private ToolsModule toolsModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public Builder repositoriesModule(RepositoriesModule repositoriesModule) {
      this.repositoriesModule = Preconditions.checkNotNull(repositoriesModule);
      return this;
    }

    public Builder toolsModule(ToolsModule toolsModule) {
      this.toolsModule = Preconditions.checkNotNull(toolsModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (repositoriesModule == null) {
        this.repositoriesModule = new RepositoriesModule();
      }
      if (toolsModule == null) {
        this.toolsModule = new ToolsModule();
      }
      return new DaggerApp_HiltComponents_SingletonC(applicationContextModule, repositoriesModule, toolsModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, new ViewModelModule(), savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, new ServiceModule(), service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectActivityFragment(ActivityFragment arg0) {
    }

    @Override
    public void injectBaseFragment(BaseFragment arg0) {
    }

    @Override
    public void injectBrowserHistoryFragment(BrowserHistoryFragment arg0) {
    }

    @Override
    public void injectDappBrowserFragment(DappBrowserFragment arg0) {
    }

    @Override
    public void injectDiscoverDappsFragment(DiscoverDappsFragment arg0) {
    }

    @Override
    public void injectImportKeystoreFragment(ImportKeystoreFragment arg0) {
    }

    @Override
    public void injectImportPrivateKeyFragment(ImportPrivateKeyFragment arg0) {
    }

    @Override
    public void injectImportSeedFragment(ImportSeedFragment arg0) {
    }

    @Override
    public void injectMyDappsFragment(MyDappsFragment arg0) {
    }

    @Override
    public void injectNFTAssetsFragment(NFTAssetsFragment arg0) {
    }

    @Override
    public void injectNFTInfoFragment(NFTInfoFragment arg0) {
    }

    @Override
    public void injectNewSettingsFragment(NewSettingsFragment arg0) {
    }

    @Override
    public void injectSetWatchWalletFragment(SetWatchWalletFragment arg0) {
    }

    @Override
    public void injectTokenActivityFragment(TokenActivityFragment arg0) {
    }

    @Override
    public void injectTokenAlertsFragment(TokenAlertsFragment arg0) {
    }

    @Override
    public void injectTokenInfoFragment(TokenInfoFragment arg0) {
    }

    @Override
    public void injectWalletFragment(WalletFragment arg0) {
      injectWalletFragment2(arg0);
    }

    @Override
    public void injectWalletTestFragment(WalletTestFragment arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @CanIgnoreReturnValue
    private WalletFragment injectWalletFragment2(WalletFragment instance) {
      WalletFragment_MembersInjector.injectAwWalletConnectClient(instance, singletonC.provideAWWalletConnectClientProvider.get());
      return instance;
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectAddCustomRPCNetworkActivity(AddCustomRPCNetworkActivity arg0) {
    }

    @Override
    public void injectAddEditDappActivity(AddEditDappActivity arg0) {
    }

    @Override
    public void injectAddTokenActivity(AddTokenActivity arg0) {
    }

    @Override
    public void injectAdvancedSettingsActivity(AdvancedSettingsActivity arg0) {
    }

    @Override
    public void injectApiV1Activity(ApiV1Activity arg0) {
    }

    @Override
    public void injectAssetDisplayActivity(AssetDisplayActivity arg0) {
    }

    @Override
    public void injectBackupFlowActivity(BackupFlowActivity arg0) {
    }

    @Override
    public void injectBackupKeyActivity(BackupKeyActivity arg0) {
    }

    @Override
    public void injectCoinbasePayActivity(CoinbasePayActivity arg0) {
    }

    @Override
    public void injectEditTokensVisibilityActivity(EditTokensVisibilityActivity arg0) {
    }

    @Override
    public void injectErc1155AssetListActivity(Erc1155AssetListActivity arg0) {
    }

    @Override
    public void injectErc1155AssetSelectActivity(Erc1155AssetSelectActivity arg0) {
    }

    @Override
    public void injectErc20DetailActivity(Erc20DetailActivity arg0) {
    }

    @Override
    public void injectFunctionActivity(FunctionActivity arg0) {
    }

    @Override
    public void injectGasSettingsActivity(GasSettingsActivity arg0) {
    }

    @Override
    public void injectHomeActivity(HomeActivity arg0) {
      injectHomeActivity2(arg0);
    }

    @Override
    public void injectImportTokenActivity(ImportTokenActivity arg0) {
    }

    @Override
    public void injectImportWalletActivity(ImportWalletActivity arg0) {
    }

    @Override
    public void injectMyAddressActivity(MyAddressActivity arg0) {
    }

    @Override
    public void injectNFTActivity(NFTActivity arg0) {
    }

    @Override
    public void injectNFTAssetDetailActivity(NFTAssetDetailActivity arg0) {
    }

    @Override
    public void injectNameThisWalletActivity(NameThisWalletActivity arg0) {
    }

    @Override
    public void injectNodeStatusActivity(NodeStatusActivity arg0) {
    }

    @Override
    public void injectQRScannerActivity(QRScannerActivity arg0) {
    }

    @Override
    public void injectRedeemAssetSelectActivity(RedeemAssetSelectActivity arg0) {
    }

    @Override
    public void injectRedeemSignatureDisplayActivity(RedeemSignatureDisplayActivity arg0) {
    }

    @Override
    public void injectScammerWarningActivity(ScammerWarningActivity arg0) {
    }

    @Override
    public void injectSearchActivity(SearchActivity arg0) {
    }

    @Override
    public void injectSelectCurrencyActivity(SelectCurrencyActivity arg0) {
    }

    @Override
    public void injectSelectLocaleActivity(SelectLocaleActivity arg0) {
    }

    @Override
    public void injectSelectNetworkActivity(SelectNetworkActivity arg0) {
    }

    @Override
    public void injectSelectNetworkFilterActivity(SelectNetworkFilterActivity arg0) {
    }

    @Override
    public void injectSelectRouteActivity(SelectRouteActivity arg0) {
    }

    @Override
    public void injectSelectSwapProvidersActivity(SelectSwapProvidersActivity arg0) {
    }

    @Override
    public void injectSelectThemeActivity(SelectThemeActivity arg0) {
    }

    @Override
    public void injectSellDetailActivity(SellDetailActivity arg0) {
    }

    @Override
    public void injectSendActivity(SendActivity arg0) {
    }

    @Override
    public void injectSetPriceAlertActivity(SetPriceAlertActivity arg0) {
      injectSetPriceAlertActivity2(arg0);
    }

    @Override
    public void injectSignDetailActivity(SignDetailActivity arg0) {
    }

    @Override
    public void injectSplashActivity(SplashActivity arg0) {
    }

    @Override
    public void injectSupportSettingsActivity(SupportSettingsActivity arg0) {
    }

    @Override
    public void injectSwapActivity(SwapActivity arg0) {
    }

    @Override
    public void injectTokenActivity(TokenActivity arg0) {
    }

    @Override
    public void injectTokenDetailActivity(TokenDetailActivity arg0) {
    }

    @Override
    public void injectTokenFunctionActivity(TokenFunctionActivity arg0) {
    }

    @Override
    public void injectTokenManagementActivity(TokenManagementActivity arg0) {
    }

    @Override
    public void injectTokenScriptManagementActivity(TokenScriptManagementActivity arg0) {
    }

    @Override
    public void injectTransactionDetailActivity(TransactionDetailActivity arg0) {
    }

    @Override
    public void injectTransactionSuccessActivity(TransactionSuccessActivity arg0) {
    }

    @Override
    public void injectTransferNFTActivity(TransferNFTActivity arg0) {
    }

    @Override
    public void injectTransferTicketDetailActivity(TransferTicketDetailActivity arg0) {
    }

    @Override
    public void injectWalletActionsActivity(WalletActionsActivity arg0) {
    }

    @Override
    public void injectWalletConnectActivity(WalletConnectActivity arg0) {
      injectWalletConnectActivity2(arg0);
    }

    @Override
    public void injectWalletConnectNotificationActivity(WalletConnectNotificationActivity arg0) {
      injectWalletConnectNotificationActivity2(arg0);
    }

    @Override
    public void injectWalletConnectSessionActivity(WalletConnectSessionActivity arg0) {
      injectWalletConnectSessionActivity2(arg0);
    }

    @Override
    public void injectWalletConnectV2Activity(WalletConnectV2Activity arg0) {
      injectWalletConnectV2Activity2(arg0);
    }

    @Override
    public void injectWalletDiagnosticActivity(WalletDiagnosticActivity arg0) {
    }

    @Override
    public void injectWalletsActivity(WalletsActivity arg0) {
      injectWalletsActivity2(arg0);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(ActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddEditDappViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddTokenViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AdvancedSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ApiV1ViewModel_HiltModules_KeyModule_ProvideFactory.provide(), BackupKeyViewModel_HiltModules_KeyModule_ProvideFactory.provide(), BrowserHistoryViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CoinbasePayViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CustomNetworkViewModel_HiltModules_KeyModule_ProvideFactory.provide(), DappBrowserViewModel_HiltModules_KeyModule_ProvideFactory.provide(), Erc1155AssetListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), Erc1155AssetSelectViewModel_HiltModules_KeyModule_ProvideFactory.provide(), Erc20DetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), GasSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ImportTokenViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ImportWalletViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MyAddressViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MyDappsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NFTAssetsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NFTViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NameThisWalletViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NewSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NodeStatusViewModel_HiltModules_KeyModule_ProvideFactory.provide(), QrScannerViewModel_HiltModules_KeyModule_ProvideFactory.provide(), RedeemAssetSelectViewModel_HiltModules_KeyModule_ProvideFactory.provide(), RedeemSignatureDisplayModel_HiltModules_KeyModule_ProvideFactory.provide(), SelectNetworkFilterViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SelectNetworkViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SelectRouteViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SelectSwapProvidersViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SelectThemeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SellDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SendViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SetPriceAlertViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SignDialogViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SplashViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SupportSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SwapViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TokenActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TokenAlertsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TokenFunctionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TokenInfoViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TokenManagementViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TokenScriptManagementViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TransactionDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TransactionSuccessViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TransferTicketDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TransferTicketViewModel_HiltModules_KeyModule_ProvideFactory.provide(), WalletActionsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), WalletConnectV2ViewModel_HiltModules_KeyModule_ProvideFactory.provide(), WalletConnectViewModel_HiltModules_KeyModule_ProvideFactory.provide(), WalletViewModel_HiltModules_KeyModule_ProvideFactory.provide(), WalletsViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @CanIgnoreReturnValue
    private HomeActivity injectHomeActivity2(HomeActivity instance) {
      HomeActivity_MembersInjector.injectAwWalletConnectClient(instance, singletonC.provideAWWalletConnectClientProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private SetPriceAlertActivity injectSetPriceAlertActivity2(SetPriceAlertActivity instance) {
      SetPriceAlertActivity_MembersInjector.injectTickerService(instance, singletonC.provideTickerServiceProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private WalletConnectActivity injectWalletConnectActivity2(WalletConnectActivity instance) {
      WalletConnectActivity_MembersInjector.injectAwWalletConnectClient(instance, singletonC.provideAWWalletConnectClientProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private WalletConnectNotificationActivity injectWalletConnectNotificationActivity2(
        WalletConnectNotificationActivity instance) {
      WalletConnectNotificationActivity_MembersInjector.injectWalletConnectInteract(instance, singletonC.walletConnectInteract());
      return instance;
    }

    @CanIgnoreReturnValue
    private WalletConnectSessionActivity injectWalletConnectSessionActivity2(
        WalletConnectSessionActivity instance) {
      WalletConnectSessionActivity_MembersInjector.injectAwWalletConnectClient(instance, singletonC.provideAWWalletConnectClientProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private WalletConnectV2Activity injectWalletConnectV2Activity2(
        WalletConnectV2Activity instance) {
      WalletConnectV2Activity_MembersInjector.injectAwWalletConnectClient(instance, singletonC.provideAWWalletConnectClientProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private WalletsActivity injectWalletsActivity2(WalletsActivity instance) {
      WalletsActivity_MembersInjector.injectPreferenceRepository(instance, singletonC.providePreferenceRepositoryProvider.get());
      return instance;
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final ViewModelModule viewModelModule;

    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<ActivityViewModel> activityViewModelProvider;

    private Provider<AddEditDappViewModel> addEditDappViewModelProvider;

    private Provider<AddTokenViewModel> addTokenViewModelProvider;

    private Provider<AdvancedSettingsViewModel> advancedSettingsViewModelProvider;

    private Provider<ApiV1ViewModel> apiV1ViewModelProvider;

    private Provider<BackupKeyViewModel> backupKeyViewModelProvider;

    private Provider<BrowserHistoryViewModel> browserHistoryViewModelProvider;

    private Provider<CoinbasePayViewModel> coinbasePayViewModelProvider;

    private Provider<CustomNetworkViewModel> customNetworkViewModelProvider;

    private Provider<DappBrowserViewModel> dappBrowserViewModelProvider;

    private Provider<Erc1155AssetListViewModel> erc1155AssetListViewModelProvider;

    private Provider<Erc1155AssetSelectViewModel> erc1155AssetSelectViewModelProvider;

    private Provider<Erc20DetailViewModel> erc20DetailViewModelProvider;

    private Provider<GasSettingsViewModel> gasSettingsViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<ImportTokenViewModel> importTokenViewModelProvider;

    private Provider<ImportWalletViewModel> importWalletViewModelProvider;

    private Provider<MyAddressViewModel> myAddressViewModelProvider;

    private Provider<MyDappsViewModel> myDappsViewModelProvider;

    private Provider<NFTAssetsViewModel> nFTAssetsViewModelProvider;

    private Provider<NFTViewModel> nFTViewModelProvider;

    private Provider<NameThisWalletViewModel> nameThisWalletViewModelProvider;

    private Provider<NewSettingsViewModel> newSettingsViewModelProvider;

    private Provider<NodeStatusViewModel> nodeStatusViewModelProvider;

    private Provider<QrScannerViewModel> qrScannerViewModelProvider;

    private Provider<RedeemAssetSelectViewModel> redeemAssetSelectViewModelProvider;

    private Provider<RedeemSignatureDisplayModel> redeemSignatureDisplayModelProvider;

    private Provider<SelectNetworkFilterViewModel> selectNetworkFilterViewModelProvider;

    private Provider<SelectNetworkViewModel> selectNetworkViewModelProvider;

    private Provider<SelectRouteViewModel> selectRouteViewModelProvider;

    private Provider<SelectSwapProvidersViewModel> selectSwapProvidersViewModelProvider;

    private Provider<SelectThemeViewModel> selectThemeViewModelProvider;

    private Provider<SellDetailViewModel> sellDetailViewModelProvider;

    private Provider<SendViewModel> sendViewModelProvider;

    private Provider<SetPriceAlertViewModel> setPriceAlertViewModelProvider;

    private Provider<SignDialogViewModel> signDialogViewModelProvider;

    private Provider<SplashViewModel> splashViewModelProvider;

    private Provider<SupportSettingsViewModel> supportSettingsViewModelProvider;

    private Provider<SwapViewModel> swapViewModelProvider;

    private Provider<TokenActivityViewModel> tokenActivityViewModelProvider;

    private Provider<TokenAlertsViewModel> tokenAlertsViewModelProvider;

    private Provider<TokenFunctionViewModel> tokenFunctionViewModelProvider;

    private Provider<TokenInfoViewModel> tokenInfoViewModelProvider;

    private Provider<TokenManagementViewModel> tokenManagementViewModelProvider;

    private Provider<TokenScriptManagementViewModel> tokenScriptManagementViewModelProvider;

    private Provider<TransactionDetailViewModel> transactionDetailViewModelProvider;

    private Provider<TransactionSuccessViewModel> transactionSuccessViewModelProvider;

    private Provider<TransferTicketDetailViewModel> transferTicketDetailViewModelProvider;

    private Provider<TransferTicketViewModel> transferTicketViewModelProvider;

    private Provider<WalletActionsViewModel> walletActionsViewModelProvider;

    private Provider<WalletConnectV2ViewModel> walletConnectV2ViewModelProvider;

    private Provider<WalletConnectViewModel> walletConnectViewModelProvider;

    private Provider<WalletViewModel> walletViewModelProvider;

    private Provider<WalletsViewModel> walletsViewModelProvider;

    private ViewModelCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ViewModelModule viewModelModuleParam,
        SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.viewModelModule = viewModelModuleParam;
      initialize(viewModelModuleParam, savedStateHandleParam);

    }

    private GenericWalletInteract genericWalletInteract() {
      return ViewModelModule_ProvideGenericWalletInteractFactory.provideGenericWalletInteract(viewModelModule, singletonC.provideWalletRepositoryProvider.get());
    }

    private FetchTransactionsInteract fetchTransactionsInteract() {
      return ViewModelModule_ProvideFetchTransactionsInteractFactory.provideFetchTransactionsInteract(viewModelModule, singletonC.provideTransactionRepositoryProvider.get(), singletonC.provideTokenRepositoryProvider.get());
    }

    private CreateTransactionInteract createTransactionInteract() {
      return ViewModelModule_ProvideCreateTransactionInteractFactory.provideCreateTransactionInteract(viewModelModule, singletonC.provideTransactionRepositoryProvider.get());
    }

    private ExportWalletInteract exportWalletInteract() {
      return ViewModelModule_ProvideExportWalletInteractFactory.provideExportWalletInteract(viewModelModule, singletonC.provideWalletRepositoryProvider.get());
    }

    private FetchWalletsInteract fetchWalletsInteract() {
      return ViewModelModule_ProvideFetchWalletInteractFactory.provideFetchWalletInteract(viewModelModule, singletonC.provideWalletRepositoryProvider.get());
    }

    private LocaleRepositoryType localeRepositoryType() {
      return ViewModelModule_ProvideLocaleRepositoryFactory.provideLocaleRepository(viewModelModule, singletonC.providePreferenceRepositoryProvider.get());
    }

    private CurrencyRepositoryType currencyRepositoryType() {
      return ViewModelModule_ProvideCurrencyRepositoryFactory.provideCurrencyRepository(viewModelModule, singletonC.providePreferenceRepositoryProvider.get());
    }

    private FetchTokensInteract fetchTokensInteract() {
      return ViewModelModule_ProvideFetchTokensInteractFactory.provideFetchTokensInteract(viewModelModule, singletonC.provideTokenRepositoryProvider.get());
    }

    private ImportWalletInteract importWalletInteract() {
      return ViewModelModule_ProvideImportWalletInteractFactory.provideImportWalletInteract(viewModelModule, singletonC.provideWalletRepositoryProvider.get());
    }

    private SignatureGenerateInteract signatureGenerateInteract() {
      return ViewModelModule_ProvideSignatureGenerateInteractFactory.provideSignatureGenerateInteract(viewModelModule, singletonC.provideWalletRepositoryProvider.get());
    }

    private MemPoolInteract memPoolInteract() {
      return ViewModelModule_ProvideMemPoolInteractFactory.provideMemPoolInteract(viewModelModule, singletonC.provideTokenRepositoryProvider.get());
    }

    private FindDefaultNetworkInteract findDefaultNetworkInteract() {
      return ViewModelModule_ProvideFindDefaultNetworkInteractFactory.provideFindDefaultNetworkInteract(viewModelModule, singletonC.provideEthereumNetworkRepositoryProvider.get());
    }

    private ChangeTokenEnableInteract changeTokenEnableInteract() {
      return ViewModelModule_ProvideChangeTokenEnableInteractFactory.provideChangeTokenEnableInteract(viewModelModule, singletonC.provideTokenRepositoryProvider.get());
    }

    private DeleteWalletInteract deleteWalletInteract() {
      return ViewModelModule_ProvideDeleteAccountInteractFactory.provideDeleteAccountInteract(viewModelModule, singletonC.provideWalletRepositoryProvider.get());
    }

    private SetDefaultWalletInteract setDefaultWalletInteract() {
      return ViewModelModule_ProvideSetDefaultAccountInteractFactory.provideSetDefaultAccountInteract(viewModelModule, singletonC.provideWalletRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ViewModelModule viewModelModuleParam,
        final SavedStateHandle savedStateHandleParam) {
      this.activityViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.addEditDappViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.addTokenViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
      this.advancedSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 3);
      this.apiV1ViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 4);
      this.backupKeyViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 5);
      this.browserHistoryViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 6);
      this.coinbasePayViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 7);
      this.customNetworkViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 8);
      this.dappBrowserViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 9);
      this.erc1155AssetListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 10);
      this.erc1155AssetSelectViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 11);
      this.erc20DetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 12);
      this.gasSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 13);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 14);
      this.importTokenViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 15);
      this.importWalletViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 16);
      this.myAddressViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 17);
      this.myDappsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 18);
      this.nFTAssetsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 19);
      this.nFTViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 20);
      this.nameThisWalletViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 21);
      this.newSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 22);
      this.nodeStatusViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 23);
      this.qrScannerViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 24);
      this.redeemAssetSelectViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 25);
      this.redeemSignatureDisplayModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 26);
      this.selectNetworkFilterViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 27);
      this.selectNetworkViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 28);
      this.selectRouteViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 29);
      this.selectSwapProvidersViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 30);
      this.selectThemeViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 31);
      this.sellDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 32);
      this.sendViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 33);
      this.setPriceAlertViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 34);
      this.signDialogViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 35);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 36);
      this.supportSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 37);
      this.swapViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 38);
      this.tokenActivityViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 39);
      this.tokenAlertsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 40);
      this.tokenFunctionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 41);
      this.tokenInfoViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 42);
      this.tokenManagementViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 43);
      this.tokenScriptManagementViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 44);
      this.transactionDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 45);
      this.transactionSuccessViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 46);
      this.transferTicketDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 47);
      this.transferTicketViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 48);
      this.walletActionsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 49);
      this.walletConnectV2ViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 50);
      this.walletConnectViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 51);
      this.walletViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 52);
      this.walletsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 53);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(54).put("com.alphawallet.app.viewmodel.ActivityViewModel", ((Provider) activityViewModelProvider)).put("com.alphawallet.app.viewmodel.AddEditDappViewModel", ((Provider) addEditDappViewModelProvider)).put("com.alphawallet.app.viewmodel.AddTokenViewModel", ((Provider) addTokenViewModelProvider)).put("com.alphawallet.app.viewmodel.AdvancedSettingsViewModel", ((Provider) advancedSettingsViewModelProvider)).put("com.alphawallet.app.viewmodel.ApiV1ViewModel", ((Provider) apiV1ViewModelProvider)).put("com.alphawallet.app.viewmodel.BackupKeyViewModel", ((Provider) backupKeyViewModelProvider)).put("com.alphawallet.app.viewmodel.BrowserHistoryViewModel", ((Provider) browserHistoryViewModelProvider)).put("com.alphawallet.app.viewmodel.CoinbasePayViewModel", ((Provider) coinbasePayViewModelProvider)).put("com.alphawallet.app.viewmodel.CustomNetworkViewModel", ((Provider) customNetworkViewModelProvider)).put("com.alphawallet.app.viewmodel.DappBrowserViewModel", ((Provider) dappBrowserViewModelProvider)).put("com.alphawallet.app.viewmodel.Erc1155AssetListViewModel", ((Provider) erc1155AssetListViewModelProvider)).put("com.alphawallet.app.viewmodel.Erc1155AssetSelectViewModel", ((Provider) erc1155AssetSelectViewModelProvider)).put("com.alphawallet.app.viewmodel.Erc20DetailViewModel", ((Provider) erc20DetailViewModelProvider)).put("com.alphawallet.app.viewmodel.GasSettingsViewModel", ((Provider) gasSettingsViewModelProvider)).put("com.alphawallet.app.viewmodel.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.alphawallet.app.viewmodel.ImportTokenViewModel", ((Provider) importTokenViewModelProvider)).put("com.alphawallet.app.viewmodel.ImportWalletViewModel", ((Provider) importWalletViewModelProvider)).put("com.alphawallet.app.viewmodel.MyAddressViewModel", ((Provider) myAddressViewModelProvider)).put("com.alphawallet.app.viewmodel.MyDappsViewModel", ((Provider) myDappsViewModelProvider)).put("com.alphawallet.app.viewmodel.NFTAssetsViewModel", ((Provider) nFTAssetsViewModelProvider)).put("com.alphawallet.app.viewmodel.NFTViewModel", ((Provider) nFTViewModelProvider)).put("com.alphawallet.app.viewmodel.NameThisWalletViewModel", ((Provider) nameThisWalletViewModelProvider)).put("com.alphawallet.app.viewmodel.NewSettingsViewModel", ((Provider) newSettingsViewModelProvider)).put("com.alphawallet.app.viewmodel.NodeStatusViewModel", ((Provider) nodeStatusViewModelProvider)).put("com.alphawallet.app.viewmodel.QrScannerViewModel", ((Provider) qrScannerViewModelProvider)).put("com.alphawallet.app.viewmodel.RedeemAssetSelectViewModel", ((Provider) redeemAssetSelectViewModelProvider)).put("com.alphawallet.app.viewmodel.RedeemSignatureDisplayModel", ((Provider) redeemSignatureDisplayModelProvider)).put("com.alphawallet.app.viewmodel.SelectNetworkFilterViewModel", ((Provider) selectNetworkFilterViewModelProvider)).put("com.alphawallet.app.viewmodel.SelectNetworkViewModel", ((Provider) selectNetworkViewModelProvider)).put("com.alphawallet.app.viewmodel.SelectRouteViewModel", ((Provider) selectRouteViewModelProvider)).put("com.alphawallet.app.viewmodel.SelectSwapProvidersViewModel", ((Provider) selectSwapProvidersViewModelProvider)).put("com.alphawallet.app.viewmodel.SelectThemeViewModel", ((Provider) selectThemeViewModelProvider)).put("com.alphawallet.app.viewmodel.SellDetailViewModel", ((Provider) sellDetailViewModelProvider)).put("com.alphawallet.app.viewmodel.SendViewModel", ((Provider) sendViewModelProvider)).put("com.alphawallet.app.viewmodel.SetPriceAlertViewModel", ((Provider) setPriceAlertViewModelProvider)).put("com.alphawallet.app.viewmodel.SignDialogViewModel", ((Provider) signDialogViewModelProvider)).put("com.alphawallet.app.viewmodel.SplashViewModel", ((Provider) splashViewModelProvider)).put("com.alphawallet.app.viewmodel.SupportSettingsViewModel", ((Provider) supportSettingsViewModelProvider)).put("com.alphawallet.app.viewmodel.SwapViewModel", ((Provider) swapViewModelProvider)).put("com.alphawallet.app.viewmodel.TokenActivityViewModel", ((Provider) tokenActivityViewModelProvider)).put("com.alphawallet.app.viewmodel.TokenAlertsViewModel", ((Provider) tokenAlertsViewModelProvider)).put("com.alphawallet.app.viewmodel.TokenFunctionViewModel", ((Provider) tokenFunctionViewModelProvider)).put("com.alphawallet.app.viewmodel.TokenInfoViewModel", ((Provider) tokenInfoViewModelProvider)).put("com.alphawallet.app.viewmodel.TokenManagementViewModel", ((Provider) tokenManagementViewModelProvider)).put("com.alphawallet.app.viewmodel.TokenScriptManagementViewModel", ((Provider) tokenScriptManagementViewModelProvider)).put("com.alphawallet.app.viewmodel.TransactionDetailViewModel", ((Provider) transactionDetailViewModelProvider)).put("com.alphawallet.app.viewmodel.TransactionSuccessViewModel", ((Provider) transactionSuccessViewModelProvider)).put("com.alphawallet.app.viewmodel.TransferTicketDetailViewModel", ((Provider) transferTicketDetailViewModelProvider)).put("com.alphawallet.app.viewmodel.TransferTicketViewModel", ((Provider) transferTicketViewModelProvider)).put("com.alphawallet.app.viewmodel.WalletActionsViewModel", ((Provider) walletActionsViewModelProvider)).put("com.alphawallet.app.viewmodel.WalletConnectV2ViewModel", ((Provider) walletConnectV2ViewModelProvider)).put("com.alphawallet.app.viewmodel.WalletConnectViewModel", ((Provider) walletConnectViewModelProvider)).put("com.alphawallet.app.viewmodel.WalletViewModel", ((Provider) walletViewModelProvider)).put("com.alphawallet.app.viewmodel.WalletsViewModel", ((Provider) walletsViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.alphawallet.app.viewmodel.ActivityViewModel 
          return (T) ActivityViewModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), viewModelCImpl.fetchTransactionsInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideTransactionsServicesProvider.get(), singletonC.provideRealmManagerProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 1: // com.alphawallet.app.viewmodel.AddEditDappViewModel 
          return (T) AddEditDappViewModel_Factory.newInstance(singletonC.provideAnalyticsServiceProvider.get());

          case 2: // com.alphawallet.app.viewmodel.AddTokenViewModel 
          return (T) AddTokenViewModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), singletonC.provideEthereumNetworkRepositoryProvider.get(), viewModelCImpl.fetchTransactionsInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get());

          case 3: // com.alphawallet.app.viewmodel.AdvancedSettingsViewModel 
          return (T) AdvancedSettingsViewModel_Factory.newInstance(singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideTransactionsServicesProvider.get());

          case 4: // com.alphawallet.app.viewmodel.ApiV1ViewModel 
          return (T) new ApiV1ViewModel(viewModelCImpl.genericWalletInteract(), viewModelCImpl.createTransactionInteract(), singletonC.provideKeyServiceProvider.get());

          case 5: // com.alphawallet.app.viewmodel.BackupKeyViewModel 
          return (T) new BackupKeyViewModel(singletonC.provideKeyServiceProvider.get(), viewModelCImpl.exportWalletInteract(), viewModelCImpl.fetchWalletsInteract());

          case 6: // com.alphawallet.app.viewmodel.BrowserHistoryViewModel 
          return (T) BrowserHistoryViewModel_Factory.newInstance(singletonC.provideAnalyticsServiceProvider.get());

          case 7: // com.alphawallet.app.viewmodel.CoinbasePayViewModel 
          return (T) new CoinbasePayViewModel(viewModelCImpl.genericWalletInteract(), singletonC.provideCoinbasePayRepositoryProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 8: // com.alphawallet.app.viewmodel.CustomNetworkViewModel 
          return (T) CustomNetworkViewModel_Factory.newInstance(singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 9: // com.alphawallet.app.viewmodel.DappBrowserViewModel 
          return (T) DappBrowserViewModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), viewModelCImpl.createTransactionInteract(), singletonC.provideTokensServicesProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideKeyServiceProvider.get(), singletonC.provideGasServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 10: // com.alphawallet.app.viewmodel.Erc1155AssetListViewModel 
          return (T) new Erc1155AssetListViewModel(singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get());

          case 11: // com.alphawallet.app.viewmodel.Erc1155AssetSelectViewModel 
          return (T) new Erc1155AssetSelectViewModel(viewModelCImpl.fetchTransactionsInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get());

          case 12: // com.alphawallet.app.viewmodel.Erc20DetailViewModel 
          return (T) new Erc20DetailViewModel(ViewModelModule_ProvideMyAddressRouterFactory.provideMyAddressRouter(viewModelCImpl.viewModelModule), viewModelCImpl.fetchTransactionsInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideOnRampRepositoryProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 13: // com.alphawallet.app.viewmodel.GasSettingsViewModel 
          return (T) new GasSettingsViewModel(singletonC.provideTokensServicesProvider.get());

          case 14: // com.alphawallet.app.viewmodel.HomeViewModel 
          return (T) HomeViewModel_Factory.newInstance(singletonC.providePreferenceRepositoryProvider.get(), viewModelCImpl.localeRepositoryType(), ViewModelModule_ProvideImportTokenRouterFactory.provideImportTokenRouter(viewModelCImpl.viewModelModule), singletonC.providingAssetDefinitionServicesProvider.get(), viewModelCImpl.genericWalletInteract(), viewModelCImpl.fetchWalletsInteract(), viewModelCImpl.currencyRepositoryType(), singletonC.provideEthereumNetworkRepositoryProvider.get(), ViewModelModule_ProvideMyAddressRouterFactory.provideMyAddressRouter(viewModelCImpl.viewModelModule), singletonC.provideTransactionsServicesProvider.get(), singletonC.provideAnalyticsServiceProvider.get(), ViewModelModule_ExternalBrowserRouterFactory.externalBrowserRouter(viewModelCImpl.viewModelModule), singletonC.okHttpClientProvider.get(), singletonC.provideRealmManagerProvider.get());

          case 15: // com.alphawallet.app.viewmodel.ImportTokenViewModel 
          return (T) ImportTokenViewModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), viewModelCImpl.createTransactionInteract(), viewModelCImpl.fetchTokensInteract(), singletonC.provideTokensServicesProvider.get(), singletonC.provideFeemasterServiceProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.providingAssetDefinitionServicesProvider.get(), viewModelCImpl.fetchTransactionsInteract(), singletonC.provideGasServiceProvider.get(), singletonC.provideKeyServiceProvider.get());

          case 16: // com.alphawallet.app.viewmodel.ImportWalletViewModel 
          return (T) ImportWalletViewModel_Factory.newInstance(viewModelCImpl.importWalletInteract(), singletonC.provideKeyServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 17: // com.alphawallet.app.viewmodel.MyAddressViewModel 
          return (T) MyAddressViewModel_Factory.newInstance(singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.providingAssetDefinitionServicesProvider.get());

          case 18: // com.alphawallet.app.viewmodel.MyDappsViewModel 
          return (T) MyDappsViewModel_Factory.newInstance(singletonC.provideAnalyticsServiceProvider.get());

          case 19: // com.alphawallet.app.viewmodel.NFTAssetsViewModel 
          return (T) new NFTAssetsViewModel(viewModelCImpl.fetchTransactionsInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideOpenseaServiceProvider.get());

          case 20: // com.alphawallet.app.viewmodel.NFTViewModel 
          return (T) new NFTViewModel(viewModelCImpl.fetchTransactionsInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get());

          case 21: // com.alphawallet.app.viewmodel.NameThisWalletViewModel 
          return (T) NameThisWalletViewModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideAnalyticsServiceProvider.get());

          case 22: // com.alphawallet.app.viewmodel.NewSettingsViewModel 
          return (T) NewSettingsViewModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), ViewModelModule_ProvideMyAddressRouterFactory.provideMyAddressRouter(viewModelCImpl.viewModelModule), ViewModelModule_ProvideManageWalletsRouterFactory.provideManageWalletsRouter(viewModelCImpl.viewModelModule), singletonC.providePreferenceRepositoryProvider.get(), viewModelCImpl.localeRepositoryType(), viewModelCImpl.currencyRepositoryType(), singletonC.provideTransactionsServicesProvider.get(), singletonC.provideTickerServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 23: // com.alphawallet.app.viewmodel.NodeStatusViewModel 
          return (T) new NodeStatusViewModel(singletonC.provideEthereumNetworkRepositoryProvider.get());

          case 24: // com.alphawallet.app.viewmodel.QrScannerViewModel 
          return (T) new QrScannerViewModel(singletonC.provideAnalyticsServiceProvider.get());

          case 25: // com.alphawallet.app.viewmodel.RedeemAssetSelectViewModel 
          return (T) new RedeemAssetSelectViewModel(ViewModelModule_ProvideRedeemSignatureDisplayRouterFactory.provideRedeemSignatureDisplayRouter(viewModelCImpl.viewModelModule), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get(), viewModelCImpl.genericWalletInteract());

          case 26: // com.alphawallet.app.viewmodel.RedeemSignatureDisplayModel 
          return (T) RedeemSignatureDisplayModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), viewModelCImpl.signatureGenerateInteract(), viewModelCImpl.createTransactionInteract(), singletonC.provideKeyServiceProvider.get(), viewModelCImpl.fetchTokensInteract(), viewModelCImpl.memPoolInteract(), singletonC.provideTokensServicesProvider.get(), singletonC.providingAssetDefinitionServicesProvider.get());

          case 27: // com.alphawallet.app.viewmodel.SelectNetworkFilterViewModel 
          return (T) new SelectNetworkFilterViewModel(singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 28: // com.alphawallet.app.viewmodel.SelectNetworkViewModel 
          return (T) new SelectNetworkViewModel(singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.providePreferenceRepositoryProvider.get());

          case 29: // com.alphawallet.app.viewmodel.SelectRouteViewModel 
          return (T) new SelectRouteViewModel(singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideSwapServiceProvider.get());

          case 30: // com.alphawallet.app.viewmodel.SelectSwapProvidersViewModel 
          return (T) new SelectSwapProvidersViewModel(singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideSwapRepositoryProvider.get());

          case 31: // com.alphawallet.app.viewmodel.SelectThemeViewModel 
          return (T) new SelectThemeViewModel(singletonC.providePreferenceRepositoryProvider.get());

          case 32: // com.alphawallet.app.viewmodel.SellDetailViewModel 
          return (T) SellDetailViewModel_Factory.newInstance(viewModelCImpl.findDefaultNetworkInteract(), singletonC.provideTokensServicesProvider.get(), viewModelCImpl.createTransactionInteract(), ViewModelModule_ProvideSellDetailRouterFactory.provideSellDetailRouter(viewModelCImpl.viewModelModule), singletonC.provideKeyServiceProvider.get(), singletonC.providingAssetDefinitionServicesProvider.get());

          case 33: // com.alphawallet.app.viewmodel.SendViewModel 
          return (T) new SendViewModel(ViewModelModule_ProvideMyAddressRouterFactory.provideMyAddressRouter(viewModelCImpl.viewModelModule), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideTokensServicesProvider.get(), viewModelCImpl.fetchTransactionsInteract(), viewModelCImpl.createTransactionInteract(), singletonC.provideGasServiceProvider.get(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideKeyServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 34: // com.alphawallet.app.viewmodel.SetPriceAlertViewModel 
          return (T) SetPriceAlertViewModel_Factory.newInstance(viewModelCImpl.currencyRepositoryType(), singletonC.provideTokensServicesProvider.get());

          case 35: // com.alphawallet.app.viewmodel.SignDialogViewModel 
          return (T) new SignDialogViewModel(viewModelCImpl.genericWalletInteract(), singletonC.provideTransactionRepositoryProvider.get(), singletonC.provideKeyServiceProvider.get());

          case 36: // com.alphawallet.app.viewmodel.SplashViewModel 
          return (T) SplashViewModel_Factory.newInstance(viewModelCImpl.fetchWalletsInteract(), singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideKeyServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 37: // com.alphawallet.app.viewmodel.SupportSettingsViewModel 
          return (T) SupportSettingsViewModel_Factory.newInstance(singletonC.provideAnalyticsServiceProvider.get());

          case 38: // com.alphawallet.app.viewmodel.SwapViewModel 
          return (T) new SwapViewModel(singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideSwapRepositoryProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideSwapServiceProvider.get(), viewModelCImpl.createTransactionInteract(), singletonC.provideKeyServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

          case 39: // com.alphawallet.app.viewmodel.TokenActivityViewModel 
          return (T) new TokenActivityViewModel(singletonC.providingAssetDefinitionServicesProvider.get(), viewModelCImpl.fetchTransactionsInteract(), singletonC.provideTokensServicesProvider.get());

          case 40: // com.alphawallet.app.viewmodel.TokenAlertsViewModel 
          return (T) new TokenAlertsViewModel(singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideTickerServiceProvider.get());

          case 41: // com.alphawallet.app.viewmodel.TokenFunctionViewModel 
          return (T) TokenFunctionViewModel_Factory.newInstance(singletonC.providingAssetDefinitionServicesProvider.get(), viewModelCImpl.createTransactionInteract(), singletonC.provideGasServiceProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideKeyServiceProvider.get(), viewModelCImpl.genericWalletInteract(), singletonC.provideOpenseaServiceProvider.get(), viewModelCImpl.fetchTransactionsInteract(), singletonC.provideAnalyticsServiceProvider.get());

          case 42: // com.alphawallet.app.viewmodel.TokenInfoViewModel 
          return (T) new TokenInfoViewModel(singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get());

          case 43: // com.alphawallet.app.viewmodel.TokenManagementViewModel 
          return (T) new TokenManagementViewModel(singletonC.provideTokenRepositoryProvider.get(), viewModelCImpl.changeTokenEnableInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get());

          case 44: // com.alphawallet.app.viewmodel.TokenScriptManagementViewModel 
          return (T) new TokenScriptManagementViewModel(singletonC.providingAssetDefinitionServicesProvider.get());

          case 45: // com.alphawallet.app.viewmodel.TransactionDetailViewModel 
          return (T) TransactionDetailViewModel_Factory.newInstance(viewModelCImpl.findDefaultNetworkInteract(), ViewModelModule_ExternalBrowserRouterFactory.externalBrowserRouter(viewModelCImpl.viewModelModule), singletonC.provideTokenRepositoryProvider.get(), singletonC.provideTokensServicesProvider.get(), viewModelCImpl.fetchTransactionsInteract(), singletonC.provideKeyServiceProvider.get(), singletonC.provideGasServiceProvider.get(), viewModelCImpl.createTransactionInteract(), singletonC.provideAnalyticsServiceProvider.get());

          case 46: // com.alphawallet.app.viewmodel.TransactionSuccessViewModel 
          return (T) new TransactionSuccessViewModel(singletonC.providePreferenceRepositoryProvider.get());

          case 47: // com.alphawallet.app.viewmodel.TransferTicketDetailViewModel 
          return (T) TransferTicketDetailViewModel_Factory.newInstance(viewModelCImpl.genericWalletInteract(), singletonC.provideKeyServiceProvider.get(), viewModelCImpl.createTransactionInteract(), viewModelCImpl.fetchTransactionsInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideGasServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get(), singletonC.provideTokensServicesProvider.get());

          case 48: // com.alphawallet.app.viewmodel.TransferTicketViewModel 
          return (T) TransferTicketViewModel_Factory.newInstance(singletonC.provideTokensServicesProvider.get(), viewModelCImpl.genericWalletInteract(), ViewModelModule_ProvideTransferTicketRouterFactory.provideTransferTicketRouter(viewModelCImpl.viewModelModule), singletonC.providingAssetDefinitionServicesProvider.get());

          case 49: // com.alphawallet.app.viewmodel.WalletActionsViewModel 
          return (T) WalletActionsViewModel_Factory.newInstance(ViewModelModule_ProvideHomeRouterFactory.provideHomeRouter(viewModelCImpl.viewModelModule), viewModelCImpl.deleteWalletInteract(), viewModelCImpl.exportWalletInteract(), viewModelCImpl.fetchWalletsInteract());

          case 50: // com.alphawallet.app.viewmodel.WalletConnectV2ViewModel 
          return (T) WalletConnectV2ViewModel_Factory.newInstance(viewModelCImpl.fetchWalletsInteract(), viewModelCImpl.genericWalletInteract());

          case 51: // com.alphawallet.app.viewmodel.WalletConnectViewModel 
          return (T) WalletConnectViewModel_Factory.newInstance(singletonC.provideKeyServiceProvider.get(), viewModelCImpl.findDefaultNetworkInteract(), viewModelCImpl.fetchWalletsInteract(), viewModelCImpl.createTransactionInteract(), viewModelCImpl.genericWalletInteract(), singletonC.walletConnectInteract(), singletonC.provideRealmManagerProvider.get(), singletonC.provideGasServiceProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideAnalyticsServiceProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideAWWalletConnectClientProvider.get());

          case 52: // com.alphawallet.app.viewmodel.WalletViewModel 
          return (T) WalletViewModel_Factory.newInstance(viewModelCImpl.fetchTokensInteract(), ViewModelModule_ProvideErc20DetailRouterRouterFactory.provideErc20DetailRouterRouter(viewModelCImpl.viewModelModule), viewModelCImpl.genericWalletInteract(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.provideTokensServicesProvider.get(), viewModelCImpl.changeTokenEnableInteract(), ViewModelModule_ProvideMyAddressRouterFactory.provideMyAddressRouter(viewModelCImpl.viewModelModule), ViewModelModule_ProvideCoinbasePayRouterFactory.provideCoinbasePayRouter(viewModelCImpl.viewModelModule), ViewModelModule_ProvideManageWalletsRouterFactory.provideManageWalletsRouter(viewModelCImpl.viewModelModule), singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideRealmManagerProvider.get(), singletonC.provideOnRampRepositoryProvider.get(), singletonC.provideAnalyticsServiceProvider.get(), singletonC.provideAWWalletConnectClientProvider.get());

          case 53: // com.alphawallet.app.viewmodel.WalletsViewModel 
          return (T) WalletsViewModel_Factory.newInstance(viewModelCImpl.setDefaultWalletInteract(), viewModelCImpl.fetchWalletsInteract(), viewModelCImpl.genericWalletInteract(), ViewModelModule_ProvideImportAccountRouterFactory.provideImportAccountRouter(viewModelCImpl.viewModelModule), ViewModelModule_ProvideHomeRouterFactory.provideHomeRouter(viewModelCImpl.viewModelModule), viewModelCImpl.findDefaultNetworkInteract(), singletonC.provideKeyServiceProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideTokenRepositoryProvider.get(), singletonC.provideTickerServiceProvider.get(), singletonC.providingAssetDefinitionServicesProvider.get(), singletonC.providePreferenceRepositoryProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final ServiceModule serviceModule;

    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerApp_HiltComponents_SingletonC singletonC,
        ServiceModule serviceModuleParam, Service serviceParam) {
      this.singletonC = singletonC;
      this.serviceModule = serviceModuleParam;

    }

    private GenericWalletInteract genericWalletInteract() {
      return ServiceModule_ProvideGenericWalletInteractFactory.provideGenericWalletInteract(serviceModule, singletonC.provideWalletRepositoryProvider.get());
    }

    @Override
    public void injectPriceAlertsService(PriceAlertsService arg0) {
      injectPriceAlertsService2(arg0);
    }

    @Override
    public void injectWalletConnectV2Service(WalletConnectV2Service arg0) {
    }

    @CanIgnoreReturnValue
    private PriceAlertsService injectPriceAlertsService2(PriceAlertsService instance) {
      PriceAlertsService_MembersInjector.injectLocalSource(instance, singletonC.provideRealmTokenSourceProvider.get());
      PriceAlertsService_MembersInjector.injectPreferenceRepository(instance, singletonC.providePreferenceRepositoryProvider.get());
      PriceAlertsService_MembersInjector.injectTokensService(instance, singletonC.provideTokensServicesProvider.get());
      PriceAlertsService_MembersInjector.injectTickerService(instance, singletonC.provideTickerServiceProvider.get());
      PriceAlertsService_MembersInjector.injectNotificationService(instance, singletonC.provideNotificationServiceProvider.get());
      PriceAlertsService_MembersInjector.injectTokenDetailRouter(instance, ServiceModule_ProvideTokenDetailRouterFactory.provideTokenDetailRouter(serviceModule));
      PriceAlertsService_MembersInjector.injectGenericWalletInteract(instance, genericWalletInteract());
      PriceAlertsService_MembersInjector.injectAssetDefinitionService(instance, singletonC.providingAssetDefinitionServicesProvider.get());
      return instance;
    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerApp_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerApp_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.alphawallet.app.walletconnect.AWWalletConnectClient 
        return (T) ToolsModule_ProvideAWWalletConnectClientFactory.provideAWWalletConnectClient(singletonC.toolsModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.walletConnectInteract());

        case 1: // com.alphawallet.app.service.RealmManager 
        return (T) ToolsModule_ProvideRealmManagerFactory.provideRealmManager(singletonC.toolsModule);

        case 2: // com.alphawallet.app.service.TickerService 
        return (T) RepositoriesModule_ProvideTickerServiceFactory.provideTickerService(singletonC.repositoriesModule, singletonC.okHttpClientProvider.get(), singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideRealmTokenSourceProvider.get());

        case 3: // okhttp3.OkHttpClient 
        return (T) ToolsModule_OkHttpClientFactory.okHttpClient(singletonC.toolsModule);

        case 4: // com.alphawallet.app.repository.PreferenceRepositoryType 
        return (T) RepositoriesModule_ProvidePreferenceRepositoryFactory.providePreferenceRepository(singletonC.repositoriesModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 5: // com.alphawallet.app.repository.TokenLocalSource 
        return (T) RepositoriesModule_ProvideRealmTokenSourceFactory.provideRealmTokenSource(singletonC.repositoriesModule, singletonC.provideRealmManagerProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get());

        case 6: // com.alphawallet.app.repository.EthereumNetworkRepositoryType 
        return (T) RepositoriesModule_ProvideEthereumNetworkRepositoryFactory.provideEthereumNetworkRepository(singletonC.repositoriesModule, singletonC.providePreferenceRepositoryProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 7: // com.alphawallet.app.repository.WalletRepositoryType 
        return (T) RepositoriesModule_ProvideWalletRepositoryFactory.provideWalletRepository(singletonC.repositoriesModule, singletonC.providePreferenceRepositoryProvider.get(), singletonC.provideAccountKeyStoreServiceProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideRealmWalletDataSourceProvider.get(), singletonC.provideKeyServiceProvider.get());

        case 8: // com.alphawallet.app.service.AccountKeystoreService 
        return (T) RepositoriesModule_ProvideAccountKeyStoreServiceFactory.provideAccountKeyStoreService(singletonC.repositoriesModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideKeyServiceProvider.get());

        case 9: // com.alphawallet.app.service.KeyService 
        return (T) RepositoriesModule_ProvideKeyServiceFactory.provideKeyService(singletonC.repositoriesModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideAnalyticsServiceProvider.get());

        case 10: // com.alphawallet.app.service.AnalyticsServiceType 
        return (T) RepositoriesModule_ProvideAnalyticsServiceFactory.provideAnalyticsService(singletonC.repositoriesModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 11: // com.alphawallet.app.repository.WalletDataRealmSource 
        return (T) RepositoriesModule_ProvideRealmWalletDataSourceFactory.provideRealmWalletDataSource(singletonC.repositoriesModule, singletonC.provideRealmManagerProvider.get());

        case 12: // com.alphawallet.app.repository.TransactionRepositoryType 
        return (T) RepositoriesModule_ProvideTransactionRepositoryFactory.provideTransactionRepository(singletonC.repositoriesModule, singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideAccountKeyStoreServiceProvider.get(), singletonC.provideTransactionInDiskCacheProvider.get(), singletonC.provideTransactionsServicesProvider.get());

        case 13: // com.alphawallet.app.repository.TransactionLocalSource 
        return (T) RepositoriesModule_ProvideTransactionInDiskCacheFactory.provideTransactionInDiskCache(singletonC.repositoriesModule, singletonC.provideRealmManagerProvider.get());

        case 14: // com.alphawallet.app.service.TransactionsService 
        return (T) RepositoriesModule_ProvideTransactionsServicesFactory.provideTransactionsServices(singletonC.repositoriesModule, singletonC.provideTokensServicesProvider.get(), singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideBlockExplorerClientProvider.get(), singletonC.provideTransactionInDiskCacheProvider.get());

        case 15: // com.alphawallet.app.service.TokensService 
        return (T) RepositoriesModule_ProvideTokensServicesFactory.provideTokensServices(singletonC.repositoriesModule, singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideTokenRepositoryProvider.get(), singletonC.provideTickerServiceProvider.get(), singletonC.provideOpenseaServiceProvider.get(), singletonC.provideAnalyticsServiceProvider.get());

        case 16: // com.alphawallet.app.repository.TokenRepositoryType 
        return (T) RepositoriesModule_ProvideTokenRepositoryFactory.provideTokenRepository(singletonC.repositoriesModule, singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.provideRealmTokenSourceProvider.get(), singletonC.okHttpClientProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideTickerServiceProvider.get());

        case 17: // com.alphawallet.app.service.OpenSeaService 
        return (T) RepositoriesModule_ProvideOpenseaServiceFactory.provideOpenseaService(singletonC.repositoriesModule);

        case 18: // com.alphawallet.app.service.TransactionsNetworkClientType 
        return (T) RepositoriesModule_ProvideBlockExplorerClientFactory.provideBlockExplorerClient(singletonC.repositoriesModule, singletonC.okHttpClientProvider.get(), singletonC.provideGsonProvider.get(), singletonC.provideRealmManagerProvider.get());

        case 19: // com.google.gson.Gson 
        return (T) ToolsModule_ProvideGsonFactory.provideGson(singletonC.toolsModule);

        case 20: // com.alphawallet.app.service.AssetDefinitionService 
        return (T) RepositoriesModule_ProvidingAssetDefinitionServicesFactory.providingAssetDefinitionServices(singletonC.repositoriesModule, singletonC.provideIPFSServiceProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideNotificationServiceProvider.get(), singletonC.provideRealmManagerProvider.get(), singletonC.provideTokensServicesProvider.get(), singletonC.provideRealmTokenSourceProvider.get(), singletonC.provideFeemasterServiceProvider.get());

        case 21: // com.alphawallet.app.service.IPFSServiceType 
        return (T) RepositoriesModule_ProvideIPFSServiceFactory.provideIPFSService(singletonC.repositoriesModule, singletonC.okHttpClientProvider.get());

        case 22: // com.alphawallet.app.service.NotificationService 
        return (T) RepositoriesModule_ProvideNotificationServiceFactory.provideNotificationService(singletonC.repositoriesModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 23: // com.alphawallet.app.service.AlphaWalletService 
        return (T) RepositoriesModule_ProvideFeemasterServiceFactory.provideFeemasterService(singletonC.repositoriesModule, singletonC.okHttpClientProvider.get(), singletonC.provideTransactionRepositoryProvider.get(), singletonC.provideGsonProvider.get());

        case 24: // com.alphawallet.app.repository.CoinbasePayRepositoryType 
        return (T) RepositoriesModule_ProvideCoinbasePayRepositoryFactory.provideCoinbasePayRepository(singletonC.repositoriesModule);

        case 25: // com.alphawallet.app.service.GasService 
        return (T) RepositoriesModule_ProvideGasServiceFactory.provideGasService(singletonC.repositoriesModule, singletonC.provideEthereumNetworkRepositoryProvider.get(), singletonC.okHttpClientProvider.get(), singletonC.provideRealmManagerProvider.get());

        case 26: // com.alphawallet.app.repository.OnRampRepositoryType 
        return (T) RepositoriesModule_ProvideOnRampRepositoryFactory.provideOnRampRepository(singletonC.repositoriesModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 27: // com.alphawallet.app.service.SwapService 
        return (T) RepositoriesModule_ProvideSwapServiceFactory.provideSwapService(singletonC.repositoriesModule);

        case 28: // com.alphawallet.app.repository.SwapRepositoryType 
        return (T) RepositoriesModule_ProvideSwapRepositoryFactory.provideSwapRepository(singletonC.repositoriesModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        default: throw new AssertionError(id);
      }
    }
  }
}
