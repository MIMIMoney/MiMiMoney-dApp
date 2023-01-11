package com.alphawallet.app.viewmodel;

import com.alphawallet.app.interact.CreateTransactionInteract;
import com.alphawallet.app.interact.FetchTokensInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.interact.MemPoolInteract;
import com.alphawallet.app.interact.SignatureGenerateInteract;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.TokensService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class RedeemSignatureDisplayModel_Factory implements Factory<RedeemSignatureDisplayModel> {
  private final Provider<GenericWalletInteract> genericWalletInteractProvider;

  private final Provider<SignatureGenerateInteract> signatureGenerateInteractProvider;

  private final Provider<CreateTransactionInteract> createTransactionInteractProvider;

  private final Provider<KeyService> keyServiceProvider;

  private final Provider<FetchTokensInteract> fetchTokensInteractProvider;

  private final Provider<MemPoolInteract> memoryPoolInteractProvider;

  private final Provider<TokensService> tokensServiceProvider;

  private final Provider<AssetDefinitionService> assetDefinitionServiceProvider;

  public RedeemSignatureDisplayModel_Factory(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<SignatureGenerateInteract> signatureGenerateInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<FetchTokensInteract> fetchTokensInteractProvider,
      Provider<MemPoolInteract> memoryPoolInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    this.genericWalletInteractProvider = genericWalletInteractProvider;
    this.signatureGenerateInteractProvider = signatureGenerateInteractProvider;
    this.createTransactionInteractProvider = createTransactionInteractProvider;
    this.keyServiceProvider = keyServiceProvider;
    this.fetchTokensInteractProvider = fetchTokensInteractProvider;
    this.memoryPoolInteractProvider = memoryPoolInteractProvider;
    this.tokensServiceProvider = tokensServiceProvider;
    this.assetDefinitionServiceProvider = assetDefinitionServiceProvider;
  }

  @Override
  public RedeemSignatureDisplayModel get() {
    return newInstance(genericWalletInteractProvider.get(), signatureGenerateInteractProvider.get(), createTransactionInteractProvider.get(), keyServiceProvider.get(), fetchTokensInteractProvider.get(), memoryPoolInteractProvider.get(), tokensServiceProvider.get(), assetDefinitionServiceProvider.get());
  }

  public static RedeemSignatureDisplayModel_Factory create(
      Provider<GenericWalletInteract> genericWalletInteractProvider,
      Provider<SignatureGenerateInteract> signatureGenerateInteractProvider,
      Provider<CreateTransactionInteract> createTransactionInteractProvider,
      Provider<KeyService> keyServiceProvider,
      Provider<FetchTokensInteract> fetchTokensInteractProvider,
      Provider<MemPoolInteract> memoryPoolInteractProvider,
      Provider<TokensService> tokensServiceProvider,
      Provider<AssetDefinitionService> assetDefinitionServiceProvider) {
    return new RedeemSignatureDisplayModel_Factory(genericWalletInteractProvider, signatureGenerateInteractProvider, createTransactionInteractProvider, keyServiceProvider, fetchTokensInteractProvider, memoryPoolInteractProvider, tokensServiceProvider, assetDefinitionServiceProvider);
  }

  public static RedeemSignatureDisplayModel newInstance(GenericWalletInteract genericWalletInteract,
      SignatureGenerateInteract signatureGenerateInteract,
      CreateTransactionInteract createTransactionInteract, KeyService keyService,
      FetchTokensInteract fetchTokensInteract, MemPoolInteract memoryPoolInteract,
      TokensService tokensService, AssetDefinitionService assetDefinitionService) {
    return new RedeemSignatureDisplayModel(genericWalletInteract, signatureGenerateInteract, createTransactionInteract, keyService, fetchTokensInteract, memoryPoolInteract, tokensService, assetDefinitionService);
  }
}
