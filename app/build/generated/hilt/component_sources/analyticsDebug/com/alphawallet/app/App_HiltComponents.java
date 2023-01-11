package com.alphawallet.app;

import com.alphawallet.app.di.RepositoriesModule;
import com.alphawallet.app.di.ServiceModule;
import com.alphawallet.app.di.ToolsModule;
import com.alphawallet.app.di.ViewModelModule;
import com.alphawallet.app.service.PriceAlertsService_GeneratedInjector;
import com.alphawallet.app.service.WalletConnectV2Service_GeneratedInjector;
import com.alphawallet.app.ui.ActivityFragment_GeneratedInjector;
import com.alphawallet.app.ui.AddCustomRPCNetworkActivity_GeneratedInjector;
import com.alphawallet.app.ui.AddEditDappActivity_GeneratedInjector;
import com.alphawallet.app.ui.AddTokenActivity_GeneratedInjector;
import com.alphawallet.app.ui.AdvancedSettingsActivity_GeneratedInjector;
import com.alphawallet.app.ui.ApiV1Activity_GeneratedInjector;
import com.alphawallet.app.ui.AssetDisplayActivity_GeneratedInjector;
import com.alphawallet.app.ui.BackupFlowActivity_GeneratedInjector;
import com.alphawallet.app.ui.BackupKeyActivity_GeneratedInjector;
import com.alphawallet.app.ui.BaseFragment_GeneratedInjector;
import com.alphawallet.app.ui.BrowserHistoryFragment_GeneratedInjector;
import com.alphawallet.app.ui.CoinbasePayActivity_GeneratedInjector;
import com.alphawallet.app.ui.DappBrowserFragment_GeneratedInjector;
import com.alphawallet.app.ui.DiscoverDappsFragment_GeneratedInjector;
import com.alphawallet.app.ui.EditTokensVisibilityActivity_GeneratedInjector;
import com.alphawallet.app.ui.Erc1155AssetListActivity_GeneratedInjector;
import com.alphawallet.app.ui.Erc1155AssetSelectActivity_GeneratedInjector;
import com.alphawallet.app.ui.Erc20DetailActivity_GeneratedInjector;
import com.alphawallet.app.ui.FunctionActivity_GeneratedInjector;
import com.alphawallet.app.ui.GasSettingsActivity_GeneratedInjector;
import com.alphawallet.app.ui.HomeActivity_GeneratedInjector;
import com.alphawallet.app.ui.ImportKeystoreFragment_GeneratedInjector;
import com.alphawallet.app.ui.ImportPrivateKeyFragment_GeneratedInjector;
import com.alphawallet.app.ui.ImportSeedFragment_GeneratedInjector;
import com.alphawallet.app.ui.ImportTokenActivity_GeneratedInjector;
import com.alphawallet.app.ui.ImportWalletActivity_GeneratedInjector;
import com.alphawallet.app.ui.MyAddressActivity_GeneratedInjector;
import com.alphawallet.app.ui.MyDappsFragment_GeneratedInjector;
import com.alphawallet.app.ui.NFTActivity_GeneratedInjector;
import com.alphawallet.app.ui.NFTAssetDetailActivity_GeneratedInjector;
import com.alphawallet.app.ui.NFTAssetsFragment_GeneratedInjector;
import com.alphawallet.app.ui.NFTInfoFragment_GeneratedInjector;
import com.alphawallet.app.ui.NameThisWalletActivity_GeneratedInjector;
import com.alphawallet.app.ui.NewSettingsFragment_GeneratedInjector;
import com.alphawallet.app.ui.NodeStatusActivity_GeneratedInjector;
import com.alphawallet.app.ui.QRScanning.QRScannerActivity_GeneratedInjector;
import com.alphawallet.app.ui.RedeemAssetSelectActivity_GeneratedInjector;
import com.alphawallet.app.ui.RedeemSignatureDisplayActivity_GeneratedInjector;
import com.alphawallet.app.ui.ScammerWarningActivity_GeneratedInjector;
import com.alphawallet.app.ui.SearchActivity_GeneratedInjector;
import com.alphawallet.app.ui.SelectCurrencyActivity_GeneratedInjector;
import com.alphawallet.app.ui.SelectLocaleActivity_GeneratedInjector;
import com.alphawallet.app.ui.SelectNetworkActivity_GeneratedInjector;
import com.alphawallet.app.ui.SelectNetworkFilterActivity_GeneratedInjector;
import com.alphawallet.app.ui.SelectRouteActivity_GeneratedInjector;
import com.alphawallet.app.ui.SelectSwapProvidersActivity_GeneratedInjector;
import com.alphawallet.app.ui.SelectThemeActivity_GeneratedInjector;
import com.alphawallet.app.ui.SellDetailActivity_GeneratedInjector;
import com.alphawallet.app.ui.SendActivity_GeneratedInjector;
import com.alphawallet.app.ui.SetPriceAlertActivity_GeneratedInjector;
import com.alphawallet.app.ui.SetWatchWalletFragment_GeneratedInjector;
import com.alphawallet.app.ui.SignDetailActivity_GeneratedInjector;
import com.alphawallet.app.ui.SplashActivity_GeneratedInjector;
import com.alphawallet.app.ui.SupportSettingsActivity_GeneratedInjector;
import com.alphawallet.app.ui.SwapActivity_GeneratedInjector;
import com.alphawallet.app.ui.TokenActivityFragment_GeneratedInjector;
import com.alphawallet.app.ui.TokenActivity_GeneratedInjector;
import com.alphawallet.app.ui.TokenAlertsFragment_GeneratedInjector;
import com.alphawallet.app.ui.TokenDetailActivity_GeneratedInjector;
import com.alphawallet.app.ui.TokenFunctionActivity_GeneratedInjector;
import com.alphawallet.app.ui.TokenInfoFragment_GeneratedInjector;
import com.alphawallet.app.ui.TokenManagementActivity_GeneratedInjector;
import com.alphawallet.app.ui.TokenScriptManagementActivity_GeneratedInjector;
import com.alphawallet.app.ui.TransactionDetailActivity_GeneratedInjector;
import com.alphawallet.app.ui.TransactionSuccessActivity_GeneratedInjector;
import com.alphawallet.app.ui.TransferNFTActivity_GeneratedInjector;
import com.alphawallet.app.ui.TransferTicketDetailActivity_GeneratedInjector;
import com.alphawallet.app.ui.WalletActionsActivity_GeneratedInjector;
import com.alphawallet.app.ui.WalletConnectActivity_GeneratedInjector;
import com.alphawallet.app.ui.WalletConnectNotificationActivity_GeneratedInjector;
import com.alphawallet.app.ui.WalletConnectSessionActivity_GeneratedInjector;
import com.alphawallet.app.ui.WalletConnectV2Activity_GeneratedInjector;
import com.alphawallet.app.ui.WalletDiagnosticActivity_GeneratedInjector;
import com.alphawallet.app.ui.WalletFragment_GeneratedInjector;
import com.alphawallet.app.ui.WalletTestFragment_GeneratedInjector;
import com.alphawallet.app.ui.WalletsActivity_GeneratedInjector;
import com.alphawallet.app.viewmodel.ActivityViewModel_HiltModules;
import com.alphawallet.app.viewmodel.AddEditDappViewModel_HiltModules;
import com.alphawallet.app.viewmodel.AddTokenViewModel_HiltModules;
import com.alphawallet.app.viewmodel.AdvancedSettingsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.ApiV1ViewModel_HiltModules;
import com.alphawallet.app.viewmodel.BackupKeyViewModel_HiltModules;
import com.alphawallet.app.viewmodel.BrowserHistoryViewModel_HiltModules;
import com.alphawallet.app.viewmodel.CoinbasePayViewModel_HiltModules;
import com.alphawallet.app.viewmodel.CustomNetworkViewModel_HiltModules;
import com.alphawallet.app.viewmodel.DappBrowserViewModel_HiltModules;
import com.alphawallet.app.viewmodel.Erc1155AssetListViewModel_HiltModules;
import com.alphawallet.app.viewmodel.Erc1155AssetSelectViewModel_HiltModules;
import com.alphawallet.app.viewmodel.Erc20DetailViewModel_HiltModules;
import com.alphawallet.app.viewmodel.GasSettingsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.HomeViewModel_HiltModules;
import com.alphawallet.app.viewmodel.ImportTokenViewModel_HiltModules;
import com.alphawallet.app.viewmodel.ImportWalletViewModel_HiltModules;
import com.alphawallet.app.viewmodel.MyAddressViewModel_HiltModules;
import com.alphawallet.app.viewmodel.MyDappsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.NFTAssetsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.NFTViewModel_HiltModules;
import com.alphawallet.app.viewmodel.NameThisWalletViewModel_HiltModules;
import com.alphawallet.app.viewmodel.NewSettingsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.NodeStatusViewModel_HiltModules;
import com.alphawallet.app.viewmodel.QrScannerViewModel_HiltModules;
import com.alphawallet.app.viewmodel.RedeemAssetSelectViewModel_HiltModules;
import com.alphawallet.app.viewmodel.RedeemSignatureDisplayModel_HiltModules;
import com.alphawallet.app.viewmodel.SelectNetworkFilterViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SelectNetworkViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SelectRouteViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SelectSwapProvidersViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SelectThemeViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SellDetailViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SendViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SetPriceAlertViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SignDialogViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SplashViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SupportSettingsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.SwapViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TokenActivityViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TokenAlertsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TokenFunctionViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TokenInfoViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TokenManagementViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TokenScriptManagementViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TransactionDetailViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TransactionSuccessViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TransferTicketDetailViewModel_HiltModules;
import com.alphawallet.app.viewmodel.TransferTicketViewModel_HiltModules;
import com.alphawallet.app.viewmodel.WalletActionsViewModel_HiltModules;
import com.alphawallet.app.viewmodel.WalletConnectV2ViewModel_HiltModules;
import com.alphawallet.app.viewmodel.WalletConnectViewModel_HiltModules;
import com.alphawallet.app.viewmodel.WalletViewModel_HiltModules;
import com.alphawallet.app.viewmodel.WalletsViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.processing.Generated;
import javax.inject.Singleton;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class App_HiltComponents {
  private App_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          ApplicationContextModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          RepositoriesModule.class,
          ToolsModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements App_GeneratedInjector,
      FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent(
      modules = ServiceModule.class
  )
  @ServiceScoped
  public abstract static class ServiceC implements PriceAlertsService_GeneratedInjector,
      WalletConnectV2Service_GeneratedInjector,
      ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActivityViewModel_HiltModules.KeyModule.class,
          AddEditDappViewModel_HiltModules.KeyModule.class,
          AddTokenViewModel_HiltModules.KeyModule.class,
          AdvancedSettingsViewModel_HiltModules.KeyModule.class,
          ApiV1ViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          BackupKeyViewModel_HiltModules.KeyModule.class,
          BrowserHistoryViewModel_HiltModules.KeyModule.class,
          CoinbasePayViewModel_HiltModules.KeyModule.class,
          CustomNetworkViewModel_HiltModules.KeyModule.class,
          DappBrowserViewModel_HiltModules.KeyModule.class,
          Erc1155AssetListViewModel_HiltModules.KeyModule.class,
          Erc1155AssetSelectViewModel_HiltModules.KeyModule.class,
          Erc20DetailViewModel_HiltModules.KeyModule.class,
          GasSettingsViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HomeViewModel_HiltModules.KeyModule.class,
          ImportTokenViewModel_HiltModules.KeyModule.class,
          ImportWalletViewModel_HiltModules.KeyModule.class,
          MyAddressViewModel_HiltModules.KeyModule.class,
          MyDappsViewModel_HiltModules.KeyModule.class,
          NFTAssetsViewModel_HiltModules.KeyModule.class,
          NFTViewModel_HiltModules.KeyModule.class,
          NameThisWalletViewModel_HiltModules.KeyModule.class,
          NewSettingsViewModel_HiltModules.KeyModule.class,
          NodeStatusViewModel_HiltModules.KeyModule.class,
          QrScannerViewModel_HiltModules.KeyModule.class,
          RedeemAssetSelectViewModel_HiltModules.KeyModule.class,
          RedeemSignatureDisplayModel_HiltModules.KeyModule.class,
          SelectNetworkFilterViewModel_HiltModules.KeyModule.class,
          SelectNetworkViewModel_HiltModules.KeyModule.class,
          SelectRouteViewModel_HiltModules.KeyModule.class,
          SelectSwapProvidersViewModel_HiltModules.KeyModule.class,
          SelectThemeViewModel_HiltModules.KeyModule.class,
          SellDetailViewModel_HiltModules.KeyModule.class,
          SendViewModel_HiltModules.KeyModule.class,
          SetPriceAlertViewModel_HiltModules.KeyModule.class,
          SignDialogViewModel_HiltModules.KeyModule.class,
          SplashViewModel_HiltModules.KeyModule.class,
          SupportSettingsViewModel_HiltModules.KeyModule.class,
          SwapViewModel_HiltModules.KeyModule.class,
          TokenActivityViewModel_HiltModules.KeyModule.class,
          TokenAlertsViewModel_HiltModules.KeyModule.class,
          TokenFunctionViewModel_HiltModules.KeyModule.class,
          TokenInfoViewModel_HiltModules.KeyModule.class,
          TokenManagementViewModel_HiltModules.KeyModule.class,
          TokenScriptManagementViewModel_HiltModules.KeyModule.class,
          TransactionDetailViewModel_HiltModules.KeyModule.class,
          TransactionSuccessViewModel_HiltModules.KeyModule.class,
          TransferTicketDetailViewModel_HiltModules.KeyModule.class,
          TransferTicketViewModel_HiltModules.KeyModule.class,
          WalletActionsViewModel_HiltModules.KeyModule.class,
          WalletConnectV2ViewModel_HiltModules.KeyModule.class,
          WalletConnectViewModel_HiltModules.KeyModule.class,
          WalletViewModel_HiltModules.KeyModule.class,
          WalletsViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements AddCustomRPCNetworkActivity_GeneratedInjector,
      AddEditDappActivity_GeneratedInjector,
      AddTokenActivity_GeneratedInjector,
      AdvancedSettingsActivity_GeneratedInjector,
      ApiV1Activity_GeneratedInjector,
      AssetDisplayActivity_GeneratedInjector,
      BackupFlowActivity_GeneratedInjector,
      BackupKeyActivity_GeneratedInjector,
      CoinbasePayActivity_GeneratedInjector,
      EditTokensVisibilityActivity_GeneratedInjector,
      Erc1155AssetListActivity_GeneratedInjector,
      Erc1155AssetSelectActivity_GeneratedInjector,
      Erc20DetailActivity_GeneratedInjector,
      FunctionActivity_GeneratedInjector,
      GasSettingsActivity_GeneratedInjector,
      HomeActivity_GeneratedInjector,
      ImportTokenActivity_GeneratedInjector,
      ImportWalletActivity_GeneratedInjector,
      MyAddressActivity_GeneratedInjector,
      NFTActivity_GeneratedInjector,
      NFTAssetDetailActivity_GeneratedInjector,
      NameThisWalletActivity_GeneratedInjector,
      NodeStatusActivity_GeneratedInjector,
      QRScannerActivity_GeneratedInjector,
      RedeemAssetSelectActivity_GeneratedInjector,
      RedeemSignatureDisplayActivity_GeneratedInjector,
      ScammerWarningActivity_GeneratedInjector,
      SearchActivity_GeneratedInjector,
      SelectCurrencyActivity_GeneratedInjector,
      SelectLocaleActivity_GeneratedInjector,
      SelectNetworkActivity_GeneratedInjector,
      SelectNetworkFilterActivity_GeneratedInjector,
      SelectRouteActivity_GeneratedInjector,
      SelectSwapProvidersActivity_GeneratedInjector,
      SelectThemeActivity_GeneratedInjector,
      SellDetailActivity_GeneratedInjector,
      SendActivity_GeneratedInjector,
      SetPriceAlertActivity_GeneratedInjector,
      SignDetailActivity_GeneratedInjector,
      SplashActivity_GeneratedInjector,
      SupportSettingsActivity_GeneratedInjector,
      SwapActivity_GeneratedInjector,
      TokenActivity_GeneratedInjector,
      TokenDetailActivity_GeneratedInjector,
      TokenFunctionActivity_GeneratedInjector,
      TokenManagementActivity_GeneratedInjector,
      TokenScriptManagementActivity_GeneratedInjector,
      TransactionDetailActivity_GeneratedInjector,
      TransactionSuccessActivity_GeneratedInjector,
      TransferNFTActivity_GeneratedInjector,
      TransferTicketDetailActivity_GeneratedInjector,
      WalletActionsActivity_GeneratedInjector,
      WalletConnectActivity_GeneratedInjector,
      WalletConnectNotificationActivity_GeneratedInjector,
      WalletConnectSessionActivity_GeneratedInjector,
      WalletConnectV2Activity_GeneratedInjector,
      WalletDiagnosticActivity_GeneratedInjector,
      WalletsActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActivityViewModel_HiltModules.BindsModule.class,
          AddEditDappViewModel_HiltModules.BindsModule.class,
          AddTokenViewModel_HiltModules.BindsModule.class,
          AdvancedSettingsViewModel_HiltModules.BindsModule.class,
          ApiV1ViewModel_HiltModules.BindsModule.class,
          BackupKeyViewModel_HiltModules.BindsModule.class,
          BrowserHistoryViewModel_HiltModules.BindsModule.class,
          CoinbasePayViewModel_HiltModules.BindsModule.class,
          CustomNetworkViewModel_HiltModules.BindsModule.class,
          DappBrowserViewModel_HiltModules.BindsModule.class,
          Erc1155AssetListViewModel_HiltModules.BindsModule.class,
          Erc1155AssetSelectViewModel_HiltModules.BindsModule.class,
          Erc20DetailViewModel_HiltModules.BindsModule.class,
          GasSettingsViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          HomeViewModel_HiltModules.BindsModule.class,
          ImportTokenViewModel_HiltModules.BindsModule.class,
          ImportWalletViewModel_HiltModules.BindsModule.class,
          MyAddressViewModel_HiltModules.BindsModule.class,
          MyDappsViewModel_HiltModules.BindsModule.class,
          NFTAssetsViewModel_HiltModules.BindsModule.class,
          NFTViewModel_HiltModules.BindsModule.class,
          NameThisWalletViewModel_HiltModules.BindsModule.class,
          NewSettingsViewModel_HiltModules.BindsModule.class,
          NodeStatusViewModel_HiltModules.BindsModule.class,
          QrScannerViewModel_HiltModules.BindsModule.class,
          RedeemAssetSelectViewModel_HiltModules.BindsModule.class,
          RedeemSignatureDisplayModel_HiltModules.BindsModule.class,
          SelectNetworkFilterViewModel_HiltModules.BindsModule.class,
          SelectNetworkViewModel_HiltModules.BindsModule.class,
          SelectRouteViewModel_HiltModules.BindsModule.class,
          SelectSwapProvidersViewModel_HiltModules.BindsModule.class,
          SelectThemeViewModel_HiltModules.BindsModule.class,
          SellDetailViewModel_HiltModules.BindsModule.class,
          SendViewModel_HiltModules.BindsModule.class,
          SetPriceAlertViewModel_HiltModules.BindsModule.class,
          SignDialogViewModel_HiltModules.BindsModule.class,
          SplashViewModel_HiltModules.BindsModule.class,
          SupportSettingsViewModel_HiltModules.BindsModule.class,
          SwapViewModel_HiltModules.BindsModule.class,
          TokenActivityViewModel_HiltModules.BindsModule.class,
          TokenAlertsViewModel_HiltModules.BindsModule.class,
          TokenFunctionViewModel_HiltModules.BindsModule.class,
          TokenInfoViewModel_HiltModules.BindsModule.class,
          TokenManagementViewModel_HiltModules.BindsModule.class,
          TokenScriptManagementViewModel_HiltModules.BindsModule.class,
          TransactionDetailViewModel_HiltModules.BindsModule.class,
          TransactionSuccessViewModel_HiltModules.BindsModule.class,
          TransferTicketDetailViewModel_HiltModules.BindsModule.class,
          TransferTicketViewModel_HiltModules.BindsModule.class,
          ViewModelModule.class,
          WalletActionsViewModel_HiltModules.BindsModule.class,
          WalletConnectV2ViewModel_HiltModules.BindsModule.class,
          WalletConnectViewModel_HiltModules.BindsModule.class,
          WalletViewModel_HiltModules.BindsModule.class,
          WalletsViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements ActivityFragment_GeneratedInjector,
      BaseFragment_GeneratedInjector,
      BrowserHistoryFragment_GeneratedInjector,
      DappBrowserFragment_GeneratedInjector,
      DiscoverDappsFragment_GeneratedInjector,
      ImportKeystoreFragment_GeneratedInjector,
      ImportPrivateKeyFragment_GeneratedInjector,
      ImportSeedFragment_GeneratedInjector,
      MyDappsFragment_GeneratedInjector,
      NFTAssetsFragment_GeneratedInjector,
      NFTInfoFragment_GeneratedInjector,
      NewSettingsFragment_GeneratedInjector,
      SetWatchWalletFragment_GeneratedInjector,
      TokenActivityFragment_GeneratedInjector,
      TokenAlertsFragment_GeneratedInjector,
      TokenInfoFragment_GeneratedInjector,
      WalletFragment_GeneratedInjector,
      WalletTestFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
