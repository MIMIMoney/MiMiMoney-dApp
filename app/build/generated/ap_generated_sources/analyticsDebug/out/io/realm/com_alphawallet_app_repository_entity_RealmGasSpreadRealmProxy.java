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
public class com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy extends com.alphawallet.app.repository.entity.RealmGasSpread
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface {

    static final class RealmGasSpreadColumnInfo extends ColumnInfo {
        long chainIdColKey;
        long rapidColKey;
        long fastColKey;
        long standardColKey;
        long slowColKey;
        long baseFeeColKey;
        long timeStampColKey;

        RealmGasSpreadColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmGasSpread");
            this.chainIdColKey = addColumnDetails("chainId", "chainId", objectSchemaInfo);
            this.rapidColKey = addColumnDetails("rapid", "rapid", objectSchemaInfo);
            this.fastColKey = addColumnDetails("fast", "fast", objectSchemaInfo);
            this.standardColKey = addColumnDetails("standard", "standard", objectSchemaInfo);
            this.slowColKey = addColumnDetails("slow", "slow", objectSchemaInfo);
            this.baseFeeColKey = addColumnDetails("baseFee", "baseFee", objectSchemaInfo);
            this.timeStampColKey = addColumnDetails("timeStamp", "timeStamp", objectSchemaInfo);
        }

        RealmGasSpreadColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmGasSpreadColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmGasSpreadColumnInfo src = (RealmGasSpreadColumnInfo) rawSrc;
            final RealmGasSpreadColumnInfo dst = (RealmGasSpreadColumnInfo) rawDst;
            dst.chainIdColKey = src.chainIdColKey;
            dst.rapidColKey = src.rapidColKey;
            dst.fastColKey = src.fastColKey;
            dst.standardColKey = src.standardColKey;
            dst.slowColKey = src.slowColKey;
            dst.baseFeeColKey = src.baseFeeColKey;
            dst.timeStampColKey = src.timeStampColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmGasSpreadColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmGasSpread> proxyState;

    com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmGasSpreadColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmGasSpread>(this);
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
    public String realmGet$rapid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.rapidColKey);
    }

    @Override
    public void realmSet$rapid(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.rapidColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.rapidColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.rapidColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.rapidColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fast() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fastColKey);
    }

    @Override
    public void realmSet$fast(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fastColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fastColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fastColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fastColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$standard() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.standardColKey);
    }

    @Override
    public void realmSet$standard(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.standardColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.standardColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.standardColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.standardColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$slow() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.slowColKey);
    }

    @Override
    public void realmSet$slow(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.slowColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.slowColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.slowColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.slowColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$baseFee() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.baseFeeColKey);
    }

    @Override
    public void realmSet$baseFee(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.baseFeeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.baseFeeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.baseFeeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.baseFeeColKey, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmGasSpread", false, 7, 0);
        builder.addPersistedProperty(NO_ALIAS, "chainId", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "rapid", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "fast", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "standard", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "slow", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "baseFee", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "timeStamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmGasSpreadColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmGasSpreadColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmGasSpread";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmGasSpread";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmGasSpread createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmGasSpread obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
            RealmGasSpreadColumnInfo columnInfo = (RealmGasSpreadColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class);
            long pkColumnKey = columnInfo.chainIdColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("chainId")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("chainId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("chainId")) {
                if (json.isNull("chainId")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmGasSpread.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmGasSpread.class, json.getLong("chainId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'chainId'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) obj;
        if (json.has("rapid")) {
            if (json.isNull("rapid")) {
                objProxy.realmSet$rapid(null);
            } else {
                objProxy.realmSet$rapid((String) json.getString("rapid"));
            }
        }
        if (json.has("fast")) {
            if (json.isNull("fast")) {
                objProxy.realmSet$fast(null);
            } else {
                objProxy.realmSet$fast((String) json.getString("fast"));
            }
        }
        if (json.has("standard")) {
            if (json.isNull("standard")) {
                objProxy.realmSet$standard(null);
            } else {
                objProxy.realmSet$standard((String) json.getString("standard"));
            }
        }
        if (json.has("slow")) {
            if (json.isNull("slow")) {
                objProxy.realmSet$slow(null);
            } else {
                objProxy.realmSet$slow((String) json.getString("slow"));
            }
        }
        if (json.has("baseFee")) {
            if (json.isNull("baseFee")) {
                objProxy.realmSet$baseFee(null);
            } else {
                objProxy.realmSet$baseFee((String) json.getString("baseFee"));
            }
        }
        if (json.has("timeStamp")) {
            if (json.isNull("timeStamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
            } else {
                objProxy.realmSet$timeStamp((long) json.getLong("timeStamp"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmGasSpread createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmGasSpread obj = new com.alphawallet.app.repository.entity.RealmGasSpread();
        final com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) obj;
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
            } else if (name.equals("rapid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rapid((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rapid(null);
                }
            } else if (name.equals("fast")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fast((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fast(null);
                }
            } else if (name.equals("standard")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$standard((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$standard(null);
                }
            } else if (name.equals("slow")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$slow((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$slow(null);
                }
            } else if (name.equals("baseFee")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$baseFee((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$baseFee(null);
                }
            } else if (name.equals("timeStamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeStamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
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

    static com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmGasSpread copyOrUpdate(Realm realm, RealmGasSpreadColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmGasSpread object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmGasSpread) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmGasSpread realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
            long pkColumnKey = columnInfo.chainIdColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmGasSpread copy(Realm realm, RealmGasSpreadColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmGasSpread newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmGasSpread) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.chainIdColKey, unmanagedSource.realmGet$chainId());
        builder.addString(columnInfo.rapidColKey, unmanagedSource.realmGet$rapid());
        builder.addString(columnInfo.fastColKey, unmanagedSource.realmGet$fast());
        builder.addString(columnInfo.standardColKey, unmanagedSource.realmGet$standard());
        builder.addString(columnInfo.slowColKey, unmanagedSource.realmGet$slow());
        builder.addString(columnInfo.baseFeeColKey, unmanagedSource.realmGet$baseFee());
        builder.addInteger(columnInfo.timeStampColKey, unmanagedSource.realmGet$timeStamp());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmGasSpread object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long tableNativePtr = table.getNativePtr();
        RealmGasSpreadColumnInfo columnInfo = (RealmGasSpreadColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$rapid = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$rapid();
        if (realmGet$rapid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rapidColKey, objKey, realmGet$rapid, false);
        }
        String realmGet$fast = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$fast();
        if (realmGet$fast != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fastColKey, objKey, realmGet$fast, false);
        }
        String realmGet$standard = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$standard();
        if (realmGet$standard != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.standardColKey, objKey, realmGet$standard, false);
        }
        String realmGet$slow = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$slow();
        if (realmGet$slow != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slowColKey, objKey, realmGet$slow, false);
        }
        String realmGet$baseFee = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$baseFee();
        if (realmGet$baseFee != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.baseFeeColKey, objKey, realmGet$baseFee, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$timeStamp(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long tableNativePtr = table.getNativePtr();
        RealmGasSpreadColumnInfo columnInfo = (RealmGasSpreadColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        com.alphawallet.app.repository.entity.RealmGasSpread object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmGasSpread) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$rapid = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$rapid();
            if (realmGet$rapid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rapidColKey, objKey, realmGet$rapid, false);
            }
            String realmGet$fast = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$fast();
            if (realmGet$fast != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fastColKey, objKey, realmGet$fast, false);
            }
            String realmGet$standard = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$standard();
            if (realmGet$standard != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.standardColKey, objKey, realmGet$standard, false);
            }
            String realmGet$slow = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$slow();
            if (realmGet$slow != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.slowColKey, objKey, realmGet$slow, false);
            }
            String realmGet$baseFee = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$baseFee();
            if (realmGet$baseFee != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.baseFeeColKey, objKey, realmGet$baseFee, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$timeStamp(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmGasSpread object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long tableNativePtr = table.getNativePtr();
        RealmGasSpreadColumnInfo columnInfo = (RealmGasSpreadColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
        }
        cache.put(object, objKey);
        String realmGet$rapid = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$rapid();
        if (realmGet$rapid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rapidColKey, objKey, realmGet$rapid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rapidColKey, objKey, false);
        }
        String realmGet$fast = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$fast();
        if (realmGet$fast != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fastColKey, objKey, realmGet$fast, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fastColKey, objKey, false);
        }
        String realmGet$standard = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$standard();
        if (realmGet$standard != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.standardColKey, objKey, realmGet$standard, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.standardColKey, objKey, false);
        }
        String realmGet$slow = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$slow();
        if (realmGet$slow != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.slowColKey, objKey, realmGet$slow, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.slowColKey, objKey, false);
        }
        String realmGet$baseFee = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$baseFee();
        if (realmGet$baseFee != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.baseFeeColKey, objKey, realmGet$baseFee, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.baseFeeColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$timeStamp(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long tableNativePtr = table.getNativePtr();
        RealmGasSpreadColumnInfo columnInfo = (RealmGasSpreadColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        long pkColumnKey = columnInfo.chainIdColKey;
        com.alphawallet.app.repository.entity.RealmGasSpread object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmGasSpread) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$chainId());
            }
            cache.put(object, objKey);
            String realmGet$rapid = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$rapid();
            if (realmGet$rapid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rapidColKey, objKey, realmGet$rapid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rapidColKey, objKey, false);
            }
            String realmGet$fast = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$fast();
            if (realmGet$fast != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fastColKey, objKey, realmGet$fast, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fastColKey, objKey, false);
            }
            String realmGet$standard = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$standard();
            if (realmGet$standard != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.standardColKey, objKey, realmGet$standard, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.standardColKey, objKey, false);
            }
            String realmGet$slow = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$slow();
            if (realmGet$slow != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.slowColKey, objKey, realmGet$slow, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.slowColKey, objKey, false);
            }
            String realmGet$baseFee = ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$baseFee();
            if (realmGet$baseFee != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.baseFeeColKey, objKey, realmGet$baseFee, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.baseFeeColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) object).realmGet$timeStamp(), false);
        }
    }

    public static com.alphawallet.app.repository.entity.RealmGasSpread createDetachedCopy(com.alphawallet.app.repository.entity.RealmGasSpread realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmGasSpread unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmGasSpread();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmGasSpread) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmGasSpread) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$chainId(realmSource.realmGet$chainId());
        unmanagedCopy.realmSet$rapid(realmSource.realmGet$rapid());
        unmanagedCopy.realmSet$fast(realmSource.realmGet$fast());
        unmanagedCopy.realmSet$standard(realmSource.realmGet$standard());
        unmanagedCopy.realmSet$slow(realmSource.realmGet$slow());
        unmanagedCopy.realmSet$baseFee(realmSource.realmGet$baseFee());
        unmanagedCopy.realmSet$timeStamp(realmSource.realmGet$timeStamp());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmGasSpread update(Realm realm, RealmGasSpreadColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmGasSpread realmObject, com.alphawallet.app.repository.entity.RealmGasSpread newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmGasSpread.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.chainIdColKey, realmObjectSource.realmGet$chainId());
        builder.addString(columnInfo.rapidColKey, realmObjectSource.realmGet$rapid());
        builder.addString(columnInfo.fastColKey, realmObjectSource.realmGet$fast());
        builder.addString(columnInfo.standardColKey, realmObjectSource.realmGet$standard());
        builder.addString(columnInfo.slowColKey, realmObjectSource.realmGet$slow());
        builder.addString(columnInfo.baseFeeColKey, realmObjectSource.realmGet$baseFee());
        builder.addInteger(columnInfo.timeStampColKey, realmObjectSource.realmGet$timeStamp());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmGasSpread = proxy[");
        stringBuilder.append("{chainId:");
        stringBuilder.append(realmGet$chainId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rapid:");
        stringBuilder.append(realmGet$rapid() != null ? realmGet$rapid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fast:");
        stringBuilder.append(realmGet$fast() != null ? realmGet$fast() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{standard:");
        stringBuilder.append(realmGet$standard() != null ? realmGet$standard() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{slow:");
        stringBuilder.append(realmGet$slow() != null ? realmGet$slow() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{baseFee:");
        stringBuilder.append(realmGet$baseFee() != null ? realmGet$baseFee() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeStamp:");
        stringBuilder.append(realmGet$timeStamp());
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
        com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy aRealmGasSpread = (com_alphawallet_app_repository_entity_RealmGasSpreadRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmGasSpread.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmGasSpread.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmGasSpread.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
