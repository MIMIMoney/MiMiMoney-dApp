package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(15);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmWalletData.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmWCSession.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmTransfer.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmTransaction.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmToken.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmKeyType.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        modelClasses.add(com.alphawallet.app.repository.entity.RealmAuxData.class);
        modelClasses.add(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(15);
        infoMap.put(com.alphawallet.app.repository.entity.RealmWalletData.class, io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmWCSignElement.class, io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmWCSession.class, io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmTransfer.class, io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmTransaction.class, io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmTokenTicker.class, io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmTokenScriptData.class, io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmTokenMapping.class, io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmToken.class, io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmNFTAsset.class, io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmKeyType.class, io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmGasSpread.class, io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmCertificateData.class, io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.RealmAuxData.class, io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.alphawallet.app.repository.entity.Realm1559Gas.class, io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return "RealmWalletData";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return "RealmWCSignElement";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return "RealmWCSession";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return "RealmTransfer";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return "RealmTransaction";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return "RealmTokenTicker";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return "RealmTokenScriptData";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return "RealmTokenMapping";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return "RealmToken";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return "RealmNFTAsset";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return "RealmKeyType";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return "RealmGasSpread";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return "RealmCertificateData";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return "RealmAuxData";
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return "Realm1559Gas";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public Class<? extends RealmModel> getClazzImpl(String className) {
        checkClassName(className);

        if (className.equals("RealmWalletData")) {
            return com.alphawallet.app.repository.entity.RealmWalletData.class;
        }
        if (className.equals("RealmWCSignElement")) {
            return com.alphawallet.app.repository.entity.RealmWCSignElement.class;
        }
        if (className.equals("RealmWCSession")) {
            return com.alphawallet.app.repository.entity.RealmWCSession.class;
        }
        if (className.equals("RealmTransfer")) {
            return com.alphawallet.app.repository.entity.RealmTransfer.class;
        }
        if (className.equals("RealmTransaction")) {
            return com.alphawallet.app.repository.entity.RealmTransaction.class;
        }
        if (className.equals("RealmTokenTicker")) {
            return com.alphawallet.app.repository.entity.RealmTokenTicker.class;
        }
        if (className.equals("RealmTokenScriptData")) {
            return com.alphawallet.app.repository.entity.RealmTokenScriptData.class;
        }
        if (className.equals("RealmTokenMapping")) {
            return com.alphawallet.app.repository.entity.RealmTokenMapping.class;
        }
        if (className.equals("RealmToken")) {
            return com.alphawallet.app.repository.entity.RealmToken.class;
        }
        if (className.equals("RealmNFTAsset")) {
            return com.alphawallet.app.repository.entity.RealmNFTAsset.class;
        }
        if (className.equals("RealmKeyType")) {
            return com.alphawallet.app.repository.entity.RealmKeyType.class;
        }
        if (className.equals("RealmGasSpread")) {
            return com.alphawallet.app.repository.entity.RealmGasSpread.class;
        }
        if (className.equals("RealmCertificateData")) {
            return com.alphawallet.app.repository.entity.RealmCertificateData.class;
        }
        if (className.equals("RealmAuxData")) {
            return com.alphawallet.app.repository.entity.RealmAuxData.class;
        }
        if (className.equals("Realm1559Gas")) {
            return com.alphawallet.app.repository.entity.Realm1559Gas.class;
        }
        throw getMissingProxyClassException(className);
    }

    @Override
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> clazz) {
        return com.alphawallet.app.repository.entity.RealmWalletData.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmWCSession.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmTransaction.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmTokenTicker.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmTokenScriptData.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmTokenMapping.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmToken.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmNFTAsset.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmKeyType.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmGasSpread.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmCertificateData.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.RealmAuxData.class.isAssignableFrom(clazz)
                || com.alphawallet.app.repository.entity.Realm1559Gas.class.isAssignableFrom(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy());
            }
            if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
                return clazz.cast(new io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.RealmWalletDataColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.RealmWalletDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmWalletData) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.RealmWCSignElementColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.RealmWCSignElementColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmWCSignElement) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.RealmWCSessionColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.RealmWCSessionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmWCSession) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            com_alphawallet_app_repository_entity_RealmTransferRealmProxy.RealmTransferColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmTransferRealmProxy.RealmTransferColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransfer.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmTransfer) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.RealmTransactionColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.RealmTransactionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmTransaction) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.RealmTokenTickerColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.RealmTokenTickerColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmTokenTicker) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.RealmTokenScriptDataColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.RealmTokenScriptDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmTokenScriptData) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.RealmTokenMappingColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.RealmTokenMappingColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmTokenMapping) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            com_alphawallet_app_repository_entity_RealmTokenRealmProxy.RealmTokenColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmTokenRealmProxy.RealmTokenColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmToken) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.RealmNFTAssetColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.RealmNFTAssetColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmNFTAsset) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.RealmKeyTypeColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.RealmKeyTypeColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmKeyType) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.RealmGasSpreadColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.RealmGasSpreadColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmGasSpread) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.RealmCertificateDataColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.RealmCertificateDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmCertificateData) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.RealmAuxDataColumnInfo columnInfo = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.RealmAuxDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.RealmAuxData) obj, update, cache, flags));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.Realm1559GasColumnInfo columnInfo = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.Realm1559GasColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class);
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.copyOrUpdate(realm, columnInfo, (com.alphawallet.app.repository.entity.Realm1559Gas) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public long insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmWalletData) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmWCSignElement) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmWCSession) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTransfer) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTransaction) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTokenTicker) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTokenScriptData) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTokenMapping) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmToken) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmNFTAsset) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmKeyType) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmGasSpread) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmCertificateData) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmAuxData) object, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.Realm1559Gas) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmWalletData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmWCSignElement) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmWCSession) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTransfer) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTransaction) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTokenTicker) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTokenScriptData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmTokenMapping) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmToken) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmNFTAsset) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmKeyType) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmGasSpread) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmCertificateData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.RealmAuxData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
                io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.insert(realm, (com.alphawallet.app.repository.entity.Realm1559Gas) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
                    io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public long insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmWalletData) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmWCSignElement) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmWCSession) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTransfer) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTransaction) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTokenTicker) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTokenScriptData) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTokenMapping) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmToken) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmNFTAsset) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmKeyType) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmGasSpread) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmCertificateData) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmAuxData) obj, cache);
        } else if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.Realm1559Gas) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmWalletData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmWCSignElement) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmWCSession) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTransfer) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTransaction) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTokenTicker) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTokenScriptData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmTokenMapping) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmToken) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmNFTAsset) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmKeyType) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmGasSpread) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmCertificateData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
                io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.RealmAuxData) object, cache);
            } else if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
                io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.insertOrUpdate(realm, (com.alphawallet.app.repository.entity.Realm1559Gas) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
                    io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
                    io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmWalletData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmWCSignElement) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmWCSession) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmTransfer) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmTransaction) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmTokenTicker) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmTokenScriptData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmTokenMapping) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmToken) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmNFTAsset) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmKeyType) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmGasSpread) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmCertificateData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.RealmAuxData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return clazz.cast(io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy.createDetachedCopy((com.alphawallet.app.repository.entity.Realm1559Gas) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            return false;
        }
        if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            return false;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(com.alphawallet.app.repository.entity.RealmWalletData.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmWalletData");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSignElement.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmWCSignElement");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmWCSession.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmWCSession");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransfer.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmTransfer");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTransaction.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmTransaction");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenTicker.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmTokenTicker");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenScriptData.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmTokenScriptData");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmTokenMapping.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmTokenMapping");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmToken.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmToken");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmNFTAsset.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmNFTAsset");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmKeyType.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmKeyType");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmGasSpread.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmGasSpread");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmCertificateData.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmCertificateData");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.RealmAuxData.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.RealmAuxData");
        } else if (clazz.equals(com.alphawallet.app.repository.entity.Realm1559Gas.class)) {
            throw getNotEmbeddedClassException("com.alphawallet.app.repository.entity.Realm1559Gas");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
