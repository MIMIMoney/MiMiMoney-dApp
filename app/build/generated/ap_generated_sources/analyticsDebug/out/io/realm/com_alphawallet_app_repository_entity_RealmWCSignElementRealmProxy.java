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
public class com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy extends com.alphawallet.app.repository.entity.RealmWCSignElement
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface {

    static final class RealmWCSignElementColumnInfo extends ColumnInfo {
        long sessionIdColKey;
        long signMessageColKey;
        long signTimeColKey;
        long signTypeColKey;

        RealmWCSignElementColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmWCSignElement");
            this.sessionIdColKey = addColumnDetails("sessionId", "sessionId", objectSchemaInfo);
            this.signMessageColKey = addColumnDetails("signMessage", "signMessage", objectSchemaInfo);
            this.signTimeColKey = addColumnDetails("signTime", "signTime", objectSchemaInfo);
            this.signTypeColKey = addColumnDetails("signType", "signType", objectSchemaInfo);
        }

        RealmWCSignElementColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmWCSignElementColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmWCSignElementColumnInfo src = (RealmWCSignElementColumnInfo) rawSrc;
            final RealmWCSignElementColumnInfo dst = (RealmWCSignElementColumnInfo) rawDst;
            dst.sessionIdColKey = src.sessionIdColKey;
            dst.signMessageColKey = src.signMessageColKey;
            dst.signTimeColKey = src.signTimeColKey;
            dst.signTypeColKey = src.signTypeColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmWCSignElementColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmWCSignElement> proxyState;

    com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmWCSignElementColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmWCSignElement>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sessionId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sessionIdColKey);
    }

    @Override
    public void realmSet$sessionId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sessionIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.sessionIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sessionIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sessionIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public byte[] realmGet$signMessage() {
        proxyState.getRealm$realm().checkIfValid();
        return (byte[]) proxyState.getRow$realm().getBinaryByteArray(columnInfo.signMessageColKey);
    }

    @Override
    public void realmSet$signMessage(byte[] value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.signMessageColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setBinaryByteArray(columnInfo.signMessageColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.signMessageColKey);
            return;
        }
        proxyState.getRow$realm().setBinaryByteArray(columnInfo.signMessageColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$signTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.signTimeColKey);
    }

    @Override
    public void realmSet$signTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.signTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.signTimeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$signType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.signTypeColKey);
    }

    @Override
    public void realmSet$signType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.signTypeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.signTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.signTypeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.signTypeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmWCSignElement", false, 4, 0);
        builder.addPersistedProperty(NO_ALIAS, "sessionId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "signMessage", RealmFieldType.BINARY, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "signTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "signType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmWCSignElementColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmWCSignElementColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmWCSignElement";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmWCSignElement";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmWCSignElement createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmWCSignElement obj = realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmWCSignElement.class, true, excludeFields);

        final com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) obj;
        if (json.has("sessionId")) {
            if (json.isNull("sessionId")) {
                objProxy.realmSet$sessionId(null);
            } else {
                objProxy.realmSet$sessionId((String) json.getString("sessionId"));
            }
        }
        if (json.has("signMessage")) {
            if (json.isNull("signMessage")) {
                objProxy.realmSet$signMessage(null);
            } else {
                objProxy.realmSet$signMessage(JsonUtils.stringToBytes(json.getString("signMessage")));
            }
        }
        if (json.has("signTime")) {
            if (json.isNull("signTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'signTime' to null.");
            } else {
                objProxy.realmSet$signTime((long) json.getLong("signTime"));
            }
        }
        if (json.has("signType")) {
            if (json.isNull("signType")) {
                objProxy.realmSet$signType(null);
            } else {
                objProxy.realmSet$signType((String) json.getString("signType"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmWCSignElement createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.alphawallet.app.repository.entity.RealmWCSignElement obj = new com.alphawallet.app.repository.entity.RealmWCSignElement();
        final com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("sessionId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sessionId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sessionId(null);
                }
            } else if (name.equals("signMessage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$signMessage(JsonUtils.stringToBytes(reader.nextString()));
                } else {
                    reader.skipValue();
                    objProxy.realmSet$signMessage(null);
                }
            } else if (name.equals("signTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$signTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'signTime' to null.");
                }
            } else if (name.equals("signType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$signType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$signType(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSignElement.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmWCSignElement copyOrUpdate(Realm realm, RealmWCSignElementColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWCSignElement object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmWCSignElement) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmWCSignElement copy(Realm realm, RealmWCSignElementColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWCSignElement newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmWCSignElement) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.sessionIdColKey, unmanagedSource.realmGet$sessionId());
        builder.addByteArray(columnInfo.signMessageColKey, unmanagedSource.realmGet$signMessage());
        builder.addInteger(columnInfo.signTimeColKey, unmanagedSource.realmGet$signTime());
        builder.addString(columnInfo.signTypeColKey, unmanagedSource.realmGet$signType());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmWCSignElement object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSignElementColumnInfo columnInfo = (RealmWCSignElementColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$sessionId = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$sessionId();
        if (realmGet$sessionId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sessionIdColKey, objKey, realmGet$sessionId, false);
        }
        byte[] realmGet$signMessage = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signMessage();
        if (realmGet$signMessage != null) {
            Table.nativeSetByteArray(tableNativePtr, columnInfo.signMessageColKey, objKey, realmGet$signMessage, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.signTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signTime(), false);
        String realmGet$signType = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signType();
        if (realmGet$signType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.signTypeColKey, objKey, realmGet$signType, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSignElementColumnInfo columnInfo = (RealmWCSignElementColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        com.alphawallet.app.repository.entity.RealmWCSignElement object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmWCSignElement) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$sessionId = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$sessionId();
            if (realmGet$sessionId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sessionIdColKey, objKey, realmGet$sessionId, false);
            }
            byte[] realmGet$signMessage = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signMessage();
            if (realmGet$signMessage != null) {
                Table.nativeSetByteArray(tableNativePtr, columnInfo.signMessageColKey, objKey, realmGet$signMessage, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.signTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signTime(), false);
            String realmGet$signType = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signType();
            if (realmGet$signType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.signTypeColKey, objKey, realmGet$signType, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmWCSignElement object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSignElementColumnInfo columnInfo = (RealmWCSignElementColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$sessionId = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$sessionId();
        if (realmGet$sessionId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sessionIdColKey, objKey, realmGet$sessionId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sessionIdColKey, objKey, false);
        }
        byte[] realmGet$signMessage = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signMessage();
        if (realmGet$signMessage != null) {
            Table.nativeSetByteArray(tableNativePtr, columnInfo.signMessageColKey, objKey, realmGet$signMessage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.signMessageColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.signTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signTime(), false);
        String realmGet$signType = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signType();
        if (realmGet$signType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.signTypeColKey, objKey, realmGet$signType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.signTypeColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSignElementColumnInfo columnInfo = (RealmWCSignElementColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSignElement.class);
        com.alphawallet.app.repository.entity.RealmWCSignElement object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmWCSignElement) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$sessionId = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$sessionId();
            if (realmGet$sessionId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sessionIdColKey, objKey, realmGet$sessionId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sessionIdColKey, objKey, false);
            }
            byte[] realmGet$signMessage = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signMessage();
            if (realmGet$signMessage != null) {
                Table.nativeSetByteArray(tableNativePtr, columnInfo.signMessageColKey, objKey, realmGet$signMessage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.signMessageColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.signTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signTime(), false);
            String realmGet$signType = ((com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) object).realmGet$signType();
            if (realmGet$signType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.signTypeColKey, objKey, realmGet$signType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.signTypeColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmWCSignElement createDetachedCopy(com.alphawallet.app.repository.entity.RealmWCSignElement realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmWCSignElement unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmWCSignElement();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmWCSignElement) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmWCSignElement) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$sessionId(realmSource.realmGet$sessionId());
        unmanagedCopy.realmSet$signMessage(realmSource.realmGet$signMessage());
        unmanagedCopy.realmSet$signTime(realmSource.realmGet$signTime());
        unmanagedCopy.realmSet$signType(realmSource.realmGet$signType());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmWCSignElement = proxy[");
        stringBuilder.append("{sessionId:");
        stringBuilder.append(realmGet$sessionId() != null ? realmGet$sessionId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{signMessage:");
        stringBuilder.append((realmGet$signMessage() == null) ? "null" : "binary(" + realmGet$signMessage().length + ")");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{signTime:");
        stringBuilder.append(realmGet$signTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{signType:");
        stringBuilder.append(realmGet$signType() != null ? realmGet$signType() : "null");
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
        com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy aRealmWCSignElement = (com_alphawallet_app_repository_entity_RealmWCSignElementRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmWCSignElement.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmWCSignElement.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmWCSignElement.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
