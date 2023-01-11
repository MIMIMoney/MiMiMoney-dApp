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
public class com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy extends com.alphawallet.app.repository.entity.RealmWalletData
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface {

    static final class RealmWalletDataColumnInfo extends ColumnInfo {
        long addressColKey;
        long ENSNameColKey;
        long balanceColKey;
        long nameColKey;
        long lastWarningColKey;
        long ENSAvatarColKey;

        RealmWalletDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmWalletData");
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
            this.ENSNameColKey = addColumnDetails("ENSName", "ENSName", objectSchemaInfo);
            this.balanceColKey = addColumnDetails("balance", "balance", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.lastWarningColKey = addColumnDetails("lastWarning", "lastWarning", objectSchemaInfo);
            this.ENSAvatarColKey = addColumnDetails("ENSAvatar", "ENSAvatar", objectSchemaInfo);
        }

        RealmWalletDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmWalletDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmWalletDataColumnInfo src = (RealmWalletDataColumnInfo) rawSrc;
            final RealmWalletDataColumnInfo dst = (RealmWalletDataColumnInfo) rawDst;
            dst.addressColKey = src.addressColKey;
            dst.ENSNameColKey = src.ENSNameColKey;
            dst.balanceColKey = src.balanceColKey;
            dst.nameColKey = src.nameColKey;
            dst.lastWarningColKey = src.lastWarningColKey;
            dst.ENSAvatarColKey = src.ENSAvatarColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmWalletDataColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmWalletData> proxyState;

    com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmWalletDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmWalletData>(this);
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
    public String realmGet$ENSName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ENSNameColKey);
    }

    @Override
    public void realmSet$ENSName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ENSNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.ENSNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ENSNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ENSNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$balance() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.balanceColKey);
    }

    @Override
    public void realmSet$balance(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.balanceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.balanceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.balanceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.balanceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastWarning() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastWarningColKey);
    }

    @Override
    public void realmSet$lastWarning(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastWarningColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastWarningColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ENSAvatar() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ENSAvatarColKey);
    }

    @Override
    public void realmSet$ENSAvatar(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ENSAvatarColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.ENSAvatarColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ENSAvatarColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ENSAvatarColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmWalletData", false, 6, 0);
        builder.addPersistedProperty(NO_ALIAS, "address", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "ENSName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "balance", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lastWarning", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "ENSAvatar", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmWalletDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmWalletDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmWalletData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmWalletData";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmWalletData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmWalletData obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
            RealmWalletDataColumnInfo columnInfo = (RealmWalletDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class);
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
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("address")) {
                if (json.isNull("address")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmWalletData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmWalletData.class, json.getString("address"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'address'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) obj;
        if (json.has("ENSName")) {
            if (json.isNull("ENSName")) {
                objProxy.realmSet$ENSName(null);
            } else {
                objProxy.realmSet$ENSName((String) json.getString("ENSName"));
            }
        }
        if (json.has("balance")) {
            if (json.isNull("balance")) {
                objProxy.realmSet$balance(null);
            } else {
                objProxy.realmSet$balance((String) json.getString("balance"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("lastWarning")) {
            if (json.isNull("lastWarning")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastWarning' to null.");
            } else {
                objProxy.realmSet$lastWarning((long) json.getLong("lastWarning"));
            }
        }
        if (json.has("ENSAvatar")) {
            if (json.isNull("ENSAvatar")) {
                objProxy.realmSet$ENSAvatar(null);
            } else {
                objProxy.realmSet$ENSAvatar((String) json.getString("ENSAvatar"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmWalletData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmWalletData obj = new com.alphawallet.app.repository.entity.RealmWalletData();
        final com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) obj;
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
            } else if (name.equals("ENSName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ENSName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ENSName(null);
                }
            } else if (name.equals("balance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$balance((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$balance(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("lastWarning")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastWarning((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastWarning' to null.");
                }
            } else if (name.equals("ENSAvatar")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ENSAvatar((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ENSAvatar(null);
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

    static com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmWalletData copyOrUpdate(Realm realm, RealmWalletDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWalletData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmWalletData) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmWalletData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
            long pkColumnKey = columnInfo.addressColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$address();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmWalletData copy(Realm realm, RealmWalletDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWalletData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmWalletData) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());
        builder.addString(columnInfo.ENSNameColKey, unmanagedSource.realmGet$ENSName());
        builder.addString(columnInfo.balanceColKey, unmanagedSource.realmGet$balance());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addInteger(columnInfo.lastWarningColKey, unmanagedSource.realmGet$lastWarning());
        builder.addString(columnInfo.ENSAvatarColKey, unmanagedSource.realmGet$ENSAvatar());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmWalletData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long tableNativePtr = table.getNativePtr();
        RealmWalletDataColumnInfo columnInfo = (RealmWalletDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$address();
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
        String realmGet$ENSName = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSName();
        if (realmGet$ENSName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ENSNameColKey, objKey, realmGet$ENSName, false);
        }
        String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$balance();
        if (realmGet$balance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
        }
        String realmGet$name = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastWarningColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$lastWarning(), false);
        String realmGet$ENSAvatar = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSAvatar();
        if (realmGet$ENSAvatar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ENSAvatarColKey, objKey, realmGet$ENSAvatar, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long tableNativePtr = table.getNativePtr();
        RealmWalletDataColumnInfo columnInfo = (RealmWalletDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmWalletData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmWalletData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$address();
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
            String realmGet$ENSName = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSName();
            if (realmGet$ENSName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ENSNameColKey, objKey, realmGet$ENSName, false);
            }
            String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$balance();
            if (realmGet$balance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
            }
            String realmGet$name = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastWarningColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$lastWarning(), false);
            String realmGet$ENSAvatar = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSAvatar();
            if (realmGet$ENSAvatar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ENSAvatarColKey, objKey, realmGet$ENSAvatar, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmWalletData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long tableNativePtr = table.getNativePtr();
        RealmWalletDataColumnInfo columnInfo = (RealmWalletDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$address();
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
        String realmGet$ENSName = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSName();
        if (realmGet$ENSName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ENSNameColKey, objKey, realmGet$ENSName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ENSNameColKey, objKey, false);
        }
        String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$balance();
        if (realmGet$balance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.balanceColKey, objKey, false);
        }
        String realmGet$name = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastWarningColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$lastWarning(), false);
        String realmGet$ENSAvatar = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSAvatar();
        if (realmGet$ENSAvatar != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ENSAvatarColKey, objKey, realmGet$ENSAvatar, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ENSAvatarColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long tableNativePtr = table.getNativePtr();
        RealmWalletDataColumnInfo columnInfo = (RealmWalletDataColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmWalletData.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmWalletData object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmWalletData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$address();
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
            String realmGet$ENSName = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSName();
            if (realmGet$ENSName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ENSNameColKey, objKey, realmGet$ENSName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ENSNameColKey, objKey, false);
            }
            String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$balance();
            if (realmGet$balance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.balanceColKey, objKey, false);
            }
            String realmGet$name = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastWarningColKey, objKey, ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$lastWarning(), false);
            String realmGet$ENSAvatar = ((com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) object).realmGet$ENSAvatar();
            if (realmGet$ENSAvatar != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ENSAvatarColKey, objKey, realmGet$ENSAvatar, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ENSAvatarColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmWalletData createDetachedCopy(com.alphawallet.app.repository.entity.RealmWalletData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmWalletData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmWalletData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmWalletData) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmWalletData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$ENSName(realmSource.realmGet$ENSName());
        unmanagedCopy.realmSet$balance(realmSource.realmGet$balance());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$lastWarning(realmSource.realmGet$lastWarning());
        unmanagedCopy.realmSet$ENSAvatar(realmSource.realmGet$ENSAvatar());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmWalletData update(Realm realm, RealmWalletDataColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmWalletData realmObject, com.alphawallet.app.repository.entity.RealmWalletData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmWalletData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.addressColKey, realmObjectSource.realmGet$address());
        builder.addString(columnInfo.ENSNameColKey, realmObjectSource.realmGet$ENSName());
        builder.addString(columnInfo.balanceColKey, realmObjectSource.realmGet$balance());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addInteger(columnInfo.lastWarningColKey, realmObjectSource.realmGet$lastWarning());
        builder.addString(columnInfo.ENSAvatarColKey, realmObjectSource.realmGet$ENSAvatar());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmWalletData = proxy[");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address() != null ? realmGet$address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ENSName:");
        stringBuilder.append(realmGet$ENSName() != null ? realmGet$ENSName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{balance:");
        stringBuilder.append(realmGet$balance() != null ? realmGet$balance() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastWarning:");
        stringBuilder.append(realmGet$lastWarning());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ENSAvatar:");
        stringBuilder.append(realmGet$ENSAvatar() != null ? realmGet$ENSAvatar() : "null");
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
        com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy aRealmWalletData = (com_alphawallet_app_repository_entity_RealmWalletDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmWalletData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmWalletData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmWalletData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
