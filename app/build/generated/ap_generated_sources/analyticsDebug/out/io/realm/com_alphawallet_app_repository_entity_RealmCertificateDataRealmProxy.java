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
public class com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy extends com.alphawallet.app.repository.entity.RealmCertificateData
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface {

    static final class RealmCertificateDataColumnInfo extends ColumnInfo {
        long instanceKeyColKey;
        long resultColKey;
        long subjectColKey;
        long keyNameColKey;
        long keyTypeColKey;
        long issuerColKey;
        long certificateNameColKey;
        long typeColKey;

        RealmCertificateDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmCertificateData");
            this.instanceKeyColKey = addColumnDetails("instanceKey", "instanceKey", objectSchemaInfo);
            this.resultColKey = addColumnDetails("result", "result", objectSchemaInfo);
            this.subjectColKey = addColumnDetails("subject", "subject", objectSchemaInfo);
            this.keyNameColKey = addColumnDetails("keyName", "keyName", objectSchemaInfo);
            this.keyTypeColKey = addColumnDetails("keyType", "keyType", objectSchemaInfo);
            this.issuerColKey = addColumnDetails("issuer", "issuer", objectSchemaInfo);
            this.certificateNameColKey = addColumnDetails("certificateName", "certificateName", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
        }

        RealmCertificateDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmCertificateDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmCertificateDataColumnInfo src = (RealmCertificateDataColumnInfo) rawSrc;
            final RealmCertificateDataColumnInfo dst = (RealmCertificateDataColumnInfo) rawDst;
            dst.instanceKeyColKey = src.instanceKeyColKey;
            dst.resultColKey = src.resultColKey;
            dst.subjectColKey = src.subjectColKey;
            dst.keyNameColKey = src.keyNameColKey;
            dst.keyTypeColKey = src.keyTypeColKey;
            dst.issuerColKey = src.issuerColKey;
            dst.certificateNameColKey = src.certificateNameColKey;
            dst.typeColKey = src.typeColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmCertificateDataColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmCertificateData> proxyState;

    com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmCertificateDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmCertificateData>(this);
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
    public String realmGet$subject() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.subjectColKey);
    }

    @Override
    public void realmSet$subject(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.subjectColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.subjectColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.subjectColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.subjectColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$keyName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.keyNameColKey);
    }

    @Override
    public void realmSet$keyName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.keyNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.keyNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.keyNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.keyNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$keyType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.keyTypeColKey);
    }

    @Override
    public void realmSet$keyType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.keyTypeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.keyTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.keyTypeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.keyTypeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$issuer() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.issuerColKey);
    }

    @Override
    public void realmSet$issuer(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.issuerColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.issuerColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.issuerColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.issuerColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$certificateName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.certificateNameColKey);
    }

    @Override
    public void realmSet$certificateName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.certificateNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.certificateNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.certificateNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.certificateNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(int value) {
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmCertificateData", false, 8, 0);
        builder.addPersistedProperty(NO_ALIAS, "instanceKey", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "result", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "subject", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "keyName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "keyType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "issuer", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "certificateName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmCertificateDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmCertificateDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmCertificateData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmCertificateData";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmCertificateData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmCertificateData obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
            RealmCertificateDataColumnInfo columnInfo = (RealmCertificateDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class);
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
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("instanceKey")) {
                if (json.isNull("instanceKey")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmCertificateData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmCertificateData.class, json.getString("instanceKey"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'instanceKey'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) obj;
        if (json.has("result")) {
            if (json.isNull("result")) {
                objProxy.realmSet$result(null);
            } else {
                objProxy.realmSet$result((String) json.getString("result"));
            }
        }
        if (json.has("subject")) {
            if (json.isNull("subject")) {
                objProxy.realmSet$subject(null);
            } else {
                objProxy.realmSet$subject((String) json.getString("subject"));
            }
        }
        if (json.has("keyName")) {
            if (json.isNull("keyName")) {
                objProxy.realmSet$keyName(null);
            } else {
                objProxy.realmSet$keyName((String) json.getString("keyName"));
            }
        }
        if (json.has("keyType")) {
            if (json.isNull("keyType")) {
                objProxy.realmSet$keyType(null);
            } else {
                objProxy.realmSet$keyType((String) json.getString("keyType"));
            }
        }
        if (json.has("issuer")) {
            if (json.isNull("issuer")) {
                objProxy.realmSet$issuer(null);
            } else {
                objProxy.realmSet$issuer((String) json.getString("issuer"));
            }
        }
        if (json.has("certificateName")) {
            if (json.isNull("certificateName")) {
                objProxy.realmSet$certificateName(null);
            } else {
                objProxy.realmSet$certificateName((String) json.getString("certificateName"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            } else {
                objProxy.realmSet$type((int) json.getInt("type"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmCertificateData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmCertificateData obj = new com.alphawallet.app.repository.entity.RealmCertificateData();
        final com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) obj;
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
            } else if (name.equals("result")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$result((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$result(null);
                }
            } else if (name.equals("subject")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$subject((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$subject(null);
                }
            } else if (name.equals("keyName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$keyName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$keyName(null);
                }
            } else if (name.equals("keyType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$keyType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$keyType(null);
                }
            } else if (name.equals("issuer")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$issuer((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$issuer(null);
                }
            } else if (name.equals("certificateName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$certificateName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$certificateName(null);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
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

    static com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmCertificateData copyOrUpdate(Realm realm, RealmCertificateDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmCertificateData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmCertificateData) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmCertificateData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
            long pkColumnKey = columnInfo.instanceKeyColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$instanceKey();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmCertificateData copy(Realm realm, RealmCertificateDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmCertificateData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmCertificateData) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.instanceKeyColKey, unmanagedSource.realmGet$instanceKey());
        builder.addString(columnInfo.resultColKey, unmanagedSource.realmGet$result());
        builder.addString(columnInfo.subjectColKey, unmanagedSource.realmGet$subject());
        builder.addString(columnInfo.keyNameColKey, unmanagedSource.realmGet$keyName());
        builder.addString(columnInfo.keyTypeColKey, unmanagedSource.realmGet$keyType());
        builder.addString(columnInfo.issuerColKey, unmanagedSource.realmGet$issuer());
        builder.addString(columnInfo.certificateNameColKey, unmanagedSource.realmGet$certificateName());
        builder.addInteger(columnInfo.typeColKey, unmanagedSource.realmGet$type());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmCertificateData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long tableNativePtr = table.getNativePtr();
        RealmCertificateDataColumnInfo columnInfo = (RealmCertificateDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$instanceKey();
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
        String realmGet$result = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$result();
        if (realmGet$result != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
        }
        String realmGet$subject = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
        }
        String realmGet$keyName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyName();
        if (realmGet$keyName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyNameColKey, objKey, realmGet$keyName, false);
        }
        String realmGet$keyType = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyType();
        if (realmGet$keyType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyTypeColKey, objKey, realmGet$keyType, false);
        }
        String realmGet$issuer = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$issuer();
        if (realmGet$issuer != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.issuerColKey, objKey, realmGet$issuer, false);
        }
        String realmGet$certificateName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$certificateName();
        if (realmGet$certificateName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.certificateNameColKey, objKey, realmGet$certificateName, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$type(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long tableNativePtr = table.getNativePtr();
        RealmCertificateDataColumnInfo columnInfo = (RealmCertificateDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        com.alphawallet.app.repository.entity.RealmCertificateData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmCertificateData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$instanceKey();
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
            String realmGet$result = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$result();
            if (realmGet$result != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
            }
            String realmGet$subject = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
            }
            String realmGet$keyName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyName();
            if (realmGet$keyName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keyNameColKey, objKey, realmGet$keyName, false);
            }
            String realmGet$keyType = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyType();
            if (realmGet$keyType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keyTypeColKey, objKey, realmGet$keyType, false);
            }
            String realmGet$issuer = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$issuer();
            if (realmGet$issuer != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.issuerColKey, objKey, realmGet$issuer, false);
            }
            String realmGet$certificateName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$certificateName();
            if (realmGet$certificateName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.certificateNameColKey, objKey, realmGet$certificateName, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$type(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmCertificateData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long tableNativePtr = table.getNativePtr();
        RealmCertificateDataColumnInfo columnInfo = (RealmCertificateDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$instanceKey();
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
        String realmGet$result = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$result();
        if (realmGet$result != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.resultColKey, objKey, false);
        }
        String realmGet$subject = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$subject();
        if (realmGet$subject != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.subjectColKey, objKey, false);
        }
        String realmGet$keyName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyName();
        if (realmGet$keyName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyNameColKey, objKey, realmGet$keyName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.keyNameColKey, objKey, false);
        }
        String realmGet$keyType = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyType();
        if (realmGet$keyType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyTypeColKey, objKey, realmGet$keyType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.keyTypeColKey, objKey, false);
        }
        String realmGet$issuer = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$issuer();
        if (realmGet$issuer != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.issuerColKey, objKey, realmGet$issuer, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.issuerColKey, objKey, false);
        }
        String realmGet$certificateName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$certificateName();
        if (realmGet$certificateName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.certificateNameColKey, objKey, realmGet$certificateName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.certificateNameColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$type(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long tableNativePtr = table.getNativePtr();
        RealmCertificateDataColumnInfo columnInfo = (RealmCertificateDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        long pkColumnKey = columnInfo.instanceKeyColKey;
        com.alphawallet.app.repository.entity.RealmCertificateData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmCertificateData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$instanceKey();
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
            String realmGet$result = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$result();
            if (realmGet$result != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.resultColKey, objKey, realmGet$result, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.resultColKey, objKey, false);
            }
            String realmGet$subject = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$subject();
            if (realmGet$subject != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.subjectColKey, objKey, realmGet$subject, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.subjectColKey, objKey, false);
            }
            String realmGet$keyName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyName();
            if (realmGet$keyName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keyNameColKey, objKey, realmGet$keyName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.keyNameColKey, objKey, false);
            }
            String realmGet$keyType = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$keyType();
            if (realmGet$keyType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keyTypeColKey, objKey, realmGet$keyType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.keyTypeColKey, objKey, false);
            }
            String realmGet$issuer = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$issuer();
            if (realmGet$issuer != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.issuerColKey, objKey, realmGet$issuer, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.issuerColKey, objKey, false);
            }
            String realmGet$certificateName = ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$certificateName();
            if (realmGet$certificateName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.certificateNameColKey, objKey, realmGet$certificateName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.certificateNameColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) object).realmGet$type(), false);
        }
    }

    public static com.alphawallet.app.repository.entity.RealmCertificateData createDetachedCopy(com.alphawallet.app.repository.entity.RealmCertificateData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmCertificateData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmCertificateData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmCertificateData) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmCertificateData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$instanceKey(realmSource.realmGet$instanceKey());
        unmanagedCopy.realmSet$result(realmSource.realmGet$result());
        unmanagedCopy.realmSet$subject(realmSource.realmGet$subject());
        unmanagedCopy.realmSet$keyName(realmSource.realmGet$keyName());
        unmanagedCopy.realmSet$keyType(realmSource.realmGet$keyType());
        unmanagedCopy.realmSet$issuer(realmSource.realmGet$issuer());
        unmanagedCopy.realmSet$certificateName(realmSource.realmGet$certificateName());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmCertificateData update(Realm realm, RealmCertificateDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmCertificateData realmObject, com.alphawallet.app.repository.entity.RealmCertificateData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmCertificateData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.instanceKeyColKey, realmObjectSource.realmGet$instanceKey());
        builder.addString(columnInfo.resultColKey, realmObjectSource.realmGet$result());
        builder.addString(columnInfo.subjectColKey, realmObjectSource.realmGet$subject());
        builder.addString(columnInfo.keyNameColKey, realmObjectSource.realmGet$keyName());
        builder.addString(columnInfo.keyTypeColKey, realmObjectSource.realmGet$keyType());
        builder.addString(columnInfo.issuerColKey, realmObjectSource.realmGet$issuer());
        builder.addString(columnInfo.certificateNameColKey, realmObjectSource.realmGet$certificateName());
        builder.addInteger(columnInfo.typeColKey, realmObjectSource.realmGet$type());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmCertificateData = proxy[");
        stringBuilder.append("{instanceKey:");
        stringBuilder.append(realmGet$instanceKey() != null ? realmGet$instanceKey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{result:");
        stringBuilder.append(realmGet$result() != null ? realmGet$result() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{subject:");
        stringBuilder.append(realmGet$subject() != null ? realmGet$subject() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{keyName:");
        stringBuilder.append(realmGet$keyName() != null ? realmGet$keyName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{keyType:");
        stringBuilder.append(realmGet$keyType() != null ? realmGet$keyType() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{issuer:");
        stringBuilder.append(realmGet$issuer() != null ? realmGet$issuer() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{certificateName:");
        stringBuilder.append(realmGet$certificateName() != null ? realmGet$certificateName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
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
        com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy aRealmCertificateData = (com_alphawallet_app_repository_entity_RealmCertificateDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmCertificateData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmCertificateData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmCertificateData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
