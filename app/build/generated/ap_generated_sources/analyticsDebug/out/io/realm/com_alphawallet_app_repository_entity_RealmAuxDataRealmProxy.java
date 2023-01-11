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
public class com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy extends com.alphawallet.app.repository.entity.RealmAuxData
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface {

    static final class RealmAuxDataColumnInfo extends ColumnInfo {
        long instanceKeyColKey;
        long chainIdColKey;
        long tokenAddressColKey;
        long tokenIdColKey;
        long functionIdColKey;
        long resultColKey;
        long resultTimeColKey;
        long resultReceivedTimeColKey;

        RealmAuxDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmAuxData");
            this.instanceKeyColKey = addColumnDetails("instanceKey", "instanceKey", objectSchemaInfo);
            this.chainIdColKey = addColumnDetails("chainId", "chainId", objectSchemaInfo);
            this.tokenAddressColKey = addColumnDetails("tokenAddress", "tokenAddress", objectSchemaInfo);
            this.tokenIdColKey = addColumnDetails("tokenId", "tokenId", objectSchemaInfo);
            this.functionIdColKey = addColumnDetails("functionId", "functionId", objectSchemaInfo);
            this.resultColKey = addColumnDetails("result", "result", objectSchemaInfo);
            this.resultTimeColKey = addColumnDetails("resultTime", "resultTime", objectSchemaInfo);
            this.resultReceivedTimeColKey = addColumnDetails("resultReceivedTime", "resultReceivedTime", objectSchemaInfo);
        }

        RealmAuxDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmAuxDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmAuxDataColumnInfo src = (RealmAuxDataColumnInfo) rawSrc;
            final RealmAuxDataColumnInfo dst = (RealmAuxDataColumnInfo) rawDst;
            dst.instanceKeyColKey = src.instanceKeyColKey;
            dst.chainIdColKey = src.chainIdColKey;
            dst.tokenAddressColKey = src.tokenAddressColKey;
            dst.tokenIdColKey = src.tokenIdColKey;
            dst.functionIdColKey = src.functionIdColKey;
            dst.resultColKey = src.resultColKey;
            dst.resultTimeColKey = src.resultTimeColKey;
            dst.resultReceivedTimeColKey = src.resultReceivedTimeColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmAuxDataColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmAuxData> proxyState;

    com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmAuxDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmAuxData>(this);
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
    public long realmGet$chainId() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.chainIdColKey);
    }

    @Override
    public void realmSet$chainId(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.chainIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.chainIdColKey, value);
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
    public String realmGet$tokenId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenIdColKey);
    }

    @Override
    public void realmSet$tokenId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$functionId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.functionIdColKey);
    }

    @Override
    public void realmSet$functionId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.functionIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.functionIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.functionIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.functionIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$result() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.resultColKey);
    }

    @Override
    public void realmSet$result(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.resultColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.resultColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.resultColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.resultColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$resultTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.resultTimeColKey);
    }

    @Override
    public void realmSet$resultTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.resultTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.resultTimeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$resultReceivedTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.resultReceivedTimeColKey);
    }

    @Override
    public void realmSet$resultReceivedTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.resultReceivedTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.resultReceivedTimeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmAuxData", false, 8, 0);
        builder.addPersistedProperty(NO_ALIAS, "instanceKey", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "chainId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "tokenAddress", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "tokenId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "functionId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "result", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "resultTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "resultReceivedTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmAuxDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmAuxDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmAuxData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmAuxData";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmAuxData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmAuxData obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
            RealmAuxDataColumnInfo columnInfo = (RealmAuxDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class);
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
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("instanceKey")) {
                if (json.isNull("instanceKey")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmAuxData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmAuxData.class, json.getString("instanceKey"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'instanceKey'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) obj;
        if (json.has("chainId")) {
            if (json.isNull("chainId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
            } else {
                objProxy.realmSet$chainId((long) json.getLong("chainId"));
            }
        }
        if (json.has("tokenAddress")) {
            if (json.isNull("tokenAddress")) {
                objProxy.realmSet$tokenAddress(null);
            } else {
                objProxy.realmSet$tokenAddress((String) json.getString("tokenAddress"));
            }
        }
        if (json.has("tokenId")) {
            if (json.isNull("tokenId")) {
                objProxy.realmSet$tokenId(null);
            } else {
                objProxy.realmSet$tokenId((String) json.getString("tokenId"));
            }
        }
        if (json.has("functionId")) {
            if (json.isNull("functionId")) {
                objProxy.realmSet$functionId(null);
            } else {
                objProxy.realmSet$functionId((String) json.getString("functionId"));
            }
        }
        if (json.has("result")) {
            if (json.isNull("result")) {
                objProxy.realmSet$result(null);
            } else {
                objProxy.realmSet$result((String) json.getString("result"));
            }
        }
        if (json.has("resultTime")) {
            if (json.isNull("resultTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'resultTime' to null.");
            } else {
                objProxy.realmSet$resultTime((long) json.getLong("resultTime"));
            }
        }
        if (json.has("resultReceivedTime")) {
            if (json.isNull("resultReceivedTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'resultReceivedTime' to null.");
            } else {
                objProxy.realmSet$resultReceivedTime((long) json.getLong("resultReceivedTime"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmAuxData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmAuxData obj = new com.alphawallet.app.repository.entity.RealmAuxData();
        final com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) obj;
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
            } else if (name.equals("chainId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chainId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
                }
            } else if (name.equals("tokenAddress")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tokenAddress((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tokenAddress(null);
                }
            } else if (name.equals("tokenId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tokenId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tokenId(null);
                }
            } else if (name.equals("functionId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$functionId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$functionId(null);
                }
            } else if (name.equals("result")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$result((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$result(null);
                }
            } else if (name.equals("resultTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$resultTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'resultTime' to null.");
                }
            } else if (name.equals("resultReceivedTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$resultReceivedTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'resultReceivedTime' to null.");
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

    static com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmAuxData copyOrUpdate(Realm realm, RealmAuxDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmAuxData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmAuxData) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmAuxData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
            long pkColumnKey = columnInfo.instanceKeyColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$instanceKey();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmAuxData copy(Realm realm, RealmAuxDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmAuxData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmAuxData) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.instanceKeyColKey, unmanagedSource.realmGet$instanceKey());
        builder.addInteger(columnInfo.chainIdColKey, unmanagedSource.realmGet$chainId());
        builder.addString(columnInfo.tokenAddressColKey, unmanagedSource.realmGet$tokenAddress());
        builder.addString(columnInfo.tokenIdColKey, unmanagedSource.realmGet$tokenId());
        builder.addString(columnInfo.functionIdColKey, unmanagedSource.realmGet$functionId());
        builder.addString(columnInfo.resultColKey, unmanagedSource.realmGet$result());
        builder.addInteger(columnInfo.resultTimeColKey, unmanagedSource.realmGet$resultTime());
        builder.addInteger(columnInfo.resultReceivedTimeColKey, unmanagedSource.realmGet$resultReceivedTime());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmAuxData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long tableNativePtr = table.getNativePtr();
        RealmAuxDataColumnInfo columnInfo = (RealmAuxDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$instanceKey();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$chainId(), false);
        String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenAddress();
        if (realmGet$tokenAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
        }
        String realmGet$tokenId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenId();
        if (realmGet$tokenId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, objKey, realmGet$tokenId, false);
        }
        String realmGet$functionId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$functionId();
        if (realmGet$functionId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.functionIdColKey, objKey, realmGet$functionId, false);
        }
        String realmGet$result = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$result();
        if (realmGet$result != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.resultTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultTime(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.resultReceivedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultReceivedTime(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long tableNativePtr = table.getNativePtr();
        RealmAuxDataColumnInfo columnInfo = (RealmAuxDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        com.alphawallet.app.repository.entity.RealmAuxData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmAuxData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$instanceKey();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$chainId(), false);
            String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenAddress();
            if (realmGet$tokenAddress != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
            }
            String realmGet$tokenId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenId();
            if (realmGet$tokenId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, objKey, realmGet$tokenId, false);
            }
            String realmGet$functionId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$functionId();
            if (realmGet$functionId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.functionIdColKey, objKey, realmGet$functionId, false);
            }
            String realmGet$result = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$result();
            if (realmGet$result != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.resultTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultTime(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.resultReceivedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultReceivedTime(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmAuxData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long tableNativePtr = table.getNativePtr();
        RealmAuxDataColumnInfo columnInfo = (RealmAuxDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$instanceKey();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$chainId(), false);
        String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenAddress();
        if (realmGet$tokenAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenAddressColKey, objKey, false);
        }
        String realmGet$tokenId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenId();
        if (realmGet$tokenId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, objKey, realmGet$tokenId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenIdColKey, objKey, false);
        }
        String realmGet$functionId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$functionId();
        if (realmGet$functionId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.functionIdColKey, objKey, realmGet$functionId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.functionIdColKey, objKey, false);
        }
        String realmGet$result = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$result();
        if (realmGet$result != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.resultColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.resultTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultTime(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.resultReceivedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultReceivedTime(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long tableNativePtr = table.getNativePtr();
        RealmAuxDataColumnInfo columnInfo = (RealmAuxDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmAuxData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        com.alphawallet.app.repository.entity.RealmAuxData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmAuxData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$instanceKey();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$chainId(), false);
            String realmGet$tokenAddress = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenAddress();
            if (realmGet$tokenAddress != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenAddressColKey, objKey, realmGet$tokenAddress, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tokenAddressColKey, objKey, false);
            }
            String realmGet$tokenId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$tokenId();
            if (realmGet$tokenId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, objKey, realmGet$tokenId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tokenIdColKey, objKey, false);
            }
            String realmGet$functionId = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$functionId();
            if (realmGet$functionId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.functionIdColKey, objKey, realmGet$functionId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.functionIdColKey, objKey, false);
            }
            String realmGet$result = ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$result();
            if (realmGet$result != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.resultColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.resultTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultTime(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.resultReceivedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) object).realmGet$resultReceivedTime(), false);
        }
    }

    public static com.alphawallet.app.repository.entity.RealmAuxData createDetachedCopy(com.alphawallet.app.repository.entity.RealmAuxData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmAuxData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmAuxData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmAuxData) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmAuxData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$instanceKey(realmSource.realmGet$instanceKey());
        unmanagedCopy.realmSet$chainId(realmSource.realmGet$chainId());
        unmanagedCopy.realmSet$tokenAddress(realmSource.realmGet$tokenAddress());
        unmanagedCopy.realmSet$tokenId(realmSource.realmGet$tokenId());
        unmanagedCopy.realmSet$functionId(realmSource.realmGet$functionId());
        unmanagedCopy.realmSet$result(realmSource.realmGet$result());
        unmanagedCopy.realmSet$resultTime(realmSource.realmGet$resultTime());
        unmanagedCopy.realmSet$resultReceivedTime(realmSource.realmGet$resultReceivedTime());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmAuxData update(Realm realm, RealmAuxDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmAuxData realmObject, com.alphawallet.app.repository.entity.RealmAuxData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmAuxData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.instanceKeyColKey, realmObjectSource.realmGet$instanceKey());
        builder.addInteger(columnInfo.chainIdColKey, realmObjectSource.realmGet$chainId());
        builder.addString(columnInfo.tokenAddressColKey, realmObjectSource.realmGet$tokenAddress());
        builder.addString(columnInfo.tokenIdColKey, realmObjectSource.realmGet$tokenId());
        builder.addString(columnInfo.functionIdColKey, realmObjectSource.realmGet$functionId());
        builder.addString(columnInfo.resultColKey, realmObjectSource.realmGet$result());
        builder.addInteger(columnInfo.resultTimeColKey, realmObjectSource.realmGet$resultTime());
        builder.addInteger(columnInfo.resultReceivedTimeColKey, realmObjectSource.realmGet$resultReceivedTime());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmAuxData = proxy[");
        stringBuilder.append("{instanceKey:");
        stringBuilder.append(realmGet$instanceKey() != null ? realmGet$instanceKey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chainId:");
        stringBuilder.append(realmGet$chainId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tokenAddress:");
        stringBuilder.append(realmGet$tokenAddress() != null ? realmGet$tokenAddress() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tokenId:");
        stringBuilder.append(realmGet$tokenId() != null ? realmGet$tokenId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{functionId:");
        stringBuilder.append(realmGet$functionId() != null ? realmGet$functionId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{result:");
        stringBuilder.append(realmGet$result() != null ? realmGet$result() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{resultTime:");
        stringBuilder.append(realmGet$resultTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{resultReceivedTime:");
        stringBuilder.append(realmGet$resultReceivedTime());
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
        com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy aRealmAuxData = (com_alphawallet_app_repository_entity_RealmAuxDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmAuxData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmAuxData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmAuxData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
