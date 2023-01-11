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
public class com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy extends com.alphawallet.app.repository.entity.RealmWCSession
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface {

    static final class RealmWCSessionColumnInfo extends ColumnInfo {
        long sessionIdColKey;
        long peerIdColKey;
        long sessionDataColKey;
        long remotePeerDataColKey;
        long remotePeerIdColKey;
        long usageCountColKey;
        long lastUsageTimeColKey;
        long walletAccountColKey;
        long chainIdColKey;

        RealmWCSessionColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmWCSession");
            this.sessionIdColKey = addColumnDetails("sessionId", "sessionId", objectSchemaInfo);
            this.peerIdColKey = addColumnDetails("peerId", "peerId", objectSchemaInfo);
            this.sessionDataColKey = addColumnDetails("sessionData", "sessionData", objectSchemaInfo);
            this.remotePeerDataColKey = addColumnDetails("remotePeerData", "remotePeerData", objectSchemaInfo);
            this.remotePeerIdColKey = addColumnDetails("remotePeerId", "remotePeerId", objectSchemaInfo);
            this.usageCountColKey = addColumnDetails("usageCount", "usageCount", objectSchemaInfo);
            this.lastUsageTimeColKey = addColumnDetails("lastUsageTime", "lastUsageTime", objectSchemaInfo);
            this.walletAccountColKey = addColumnDetails("walletAccount", "walletAccount", objectSchemaInfo);
            this.chainIdColKey = addColumnDetails("chainId", "chainId", objectSchemaInfo);
        }

        RealmWCSessionColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmWCSessionColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmWCSessionColumnInfo src = (RealmWCSessionColumnInfo) rawSrc;
            final RealmWCSessionColumnInfo dst = (RealmWCSessionColumnInfo) rawDst;
            dst.sessionIdColKey = src.sessionIdColKey;
            dst.peerIdColKey = src.peerIdColKey;
            dst.sessionDataColKey = src.sessionDataColKey;
            dst.remotePeerDataColKey = src.remotePeerDataColKey;
            dst.remotePeerIdColKey = src.remotePeerIdColKey;
            dst.usageCountColKey = src.usageCountColKey;
            dst.lastUsageTimeColKey = src.lastUsageTimeColKey;
            dst.walletAccountColKey = src.walletAccountColKey;
            dst.chainIdColKey = src.chainIdColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmWCSessionColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmWCSession> proxyState;

    com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmWCSessionColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmWCSession>(this);
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'sessionId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$peerId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.peerIdColKey);
    }

    @Override
    public void realmSet$peerId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.peerIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.peerIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.peerIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.peerIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sessionData() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sessionDataColKey);
    }

    @Override
    public void realmSet$sessionData(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sessionDataColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.sessionDataColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sessionDataColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sessionDataColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$remotePeerData() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.remotePeerDataColKey);
    }

    @Override
    public void realmSet$remotePeerData(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.remotePeerDataColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.remotePeerDataColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.remotePeerDataColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.remotePeerDataColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$remotePeerId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.remotePeerIdColKey);
    }

    @Override
    public void realmSet$remotePeerId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.remotePeerIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.remotePeerIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.remotePeerIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.remotePeerIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$usageCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.usageCountColKey);
    }

    @Override
    public void realmSet$usageCount(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.usageCountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.usageCountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastUsageTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastUsageTimeColKey);
    }

    @Override
    public void realmSet$lastUsageTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastUsageTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastUsageTimeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$walletAccount() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.walletAccountColKey);
    }

    @Override
    public void realmSet$walletAccount(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.walletAccountColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.walletAccountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.walletAccountColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.walletAccountColKey, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmWCSession", false, 9, 0);
        builder.addPersistedProperty(NO_ALIAS, "sessionId", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "peerId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "sessionData", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "remotePeerData", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "remotePeerId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "usageCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lastUsageTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "walletAccount", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "chainId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmWCSessionColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmWCSessionColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmWCSession";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmWCSession";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmWCSession createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmWCSession obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
            RealmWCSessionColumnInfo columnInfo = (RealmWCSessionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class);
            long pkColumnKey = columnInfo.sessionIdColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("sessionId")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("sessionId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("sessionId")) {
                if (json.isNull("sessionId")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmWCSession.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmWCSession.class, json.getString("sessionId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'sessionId'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) obj;
        if (json.has("peerId")) {
            if (json.isNull("peerId")) {
                objProxy.realmSet$peerId(null);
            } else {
                objProxy.realmSet$peerId((String) json.getString("peerId"));
            }
        }
        if (json.has("sessionData")) {
            if (json.isNull("sessionData")) {
                objProxy.realmSet$sessionData(null);
            } else {
                objProxy.realmSet$sessionData((String) json.getString("sessionData"));
            }
        }
        if (json.has("remotePeerData")) {
            if (json.isNull("remotePeerData")) {
                objProxy.realmSet$remotePeerData(null);
            } else {
                objProxy.realmSet$remotePeerData((String) json.getString("remotePeerData"));
            }
        }
        if (json.has("remotePeerId")) {
            if (json.isNull("remotePeerId")) {
                objProxy.realmSet$remotePeerId(null);
            } else {
                objProxy.realmSet$remotePeerId((String) json.getString("remotePeerId"));
            }
        }
        if (json.has("usageCount")) {
            if (json.isNull("usageCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'usageCount' to null.");
            } else {
                objProxy.realmSet$usageCount((int) json.getInt("usageCount"));
            }
        }
        if (json.has("lastUsageTime")) {
            if (json.isNull("lastUsageTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastUsageTime' to null.");
            } else {
                objProxy.realmSet$lastUsageTime((long) json.getLong("lastUsageTime"));
            }
        }
        if (json.has("walletAccount")) {
            if (json.isNull("walletAccount")) {
                objProxy.realmSet$walletAccount(null);
            } else {
                objProxy.realmSet$walletAccount((String) json.getString("walletAccount"));
            }
        }
        if (json.has("chainId")) {
            if (json.isNull("chainId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
            } else {
                objProxy.realmSet$chainId((long) json.getLong("chainId"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmWCSession createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmWCSession obj = new com.alphawallet.app.repository.entity.RealmWCSession();
        final com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) obj;
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
                jsonHasPrimaryKey = true;
            } else if (name.equals("peerId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$peerId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$peerId(null);
                }
            } else if (name.equals("sessionData")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sessionData((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sessionData(null);
                }
            } else if (name.equals("remotePeerData")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$remotePeerData((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$remotePeerData(null);
                }
            } else if (name.equals("remotePeerId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$remotePeerId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$remotePeerId(null);
                }
            } else if (name.equals("usageCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$usageCount((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'usageCount' to null.");
                }
            } else if (name.equals("lastUsageTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastUsageTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastUsageTime' to null.");
                }
            } else if (name.equals("walletAccount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$walletAccount((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$walletAccount(null);
                }
            } else if (name.equals("chainId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chainId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'sessionId'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmWCSession copyOrUpdate(Realm realm, RealmWCSessionColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWCSession object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmWCSession) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmWCSession realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
            long pkColumnKey = columnInfo.sessionIdColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionId();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmWCSession copy(Realm realm, RealmWCSessionColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWCSession newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmWCSession) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.sessionIdColKey, unmanagedSource.realmGet$sessionId());
        builder.addString(columnInfo.peerIdColKey, unmanagedSource.realmGet$peerId());
        builder.addString(columnInfo.sessionDataColKey, unmanagedSource.realmGet$sessionData());
        builder.addString(columnInfo.remotePeerDataColKey, unmanagedSource.realmGet$remotePeerData());
        builder.addString(columnInfo.remotePeerIdColKey, unmanagedSource.realmGet$remotePeerId());
        builder.addInteger(columnInfo.usageCountColKey, unmanagedSource.realmGet$usageCount());
        builder.addInteger(columnInfo.lastUsageTimeColKey, unmanagedSource.realmGet$lastUsageTime());
        builder.addString(columnInfo.walletAccountColKey, unmanagedSource.realmGet$walletAccount());
        builder.addInteger(columnInfo.chainIdColKey, unmanagedSource.realmGet$chainId());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmWCSession object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSessionColumnInfo columnInfo = (RealmWCSessionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long pkColumnKey = columnInfo.sessionIdColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionId();
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
        String realmGet$peerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$peerId();
        if (realmGet$peerId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.peerIdColKey, objKey, realmGet$peerId, false);
        }
        String realmGet$sessionData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionData();
        if (realmGet$sessionData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sessionDataColKey, objKey, realmGet$sessionData, false);
        }
        String realmGet$remotePeerData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerData();
        if (realmGet$remotePeerData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remotePeerDataColKey, objKey, realmGet$remotePeerData, false);
        }
        String realmGet$remotePeerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerId();
        if (realmGet$remotePeerId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remotePeerIdColKey, objKey, realmGet$remotePeerId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.usageCountColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$usageCount(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUsageTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$lastUsageTime(), false);
        String realmGet$walletAccount = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$walletAccount();
        if (realmGet$walletAccount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.walletAccountColKey, objKey, realmGet$walletAccount, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$chainId(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSessionColumnInfo columnInfo = (RealmWCSessionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long pkColumnKey = columnInfo.sessionIdColKey;
        com.alphawallet.app.repository.entity.RealmWCSession object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmWCSession) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionId();
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
            String realmGet$peerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$peerId();
            if (realmGet$peerId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.peerIdColKey, objKey, realmGet$peerId, false);
            }
            String realmGet$sessionData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionData();
            if (realmGet$sessionData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sessionDataColKey, objKey, realmGet$sessionData, false);
            }
            String realmGet$remotePeerData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerData();
            if (realmGet$remotePeerData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remotePeerDataColKey, objKey, realmGet$remotePeerData, false);
            }
            String realmGet$remotePeerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerId();
            if (realmGet$remotePeerId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remotePeerIdColKey, objKey, realmGet$remotePeerId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.usageCountColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$usageCount(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUsageTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$lastUsageTime(), false);
            String realmGet$walletAccount = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$walletAccount();
            if (realmGet$walletAccount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.walletAccountColKey, objKey, realmGet$walletAccount, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$chainId(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmWCSession object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSessionColumnInfo columnInfo = (RealmWCSessionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long pkColumnKey = columnInfo.sessionIdColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionId();
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
        String realmGet$peerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$peerId();
        if (realmGet$peerId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.peerIdColKey, objKey, realmGet$peerId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.peerIdColKey, objKey, false);
        }
        String realmGet$sessionData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionData();
        if (realmGet$sessionData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sessionDataColKey, objKey, realmGet$sessionData, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sessionDataColKey, objKey, false);
        }
        String realmGet$remotePeerData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerData();
        if (realmGet$remotePeerData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remotePeerDataColKey, objKey, realmGet$remotePeerData, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.remotePeerDataColKey, objKey, false);
        }
        String realmGet$remotePeerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerId();
        if (realmGet$remotePeerId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remotePeerIdColKey, objKey, realmGet$remotePeerId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.remotePeerIdColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.usageCountColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$usageCount(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastUsageTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$lastUsageTime(), false);
        String realmGet$walletAccount = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$walletAccount();
        if (realmGet$walletAccount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.walletAccountColKey, objKey, realmGet$walletAccount, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.walletAccountColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$chainId(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long tableNativePtr = table.getNativePtr();
        RealmWCSessionColumnInfo columnInfo = (RealmWCSessionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWCSession.class);
        long pkColumnKey = columnInfo.sessionIdColKey;
        com.alphawallet.app.repository.entity.RealmWCSession object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmWCSession) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionId();
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
            String realmGet$peerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$peerId();
            if (realmGet$peerId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.peerIdColKey, objKey, realmGet$peerId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.peerIdColKey, objKey, false);
            }
            String realmGet$sessionData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$sessionData();
            if (realmGet$sessionData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sessionDataColKey, objKey, realmGet$sessionData, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sessionDataColKey, objKey, false);
            }
            String realmGet$remotePeerData = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerData();
            if (realmGet$remotePeerData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remotePeerDataColKey, objKey, realmGet$remotePeerData, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.remotePeerDataColKey, objKey, false);
            }
            String realmGet$remotePeerId = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$remotePeerId();
            if (realmGet$remotePeerId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remotePeerIdColKey, objKey, realmGet$remotePeerId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.remotePeerIdColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.usageCountColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$usageCount(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastUsageTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$lastUsageTime(), false);
            String realmGet$walletAccount = ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$walletAccount();
            if (realmGet$walletAccount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.walletAccountColKey, objKey, realmGet$walletAccount, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.walletAccountColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) object).realmGet$chainId(), false);
        }
    }

    public static com.alphawallet.app.repository.entity.RealmWCSession createDetachedCopy(com.alphawallet.app.repository.entity.RealmWCSession realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmWCSession unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmWCSession();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmWCSession) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmWCSession) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$sessionId(realmSource.realmGet$sessionId());
        unmanagedCopy.realmSet$peerId(realmSource.realmGet$peerId());
        unmanagedCopy.realmSet$sessionData(realmSource.realmGet$sessionData());
        unmanagedCopy.realmSet$remotePeerData(realmSource.realmGet$remotePeerData());
        unmanagedCopy.realmSet$remotePeerId(realmSource.realmGet$remotePeerId());
        unmanagedCopy.realmSet$usageCount(realmSource.realmGet$usageCount());
        unmanagedCopy.realmSet$lastUsageTime(realmSource.realmGet$lastUsageTime());
        unmanagedCopy.realmSet$walletAccount(realmSource.realmGet$walletAccount());
        unmanagedCopy.realmSet$chainId(realmSource.realmGet$chainId());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmWCSession update(Realm realm, RealmWCSessionColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWCSession realmObject, com.alphawallet.app.repository.entity.RealmWCSession newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWCSession.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.sessionIdColKey, realmObjectSource.realmGet$sessionId());
        builder.addString(columnInfo.peerIdColKey, realmObjectSource.realmGet$peerId());
        builder.addString(columnInfo.sessionDataColKey, realmObjectSource.realmGet$sessionData());
        builder.addString(columnInfo.remotePeerDataColKey, realmObjectSource.realmGet$remotePeerData());
        builder.addString(columnInfo.remotePeerIdColKey, realmObjectSource.realmGet$remotePeerId());
        builder.addInteger(columnInfo.usageCountColKey, realmObjectSource.realmGet$usageCount());
        builder.addInteger(columnInfo.lastUsageTimeColKey, realmObjectSource.realmGet$lastUsageTime());
        builder.addString(columnInfo.walletAccountColKey, realmObjectSource.realmGet$walletAccount());
        builder.addInteger(columnInfo.chainIdColKey, realmObjectSource.realmGet$chainId());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmWCSession = proxy[");
        stringBuilder.append("{sessionId:");
        stringBuilder.append(realmGet$sessionId() != null ? realmGet$sessionId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{peerId:");
        stringBuilder.append(realmGet$peerId() != null ? realmGet$peerId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sessionData:");
        stringBuilder.append(realmGet$sessionData() != null ? realmGet$sessionData() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{remotePeerData:");
        stringBuilder.append(realmGet$remotePeerData() != null ? realmGet$remotePeerData() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{remotePeerId:");
        stringBuilder.append(realmGet$remotePeerId() != null ? realmGet$remotePeerId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{usageCount:");
        stringBuilder.append(realmGet$usageCount());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastUsageTime:");
        stringBuilder.append(realmGet$lastUsageTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{walletAccount:");
        stringBuilder.append(realmGet$walletAccount() != null ? realmGet$walletAccount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chainId:");
        stringBuilder.append(realmGet$chainId());
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
        com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy aRealmWCSession = (com_alphawallet_app_repository_entity_RealmWCSessionRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmWCSession.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmWCSession.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmWCSession.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
