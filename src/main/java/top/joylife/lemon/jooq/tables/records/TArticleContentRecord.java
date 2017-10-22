/*
 * This file is generated by jOOQ.
*/
package top.joylife.lemon.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import top.joylife.lemon.jooq.tables.TArticleContent;


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
public class TArticleContentRecord extends UpdatableRecordImpl<TArticleContentRecord> implements Record5<Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1555609154;

    /**
     * Setter for <code>lemon.t_article_content.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lemon.t_article_content.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lemon.t_article_content.article_id</code>. 文章id
     */
    public void setArticleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>lemon.t_article_content.article_id</code>. 文章id
     */
    public Integer getArticleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>lemon.t_article_content.content</code>. 文章内容
     */
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>lemon.t_article_content.content</code>. 文章内容
     */
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>lemon.t_article_content.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>lemon.t_article_content.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>lemon.t_article_content.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>lemon.t_article_content.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TArticleContent.T_ARTICLE_CONTENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TArticleContent.T_ARTICLE_CONTENT.ARTICLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TArticleContent.T_ARTICLE_CONTENT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TArticleContent.T_ARTICLE_CONTENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TArticleContent.T_ARTICLE_CONTENT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getArticleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TArticleContentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TArticleContentRecord value2(Integer value) {
        setArticleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TArticleContentRecord value3(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TArticleContentRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TArticleContentRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TArticleContentRecord values(Integer value1, Integer value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TArticleContentRecord
     */
    public TArticleContentRecord() {
        super(TArticleContent.T_ARTICLE_CONTENT);
    }

    /**
     * Create a detached, initialised TArticleContentRecord
     */
    public TArticleContentRecord(Integer id, Integer articleId, String content, Timestamp createTime, Timestamp updateTime) {
        super(TArticleContent.T_ARTICLE_CONTENT);

        set(0, id);
        set(1, articleId);
        set(2, content);
        set(3, createTime);
        set(4, updateTime);
    }
}
