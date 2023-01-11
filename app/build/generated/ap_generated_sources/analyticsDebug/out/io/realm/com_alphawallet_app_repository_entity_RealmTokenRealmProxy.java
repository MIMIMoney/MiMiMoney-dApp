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
public class com_alphawallet_app_repository_entity_RealmTokenRealmProxy extends com.alphawallet.app.repository.entity.RealmToken
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface {

    static final class RealmTokenColumnInfo extends ColumnInfo {
        long addressColKey;
        long nameColKey;
        long symbolColKey;
        long decimalsColKey;
        long addedTimeColKey;
        long updatedTimeColKey;
        long lastTxTimeColKey;
        long balanceColKey;
        long isEnabledColKey;
        long tokenIdColKey;
        long interfaceSpecColKey;
        long auxDataColKey;
        long lastBlockReadColKey;
        long chainIdColKey;
        long earliestTxBlockColKey;
        long visibilityChangedColKey;
        long erc1155BlockReadColKey;

        RealmTokenColumnInfo(OsSchemaInfo schemaInfo) {
            super(17);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmToken");
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.symbolColKey = addColumnDetails("symbol", "symbol", objectSchemaInfo);
            this.decimalsColKey = addColumnDetails("decimals", "decimals", objectSchemaInfo);
            this.addedTimeColKey = addColumnDetails("addedTime", "addedTime", objectSchemaInfo);
            this.updatedTimeColKey = addColumnDetails("updatedTime", "updatedTime", objectSchemaInfo);
            this.lastTxTimeColKey = addColumnDetails("lastTxTime", "lastTxTime", objectSchemaInfo);
            this.balanceColKey = addColumnDetails("balance", "balance", objectSchemaInfo);
            this.isEnabledColKey = addColumnDetails("isEnabled", "isEnabled", objectSchemaInfo);
            this.tokenIdColKey = addColumnDetails("tokenId", "tokenId", objectSchemaInfo);
            this.interfaceSpecColKey = addColumnDetails("interfaceSpec", "interfaceSpec", objectSchemaInfo);
            this.auxDataColKey = addColumnDetails("auxData", "auxData", objectSchemaInfo);
            this.lastBlockReadColKey = addColumnDetails("lastBlockRead", "lastBlockRead", objectSchemaInfo);
            this.chainIdColKey = addColumnDetails("chainId", "chainId", objectSchemaInfo);
            this.earliestTxBlockColKey = addColumnDetails("earliestTxBlock", "earliestTxBlock", objectSchemaInfo);
            this.visibilityChangedColKey = addColumnDetails("visibilityChanged", "visibilityChanged", objectSchemaInfo);
            this.erc1155BlockReadColKey = addColumnDetails("erc1155BlockRead", "erc1155BlockRead", objectSchemaInfo);
        }

        RealmTokenColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmTokenColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmTokenColumnInfo src = (RealmTokenColumnInfo) rawSrc;
            final RealmTokenColumnInfo dst = (RealmTokenColumnInfo) rawDst;
            dst.addressColKey = src.addressColKey;
            dst.nameColKey = src.nameColKey;
            dst.symbolColKey = src.symbolColKey;
            dst.decimalsColKey = src.decimalsColKey;
            dst.addedTimeColKey = src.addedTimeColKey;
            dst.updatedTimeColKey = src.updatedTimeColKey;
            dst.lastTxTimeColKey = src.lastTxTimeColKey;
            dst.balanceColKey = src.balanceColKey;
            dst.isEnabledColKey = src.isEnabledColKey;
            dst.tokenIdColKey = src.tokenIdColKey;
            dst.interfaceSpecColKey = src.interfaceSpecColKey;
            dst.auxDataColKey = src.auxDataColKey;
            dst.lastBlockReadColKey = src.lastBlockReadColKey;
            dst.chainIdColKey = src.chainIdColKey;
            dst.earliestTxBlockColKey = src.earliestTxBlockColKey;
            dst.visibilityChangedColKey = src.visibilityChangedColKey;
            dst.erc1155BlockReadColKey = src.erc1155BlockReadColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmTokenColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmToken> proxyState;

    com_alphawallet_app_repository_entity_RealmTokenRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmTokenColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmToken>(this);
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
    public String realmGet$symbol() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.symbolColKey);
    }

    @Override
    public void realmSet$symbol(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.symbolColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.symbolColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.symbolColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.symbolColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$decimals() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.decimalsColKey);
    }

    @Override
    public void realmSet$decimals(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.decimalsColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.decimalsColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$addedTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.addedTimeColKey);
    }

    @Override
    public void realmSet$addedTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.addedTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.addedTimeColKey, value);
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
    public long realmGet$lastTxTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastTxTimeColKey);
    }

    @Override
    public void realmSet$lastTxTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastTxTimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastTxTimeColKey, value);
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
    public boolean realmGet$isEnabled() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isEnabledColKey);
    }

    @Override
    public void realmSet$isEnabled(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isEnabledColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isEnabledColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$tokenId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.tokenIdColKey);
    }

    @Override
    public void realmSet$tokenId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.tokenIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.tokenIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$interfaceSpec() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.interfaceSpecColKey);
    }

    @Override
    public void realmSet$interfaceSpec(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.interfaceSpecColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.interfaceSpecColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$auxData() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.auxDataColKey);
    }

    @Override
    public void realmSet$auxData(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.auxDataColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.auxDataColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.auxDataColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.auxDataColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastBlockRead() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastBlockReadColKey);
    }

    @Override
    public void realmSet$lastBlockRead(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastBlockReadColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastBlockReadColKey, value);
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
    public long realmGet$earliestTxBlock() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.earliestTxBlockColKey);
    }

    @Override
    public void realmSet$earliestTxBlock(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.earliestTxBlockColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.earliestTxBlockColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$visibilityChanged() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.visibilityChangedColKey);
    }

    @Override
    public void realmSet$visibilityChanged(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.visibilityChangedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.visibilityChangedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$erc1155BlockRead() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.erc1155BlockReadColKey);
    }

    @Override
    public void realmSet$erc1155BlockRead(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.erc1155BlockReadColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.erc1155BlockReadColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.erc1155BlockReadColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.erc1155BlockReadColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmToken", false, 17, 0);
        builder.addPersistedProperty(NO_ALIAS, "address", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "symbol", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "decimals", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "addedTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "updatedTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lastTxTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "balance", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "isEnabled", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "tokenId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "interfaceSpec", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "auxData", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lastBlockRead", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "chainId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "earliestTxBlock", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "visibilityChanged", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "erc1155BlockRead", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmTokenColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmTokenColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmToken";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmToken";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmToken createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmToken obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
            RealmTokenColumnInfo columnInfo = (RealmTokenColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class);
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
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("address")) {
                if (json.isNull("address")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmToken.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmToken.class, json.getString("address"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'address'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("symbol")) {
            if (json.isNull("symbol")) {
                objProxy.realmSet$symbol(null);
            } else {
                objProxy.realmSet$symbol((String) json.getString("symbol"));
            }
        }
        if (json.has("decimals")) {
            if (json.isNull("decimals")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'decimals' to null.");
            } else {
                objProxy.realmSet$decimals((int) json.getInt("decimals"));
            }
        }
        if (json.has("addedTime")) {
            if (json.isNull("addedTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'addedTime' to null.");
            } else {
                objProxy.realmSet$addedTime((long) json.getLong("addedTime"));
            }
        }
        if (json.has("updatedTime")) {
            if (json.isNull("updatedTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'updatedTime' to null.");
            } else {
                objProxy.realmSet$updatedTime((long) json.getLong("updatedTime"));
            }
        }
        if (json.has("lastTxTime")) {
            if (json.isNull("lastTxTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastTxTime' to null.");
            } else {
                objProxy.realmSet$lastTxTime((long) json.getLong("lastTxTime"));
            }
        }
        if (json.has("balance")) {
            if (json.isNull("balance")) {
                objProxy.realmSet$balance(null);
            } else {
                objProxy.realmSet$balance((String) json.getString("balance"));
            }
        }
        if (json.has("isEnabled")) {
            if (json.isNull("isEnabled")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isEnabled' to null.");
            } else {
                objProxy.realmSet$isEnabled((boolean) json.getBoolean("isEnabled"));
            }
        }
        if (json.has("tokenId")) {
            if (json.isNull("tokenId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tokenId' to null.");
            } else {
                objProxy.realmSet$tokenId((int) json.getInt("tokenId"));
            }
        }
        if (json.has("interfaceSpec")) {
            if (json.isNull("interfaceSpec")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'interfaceSpec' to null.");
            } else {
                objProxy.realmSet$interfaceSpec((int) json.getInt("interfaceSpec"));
            }
        }
        if (json.has("auxData")) {
            if (json.isNull("auxData")) {
                objProxy.realmSet$auxData(null);
            } else {
                objProxy.realmSet$auxData((String) json.getString("auxData"));
            }
        }
        if (json.has("lastBlockRead")) {
            if (json.isNull("lastBlockRead")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastBlockRead' to null.");
            } else {
                objProxy.realmSet$lastBlockRead((long) json.getLong("lastBlockRead"));
            }
        }
        if (json.has("chainId")) {
            if (json.isNull("chainId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
            } else {
                objProxy.realmSet$chainId((long) json.getLong("chainId"));
            }
        }
        if (json.has("earliestTxBlock")) {
            if (json.isNull("earliestTxBlock")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'earliestTxBlock' to null.");
            } else {
                objProxy.realmSet$earliestTxBlock((long) json.getLong("earliestTxBlock"));
            }
        }
        if (json.has("visibilityChanged")) {
            if (json.isNull("visibilityChanged")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'visibilityChanged' to null.");
            } else {
                objProxy.realmSet$visibilityChanged((boolean) json.getBoolean("visibilityChanged"));
            }
        }
        if (json.has("erc1155BlockRead")) {
            if (json.isNull("erc1155BlockRead")) {
                objProxy.realmSet$erc1155BlockRead(null);
            } else {
                objProxy.realmSet$erc1155BlockRead((String) json.getString("erc1155BlockRead"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmToken createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmToken obj = new com.alphawallet.app.repository.entity.RealmToken();
        final com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) obj;
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
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("symbol")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$symbol((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$symbol(null);
                }
            } else if (name.equals("decimals")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$decimals((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'decimals' to null.");
                }
            } else if (name.equals("addedTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$addedTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'addedTime' to null.");
                }
            } else if (name.equals("updatedTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$updatedTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'updatedTime' to null.");
                }
            } else if (name.equals("lastTxTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastTxTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastTxTime' to null.");
                }
            } else if (name.equals("balance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$balance((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$balance(null);
                }
            } else if (name.equals("isEnabled")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isEnabled((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isEnabled' to null.");
                }
            } else if (name.equals("tokenId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tokenId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'tokenId' to null.");
                }
            } else if (name.equals("interfaceSpec")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$interfaceSpec((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'interfaceSpec' to null.");
                }
            } else if (name.equals("auxData")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$auxData((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$auxData(null);
                }
            } else if (name.equals("lastBlockRead")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastBlockRead((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastBlockRead' to null.");
                }
            } else if (name.equals("chainId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chainId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
                }
            } else if (name.equals("earliestTxBlock")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$earliestTxBlock((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'earliestTxBlock' to null.");
                }
            } else if (name.equals("visibilityChanged")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$visibilityChanged((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'visibilityChanged' to null.");
                }
            } else if (name.equals("erc1155BlockRead")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$erc1155BlockRead((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$erc1155BlockRead(null);
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

    static com_alphawallet_app_repository_entity_RealmTokenRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmToken copyOrUpdate(Realm realm, RealmTokenColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmToken object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmToken) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmToken realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
            long pkColumnKey = columnInfo.addressColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$address();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmToken copy(Realm realm, RealmTokenColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmToken newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmToken) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.symbolColKey, unmanagedSource.realmGet$symbol());
        builder.addInteger(columnInfo.decimalsColKey, unmanagedSource.realmGet$decimals());
        builder.addInteger(columnInfo.addedTimeColKey, unmanagedSource.realmGet$addedTime());
        builder.addInteger(columnInfo.updatedTimeColKey, unmanagedSource.realmGet$updatedTime());
        builder.addInteger(columnInfo.lastTxTimeColKey, unmanagedSource.realmGet$lastTxTime());
        builder.addString(columnInfo.balanceColKey, unmanagedSource.realmGet$balance());
        builder.addBoolean(columnInfo.isEnabledColKey, unmanagedSource.realmGet$isEnabled());
        builder.addInteger(columnInfo.tokenIdColKey, unmanagedSource.realmGet$tokenId());
        builder.addInteger(columnInfo.interfaceSpecColKey, unmanagedSource.realmGet$interfaceSpec());
        builder.addString(columnInfo.auxDataColKey, unmanagedSource.realmGet$auxData());
        builder.addInteger(columnInfo.lastBlockReadColKey, unmanagedSource.realmGet$lastBlockRead());
        builder.addInteger(columnInfo.chainIdColKey, unmanagedSource.realmGet$chainId());
        builder.addInteger(columnInfo.earliestTxBlockColKey, unmanagedSource.realmGet$earliestTxBlock());
        builder.addBoolean(columnInfo.visibilityChangedColKey, unmanagedSource.realmGet$visibilityChanged());
        builder.addString(columnInfo.erc1155BlockReadColKey, unmanagedSource.realmGet$erc1155BlockRead());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmTokenRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmToken object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenColumnInfo columnInfo = (RealmTokenColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$address();
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
        String realmGet$name = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$symbol = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$symbol();
        if (realmGet$symbol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.symbolColKey, objKey, realmGet$symbol, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.decimalsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$decimals(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.addedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$addedTime(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$updatedTime(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastTxTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastTxTime(), false);
        String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$balance();
        if (realmGet$balance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isEnabledColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$isEnabled(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.tokenIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$tokenId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.interfaceSpecColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$interfaceSpec(), false);
        String realmGet$auxData = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$auxData();
        if (realmGet$auxData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.auxDataColKey, objKey, realmGet$auxData, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastBlockReadColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastBlockRead(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$chainId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.earliestTxBlockColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$earliestTxBlock(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.visibilityChangedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$visibilityChanged(), false);
        String realmGet$erc1155BlockRead = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$erc1155BlockRead();
        if (realmGet$erc1155BlockRead != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.erc1155BlockReadColKey, objKey, realmGet$erc1155BlockRead, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenColumnInfo columnInfo = (RealmTokenColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmToken object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmToken) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$address();
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
            String realmGet$name = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$symbol = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$symbol();
            if (realmGet$symbol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.symbolColKey, objKey, realmGet$symbol, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.decimalsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$decimals(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.addedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$addedTime(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$updatedTime(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastTxTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastTxTime(), false);
            String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$balance();
            if (realmGet$balance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isEnabledColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$isEnabled(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.tokenIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$tokenId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.interfaceSpecColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$interfaceSpec(), false);
            String realmGet$auxData = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$auxData();
            if (realmGet$auxData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.auxDataColKey, objKey, realmGet$auxData, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastBlockReadColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastBlockRead(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$chainId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.earliestTxBlockColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$earliestTxBlock(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.visibilityChangedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$visibilityChanged(), false);
            String realmGet$erc1155BlockRead = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$erc1155BlockRead();
            if (realmGet$erc1155BlockRead != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.erc1155BlockReadColKey, objKey, realmGet$erc1155BlockRead, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmToken object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenColumnInfo columnInfo = (RealmTokenColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class);
        long pkColumnKey = columnInfo.addressColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$address();
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
        String realmGet$name = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$symbol = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$symbol();
        if (realmGet$symbol != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.symbolColKey, objKey, realmGet$symbol, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.symbolColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.decimalsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$decimals(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.addedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$addedTime(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$updatedTime(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastTxTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastTxTime(), false);
        String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$balance();
        if (realmGet$balance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.balanceColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isEnabledColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$isEnabled(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.tokenIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$tokenId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.interfaceSpecColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$interfaceSpec(), false);
        String realmGet$auxData = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$auxData();
        if (realmGet$auxData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.auxDataColKey, objKey, realmGet$auxData, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.auxDataColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.lastBlockReadColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastBlockRead(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$chainId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.earliestTxBlockColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$earliestTxBlock(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.visibilityChangedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$visibilityChanged(), false);
        String realmGet$erc1155BlockRead = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$erc1155BlockRead();
        if (realmGet$erc1155BlockRead != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.erc1155BlockReadColKey, objKey, realmGet$erc1155BlockRead, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.erc1155BlockReadColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
        long tableNativePtr = table.getNativePtr();
        RealmTokenColumnInfo columnInfo = (RealmTokenColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmToken.class);
        long pkColumnKey = columnInfo.addressColKey;
        com.alphawallet.app.repository.entity.RealmToken object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmToken) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$address();
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
            String realmGet$name = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$symbol = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$symbol();
            if (realmGet$symbol != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.symbolColKey, objKey, realmGet$symbol, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.symbolColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.decimalsColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$decimals(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.addedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$addedTime(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.updatedTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$updatedTime(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastTxTimeColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastTxTime(), false);
            String realmGet$balance = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$balance();
            if (realmGet$balance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.balanceColKey, objKey, realmGet$balance, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.balanceColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isEnabledColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$isEnabled(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.tokenIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$tokenId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.interfaceSpecColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$interfaceSpec(), false);
            String realmGet$auxData = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$auxData();
            if (realmGet$auxData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.auxDataColKey, objKey, realmGet$auxData, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.auxDataColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.lastBlockReadColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$lastBlockRead(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$chainId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.earliestTxBlockColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$earliestTxBlock(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.visibilityChangedColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$visibilityChanged(), false);
            String realmGet$erc1155BlockRead = ((com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) object).realmGet$erc1155BlockRead();
            if (realmGet$erc1155BlockRead != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.erc1155BlockReadColKey, objKey, realmGet$erc1155BlockRead, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.erc1155BlockReadColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmToken createDetachedCopy(com.alphawallet.app.repository.entity.RealmToken realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmToken unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmToken();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmToken) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmToken) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$symbol(realmSource.realmGet$symbol());
        unmanagedCopy.realmSet$decimals(realmSource.realmGet$decimals());
        unmanagedCopy.realmSet$addedTime(realmSource.realmGet$addedTime());
        unmanagedCopy.realmSet$updatedTime(realmSource.realmGet$updatedTime());
        unmanagedCopy.realmSet$lastTxTime(realmSource.realmGet$lastTxTime());
        unmanagedCopy.realmSet$balance(realmSource.realmGet$balance());
        unmanagedCopy.realmSet$isEnabled(realmSource.realmGet$isEnabled());
        unmanagedCopy.realmSet$tokenId(realmSource.realmGet$tokenId());
        unmanagedCopy.realmSet$interfaceSpec(realmSource.realmGet$interfaceSpec());
        unmanagedCopy.realmSet$auxData(realmSource.realmGet$auxData());
        unmanagedCopy.realmSet$lastBlockRead(realmSource.realmGet$lastBlockRead());
        unmanagedCopy.realmSet$chainId(realmSource.realmGet$chainId());
        unmanagedCopy.realmSet$earliestTxBlock(realmSource.realmGet$earliestTxBlock());
        unmanagedCopy.realmSet$visibilityChanged(realmSource.realmGet$visibilityChanged());
        unmanagedCopy.realmSet$erc1155BlockRead(realmSource.realmGet$erc1155BlockRead());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmToken update(Realm realm, RealmTokenColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmToken realmObject, com.alphawallet.app.repository.entity.RealmToken newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmTokenRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmToken.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.addressColKey, realmObjectSource.realmGet$address());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.symbolColKey, realmObjectSource.realmGet$symbol());
        builder.addInteger(columnInfo.decimalsColKey, realmObjectSource.realmGet$decimals());
        builder.addInteger(columnInfo.addedTimeColKey, realmObjectSource.realmGet$addedTime());
        builder.addInteger(columnInfo.updatedTimeColKey, realmObjectSource.realmGet$updatedTime());
        builder.addInteger(columnInfo.lastTxTimeColKey, realmObjectSource.realmGet$lastTxTime());
        builder.addString(columnInfo.balanceColKey, realmObjectSource.realmGet$balance());
        builder.addBoolean(columnInfo.isEnabledColKey, realmObjectSource.realmGet$isEnabled());
        builder.addInteger(columnInfo.tokenIdColKey, realmObjectSource.realmGet$tokenId());
        builder.addInteger(columnInfo.interfaceSpecColKey, realmObjectSource.realmGet$interfaceSpec());
        builder.addString(columnInfo.auxDataColKey, realmObjectSource.realmGet$auxData());
        builder.addInteger(columnInfo.lastBlockReadColKey, realmObjectSource.realmGet$lastBlockRead());
        builder.addInteger(columnInfo.chainIdColKey, realmObjectSource.realmGet$chainId());
        builder.addInteger(columnInfo.earliestTxBlockColKey, realmObjectSource.realmGet$earliestTxBlock());
        builder.addBoolean(columnInfo.visibilityChangedColKey, realmObjectSource.realmGet$visibilityChanged());
        builder.addString(columnInfo.erc1155BlockReadColKey, realmObjectSource.realmGet$erc1155BlockRead());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmToken = proxy[");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address() != null ? realmGet$address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{symbol:");
        stringBuilder.append(realmGet$symbol() != null ? realmGet$symbol() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{decimals:");
        stringBuilder.append(realmGet$decimals());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{addedTime:");
        stringBuilder.append(realmGet$addedTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{updatedTime:");
        stringBuilder.append(realmGet$updatedTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastTxTime:");
        stringBuilder.append(realmGet$lastTxTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{balance:");
        stringBuilder.append(realmGet$balance() != null ? realmGet$balance() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isEnabled:");
        stringBuilder.append(realmGet$isEnabled());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tokenId:");
        stringBuilder.append(realmGet$tokenId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{interfaceSpec:");
        stringBuilder.append(realmGet$interfaceSpec());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{auxData:");
        stringBuilder.append(realmGet$auxData() != null ? realmGet$auxData() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastBlockRead:");
        stringBuilder.append(realmGet$lastBlockRead());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chainId:");
        stringBuilder.append(realmGet$chainId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{earliestTxBlock:");
        stringBuilder.append(realmGet$earliestTxBlock());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{visibilityChanged:");
        stringBuilder.append(realmGet$visibilityChanged());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{erc1155BlockRead:");
        stringBuilder.append(realmGet$erc1155BlockRead() != null ? realmGet$erc1155BlockRead() : "null");
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
        com_alphawallet_app_repository_entity_RealmTokenRealmProxy aRealmToken = (com_alphawallet_app_repository_entity_RealmTokenRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmToken.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmToken.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmToken.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
