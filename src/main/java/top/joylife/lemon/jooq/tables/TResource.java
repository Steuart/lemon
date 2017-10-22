/*
 * This file is generated by jOOQ.
*/
package top.joylife.lemon.jooq.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import top.joylife.lemon.jooq.Keys;
import top.joylife.lemon.jooq.Lemon;
import top.joylife.lemon.jooq.tables.records.TResourceRecord;


/**
 * 资源表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TResource extends TableImpl<TResourceRecord> {

    private static final long serialVersionUID = -265388930;

    /**
     * The reference instance of <code>lemon.t_resource</code>
     */
    public static final TResource T_RESOURCE = new TResource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TResourceRecord> getRecordType() {
        return TResourceRecord.class;
    }

    /**
     * The column <code>lemon.t_resource.id</code>.
     */
    public final TableField<TResourceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>lemon.t_resource.resource</code>. 资源字符串
     */
    public final TableField<TResourceRecord, String> RESOURCE = createField("resource", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "资源字符串");

    /**
     * The column <code>lemon.t_resource.create_time</code>. 创建时间
     */
    public final TableField<TResourceRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>lemon.t_resource.update_time</code>. 更新时间
     */
    public final TableField<TResourceRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>lemon.t_resource.status</code>. 状态标识，0-正常，1-删除
     */
    public final TableField<TResourceRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "状态标识，0-正常，1-删除");

    /**
     * Create a <code>lemon.t_resource</code> table reference
     */
    public TResource() {
        this("t_resource", null);
    }

    /**
     * Create an aliased <code>lemon.t_resource</code> table reference
     */
    public TResource(String alias) {
        this(alias, T_RESOURCE);
    }

    private TResource(String alias, Table<TResourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TResource(String alias, Table<TResourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "资源表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Lemon.LEMON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TResourceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_RESOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TResourceRecord> getPrimaryKey() {
        return Keys.KEY_T_RESOURCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TResourceRecord>> getKeys() {
        return Arrays.<UniqueKey<TResourceRecord>>asList(Keys.KEY_T_RESOURCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TResource as(String alias) {
        return new TResource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TResource rename(String name) {
        return new TResource(name, null);
    }
}