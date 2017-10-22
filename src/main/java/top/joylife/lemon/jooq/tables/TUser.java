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
import top.joylife.lemon.jooq.tables.records.TUserRecord;


/**
 * 用户信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUser extends TableImpl<TUserRecord> {

    private static final long serialVersionUID = -209321772;

    /**
     * The reference instance of <code>lemon.t_user</code>
     */
    public static final TUser T_USER = new TUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUserRecord> getRecordType() {
        return TUserRecord.class;
    }

    /**
     * The column <code>lemon.t_user.id</code>.
     */
    public final TableField<TUserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>lemon.t_user.nickname</code>. 用户昵称
     */
    public final TableField<TUserRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "用户昵称");

    /**
     * The column <code>lemon.t_user.head_pic</code>. 头像
     */
    public final TableField<TUserRecord, String> HEAD_PIC = createField("head_pic", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "头像");

    /**
     * The column <code>lemon.t_user.create_time</code>. 创建时间
     */
    public final TableField<TUserRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>lemon.t_user.email</code>. 电子邮件
     */
    public final TableField<TUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "电子邮件");

    /**
     * The column <code>lemon.t_user.update_time</code>. 更新时间
     */
    public final TableField<TUserRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>lemon.t_user.status</code>. 状态标识，0-正常，1-删除
     */
    public final TableField<TUserRecord, Boolean> STATUS = createField("status", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "状态标识，0-正常，1-删除");

    /**
     * Create a <code>lemon.t_user</code> table reference
     */
    public TUser() {
        this("t_user", null);
    }

    /**
     * Create an aliased <code>lemon.t_user</code> table reference
     */
    public TUser(String alias) {
        this(alias, T_USER);
    }

    private TUser(String alias, Table<TUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUser(String alias, Table<TUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户信息表");
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
    public Identity<TUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TUserRecord> getPrimaryKey() {
        return Keys.KEY_T_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TUserRecord>>asList(Keys.KEY_T_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUser as(String alias) {
        return new TUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUser rename(String name) {
        return new TUser(name, null);
    }
}
