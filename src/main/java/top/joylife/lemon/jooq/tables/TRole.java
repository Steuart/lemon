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
import top.joylife.lemon.jooq.tables.records.TRoleRecord;


/**
 * 角色表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRole extends TableImpl<TRoleRecord> {

    private static final long serialVersionUID = 1017481199;

    /**
     * The reference instance of <code>lemon.t_role</code>
     */
    public static final TRole T_ROLE = new TRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TRoleRecord> getRecordType() {
        return TRoleRecord.class;
    }

    /**
     * The column <code>lemon.t_role.id</code>.
     */
    public final TableField<TRoleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>lemon.t_role.rolename</code>. 角色名字
     */
    public final TableField<TRoleRecord, String> ROLENAME = createField("rolename", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "角色名字");

    /**
     * The column <code>lemon.t_role.create_time</code>. 创建时间
     */
    public final TableField<TRoleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>lemon.t_role.update_time</code>. 更新时间
     */
    public final TableField<TRoleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>lemon.t_role.status</code>. 状态标识，0-正常，1-删除
     */
    public final TableField<TRoleRecord, Boolean> STATUS = createField("status", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "状态标识，0-正常，1-删除");

    /**
     * Create a <code>lemon.t_role</code> table reference
     */
    public TRole() {
        this("t_role", null);
    }

    /**
     * Create an aliased <code>lemon.t_role</code> table reference
     */
    public TRole(String alias) {
        this(alias, T_ROLE);
    }

    private TRole(String alias, Table<TRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private TRole(String alias, Table<TRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "角色表");
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
    public Identity<TRoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TRoleRecord> getPrimaryKey() {
        return Keys.KEY_T_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<TRoleRecord>>asList(Keys.KEY_T_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRole as(String alias) {
        return new TRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TRole rename(String name) {
        return new TRole(name, null);
    }
}
