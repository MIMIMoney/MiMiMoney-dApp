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
public class com_alphawallet_app_repository_entity_Realm1559GasRealmProxy extends com.alphawallet.app.repository.entity.Realm1559Gas
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface {

    static final class Realm1559GasColumnInfo extends ColumnInfo {
        long chainIdColKey;
        long timeStampColKey;
        long resultDataColKey;

        Realm1559GasColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Realm1559Gas");
            this.chainIdColKey = addColumnDetails("chainId", "chainId", objectSchemaInfo);
            this.timeStampColKey = addColumnDetails("timeStamp", "timeStamp", objectSchemaInfo);
            this.resultDataColKey = addColumnDetails("resultData", "resultData", objectSchemaInfo);
        }

        Realm1559GasColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new Realm1559GasColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final Realm1559GasColumnInfo src = (Realm1559GasColumnInfo) rawSrc;
            final Realm1559GasColumnInfo dst = (Realm1559GasColumnInfo) rawDst;
            dst.chainIdColKey = src.chainIdColKey;
            dst.timeStampColKey = src.timeStampColKey;
            dst.resultDataColKey = src.resultDataColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private Realm1559GasColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.Realm1559Gas> proxyState;

    com_alphawallet_app_repository_entity_Realm1559GasRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (Realm1559GasColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.Realm1559Gas>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$chainId() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.chainIdColKey);
    }

    @Override
    public void realmSet$chainId(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'chainId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeStamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeStampColKey);
    }

    @Override
    public void realmSet$timeStamp(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeStampColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeStampColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$resultData() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.resultDataColKey);
    }

    @Override
    public void realmSet$resultData(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.resultDataColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.resultDataColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.resultDataColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.resultDataColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Realm1559Gas", false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "chainId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "timeStamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "resultData", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static Realm1559GasColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new Realm1559GasColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Realm1559Gas";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Realm1559Gas";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.Realm1559Gas createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.Realm1559Gas obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
            Realm1559GasColumnInfo columnInfo = (Realm1559GasColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class);
            long pkColumnKey = columnInfo.chainIdColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("chainId")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("chainId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("chainId")) {
                if (json.isNull("chainId")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.Realm1559Gas.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.Realm1559Gas.class, json.getLong("chainId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'chainId'.");
            }
        }

        final com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) obj;
        if (json.has("timeStamp")) {
            if (json.isNull("timeStamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
            } else {
                objProxy.realmSet$timeStamp((long) json.getLong("timeStamp"));
            }
        }
        if (json.has("resultData")) {
            if (json.isNull("resultData")) {
                objProxy.realmSet$resultData(null);
            } else {
                objProxy.realmSet$resultData((String) json.getString("resultData"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.Realm1559Gas createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.Realm1559Gas obj = new com.alphawallet.app.repository.entity.Realm1559Gas();
        final com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("chainId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chainId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("timeStamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeStamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
                }
            } else if (name.equals("resultData")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$resultData((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$resultData(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'chainId'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_alphawallet_app_repository_entity_Realm1559GasRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.Realm1559Gas copyOrUpdate(Realm realm, Realm1559GasColumnInfo columnInfo, com.alphawallet.app.repository.entity.Realm1559Gas object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.Realm1559Gas) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.Realm1559Gas realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
            long pkColumnKey = columnInfo.chainIdColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.Realm1559Gas copy(Realm realm, Realm1559GasColumnInfo columnInfo, com.alphawallet.app.repository.entity.Realm1559Gas newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.Realm1559Gas) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.chainIdColKey, unmanagedSource.realmGet$chainId());
        builder.addInteger(columnInfo.timeStampColKey, unmanagedSource.realmGet$timeStamp());
        builder.addString(columnInfo.resultDataColKey, unmanagedSource.realmGet$resultData());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_Realm1559GasRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.Realm1559Gas object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long tableNativePtr = table.getNativePtr();
        Realm1559GasColumnInfo columnInfo = (Realm1559GasColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$timeStamp(), false);
        String realmGet$resultData = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$resultData();
        if (realmGet$resultData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.resultDataColKey, objKey, realmGet$resultData, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long tableNativePtr = table.getNativePtr();
        Realm1559GasColumnInfo columnInfo = (Realm1559GasColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        com.alphawallet.app.repository.entity.Realm1559Gas object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.Realm1559Gas) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$timeStamp(), false);
            String realmGet$resultData = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$resultData();
            if (realmGet$resultData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.resultDataColKey, objKey, realmGet$resultData, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.Realm1559Gas object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long tableNativePtr = table.getNativePtr();
        Realm1559GasColumnInfo columnInfo = (Realm1559GasColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$timeStamp(), false);
        String realmGet$resultData = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$resultData();
        if (realmGet$resultData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.resultDataColKey, objKey, realmGet$resultData, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.resultDataColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long tableNativePtr = table.getNativePtr();
        Realm1559GasColumnInfo columnInfo = (Realm1559GasColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        com.alphawallet.app.repository.entity.Realm1559Gas object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.Realm1559Gas) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$chainId());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$timeStamp(), false);
            String realmGet$resultData = ((com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) object).realmGet$resultData();
            if (realmGet$resultData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.resultDataColKey, objKey, realmGet$resultData, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.resultDataColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.Realm1559Gas createDetachedCopy(com.alphawallet.app.repository.entity.Realm1559Gas realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.Realm1559Gas unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.Realm1559Gas();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.Realm1559Gas) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.Realm1559Gas) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$chainId(realmSource.realmGet$chainId());
        unmanagedCopy.realmSet$timeStamp(realmSource.realmGet$timeStamp());
        unmanagedCopy.realmSet$resultData(realmSource.realmGet$resultData());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.Realm1559Gas update(Realm realm, Realm1559GasColumnInfo columnInfo, com.alphawallet.app.repository.entity.Realm1559Gas realmObject, com.alphawallet.app.repository.entity.Realm1559Gas newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.Realm1559Gas.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.chainIdColKey, realmObjectSource.realmGet$chainId());
        builder.addInteger(columnInfo.timeStampColKey, realmObjectSource.realmGet$timeStamp());
        builder.addString(columnInfo.resultDataColKey, realmObjectSource.realmGet$resultData());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Realm1559Gas = proxy[");
        stringBuilder.append("{chainId:");
        stringBuilder.append(realmGet$chainId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeStamp:");
        stringBuilder.append(realmGet$timeStamp());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{resultData:");
        stringBuilder.append(realmGet$resultData() != null ? realmGet$resultData() : "null");
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
        com_alphawallet_app_repository_entity_Realm1559GasRealmProxy aRealm1559Gas = (com_alphawallet_app_repository_entity_Realm1559GasRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealm1559Gas.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealm1559Gas.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealm1559Gas.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
