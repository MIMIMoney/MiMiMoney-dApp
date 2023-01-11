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
public class com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy extends com.alphawallet.app.repository.entity.RealmTokenMapping
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface {

    static final class RealmTokenMappingColumnInfo extends ColumnInfo {
        long addressColKey;
        long baseColKey;
        long groupColKey;

        RealmTokenMappingColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmTokenMapping");
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
            this.baseColKey = addColumnDetails("base", "base", objectSchemaInfo);
            this.groupColKey = addColumnDetails("group", "group", objectSchemaInfo);
        }

        RealmTokenMappingColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmTokenMappingColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmTokenMappingColumnInfo src = (RealmTokenMappingColumnInfo) rawSrc;
            final RealmTokenMappingColumnInfo dst = (RealmTokenMappingColumnInfo) rawDst;
            dst.addressColKey = src.addressColKey;
            dst.baseColKey = src.baseColKey;
            dst.groupColKey = src.groupColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmTokenMappingColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmTokenMapping> proxyState;

    com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmTokenMappingColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmTokenMapping>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressColKey);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'address' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$base() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.baseColKey);
    }

    @Override
    public void realmSet$base(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.baseColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.baseColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.baseColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.baseColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$group() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.groupColKey);
    }

    @Override
    public void realmSet$group(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.groupColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.groupColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmTokenMapping", false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "address", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "base", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "group", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmTokenMappingColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmTokenMappingColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmTokenMapping";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmTokenMapping";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmTokenMapping createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmTokenMapping obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
            RealmTokenMappingColumnInfo columnInfo = (RealmTokenMappingColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
            long pkColumnKey = columnInfo.addressColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("address")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("address"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("address")) {
                if (json.isNull("address")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTokenMapping.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTokenMapping.class, json.getString("address"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'address'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) obj;
        if (json.has("base")) {
            if (json.isNull("base")) {
                objProxy.realmSet$base(null);
            } else {
                objProxy.realmSet$base((String) json.getString("base"));
            }
        }
        if (json.has("group")) {
            if (json.isNull("group")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'group' to null.");
            } else {
                objProxy.realmSet$group((int) json.getInt("group"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmTokenMapping createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmTokenMapping obj = new com.alphawallet.app.repository.entity.RealmTokenMapping();
        final com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("base")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$base((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$base(null);
                }
            } else if (name.equals("group")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$group((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'group' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'address'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmTokenMapping copyOrUpdate(Realm realm, RealmTokenMappingColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenMapping object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmTokenMapping) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmTokenMapping realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
            long pkColumnKey = columnInfo.addressColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$address();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmTokenMapping copy(Realm realm, RealmTokenMappingColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenMapping newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmTokenMapping) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());
        builder.addString(columnInfo.baseColKey, unmanagedSource.realmGet$base());
        builder.addInteger(columnInfo.groupColKey, unmanagedSource.realmGet$group());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmTokenMapping object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenMappingColumnInfo columnInfo = (RealmTokenMappingColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$address();
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
        String realmGet$base = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$base();
        if (realmGet$base != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.baseColKey, objKey, realmGet$base, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.groupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$group(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenMappingColumnInfo columnInfo = (RealmTokenMappingColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmTokenMapping object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTokenMapping) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$address();
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
            String realmGet$base = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$base();
            if (realmGet$base != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.baseColKey, objKey, realmGet$base, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.groupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$group(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmTokenMapping object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenMappingColumnInfo columnInfo = (RealmTokenMappingColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$address();
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
        String realmGet$base = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$base();
        if (realmGet$base != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.baseColKey, objKey, realmGet$base, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.baseColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.groupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$group(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenMappingColumnInfo columnInfo = (RealmTokenMappingColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmTokenMapping object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTokenMapping) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$address();
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
            String realmGet$base = ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$base();
            if (realmGet$base != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.baseColKey, objKey, realmGet$base, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.baseColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.groupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) object).realmGet$group(), false);
        }
    }

    public static com.alphawallet.app.repository.entity.RealmTokenMapping createDetachedCopy(com.alphawallet.app.repository.entity.RealmTokenMapping realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmTokenMapping unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmTokenMapping();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmTokenMapping) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmTokenMapping) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$base(realmSource.realmGet$base());
        unmanagedCopy.realmSet$group(realmSource.realmGet$group());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmTokenMapping update(Realm realm, RealmTokenMappingColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenMapping realmObject, com.alphawallet.app.repository.entity.RealmTokenMapping newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenMapping.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.addressColKey, realmObjectSource.realmGet$address());
        builder.addString(columnInfo.baseColKey, realmObjectSource.realmGet$base());
        builder.addInteger(columnInfo.groupColKey, realmObjectSource.realmGet$group());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmTokenMapping = proxy[");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address() != null ? realmGet$address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{base:");
        stringBuilder.append(realmGet$base() != null ? realmGet$base() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{group:");
        stringBuilder.append(realmGet$group());
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
        com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy aRealmTokenMapping = (com_alphawallet_app_repository_entity_RealmTokenMappingRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmTokenMapping.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmTokenMapping.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmTokenMapping.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
