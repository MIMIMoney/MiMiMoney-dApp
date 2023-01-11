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
public class com_alphawallet_app_repository_entity_RealmTransactionRealmProxy extends com.alphawallet.app.repository.entity.RealmTransaction
    implements RealmObjectProxy, com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface {

    static final class RealmTransactionColumnInfo extends ColumnInfo {
        long hashColKey;
        long blockNumberColKey;
        long timeStampColKey;
        long nonceColKey;
        long fromColKey;
        long toColKey;
        long valueColKey;
        long gasColKey;
        long gasPriceColKey;
        long gasUsedColKey;
        long inputColKey;
        long errorColKey;
        long maxFeePerGasColKey;
        long maxPriorityFeeColKey;
        long chainIdColKey;
        long expectedCompletionColKey;
        long contractAddressColKey;

        RealmTransactionColumnInfo(OsSchemaInfo schemaInfo) {
            super(17);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmTransaction");
            this.hashColKey = addColumnDetails("hash", "hash", objectSchemaInfo);
            this.blockNumberColKey = addColumnDetails("blockNumber", "blockNumber", objectSchemaInfo);
            this.timeStampColKey = addColumnDetails("timeStamp", "timeStamp", objectSchemaInfo);
            this.nonceColKey = addColumnDetails("nonce", "nonce", objectSchemaInfo);
            this.fromColKey = addColumnDetails("from", "from", objectSchemaInfo);
            this.toColKey = addColumnDetails("to", "to", objectSchemaInfo);
            this.valueColKey = addColumnDetails("value", "value", objectSchemaInfo);
            this.gasColKey = addColumnDetails("gas", "gas", objectSchemaInfo);
            this.gasPriceColKey = addColumnDetails("gasPrice", "gasPrice", objectSchemaInfo);
            this.gasUsedColKey = addColumnDetails("gasUsed", "gasUsed", objectSchemaInfo);
            this.inputColKey = addColumnDetails("input", "input", objectSchemaInfo);
            this.errorColKey = addColumnDetails("error", "error", objectSchemaInfo);
            this.maxFeePerGasColKey = addColumnDetails("maxFeePerGas", "maxFeePerGas", objectSchemaInfo);
            this.maxPriorityFeeColKey = addColumnDetails("maxPriorityFee", "maxPriorityFee", objectSchemaInfo);
            this.chainIdColKey = addColumnDetails("chainId", "chainId", objectSchemaInfo);
            this.expectedCompletionColKey = addColumnDetails("expectedCompletion", "expectedCompletion", objectSchemaInfo);
            this.contractAddressColKey = addColumnDetails("contractAddress", "contractAddress", objectSchemaInfo);
        }

        RealmTransactionColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmTransactionColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmTransactionColumnInfo src = (RealmTransactionColumnInfo) rawSrc;
            final RealmTransactionColumnInfo dst = (RealmTransactionColumnInfo) rawDst;
            dst.hashColKey = src.hashColKey;
            dst.blockNumberColKey = src.blockNumberColKey;
            dst.timeStampColKey = src.timeStampColKey;
            dst.nonceColKey = src.nonceColKey;
            dst.fromColKey = src.fromColKey;
            dst.toColKey = src.toColKey;
            dst.valueColKey = src.valueColKey;
            dst.gasColKey = src.gasColKey;
            dst.gasPriceColKey = src.gasPriceColKey;
            dst.gasUsedColKey = src.gasUsedColKey;
            dst.inputColKey = src.inputColKey;
            dst.errorColKey = src.errorColKey;
            dst.maxFeePerGasColKey = src.maxFeePerGasColKey;
            dst.maxPriorityFeeColKey = src.maxPriorityFeeColKey;
            dst.chainIdColKey = src.chainIdColKey;
            dst.expectedCompletionColKey = src.expectedCompletionColKey;
            dst.contractAddressColKey = src.contractAddressColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmTransactionColumnInfo columnInfo;
    private ProxyState<com.alphawallet.app.repository.entity.RealmTransaction> proxyState;

    com_alphawallet_app_repository_entity_RealmTransactionRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmTransactionColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.alphawallet.app.repository.entity.RealmTransaction>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$hash() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.hashColKey);
    }

    @Override
    public void realmSet$hash(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'hash' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$blockNumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.blockNumberColKey);
    }

    @Override
    public void realmSet$blockNumber(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.blockNumberColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.blockNumberColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.blockNumberColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.blockNumberColKey, value);
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

    @Override
    @SuppressWarnings("cast")
    public int realmGet$nonce() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.nonceColKey);
    }

    @Override
    public void realmSet$nonce(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.nonceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.nonceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$from() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fromColKey);
    }

    @Override
    public void realmSet$from(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fromColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fromColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fromColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fromColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$to() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.toColKey);
    }

    @Override
    public void realmSet$to(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.toColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.toColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.toColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.toColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$value() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.valueColKey);
    }

    @Override
    public void realmSet$value(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.valueColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.valueColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.valueColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.valueColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$gas() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.gasColKey);
    }

    @Override
    public void realmSet$gas(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.gasColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.gasColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.gasColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.gasColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$gasPrice() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.gasPriceColKey);
    }

    @Override
    public void realmSet$gasPrice(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.gasPriceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.gasPriceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.gasPriceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.gasPriceColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$gasUsed() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.gasUsedColKey);
    }

    @Override
    public void realmSet$gasUsed(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.gasUsedColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.gasUsedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.gasUsedColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.gasUsedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$input() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.inputColKey);
    }

    @Override
    public void realmSet$input(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.inputColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.inputColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.inputColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.inputColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$error() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.errorColKey);
    }

    @Override
    public void realmSet$error(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.errorColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.errorColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.errorColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.errorColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$maxFeePerGas() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.maxFeePerGasColKey);
    }

    @Override
    public void realmSet$maxFeePerGas(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.maxFeePerGasColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.maxFeePerGasColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.maxFeePerGasColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.maxFeePerGasColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$maxPriorityFee() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.maxPriorityFeeColKey);
    }

    @Override
    public void realmSet$maxPriorityFee(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.maxPriorityFeeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.maxPriorityFeeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.maxPriorityFeeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.maxPriorityFeeColKey, value);
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
    public long realmGet$expectedCompletion() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.expectedCompletionColKey);
    }

    @Override
    public void realmSet$expectedCompletion(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.expectedCompletionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.expectedCompletionColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$contractAddress() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contractAddressColKey);
    }

    @Override
    public void realmSet$contractAddress(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contractAddressColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.contractAddressColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contractAddressColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contractAddressColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmTransaction", false, 17, 0);
        builder.addPersistedProperty(NO_ALIAS, "hash", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "blockNumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "timeStamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "nonce", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "from", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "to", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "value", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "gas", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "gasPrice", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "gasUsed", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "input", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "error", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "maxFeePerGas", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "maxPriorityFee", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "chainId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "expectedCompletion", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "contractAddress", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmTransactionColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmTransactionColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmTransaction";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmTransaction";
    }

    @SuppressWarnings("cast")
    public static com.alphawallet.app.repository.entity.RealmTransaction createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.alphawallet.app.repository.entity.RealmTransaction obj = null;
        if (update) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
            RealmTransactionColumnInfo columnInfo = (RealmTransactionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class);
            long pkColumnKey = columnInfo.hashColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("hash")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("hash"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("hash")) {
                if (json.isNull("hash")) {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTransaction.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy) realm.createObjectInternal(com.alphawallet.app.repository.entity.RealmTransaction.class, json.getString("hash"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'hash'.");
            }
        }

        final com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) obj;
        if (json.has("blockNumber")) {
            if (json.isNull("blockNumber")) {
                objProxy.realmSet$blockNumber(null);
            } else {
                objProxy.realmSet$blockNumber((String) json.getString("blockNumber"));
            }
        }
        if (json.has("timeStamp")) {
            if (json.isNull("timeStamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
            } else {
                objProxy.realmSet$timeStamp((long) json.getLong("timeStamp"));
            }
        }
        if (json.has("nonce")) {
            if (json.isNull("nonce")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'nonce' to null.");
            } else {
                objProxy.realmSet$nonce((int) json.getInt("nonce"));
            }
        }
        if (json.has("from")) {
            if (json.isNull("from")) {
                objProxy.realmSet$from(null);
            } else {
                objProxy.realmSet$from((String) json.getString("from"));
            }
        }
        if (json.has("to")) {
            if (json.isNull("to")) {
                objProxy.realmSet$to(null);
            } else {
                objProxy.realmSet$to((String) json.getString("to"));
            }
        }
        if (json.has("value")) {
            if (json.isNull("value")) {
                objProxy.realmSet$value(null);
            } else {
                objProxy.realmSet$value((String) json.getString("value"));
            }
        }
        if (json.has("gas")) {
            if (json.isNull("gas")) {
                objProxy.realmSet$gas(null);
            } else {
                objProxy.realmSet$gas((String) json.getString("gas"));
            }
        }
        if (json.has("gasPrice")) {
            if (json.isNull("gasPrice")) {
                objProxy.realmSet$gasPrice(null);
            } else {
                objProxy.realmSet$gasPrice((String) json.getString("gasPrice"));
            }
        }
        if (json.has("gasUsed")) {
            if (json.isNull("gasUsed")) {
                objProxy.realmSet$gasUsed(null);
            } else {
                objProxy.realmSet$gasUsed((String) json.getString("gasUsed"));
            }
        }
        if (json.has("input")) {
            if (json.isNull("input")) {
                objProxy.realmSet$input(null);
            } else {
                objProxy.realmSet$input((String) json.getString("input"));
            }
        }
        if (json.has("error")) {
            if (json.isNull("error")) {
                objProxy.realmSet$error(null);
            } else {
                objProxy.realmSet$error((String) json.getString("error"));
            }
        }
        if (json.has("maxFeePerGas")) {
            if (json.isNull("maxFeePerGas")) {
                objProxy.realmSet$maxFeePerGas(null);
            } else {
                objProxy.realmSet$maxFeePerGas((String) json.getString("maxFeePerGas"));
            }
        }
        if (json.has("maxPriorityFee")) {
            if (json.isNull("maxPriorityFee")) {
                objProxy.realmSet$maxPriorityFee(null);
            } else {
                objProxy.realmSet$maxPriorityFee((String) json.getString("maxPriorityFee"));
            }
        }
        if (json.has("chainId")) {
            if (json.isNull("chainId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
            } else {
                objProxy.realmSet$chainId((long) json.getLong("chainId"));
            }
        }
        if (json.has("expectedCompletion")) {
            if (json.isNull("expectedCompletion")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'expectedCompletion' to null.");
            } else {
                objProxy.realmSet$expectedCompletion((long) json.getLong("expectedCompletion"));
            }
        }
        if (json.has("contractAddress")) {
            if (json.isNull("contractAddress")) {
                objProxy.realmSet$contractAddress(null);
            } else {
                objProxy.realmSet$contractAddress((String) json.getString("contractAddress"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.alphawallet.app.repository.entity.RealmTransaction createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.alphawallet.app.repository.entity.RealmTransaction obj = new com.alphawallet.app.repository.entity.RealmTransaction();
        final com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface objProxy = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("hash")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$hash((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$hash(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("blockNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$blockNumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$blockNumber(null);
                }
            } else if (name.equals("timeStamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeStamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
                }
            } else if (name.equals("nonce")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nonce((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'nonce' to null.");
                }
            } else if (name.equals("from")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$from((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$from(null);
                }
            } else if (name.equals("to")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$to((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$to(null);
                }
            } else if (name.equals("value")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$value((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$value(null);
                }
            } else if (name.equals("gas")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gas((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$gas(null);
                }
            } else if (name.equals("gasPrice")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gasPrice((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$gasPrice(null);
                }
            } else if (name.equals("gasUsed")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gasUsed((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$gasUsed(null);
                }
            } else if (name.equals("input")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$input((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$input(null);
                }
            } else if (name.equals("error")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$error((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$error(null);
                }
            } else if (name.equals("maxFeePerGas")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$maxFeePerGas((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$maxFeePerGas(null);
                }
            } else if (name.equals("maxPriorityFee")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$maxPriorityFee((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$maxPriorityFee(null);
                }
            } else if (name.equals("chainId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chainId((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'chainId' to null.");
                }
            } else if (name.equals("expectedCompletion")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$expectedCompletion((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'expectedCompletion' to null.");
                }
            } else if (name.equals("contractAddress")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contractAddress((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$contractAddress(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'hash'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_alphawallet_app_repository_entity_RealmTransactionRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class), false, Collections.<String>emptyList());
        io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy obj = new io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.alphawallet.app.repository.entity.RealmTransaction copyOrUpdate(Realm realm, RealmTransactionColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTransaction object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.alphawallet.app.repository.entity.RealmTransaction) cachedRealmObject;
        }

        com.alphawallet.app.repository.entity.RealmTransaction realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
            long pkColumnKey = columnInfo.hashColKey;
            String value = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$hash();
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
                    realmObject = new io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.alphawallet.app.repository.entity.RealmTransaction copy(Realm realm, RealmTransactionColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTransaction newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.alphawallet.app.repository.entity.RealmTransaction) cachedRealmObject;
        }

        com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface unmanagedSource = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) newObject;

        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.hashColKey, unmanagedSource.realmGet$hash());
        builder.addString(columnInfo.blockNumberColKey, unmanagedSource.realmGet$blockNumber());
        builder.addInteger(columnInfo.timeStampColKey, unmanagedSource.realmGet$timeStamp());
        builder.addInteger(columnInfo.nonceColKey, unmanagedSource.realmGet$nonce());
        builder.addString(columnInfo.fromColKey, unmanagedSource.realmGet$from());
        builder.addString(columnInfo.toColKey, unmanagedSource.realmGet$to());
        builder.addString(columnInfo.valueColKey, unmanagedSource.realmGet$value());
        builder.addString(columnInfo.gasColKey, unmanagedSource.realmGet$gas());
        builder.addString(columnInfo.gasPriceColKey, unmanagedSource.realmGet$gasPrice());
        builder.addString(columnInfo.gasUsedColKey, unmanagedSource.realmGet$gasUsed());
        builder.addString(columnInfo.inputColKey, unmanagedSource.realmGet$input());
        builder.addString(columnInfo.errorColKey, unmanagedSource.realmGet$error());
        builder.addString(columnInfo.maxFeePerGasColKey, unmanagedSource.realmGet$maxFeePerGas());
        builder.addString(columnInfo.maxPriorityFeeColKey, unmanagedSource.realmGet$maxPriorityFee());
        builder.addInteger(columnInfo.chainIdColKey, unmanagedSource.realmGet$chainId());
        builder.addInteger(columnInfo.expectedCompletionColKey, unmanagedSource.realmGet$expectedCompletion());
        builder.addString(columnInfo.contractAddressColKey, unmanagedSource.realmGet$contractAddress());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_alphawallet_app_repository_entity_RealmTransactionRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.alphawallet.app.repository.entity.RealmTransaction object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransactionColumnInfo columnInfo = (RealmTransactionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long pkColumnKey = columnInfo.hashColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$hash();
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
        String realmGet$blockNumber = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$blockNumber();
        if (realmGet$blockNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.blockNumberColKey, objKey, realmGet$blockNumber, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$timeStamp(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.nonceColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$nonce(), false);
        String realmGet$from = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$from();
        if (realmGet$from != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromColKey, objKey, realmGet$from, false);
        }
        String realmGet$to = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$to();
        if (realmGet$to != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toColKey, objKey, realmGet$to, false);
        }
        String realmGet$value = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.valueColKey, objKey, realmGet$value, false);
        }
        String realmGet$gas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gas();
        if (realmGet$gas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gasColKey, objKey, realmGet$gas, false);
        }
        String realmGet$gasPrice = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasPrice();
        if (realmGet$gasPrice != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gasPriceColKey, objKey, realmGet$gasPrice, false);
        }
        String realmGet$gasUsed = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasUsed();
        if (realmGet$gasUsed != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gasUsedColKey, objKey, realmGet$gasUsed, false);
        }
        String realmGet$input = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$input();
        if (realmGet$input != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.inputColKey, objKey, realmGet$input, false);
        }
        String realmGet$error = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$error();
        if (realmGet$error != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.errorColKey, objKey, realmGet$error, false);
        }
        String realmGet$maxFeePerGas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxFeePerGas();
        if (realmGet$maxFeePerGas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.maxFeePerGasColKey, objKey, realmGet$maxFeePerGas, false);
        }
        String realmGet$maxPriorityFee = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxPriorityFee();
        if (realmGet$maxPriorityFee != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.maxPriorityFeeColKey, objKey, realmGet$maxPriorityFee, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$chainId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.expectedCompletionColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$expectedCompletion(), false);
        String realmGet$contractAddress = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$contractAddress();
        if (realmGet$contractAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contractAddressColKey, objKey, realmGet$contractAddress, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransactionColumnInfo columnInfo = (RealmTransactionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long pkColumnKey = columnInfo.hashColKey;
        com.alphawallet.app.repository.entity.RealmTransaction object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTransaction) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$hash();
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
            String realmGet$blockNumber = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$blockNumber();
            if (realmGet$blockNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.blockNumberColKey, objKey, realmGet$blockNumber, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$timeStamp(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.nonceColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$nonce(), false);
            String realmGet$from = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$from();
            if (realmGet$from != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromColKey, objKey, realmGet$from, false);
            }
            String realmGet$to = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$to();
            if (realmGet$to != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toColKey, objKey, realmGet$to, false);
            }
            String realmGet$value = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$value();
            if (realmGet$value != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.valueColKey, objKey, realmGet$value, false);
            }
            String realmGet$gas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gas();
            if (realmGet$gas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gasColKey, objKey, realmGet$gas, false);
            }
            String realmGet$gasPrice = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasPrice();
            if (realmGet$gasPrice != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gasPriceColKey, objKey, realmGet$gasPrice, false);
            }
            String realmGet$gasUsed = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasUsed();
            if (realmGet$gasUsed != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gasUsedColKey, objKey, realmGet$gasUsed, false);
            }
            String realmGet$input = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$input();
            if (realmGet$input != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.inputColKey, objKey, realmGet$input, false);
            }
            String realmGet$error = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$error();
            if (realmGet$error != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.errorColKey, objKey, realmGet$error, false);
            }
            String realmGet$maxFeePerGas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxFeePerGas();
            if (realmGet$maxFeePerGas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.maxFeePerGasColKey, objKey, realmGet$maxFeePerGas, false);
            }
            String realmGet$maxPriorityFee = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxPriorityFee();
            if (realmGet$maxPriorityFee != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.maxPriorityFeeColKey, objKey, realmGet$maxPriorityFee, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$chainId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.expectedCompletionColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$expectedCompletion(), false);
            String realmGet$contractAddress = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$contractAddress();
            if (realmGet$contractAddress != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contractAddressColKey, objKey, realmGet$contractAddress, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.alphawallet.app.repository.entity.RealmTransaction object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransactionColumnInfo columnInfo = (RealmTransactionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long pkColumnKey = columnInfo.hashColKey;
        String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$hash();
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
        String realmGet$blockNumber = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$blockNumber();
        if (realmGet$blockNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.blockNumberColKey, objKey, realmGet$blockNumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.blockNumberColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$timeStamp(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.nonceColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$nonce(), false);
        String realmGet$from = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$from();
        if (realmGet$from != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromColKey, objKey, realmGet$from, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromColKey, objKey, false);
        }
        String realmGet$to = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$to();
        if (realmGet$to != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toColKey, objKey, realmGet$to, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.toColKey, objKey, false);
        }
        String realmGet$value = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.valueColKey, objKey, realmGet$value, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.valueColKey, objKey, false);
        }
        String realmGet$gas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gas();
        if (realmGet$gas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gasColKey, objKey, realmGet$gas, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.gasColKey, objKey, false);
        }
        String realmGet$gasPrice = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasPrice();
        if (realmGet$gasPrice != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gasPriceColKey, objKey, realmGet$gasPrice, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.gasPriceColKey, objKey, false);
        }
        String realmGet$gasUsed = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasUsed();
        if (realmGet$gasUsed != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gasUsedColKey, objKey, realmGet$gasUsed, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.gasUsedColKey, objKey, false);
        }
        String realmGet$input = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$input();
        if (realmGet$input != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.inputColKey, objKey, realmGet$input, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.inputColKey, objKey, false);
        }
        String realmGet$error = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$error();
        if (realmGet$error != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.errorColKey, objKey, realmGet$error, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.errorColKey, objKey, false);
        }
        String realmGet$maxFeePerGas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxFeePerGas();
        if (realmGet$maxFeePerGas != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.maxFeePerGasColKey, objKey, realmGet$maxFeePerGas, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.maxFeePerGasColKey, objKey, false);
        }
        String realmGet$maxPriorityFee = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxPriorityFee();
        if (realmGet$maxPriorityFee != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.maxPriorityFeeColKey, objKey, realmGet$maxPriorityFee, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.maxPriorityFeeColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$chainId(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.expectedCompletionColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$expectedCompletion(), false);
        String realmGet$contractAddress = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$contractAddress();
        if (realmGet$contractAddress != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contractAddressColKey, objKey, realmGet$contractAddress, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contractAddressColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long tableNativePtr = table.getNativePtr();
        RealmTransactionColumnInfo columnInfo = (RealmTransactionColumnInfo) realm.getSchema().getColumnInfo(com.alphawallet.app.repository.entity.RealmTransaction.class);
        long pkColumnKey = columnInfo.hashColKey;
        com.alphawallet.app.repository.entity.RealmTransaction object = null;
        while (objects.hasNext()) {
            object = (com.alphawallet.app.repository.entity.RealmTransaction) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$hash();
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
            String realmGet$blockNumber = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$blockNumber();
            if (realmGet$blockNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.blockNumberColKey, objKey, realmGet$blockNumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.blockNumberColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$timeStamp(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.nonceColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$nonce(), false);
            String realmGet$from = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$from();
            if (realmGet$from != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromColKey, objKey, realmGet$from, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromColKey, objKey, false);
            }
            String realmGet$to = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$to();
            if (realmGet$to != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toColKey, objKey, realmGet$to, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.toColKey, objKey, false);
            }
            String realmGet$value = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$value();
            if (realmGet$value != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.valueColKey, objKey, realmGet$value, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.valueColKey, objKey, false);
            }
            String realmGet$gas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gas();
            if (realmGet$gas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gasColKey, objKey, realmGet$gas, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.gasColKey, objKey, false);
            }
            String realmGet$gasPrice = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasPrice();
            if (realmGet$gasPrice != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gasPriceColKey, objKey, realmGet$gasPrice, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.gasPriceColKey, objKey, false);
            }
            String realmGet$gasUsed = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$gasUsed();
            if (realmGet$gasUsed != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gasUsedColKey, objKey, realmGet$gasUsed, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.gasUsedColKey, objKey, false);
            }
            String realmGet$input = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$input();
            if (realmGet$input != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.inputColKey, objKey, realmGet$input, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.inputColKey, objKey, false);
            }
            String realmGet$error = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$error();
            if (realmGet$error != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.errorColKey, objKey, realmGet$error, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.errorColKey, objKey, false);
            }
            String realmGet$maxFeePerGas = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxFeePerGas();
            if (realmGet$maxFeePerGas != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.maxFeePerGasColKey, objKey, realmGet$maxFeePerGas, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.maxFeePerGasColKey, objKey, false);
            }
            String realmGet$maxPriorityFee = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$maxPriorityFee();
            if (realmGet$maxPriorityFee != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.maxPriorityFeeColKey, objKey, realmGet$maxPriorityFee, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.maxPriorityFeeColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.chainIdColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$chainId(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.expectedCompletionColKey, objKey, ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$expectedCompletion(), false);
            String realmGet$contractAddress = ((com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) object).realmGet$contractAddress();
            if (realmGet$contractAddress != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contractAddressColKey, objKey, realmGet$contractAddress, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contractAddressColKey, objKey, false);
            }
        }
    }

    public static com.alphawallet.app.repository.entity.RealmTransaction createDetachedCopy(com.alphawallet.app.repository.entity.RealmTransaction realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.alphawallet.app.repository.entity.RealmTransaction unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.alphawallet.app.repository.entity.RealmTransaction();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.alphawallet.app.repository.entity.RealmTransaction) cachedObject.object;
            }
            unmanagedObject = (com.alphawallet.app.repository.entity.RealmTransaction) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface unmanagedCopy = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) unmanagedObject;
        com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface realmSource = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$hash(realmSource.realmGet$hash());
        unmanagedCopy.realmSet$blockNumber(realmSource.realmGet$blockNumber());
        unmanagedCopy.realmSet$timeStamp(realmSource.realmGet$timeStamp());
        unmanagedCopy.realmSet$nonce(realmSource.realmGet$nonce());
        unmanagedCopy.realmSet$from(realmSource.realmGet$from());
        unmanagedCopy.realmSet$to(realmSource.realmGet$to());
        unmanagedCopy.realmSet$value(realmSource.realmGet$value());
        unmanagedCopy.realmSet$gas(realmSource.realmGet$gas());
        unmanagedCopy.realmSet$gasPrice(realmSource.realmGet$gasPrice());
        unmanagedCopy.realmSet$gasUsed(realmSource.realmGet$gasUsed());
        unmanagedCopy.realmSet$input(realmSource.realmGet$input());
        unmanagedCopy.realmSet$error(realmSource.realmGet$error());
        unmanagedCopy.realmSet$maxFeePerGas(realmSource.realmGet$maxFeePerGas());
        unmanagedCopy.realmSet$maxPriorityFee(realmSource.realmGet$maxPriorityFee());
        unmanagedCopy.realmSet$chainId(realmSource.realmGet$chainId());
        unmanagedCopy.realmSet$expectedCompletion(realmSource.realmGet$expectedCompletion());
        unmanagedCopy.realmSet$contractAddress(realmSource.realmGet$contractAddress());

        return unmanagedObject;
    }

    static com.alphawallet.app.repository.entity.RealmTransaction update(Realm realm, RealmTransactionColumnInfo columnInfo, com.alphawallet.app.repository.entity.RealmTransaction realmObject, com.alphawallet.app.repository.entity.RealmTransaction newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface realmObjectTarget = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) realmObject;
        com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface realmObjectSource = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxyInterface) newObject;
        Table table = realm.getTable(com.alphawallet.app.repository.entity.RealmTransaction.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.hashColKey, realmObjectSource.realmGet$hash());
        builder.addString(columnInfo.blockNumberColKey, realmObjectSource.realmGet$blockNumber());
        builder.addInteger(columnInfo.timeStampColKey, realmObjectSource.realmGet$timeStamp());
        builder.addInteger(columnInfo.nonceColKey, realmObjectSource.realmGet$nonce());
        builder.addString(columnInfo.fromColKey, realmObjectSource.realmGet$from());
        builder.addString(columnInfo.toColKey, realmObjectSource.realmGet$to());
        builder.addString(columnInfo.valueColKey, realmObjectSource.realmGet$value());
        builder.addString(columnInfo.gasColKey, realmObjectSource.realmGet$gas());
        builder.addString(columnInfo.gasPriceColKey, realmObjectSource.realmGet$gasPrice());
        builder.addString(columnInfo.gasUsedColKey, realmObjectSource.realmGet$gasUsed());
        builder.addString(columnInfo.inputColKey, realmObjectSource.realmGet$input());
        builder.addString(columnInfo.errorColKey, realmObjectSource.realmGet$error());
        builder.addString(columnInfo.maxFeePerGasColKey, realmObjectSource.realmGet$maxFeePerGas());
        builder.addString(columnInfo.maxPriorityFeeColKey, realmObjectSource.realmGet$maxPriorityFee());
        builder.addInteger(columnInfo.chainIdColKey, realmObjectSource.realmGet$chainId());
        builder.addInteger(columnInfo.expectedCompletionColKey, realmObjectSource.realmGet$expectedCompletion());
        builder.addString(columnInfo.contractAddressColKey, realmObjectSource.realmGet$contractAddress());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmTransaction = proxy[");
        stringBuilder.append("{hash:");
        stringBuilder.append(realmGet$hash() != null ? realmGet$hash() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blockNumber:");
        stringBuilder.append(realmGet$blockNumber() != null ? realmGet$blockNumber() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeStamp:");
        stringBuilder.append(realmGet$timeStamp());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nonce:");
        stringBuilder.append(realmGet$nonce());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{from:");
        stringBuilder.append(realmGet$from() != null ? realmGet$from() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{to:");
        stringBuilder.append(realmGet$to() != null ? realmGet$to() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{value:");
        stringBuilder.append(realmGet$value() != null ? realmGet$value() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gas:");
        stringBuilder.append(realmGet$gas() != null ? realmGet$gas() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gasPrice:");
        stringBuilder.append(realmGet$gasPrice() != null ? realmGet$gasPrice() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gasUsed:");
        stringBuilder.append(realmGet$gasUsed() != null ? realmGet$gasUsed() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{input:");
        stringBuilder.append(realmGet$input() != null ? realmGet$input() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{error:");
        stringBuilder.append(realmGet$error() != null ? realmGet$error() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{maxFeePerGas:");
        stringBuilder.append(realmGet$maxFeePerGas() != null ? realmGet$maxFeePerGas() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{maxPriorityFee:");
        stringBuilder.append(realmGet$maxPriorityFee() != null ? realmGet$maxPriorityFee() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chainId:");
        stringBuilder.append(realmGet$chainId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{expectedCompletion:");
        stringBuilder.append(realmGet$expectedCompletion());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contractAddress:");
        stringBuilder.append(realmGet$contractAddress() != null ? realmGet$contractAddress() : "null");
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
        com_alphawallet_app_repository_entity_RealmTransactionRealmProxy aRealmTransaction = (com_alphawallet_app_repository_entity_RealmTransactionRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmTransaction.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmTransaction.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmTransaction.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
