/*
 * This file is generated by jOOQ.
*/
package top.joylife.lemon.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import top.joylife.lemon.jooq.tables.TPage;


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
public class TPageRecord extends UpdatableRecordImpl<TPageRecord> implements Record10<Integer, String, Integer, Integer, Timestamp, Timestamp, Boolean, String, String, Integer> {

    private static final long serialVersionUID = 103193974;

    /**
     * Setter for <code>lemon.t_page.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lemon.t_page.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lemon.t_page.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lemon.t_page.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>lemon.t_page.sort</code>. 排序
     */
    public void setSort(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>lemon.t_page.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>lemon.t_page.parent_id</code>. 父菜单id
     */
    public void setParentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>lemon.t_page.parent_id</code>. 父菜单id
     */
    public Integer getParentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>lemon.t_page.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>lemon.t_page.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>lemon.t_page.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>lemon.t_page.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>lemon.t_page.status</code>. 状态标识，0-正常，1-删除
     */
    public void setStatus(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>lemon.t_page.status</code>. 状态标识，0-正常，1-删除
     */
    public Boolean getStatus() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>lemon.t_page.name</code>. 名字
     */
    public void setName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>lemon.t_page.name</code>. 名字
     */
    public String getName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>lemon.t_page.describe</code>. 描述
     */
    public void setDescribe(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>lemon.t_page.describe</code>. 描述
     */
    public String getDescribe() {
        return (String) get(8);
    }

    /**
     * Setter for <code>lemon.t_page.type</code>. 类型
     */
    public void setType(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>lemon.t_page.type</code>. 类型
     */
    public Integer getType() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Integer, Integer, Timestamp, Timestamp, Boolean, String, String, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Integer, Integer, Timestamp, Timestamp, Boolean, String, String, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TPage.T_PAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TPage.T_PAGE.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TPage.T_PAGE.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TPage.T_PAGE.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TPage.T_PAGE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TPage.T_PAGE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return TPage.T_PAGE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TPage.T_PAGE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TPage.T_PAGE.DESCRIBE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TPage.T_PAGE.TYPE;
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
    public String value2() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getParentId();
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
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDescribe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value2(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value3(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value4(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value7(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value8(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value9(String value) {
        setDescribe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord value10(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPageRecord values(Integer value1, String value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6, Boolean value7, String value8, String value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPageRecord
     */
    public TPageRecord() {
        super(TPage.T_PAGE);
    }

    /**
     * Create a detached, initialised TPageRecord
     */
    public TPageRecord(Integer id, String url, Integer sort, Integer parentId, Timestamp updateTime, Timestamp createTime, Boolean status, String name, String describe, Integer type) {
        super(TPage.T_PAGE);

        set(0, id);
        set(1, url);
        set(2, sort);
        set(3, parentId);
        set(4, updateTime);
        set(5, createTime);
        set(6, status);
        set(7, name);
        set(8, describe);
        set(9, type);
    }
}
