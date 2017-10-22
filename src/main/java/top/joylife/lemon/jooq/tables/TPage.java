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
import top.joylife.lemon.jooq.tables.records.TPageRecord;


/**
 * 页面资源
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPage extends TableImpl<TPageRecord> {

    private static final long serialVersionUID = -499093507;

    /**
     * The reference instance of <code>lemon.t_page</code>
     */
    public static final TPage T_PAGE = new TPage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPageRecord> getRecordType() {
        return TPageRecord.class;
    }

    /**
     * The column <code>lemon.t_page.id</code>.
     */
    public final TableField<TPageRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>lemon.t_page.url</code>.
     */
    public final TableField<TPageRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>lemon.t_page.sort</code>. 排序
     */
    public final TableField<TPageRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "排序");

    /**
     * The column <code>lemon.t_page.parent_id</code>. 父菜单id
     */
    public final TableField<TPageRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "父菜单id");

    /**
     * The column <code>lemon.t_page.update_time</code>. 更新时间
     */
    public final TableField<TPageRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>lemon.t_page.create_time</code>. 创建时间
     */
    public final TableField<TPageRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>lemon.t_page.status</code>. 状态标识，0-正常，1-删除
     */
    public final TableField<TPageRecord, Boolean> STATUS = createField("status", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "状态标识，0-正常，1-删除");

    /**
     * The column <code>lemon.t_page.name</code>. 名字
     */
    public final TableField<TPageRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "名字");

    /**
     * The column <code>lemon.t_page.describe</code>. 描述
     */
    public final TableField<TPageRecord, String> DESCRIBE = createField("describe", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "描述");

    /**
     * The column <code>lemon.t_page.type</code>. 类型
     */
    public final TableField<TPageRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "类型");

    /**
     * Create a <code>lemon.t_page</code> table reference
     */
    public TPage() {
        this("t_page", null);
    }

    /**
     * Create an aliased <code>lemon.t_page</code> table reference
     */
    public TPage(String alias) {
        this(alias, T_PAGE);
    }

    private TPage(String alias, Table<TPageRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPage(String alias, Table<TPageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "页面资源");
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
    public Identity<TPageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_PAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPageRecord> getPrimaryKey() {
        return Keys.KEY_T_PAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPageRecord>> getKeys() {
        return Arrays.<UniqueKey<TPageRecord>>asList(Keys.KEY_T_PAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPage as(String alias) {
        return new TPage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPage rename(String name) {
        return new TPage(name, null);
    }
}
