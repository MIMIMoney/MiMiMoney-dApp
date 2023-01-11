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
public class com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy extends com.alphawallet.app.repository.entity.RealmKeyType
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface {

    static final class RealmKeyTypeColumnInfo extends ColumnInfo {
        long addressColKey;
        long typeColKey;
        long authLevelColKey;
        long lastBackupColKey;
        long dateAddedColKey;
        long modulusColKey;

        RealmKeyTypeColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmKeyType");
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.authLevelColKey = addColumnDetails("authLevel", "authLevel", objectSchemaInfo);
            this.lastBackupColKey = addColumnDetails("lastBackup", "lastBackup", objectSchemaInfo);
            this.dateAddedColKey = addColumnDetails("dateAdded", "dateAdded", objectSchemaInfo);
            this.modulusColKey = addColumnDetails("modulus", "modulus", objectSchemaInfo);
        }

        RealmKeyTypeColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmKeyTypeColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmKeyTypeColumnInfo src = (RealmKeyTypeColumnInfo) rawSrc;
            final RealmKeyTypeColumnInfo dst = (RealmKeyTypeColumnInfo) rawDst;
            dst.addressColKey = src.addressColKey;
            dst.typeColKey = src.typeColKey;
            dst.authLevelColKey = src.authLevelColKey;
            dst.lastBackupColKey = src.lastBackupColKey;
            dst.dateAddedColKey = src.dateAddedColKey;
            dst.modulusColKey = src.modulusColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmKeyTypeColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmKeyType> proxyState;

    com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmKeyTypeColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmKeyType>(this);
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
    public byte realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (byte) proxyState.getRow$realm().getLong(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(byte value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.typeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public byte realmGet$authLevel() {
        proxyState.getRealm$realm().checkIfValid();
        return (byte) proxyState.getRow$realm().getLong(columnInfo.authLevelColKey);
    }

    @Override
    public void realmSet$authLevel(byte value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.authLevelColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.authLevelColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastBackup() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastBackupColKey);
    }

    @Override
    public void realmSet$lastBackup(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastBackupColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastBackupColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$dateAdded() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateAddedColKey);
    }

    @Override
    public void realmSet$dateAdded(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateAddedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateAddedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$modulus() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.modulusColKey);
    }

    @Override
    public void realmSet$modulus(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.modulusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.modulusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.modulusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.modulusColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmKeyType", false, 6, 0);
        builder.addPersistedProperty(NO_ALIAS, "address", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "authLevel", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lastBackup", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dateAdded", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "modulus", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmKeyTypeColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmKeyTypeColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmKeyType";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmKeyType";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmKeyType createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmKeyType obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
            RealmKeyTypeColumnInfo columnInfo = (RealmKeyTypeColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class);
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
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("address")) {
                if (json.isNull("address")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmKeyType.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmKeyType.class, json.getString("address"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'address'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) obj;
        if (json.has("type")) {
            if (json.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            } else {
                objProxy.realmSet$type((byte) json.getInt("type"));
            }
        }
        if (json.has("authLevel")) {
            if (json.isNull("authLevel")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'authLevel' to null.");
            } else {
                objProxy.realmSet$authLevel((byte) json.getInt("authLevel"));
            }
        }
        if (json.has("lastBackup")) {
            if (json.isNull("lastBackup")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastBackup' to null.");
            } else {
                objProxy.realmSet$lastBackup((long) json.getLong("lastBackup"));
            }
        }
        if (json.has("dateAdded")) {
            if (json.isNull("dateAdded")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateAdded' to null.");
            } else {
                objProxy.realmSet$dateAdded((long) json.getLong("dateAdded"));
            }
        }
        if (json.has("modulus")) {
            if (json.isNull("modulus")) {
                objProxy.realmSet$modulus(null);
            } else {
                objProxy.realmSet$modulus((String) json.getString("modulus"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmKeyType createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmKeyType obj = new com.alphawallet.app.repository.entity.RealmKeyType();
        final com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) obj;
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
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((byte) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
            } else if (name.equals("authLevel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$authLevel((byte) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'authLevel' to null.");
                }
            } else if (name.equals("lastBackup")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastBackup((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastBackup' to null.");
                }
            } else if (name.equals("dateAdded")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dateAdded((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateAdded' to null.");
                }
            } else if (name.equals("modulus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$modulus((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$modulus(null);
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

    static com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmKeyType copyOrUpdate(Realm realm, RealmKeyTypeColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmKeyType object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmKeyType) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmKeyType realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
            long pkColumnKey = columnInfo.addressColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$address();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmKeyType copy(Realm realm, RealmKeyTypeColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmKeyType newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmKeyType) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());
        builder.addInteger(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addInteger(columnInfo.authLevelColKey, unmanagedSource.realmGet$authLevel());
        builder.addInteger(columnInfo.lastBackupColKey, unmanagedSource.realmGet$lastBackup());
        builder.addInteger(columnInfo.dateAddedColKey, unmanagedSource.realmGet$dateAdded());
        builder.addString(columnInfo.modulusColKey, unmanagedSource.realmGet$modulus());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmKeyType object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long tableNativePtr = table.getNativePtr();
        RealmKeyTypeColumnInfo columnInfo = (RealmKeyTypeColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$address();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$type(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.authLevelColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$authLevel(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastBackupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$lastBackup(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateAddedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$dateAdded(), false);
        String realmGet$modulus = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$modulus();
        if (realmGet$modulus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modulusColKey, objKey, realmGet$modulus, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long tableNativePtr = table.getNativePtr();
        RealmKeyTypeColumnInfo columnInfo = (RealmKeyTypeColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmKeyType object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmKeyType) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$address();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$type(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.authLevelColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$authLevel(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastBackupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$lastBackup(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateAddedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$dateAdded(), false);
            String realmGet$modulus = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$modulus();
            if (realmGet$modulus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modulusColKey, objKey, realmGet$modulus, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmKeyType object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long tableNativePtr = table.getNativePtr();
        RealmKeyTypeColumnInfo columnInfo = (RealmKeyTypeColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$address();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$type(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.authLevelColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$authLevel(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastBackupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$lastBackup(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateAddedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$dateAdded(), false);
        String realmGet$modulus = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$modulus();
        if (realmGet$modulus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modulusColKey, objKey, realmGet$modulus, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modulusColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long tableNativePtr = table.getNativePtr();
        RealmKeyTypeColumnInfo columnInfo = (RealmKeyTypeColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmKeyType.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmKeyType object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmKeyType) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$address();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$type(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.authLevelColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$authLevel(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastBackupColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$lastBackup(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateAddedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$dateAdded(), false);
            String realmGet$modulus = ((com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) object).realmGet$modulus();
            if (realmGet$modulus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modulusColKey, objKey, realmGet$modulus, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modulusColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmKeyType createDetachedCopy(com.alphawallet.app.repository.entity.RealmKeyType realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmKeyType unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmKeyType();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmKeyType) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmKeyType) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$authLevel(realmSource.realmGet$authLevel());
        unmanagedCopy.realmSet$lastBackup(realmSource.realmGet$lastBackup());
        unmanagedCopy.realmSet$dateAdded(realmSource.realmGet$dateAdded());
        unmanagedCopy.realmSet$modulus(realmSource.realmGet$modulus());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmKeyType update(Realm realm, RealmKeyTypeColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmKeyType realmObject, com.alphawallet.app.repository.entity.RealmKeyType newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmKeyType.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.addressColKey, realmObjectSource.realmGet$address());
        builder.addInteger(columnInfo.typeColKey, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.authLevelColKey, realmObjectSource.realmGet$authLevel());
        builder.addInteger(columnInfo.lastBackupColKey, realmObjectSource.realmGet$lastBackup());
        builder.addInteger(columnInfo.dateAddedColKey, realmObjectSource.realmGet$dateAdded());
        builder.addString(columnInfo.modulusColKey, realmObjectSource.realmGet$modulus());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmKeyType = proxy[");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address() != null ? realmGet$address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{authLevel:");
        stringBuilder.append(realmGet$authLevel());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastBackup:");
        stringBuilder.append(realmGet$lastBackup());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dateAdded:");
        stringBuilder.append(realmGet$dateAdded());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{modulus:");
        stringBuilder.append(realmGet$modulus() != null ? realmGet$modulus() : "null");
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
        com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy aRealmKeyType = (com_alphawallet_app_repository_entity_RealmKeyTypeRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmKeyType.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmKeyType.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmKeyType.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
