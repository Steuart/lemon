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
import top.joylife.lemon.jooq.tables.records.TArticleContentRecord;


/**
 * 文章内容表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArticleContent extends TableImpl<TArticleContentRecord> {

    private static final long serialVersionUID = -1689239124;

    /**
     * The reference instance of <code>lemon.t_article_content</code>
     */
    public static final TArticleContent T_ARTICLE_CONTENT = new TArticleContent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TArticleContentRecord> getRecordType() {
        return TArticleContentRecord.class;
    }

    /**
     * The column <code>lemon.t_article_content.id</code>.
     */
    public final TableField<TArticleContentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>lemon.t_article_content.article_id</code>. 文章id
     */
    public final TableField<TArticleContentRecord, Integer> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "文章id");

    /**
     * The column <code>lemon.t_article_content.content</code>. 文章内容
     */
    public final TableField<TArticleContentRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "文章内容");

    /**
     * The column <code>lemon.t_article_content.create_time</code>. 创建时间
     */
    public final TableField<TArticleContentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>lemon.t_article_content.update_time</code>. 更新时间
     */
    public final TableField<TArticleContentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>lemon.t_article_content</code> table reference
     */
    public TArticleContent() {
        this("t_article_content", null);
    }

    /**
     * Create an aliased <code>lemon.t_article_content</code> table reference
     */
    public TArticleContent(String alias) {
        this(alias, T_ARTICLE_CONTENT);
    }

    private TArticleContent(String alias, Table<TArticleContentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TArticleContent(String alias, Table<TArticleContentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "文章内容表");
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
    public Identity<TArticleContentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ARTICLE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TArticleContentRecord> getPrimaryKey() {
        return Keys.KEY_T_ARTICLE_CONTENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TArticleContentRecord>> getKeys() {
        return Arrays.<UniqueKey<TArticleContentRecord>>asList(Keys.KEY_T_ARTICLE_CONTENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TArticleContent as(String alias) {
        return new TArticleContent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TArticleContent rename(String name) {
        return new TArticleContent(name, null);
    }
}