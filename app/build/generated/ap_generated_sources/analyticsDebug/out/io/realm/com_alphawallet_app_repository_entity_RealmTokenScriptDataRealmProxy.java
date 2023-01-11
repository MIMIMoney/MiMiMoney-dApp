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
public class com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy extends com.alphawallet.app.repository.entity.RealmTokenScriptData
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface {

    static final class RealmTokenScriptDataColumnInfo extends ColumnInfo {
        long instanceKeyColKey;
        long fileHashColKey;
        long filePathColKey;
        long namesColKey;
        long viewListColKey;
        long hasEventsColKey;

        RealmTokenScriptDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmTokenScriptData");
            this.instanceKeyColKey = addColumnDetails("instanceKey", "instanceKey", objectSchemaInfo);
            this.fileHashColKey = addColumnDetails("fileHash", "fileHash", objectSchemaInfo);
            this.filePathColKey = addColumnDetails("filePath", "filePath", objectSchemaInfo);
            this.namesColKey = addColumnDetails("names", "names", objectSchemaInfo);
            this.viewListColKey = addColumnDetails("viewList", "viewList", objectSchemaInfo);
            this.hasEventsColKey = addColumnDetails("hasEvents", "hasEvents", objectSchemaInfo);
        }

        RealmTokenScriptDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmTokenScriptDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmTokenScriptDataColumnInfo src = (RealmTokenScriptDataColumnInfo) rawSrc;
            final RealmTokenScriptDataColumnInfo dst = (RealmTokenScriptDataColumnInfo) rawDst;
            dst.instanceKeyColKey = src.instanceKeyColKey;
            dst.fileHashColKey = src.fileHashColKey;
            dst.filePathColKey = src.filePathColKey;
            dst.namesColKey = src.namesColKey;
            dst.viewListColKey = src.viewListColKey;
            dst.hasEventsColKey = src.hasEventsColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmTokenScriptDataColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmTokenScriptData> proxyState;

    com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmTokenScriptDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmTokenScriptData>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$instanceKey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.instanceKeyColKey);
    }

    @Override
    public void realmSet$instanceKey(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'instanceKey' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fileHash() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fileHashColKey);
    }

    @Override
    public void realmSet$fileHash(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fileHashColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fileHashColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fileHashColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fileHashColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$filePath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.filePathColKey);
    }

    @Override
    public void realmSet$filePath(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.filePathColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.filePathColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.filePathColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.filePathColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$names() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namesColKey);
    }

    @Override
    public void realmSet$names(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namesColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namesColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namesColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namesColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$viewList() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.viewListColKey);
    }

    @Override
    public void realmSet$viewList(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.viewListColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.viewListColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.viewListColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.viewListColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$hasEvents() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.hasEventsColKey);
    }

    @Override
    public void realmSet$hasEvents(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.hasEventsColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.hasEventsColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmTokenScriptData", false, 6, 0);
        builder.addPersistedProperty(NO_ALIAS, "instanceKey", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "fileHash", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "filePath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "names", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "viewList", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "hasEvents", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmTokenScriptDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmTokenScriptDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmTokenScriptData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmTokenScriptData";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmTokenScriptData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmTokenScriptData obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
            RealmTokenScriptDataColumnInfo columnInfo = (RealmTokenScriptDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
            long pkColumnKey = columnInfo.instanceKeyColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("instanceKey")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("instanceKey"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("instanceKey")) {
                if (json.isNull("instanceKey")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTokenScriptData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTokenScriptData.class, json.getString("instanceKey"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'instanceKey'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) obj;
        if (json.has("fileHash")) {
            if (json.isNull("fileHash")) {
                objProxy.realmSet$fileHash(null);
            } else {
                objProxy.realmSet$fileHash((String) json.getString("fileHash"));
            }
        }
        if (json.has("filePath")) {
            if (json.isNull("filePath")) {
                objProxy.realmSet$filePath(null);
            } else {
                objProxy.realmSet$filePath((String) json.getString("filePath"));
            }
        }
        if (json.has("names")) {
            if (json.isNull("names")) {
                objProxy.realmSet$names(null);
            } else {
                objProxy.realmSet$names((String) json.getString("names"));
            }
        }
        if (json.has("viewList")) {
            if (json.isNull("viewList")) {
                objProxy.realmSet$viewList(null);
            } else {
                objProxy.realmSet$viewList((String) json.getString("viewList"));
            }
        }
        if (json.has("hasEvents")) {
            if (json.isNull("hasEvents")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hasEvents' to null.");
            } else {
                objProxy.realmSet$hasEvents((boolean) json.getBoolean("hasEvents"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmTokenScriptData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmTokenScriptData obj = new com.alphawallet.app.repository.entity.RealmTokenScriptData();
        final com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("instanceKey")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$instanceKey((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$instanceKey(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("fileHash")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fileHash((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fileHash(null);
                }
            } else if (name.equals("filePath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$filePath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$filePath(null);
                }
            } else if (name.equals("names")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$names((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$names(null);
                }
            } else if (name.equals("viewList")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$viewList((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$viewList(null);
                }
            } else if (name.equals("hasEvents")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$hasEvents((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hasEvents' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'instanceKey'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmTokenScriptData copyOrUpdate(Realm realm, RealmTokenScriptDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenScriptData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmTokenScriptData) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmTokenScriptData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
            long pkColumnKey = columnInfo.instanceKeyColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$instanceKey();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmTokenScriptData copy(Realm realm, RealmTokenScriptDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenScriptData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmTokenScriptData) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.instanceKeyColKey, unmanagedSource.realmGet$instanceKey());
        builder.addString(columnInfo.fileHashColKey, unmanagedSource.realmGet$fileHash());
        builder.addString(columnInfo.filePathColKey, unmanagedSource.realmGet$filePath());
        builder.addString(columnInfo.namesColKey, unmanagedSource.realmGet$names());
        builder.addString(columnInfo.viewListColKey, unmanagedSource.realmGet$viewList());
        builder.addBoolean(columnInfo.hasEventsColKey, unmanagedSource.realmGet$hasEvents());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmTokenScriptData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenScriptDataColumnInfo columnInfo = (RealmTokenScriptDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$instanceKey();
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
        String realmGet$fileHash = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$fileHash();
        if (realmGet$fileHash != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileHashColKey, objKey, realmGet$fileHash, false);
        }
        String realmGet$filePath = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$filePath();
        if (realmGet$filePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.filePathColKey, objKey, realmGet$filePath, false);
        }
        String realmGet$names = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$names();
        if (realmGet$names != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namesColKey, objKey, realmGet$names, false);
        }
        String realmGet$viewList = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$viewList();
        if (realmGet$viewList != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.viewListColKey, objKey, realmGet$viewList, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.hasEventsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$hasEvents(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenScriptDataColumnInfo columnInfo = (RealmTokenScriptDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        com.alphawallet.app.repository.entity.RealmTokenScriptData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTokenScriptData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$instanceKey();
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
            String realmGet$fileHash = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$fileHash();
            if (realmGet$fileHash != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileHashColKey, objKey, realmGet$fileHash, false);
            }
            String realmGet$filePath = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$filePath();
            if (realmGet$filePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.filePathColKey, objKey, realmGet$filePath, false);
            }
            String realmGet$names = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$names();
            if (realmGet$names != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namesColKey, objKey, realmGet$names, false);
            }
            String realmGet$viewList = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$viewList();
            if (realmGet$viewList != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.viewListColKey, objKey, realmGet$viewList, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.hasEventsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$hasEvents(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmTokenScriptData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenScriptDataColumnInfo columnInfo = (RealmTokenScriptDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$instanceKey();
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
        String realmGet$fileHash = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$fileHash();
        if (realmGet$fileHash != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileHashColKey, objKey, realmGet$fileHash, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fileHashColKey, objKey, false);
        }
        String realmGet$filePath = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$filePath();
        if (realmGet$filePath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.filePathColKey, objKey, realmGet$filePath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.filePathColKey, objKey, false);
        }
        String realmGet$names = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$names();
        if (realmGet$names != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namesColKey, objKey, realmGet$names, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namesColKey, objKey, false);
        }
        String realmGet$viewList = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$viewList();
        if (realmGet$viewList != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.viewListColKey, objKey, realmGet$viewList, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.viewListColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.hasEventsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$hasEvents(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenScriptDataColumnInfo columnInfo = (RealmTokenScriptDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        com.alphawallet.app.repository.entity.RealmTokenScriptData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTokenScriptData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$instanceKey();
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
            String realmGet$fileHash = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$fileHash();
            if (realmGet$fileHash != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileHashColKey, objKey, realmGet$fileHash, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fileHashColKey, objKey, false);
            }
            String realmGet$filePath = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$filePath();
            if (realmGet$filePath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.filePathColKey, objKey, realmGet$filePath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.filePathColKey, objKey, false);
            }
            String realmGet$names = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$names();
            if (realmGet$names != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namesColKey, objKey, realmGet$names, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namesColKey, objKey, false);
            }
            String realmGet$viewList = ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$viewList();
            if (realmGet$viewList != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.viewListColKey, objKey, realmGet$viewList, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.viewListColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.hasEventsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) object).realmGet$hasEvents(), false);
        }
    }

    public static com.alphawallet.app.repository.entity.RealmTokenScriptData createDetachedCopy(com.alphawallet.app.repository.entity.RealmTokenScriptData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmTokenScriptData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmTokenScriptData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmTokenScriptData) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmTokenScriptData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$instanceKey(realmSource.realmGet$instanceKey());
        unmanagedCopy.realmSet$fileHash(realmSource.realmGet$fileHash());
        unmanagedCopy.realmSet$filePath(realmSource.realmGet$filePath());
        unmanagedCopy.realmSet$names(realmSource.realmGet$names());
        unmanagedCopy.realmSet$viewList(realmSource.realmGet$viewList());
        unmanagedCopy.realmSet$hasEvents(realmSource.realmGet$hasEvents());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmTokenScriptData update(Realm realm, RealmTokenScriptDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenScriptData realmObject, com.alphawallet.app.repository.entity.RealmTokenScriptData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenScriptData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.instanceKeyColKey, realmObjectSource.realmGet$instanceKey());
        builder.addString(columnInfo.fileHashColKey, realmObjectSource.realmGet$fileHash());
        builder.addString(columnInfo.filePathColKey, realmObjectSource.realmGet$filePath());
        builder.addString(columnInfo.namesColKey, realmObjectSource.realmGet$names());
        builder.addString(columnInfo.viewListColKey, realmObjectSource.realmGet$viewList());
        builder.addBoolean(columnInfo.hasEventsColKey, realmObjectSource.realmGet$hasEvents());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmTokenScriptData = proxy[");
        stringBuilder.append("{instanceKey:");
        stringBuilder.append(realmGet$instanceKey() != null ? realmGet$instanceKey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fileHash:");
        stringBuilder.append(realmGet$fileHash() != null ? realmGet$fileHash() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{filePath:");
        stringBuilder.append(realmGet$filePath() != null ? realmGet$filePath() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{names:");
        stringBuilder.append(realmGet$names() != null ? realmGet$names() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{viewList:");
        stringBuilder.append(realmGet$viewList() != null ? realmGet$viewList() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{hasEvents:");
        stringBuilder.append(realmGet$hasEvents());
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
        com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy aRealmTokenScriptData = (com_alphawallet_app_repository_entity_RealmTokenScriptDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmTokenScriptData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmTokenScriptData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmTokenScriptData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
