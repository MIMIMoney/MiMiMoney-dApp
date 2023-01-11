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
public class com_alphawallet_app_repository_entity_RealmTransferRealmProxy extends com.alphawallet.app.repository.entity.RealmTransfer
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface {

    static final class RealmTransferColumnInfo extends ColumnInfo {
        long hashColKey;
        long tokenAddressColKey;
        long eventNameColKey;
        long transferDetailColKey;

        RealmTransferColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmTransfer");
            this.hashColKey = addColumnDetails("hash", "hash", objectSchemaInfo);
            this.tokenAddressColKey = addColumnDetails("tokenAddress", "tokenAddress", objectSchemaInfo);
            this.eventNameColKey = addColumnDetails("eventName", "eventName", objectSchemaInfo);
            this.transferDetailColKey = addColumnDetails("transferDetail", "transferDetail", objectSchemaInfo);
        }

        RealmTransferColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmTransferColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmTransferColumnInfo src = (RealmTransferColumnInfo) rawSrc;
            final RealmTransferColumnInfo dst = (RealmTransferColumnInfo) rawDst;
            dst.hashColKey = src.hashColKey;
            dst.tokenAddressColKey = src.tokenAddressColKey;
            dst.eventNameColKey = src.eventNameColKey;
            dst.transferDetailColKey = src.transferDetailColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmTransferColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmTransfer> proxyState;

    com_alphawallet_app_repository_entity_RealmTransferRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmTransferColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmTransfer>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$hash() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.hashColKey);
    }

    @Override
    public void realmSet$hash(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.hashColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.hashColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.hashColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.hashColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tokenAddress() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenAddressColKey);
    }

    @Override
    public void realmSet$tokenAddress(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenAddressColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenAddressColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenAddressColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenAddressColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$eventName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.eventNameColKey);
    }

    @Override
    public void realmSet$eventName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.eventNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.eventNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.eventNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.eventNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$transferDetail() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.transferDetailColKey);
    }

    @Override
    public void realmSet$transferDetail(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.transferDetailColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.transferDetailColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.transferDetailColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.transferDetailColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmTransfer", false, 4, 0);
        builder.addPersistedProperty(NO_ALIAS, "hash", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "tokenAddress", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "eventName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "transferDetail", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmTransferColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmTransferColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmTransfer";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmTransfer";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmTransfer createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmTransfer obj = realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTransfer.class, true, excludeFields);

        final com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) obj;
        if (json.has("hash")) {
            if (json.isNull("hash")) {
                objProxy.realmSet$hash(null);
            } else {
                objProxy.realmSet$hash((String) json.getString("hash"));
            }
        }
        if (json.has("tokenAddress")) {
            if (json.isNull("tokenAddress")) {
                objProxy.realmSet$tokenAddress(null);
            } else {
                objProxy.realmSet$tokenAddress((String) json.getString("tokenAddress"));
            }
        }
        if (json.has("eventName")) {
            if (json.isNull("eventName")) {
                objProxy.realmSet$eventName(null);
            } else {
                objProxy.realmSet$eventName((String) json.getString("eventName"));
            }
        }
        if (json.has("transferDetail")) {
            if (json.isNull("transferDetail")) {
                objProxy.realmSet$transferDetail(null);
            } else {
                objProxy.realmSet$transferDetail((String) json.getString("transferDetail"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmTransfer createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.alphawallet.app.repository.entity.RealmTransfer obj = new com.alphawallet.app.repository.entity.RealmTransfer();
        final com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("hash")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$hash((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$hash(null);
                }
            } else if (name.equals("tokenAddress")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tokenAddress((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tokenAddress(null);
                }
            } else if (name.equals("eventName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$eventName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$eventName(null);
                }
            } else if (name.equals("transferDetail")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$transferDetail((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$transferDetail(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_alphawallet_app_repository_entity_RealmTransferRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransfer.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmTransfer copyOrUpdate(Realm realm, RealmTransferColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTransfer object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmTransfer) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmTransfer copy(Realm realm, RealmTransferColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTransfer newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmTransfer) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransfer.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.hashColKey, unmanagedSource.realmGet$hash());
        builder.addString(columnInfo.tokenAddressColKey, unmanagedSource.realmGet$tokenAddress());
        builder.addString(columnInfo.eventNameColKey, unmanagedSource.realmGet$eventName());
        builder.addString(columnInfo.transferDetailColKey, unmanagedSource.realmGet$transferDetail());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmTransferRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmTransfer object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransfer.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransferColumnInfo columnInfo = (RealmTransferColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransfer.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$hash = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$hash();
        if (realmGet$hash != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.hashColKey, objKey, realmGet$hash, false);
        }
        String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$tokenAddress();
        if (realmGet$tokenAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
        }
        String realmGet$eventName = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$eventName();
        if (realmGet$eventName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.eventNameColKey, objKey, realmGet$eventName, false);
        }
        String realmGet$transferDetail = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$transferDetail();
        if (realmGet$transferDetail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.transferDetailColKey, objKey, realmGet$transferDetail, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransfer.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransferColumnInfo columnInfo = (RealmTransferColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransfer.class);
        com.alphawallet.app.repository.entity.RealmTransfer object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTransfer) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$hash = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$hash();
            if (realmGet$hash != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.hashColKey, objKey, realmGet$hash, false);
            }
            String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$tokenAddress();
            if (realmGet$tokenAddress != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
            }
            String realmGet$eventName = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$eventName();
            if (realmGet$eventName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.eventNameColKey, objKey, realmGet$eventName, false);
            }
            String realmGet$transferDetail = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$transferDetail();
            if (realmGet$transferDetail != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.transferDetailColKey, objKey, realmGet$transferDetail, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmTransfer object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransfer.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransferColumnInfo columnInfo = (RealmTransferColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransfer.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$hash = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$hash();
        if (realmGet$hash != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.hashColKey, objKey, realmGet$hash, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.hashColKey, objKey, false);
        }
        String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$tokenAddress();
        if (realmGet$tokenAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenAddressColKey, objKey, false);
        }
        String realmGet$eventName = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$eventName();
        if (realmGet$eventName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.eventNameColKey, objKey, realmGet$eventName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.eventNameColKey, objKey, false);
        }
        String realmGet$transferDetail = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$transferDetail();
        if (realmGet$transferDetail != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.transferDetailColKey, objKey, realmGet$transferDetail, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.transferDetailColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransfer.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransferColumnInfo columnInfo = (RealmTransferColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransfer.class);
        com.alphawallet.app.repository.entity.RealmTransfer object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTransfer) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$hash = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$hash();
            if (realmGet$hash != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.hashColKey, objKey, realmGet$hash, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.hashColKey, objKey, false);
            }
            String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$tokenAddress();
            if (realmGet$tokenAddress != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tokenAddressColKey, objKey, false);
            }
            String realmGet$eventName = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$eventName();
            if (realmGet$eventName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.eventNameColKey, objKey, realmGet$eventName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.eventNameColKey, objKey, false);
            }
            String realmGet$transferDetail = ((com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) object).realmGet$transferDetail();
            if (realmGet$transferDetail != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.transferDetailColKey, objKey, realmGet$transferDetail, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.transferDetailColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmTransfer createDetachedCopy(com.alphawallet.app.repository.entity.RealmTransfer realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmTransfer unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmTransfer();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmTransfer) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmTransfer) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmTransferRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$hash(realmSource.realmGet$hash());
        unmanagedCopy.realmSet$tokenAddress(realmSource.realmGet$tokenAddress());
        unmanagedCopy.realmSet$eventName(realmSource.realmGet$eventName());
        unmanagedCopy.realmSet$transferDetail(realmSource.realmGet$transferDetail());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmTransfer = proxy[");
        stringBuilder.append("{hash:");
        stringBuilder.append(realmGet$hash() != null ? realmGet$hash() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tokenAddress:");
        stringBuilder.append(realmGet$tokenAddress() != null ? realmGet$tokenAddress() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{eventName:");
        stringBuilder.append(realmGet$eventName() != null ? realmGet$eventName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{transferDetail:");
        stringBuilder.append(realmGet$transferDetail() != null ? realmGet$transferDetail() : "null");
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
        com_alphawallet_app_repository_entity_RealmTransferRealmProxy aRealmTransfer = (com_alphawallet_app_repository_entity_RealmTransferRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmTransfer.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmTransfer.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmTransfer.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
