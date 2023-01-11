package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy extends com.alphawallet.app.repository.entity.RealmNFTAsset
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface {

    static final class RealmNFTAssetColumnInfo extends ColumnInfo {
        long tokenIdAddrColKey;
        long metaDataColKey;
        long balanceColKey;

        RealmNFTAssetColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmNFTAsset");
            this.tokenIdAddrColKey = addColumnDetails("tokenIdAddr", "tokenIdAddr", objectSchemaInfo);
            this.metaDataColKey = addColumnDetails("metaData", "metaData", objectSchemaInfo);
            this.balanceColKey = addColumnDetails("balance", "balance", objectSchemaInfo);
        }

        RealmNFTAssetColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmNFTAssetColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmNFTAssetColumnInfo src = (RealmNFTAssetColumnInfo) rawSrc;
            final RealmNFTAssetColumnInfo dst = (RealmNFTAssetColumnInfo) rawDst;
            dst.tokenIdAddrColKey = src.tokenIdAddrColKey;
            dst.metaDataColKey = src.metaDataColKey;
            dst.balanceColKey = src.balanceColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmNFTAssetColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmNFTAsset> proxyState;

    com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmNFTAssetColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmNFTAsset>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tokenIdAddr() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenIdAddrColKey);
    }

    @Override
    public void realmSet$tokenIdAddr(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'tokenIdAddr' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$metaData() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.metaDataColKey);
    }

    @Override
    public void realmSet$metaData(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.metaDataColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.metaDataColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.metaDataColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.metaDataColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$balance() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.balanceColKey);
    }

    @Override
    public void realmSet$balance(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.balanceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.balanceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.balanceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.balanceColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmNFTAsset", false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "tokenIdAddr", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "metaData", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "balance", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmNFTAssetColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmNFTAssetColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmNFTAsset";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmNFTAsset";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmNFTAsset createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmNFTAsset obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
            RealmNFTAssetColumnInfo columnInfo = (RealmNFTAssetColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
            long pkColumnKey = columnInfo.tokenIdAddrColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("tokenIdAddr")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("tokenIdAddr"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("tokenIdAddr")) {
                if (json.isNull("tokenIdAddr")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmNFTAsset.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmNFTAsset.class, json.getString("tokenIdAddr"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'tokenIdAddr'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) obj;
        if (json.has("metaData")) {
            if (json.isNull("metaData")) {
                objProxy.realmSet$metaData(null);
            } else {
                objProxy.realmSet$metaData((String) json.getString("metaData"));
            }
        }
        if (json.has("balance")) {
            if (json.isNull("balance")) {
                objProxy.realmSet$balance(null);
            } else {
                objProxy.realmSet$balance((String) json.getString("balance"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmNFTAsset createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmNFTAsset obj = new com.alphawallet.app.repository.entity.RealmNFTAsset();
        final com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("tokenIdAddr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tokenIdAddr((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tokenIdAddr(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("metaData")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$metaData((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$metaData(null);
                }
            } else if (name.equals("balance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$balance((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$balance(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'tokenIdAddr'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmNFTAsset copyOrUpdate(Realm realm, RealmNFTAssetColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmNFTAsset object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmNFTAsset) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmNFTAsset realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
            long pkColumnKey = columnInfo.tokenIdAddrColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$tokenIdAddr();
            long objKey = Table.NO_MATCH;
            if (value == null) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, value);
            }
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmNFTAsset copy(Realm realm, RealmNFTAssetColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmNFTAsset newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmNFTAsset) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.tokenIdAddrColKey, unmanagedSource.realmGet$tokenIdAddr());
        builder.addString(columnInfo.metaDataColKey, unmanagedSource.realmGet$metaData());
        builder.addString(columnInfo.balanceColKey, unmanagedSource.realmGet$balance());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmNFTAsset object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long tableNativePtr = table.getNativePtr();
        RealmNFTAssetColumnInfo columnInfo = (RealmNFTAssetColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long pkColumnKey = columnInfo.tokenIdAddrColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$tokenIdAddr();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$metaData = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$metaData();
        if (realmGet$metaData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.metaDataColKey, objKey, realmGet$metaData, false);
        }
        String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$balance();
        if (realmGet$balance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long tableNativePtr = table.getNativePtr();
        RealmNFTAssetColumnInfo columnInfo = (RealmNFTAssetColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long pkColumnKey = columnInfo.tokenIdAddrColKey;
        com.alphawallet.app.repository.entity.RealmNFTAsset object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmNFTAsset) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$tokenIdAddr();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$metaData = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$metaData();
            if (realmGet$metaData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.metaDataColKey, objKey, realmGet$metaData, false);
            }
            String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$balance();
            if (realmGet$balance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmNFTAsset object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long tableNativePtr = table.getNativePtr();
        RealmNFTAssetColumnInfo columnInfo = (RealmNFTAssetColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long pkColumnKey = columnInfo.tokenIdAddrColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$tokenIdAddr();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$metaData = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$metaData();
        if (realmGet$metaData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.metaDataColKey, objKey, realmGet$metaData, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.metaDataColKey, objKey, false);
        }
        String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$balance();
        if (realmGet$balance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.balanceColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long tableNativePtr = table.getNativePtr();
        RealmNFTAssetColumnInfo columnInfo = (RealmNFTAssetColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        long pkColumnKey = columnInfo.tokenIdAddrColKey;
        com.alphawallet.app.repository.entity.RealmNFTAsset object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmNFTAsset) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$tokenIdAddr();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$metaData = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$metaData();
            if (realmGet$metaData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.metaDataColKey, objKey, realmGet$metaData, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.metaDataColKey, objKey, false);
            }
            String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) object).realmGet$balance();
            if (realmGet$balance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.balanceColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmNFTAsset createDetachedCopy(com.alphawallet.app.repository.entity.RealmNFTAsset realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmNFTAsset unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmNFTAsset();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmNFTAsset) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmNFTAsset) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$tokenIdAddr(realmSource.realmGet$tokenIdAddr());
        unmanagedCopy.realmSet$metaData(realmSource.realmGet$metaData());
        unmanagedCopy.realmSet$balance(realmSource.realmGet$balance());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmNFTAsset update(Realm realm, RealmNFTAssetColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmNFTAsset realmObject, com.alphawallet.app.repository.entity.RealmNFTAsset newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmNFTAsset.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.tokenIdAddrColKey, realmObjectSource.realmGet$tokenIdAddr());
        builder.addString(columnInfo.metaDataColKey, realmObjectSource.realmGet$metaData());
        builder.addString(columnInfo.balanceColKey, realmObjectSource.realmGet$balance());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmNFTAsset = proxy[");
        stringBuilder.append("{tokenIdAddr:");
        stringBuilder.append(realmGet$tokenIdAddr() != null ? realmGet$tokenIdAddr() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{metaData:");
        stringBuilder.append(realmGet$metaData() != null ? realmGet$metaData() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{balance:");
        stringBuilder.append(realmGet$balance() != null ? realmGet$balance() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy aRealmNFTAsset = (com_alphawallet_app_repository_entity_RealmNFTAssetRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmNFTAsset.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmNFTAsset.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmNFTAsset.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
