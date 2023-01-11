package com.alphawallet.app.viewmodel;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
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
public final class NodeStatusViewModel_Factory implements Factory<NodeStatusViewModel> {
  private final Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider;

  public NodeStatusViewModel_Factory(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider) {
    this.ethereumNetworkRepositoryTypeProvider = ethereumNetworkRepositoryTypeProvider;
  }

  @Override
  public NodeStatusViewModel get() {
    return newInstance(ethereumNetworkRepositoryTypeProvider.get());
  }

  public static NodeStatusViewModel_Factory create(
      Provider<EthereumNetworkRepositoryType> ethereumNetworkRepositoryTypeProvider) {
    return new NodeStatusViewModel_Factory(ethereumNetworkRepositoryTypeProvider);
  }

  public static NodeStatusViewModel newInstance(
      EthereumNetworkRepositoryType ethereumNetworkRepositoryType) {
    return new NodeStatusViewModel(ethereumNetworkRepositoryType);
  }
}
