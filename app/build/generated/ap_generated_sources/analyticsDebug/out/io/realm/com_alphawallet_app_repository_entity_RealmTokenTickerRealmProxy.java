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
public class com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy extends com.alphawallet.app.repository.entity.RealmTokenTicker
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface {

    static final class RealmTokenTickerColumnInfo extends ColumnInfo {
        long contractColKey;
        long priceColKey;
        long percentChange24hColKey;
        long createdTimeColKey;
        long idColKey;
        long imageColKey;
        long updatedTimeColKey;
        long currencySymbolColKey;

        RealmTokenTickerColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmTokenTicker");
            this.contractColKey = addColumnDetails("contract", "contract", objectSchemaInfo);
            this.priceColKey = addColumnDetails("price", "price", objectSchemaInfo);
            this.percentChange24hColKey = addColumnDetails("percentChange24h", "percentChange24h", objectSchemaInfo);
            this.createdTimeColKey = addColumnDetails("createdTime", "createdTime", objectSchemaInfo);
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.imageColKey = addColumnDetails("image", "image", objectSchemaInfo);
            this.updatedTimeColKey = addColumnDetails("updatedTime", "updatedTime", objectSchemaInfo);
            this.currencySymbolColKey = addColumnDetails("currencySymbol", "currencySymbol", objectSchemaInfo);
        }

        RealmTokenTickerColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmTokenTickerColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmTokenTickerColumnInfo src = (RealmTokenTickerColumnInfo) rawSrc;
            final RealmTokenTickerColumnInfo dst = (RealmTokenTickerColumnInfo) rawDst;
            dst.contractColKey = src.contractColKey;
            dst.priceColKey = src.priceColKey;
            dst.percentChange24hColKey = src.percentChange24hColKey;
            dst.createdTimeColKey = src.createdTimeColKey;
            dst.idColKey = src.idColKey;
            dst.imageColKey = src.imageColKey;
            dst.updatedTimeColKey = src.updatedTimeColKey;
            dst.currencySymbolColKey = src.currencySymbolColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmTokenTickerColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmTokenTicker> proxyState;

    com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmTokenTickerColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmTokenTicker>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$contract() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contractColKey);
    }

    @Override
    public void realmSet$contract(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'contract' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$price() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.priceColKey);
    }

    @Override
    public void realmSet$price(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.priceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.priceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.priceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$percentChange24h() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.percentChange24hColKey);
    }

    @Override
    public void realmSet$percentChange24h(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.percentChange24hColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.percentChange24hColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.percentChange24hColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.percentChange24hColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$createdTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.createdTimeColKey);
    }

    @Override
    public void realmSet$createdTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.createdTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.createdTimeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$image() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageColKey);
    }

    @Override
    public void realmSet$image(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$updatedTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.updatedTimeColKey);
    }

    @Override
    public void realmSet$updatedTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.updatedTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.updatedTimeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$currencySymbol() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.currencySymbolColKey);
    }

    @Override
    public void realmSet$currencySymbol(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.currencySymbolColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.currencySymbolColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.currencySymbolColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.currencySymbolColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmTokenTicker", false, 8, 0);
        builder.addPersistedProperty(NO_ALIAS, "contract", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "price", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "percentChange24h", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "createdTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "updatedTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "currencySymbol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmTokenTickerColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmTokenTickerColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmTokenTicker";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmTokenTicker";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmTokenTicker createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmTokenTicker obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
            RealmTokenTickerColumnInfo columnInfo = (RealmTokenTickerColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
            long pkColumnKey = columnInfo.contractColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("contract")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("contract"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("contract")) {
                if (json.isNull("contract")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTokenTicker.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTokenTicker.class, json.getString("contract"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'contract'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) obj;
        if (json.has("price")) {
            if (json.isNull("price")) {
                objProxy.realmSet$price(null);
            } else {
                objProxy.realmSet$price((String) json.getString("price"));
            }
        }
        if (json.has("percentChange24h")) {
            if (json.isNull("percentChange24h")) {
                objProxy.realmSet$percentChange24h(null);
            } else {
                objProxy.realmSet$percentChange24h((String) json.getString("percentChange24h"));
            }
        }
        if (json.has("createdTime")) {
            if (json.isNull("createdTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'createdTime' to null.");
            } else {
                objProxy.realmSet$createdTime((long) json.getLong("createdTime"));
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("image")) {
            if (json.isNull("image")) {
                objProxy.realmSet$image(null);
            } else {
                objProxy.realmSet$image((String) json.getString("image"));
            }
        }
        if (json.has("updatedTime")) {
            if (json.isNull("updatedTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'updatedTime' to null.");
            } else {
                objProxy.realmSet$updatedTime((long) json.getLong("updatedTime"));
            }
        }
        if (json.has("currencySymbol")) {
            if (json.isNull("currencySymbol")) {
                objProxy.realmSet$currencySymbol(null);
            } else {
                objProxy.realmSet$currencySymbol((String) json.getString("currencySymbol"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmTokenTicker createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmTokenTicker obj = new com.alphawallet.app.repository.entity.RealmTokenTicker();
        final com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("contract")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contract((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$contract(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$price((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$price(null);
                }
            } else if (name.equals("percentChange24h")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$percentChange24h((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$percentChange24h(null);
                }
            } else if (name.equals("createdTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$createdTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'createdTime' to null.");
                }
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("image")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$image((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$image(null);
                }
            } else if (name.equals("updatedTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$updatedTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'updatedTime' to null.");
                }
            } else if (name.equals("currencySymbol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currencySymbol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$currencySymbol(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'contract'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmTokenTicker copyOrUpdate(Realm realm, RealmTokenTickerColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenTicker object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmTokenTicker) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmTokenTicker realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
            long pkColumnKey = columnInfo.contractColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$contract();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmTokenTicker copy(Realm realm, RealmTokenTickerColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenTicker newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmTokenTicker) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.contractColKey, unmanagedSource.realmGet$contract());
        builder.addString(columnInfo.priceColKey, unmanagedSource.realmGet$price());
        builder.addString(columnInfo.percentChange24hColKey, unmanagedSource.realmGet$percentChange24h());
        builder.addInteger(columnInfo.createdTimeColKey, unmanagedSource.realmGet$createdTime());
        builder.addString(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.imageColKey, unmanagedSource.realmGet$image());
        builder.addInteger(columnInfo.updatedTimeColKey, unmanagedSource.realmGet$updatedTime());
        builder.addString(columnInfo.currencySymbolColKey, unmanagedSource.realmGet$currencySymbol());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmTokenTicker object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenTickerColumnInfo columnInfo = (RealmTokenTickerColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long pkColumnKey = columnInfo.contractColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$contract();
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
        String realmGet$price = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.priceColKey, objKey, realmGet$price, false);
        }
        String realmGet$percentChange24h = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$percentChange24h();
        if (realmGet$percentChange24h != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.percentChange24hColKey, objKey, realmGet$percentChange24h, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.createdTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$createdTime(), false);
        String realmGet$id = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
        }
        String realmGet$image = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageColKey, objKey, realmGet$image, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$updatedTime(), false);
        String realmGet$currencySymbol = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$currencySymbol();
        if (realmGet$currencySymbol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currencySymbolColKey, objKey, realmGet$currencySymbol, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenTickerColumnInfo columnInfo = (RealmTokenTickerColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long pkColumnKey = columnInfo.contractColKey;
        com.alphawallet.app.repository.entity.RealmTokenTicker object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTokenTicker) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$contract();
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
            String realmGet$price = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.priceColKey, objKey, realmGet$price, false);
            }
            String realmGet$percentChange24h = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$percentChange24h();
            if (realmGet$percentChange24h != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.percentChange24hColKey, objKey, realmGet$percentChange24h, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.createdTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$createdTime(), false);
            String realmGet$id = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
            }
            String realmGet$image = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageColKey, objKey, realmGet$image, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$updatedTime(), false);
            String realmGet$currencySymbol = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$currencySymbol();
            if (realmGet$currencySymbol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currencySymbolColKey, objKey, realmGet$currencySymbol, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmTokenTicker object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenTickerColumnInfo columnInfo = (RealmTokenTickerColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long pkColumnKey = columnInfo.contractColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$contract();
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
        String realmGet$price = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.priceColKey, objKey, realmGet$price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.priceColKey, objKey, false);
        }
        String realmGet$percentChange24h = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$percentChange24h();
        if (realmGet$percentChange24h != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.percentChange24hColKey, objKey, realmGet$percentChange24h, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.percentChange24hColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.createdTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$createdTime(), false);
        String realmGet$id = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, objKey, false);
        }
        String realmGet$image = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageColKey, objKey, realmGet$image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$updatedTime(), false);
        String realmGet$currencySymbol = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$currencySymbol();
        if (realmGet$currencySymbol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currencySymbolColKey, objKey, realmGet$currencySymbol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.currencySymbolColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenTickerColumnInfo columnInfo = (RealmTokenTickerColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        long pkColumnKey = columnInfo.contractColKey;
        com.alphawallet.app.repository.entity.RealmTokenTicker object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTokenTicker) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$contract();
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
            String realmGet$price = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$price();
            if (realmGet$price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.priceColKey, objKey, realmGet$price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.priceColKey, objKey, false);
            }
            String realmGet$percentChange24h = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$percentChange24h();
            if (realmGet$percentChange24h != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.percentChange24hColKey, objKey, realmGet$percentChange24h, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.percentChange24hColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.createdTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$createdTime(), false);
            String realmGet$id = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, objKey, false);
            }
            String realmGet$image = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageColKey, objKey, realmGet$image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$updatedTime(), false);
            String realmGet$currencySymbol = ((com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) object).realmGet$currencySymbol();
            if (realmGet$currencySymbol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currencySymbolColKey, objKey, realmGet$currencySymbol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.currencySymbolColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmTokenTicker createDetachedCopy(com.alphawallet.app.repository.entity.RealmTokenTicker realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmTokenTicker unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmTokenTicker();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmTokenTicker) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmTokenTicker) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$contract(realmSource.realmGet$contract());
        unmanagedCopy.realmSet$price(realmSource.realmGet$price());
        unmanagedCopy.realmSet$percentChange24h(realmSource.realmGet$percentChange24h());
        unmanagedCopy.realmSet$createdTime(realmSource.realmGet$createdTime());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$image(realmSource.realmGet$image());
        unmanagedCopy.realmSet$updatedTime(realmSource.realmGet$updatedTime());
        unmanagedCopy.realmSet$currencySymbol(realmSource.realmGet$currencySymbol());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmTokenTicker update(Realm realm, RealmTokenTickerColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTokenTicker realmObject, com.alphawallet.app.repository.entity.RealmTokenTicker newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTokenTicker.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.contractColKey, realmObjectSource.realmGet$contract());
        builder.addString(columnInfo.priceColKey, realmObjectSource.realmGet$price());
        builder.addString(columnInfo.percentChange24hColKey, realmObjectSource.realmGet$percentChange24h());
        builder.addInteger(columnInfo.createdTimeColKey, realmObjectSource.realmGet$createdTime());
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.imageColKey, realmObjectSource.realmGet$image());
        builder.addInteger(columnInfo.updatedTimeColKey, realmObjectSource.realmGet$updatedTime());
        builder.addString(columnInfo.currencySymbolColKey, realmObjectSource.realmGet$currencySymbol());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmTokenTicker = proxy[");
        stringBuilder.append("{contract:");
        stringBuilder.append(realmGet$contract() != null ? realmGet$contract() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{price:");
        stringBuilder.append(realmGet$price() != null ? realmGet$price() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{percentChange24h:");
        stringBuilder.append(realmGet$percentChange24h() != null ? realmGet$percentChange24h() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{createdTime:");
        stringBuilder.append(realmGet$createdTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{image:");
        stringBuilder.append(realmGet$image() != null ? realmGet$image() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{updatedTime:");
        stringBuilder.append(realmGet$updatedTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{currencySymbol:");
        stringBuilder.append(realmGet$currencySymbol() != null ? realmGet$currencySymbol() : "null");
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
        com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy aRealmTokenTicker = (com_alphawallet_app_repository_entity_RealmTokenTickerRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmTokenTicker.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmTokenTicker.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmTokenTicker.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
