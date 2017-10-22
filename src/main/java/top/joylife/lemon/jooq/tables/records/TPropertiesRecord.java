/*
 * This file is generated by jOOQ.
*/
package top.joylife.lemon.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import top.joylife.lemon.jooq.tables.TProperties;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPropertiesRecord extends UpdatableRecordImpl<TPropertiesRecord> implements Record7<Integer, String, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 616692900;

    /**
     * Setter for <code>lemon.t_properties.id</code>. id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lemon.t_properties.id</code>. id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lemon.t_properties.name</code>. 参数名字
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lemon.t_properties.name</code>. 参数名字
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>lemon.t_properties.title</code>. 参数中文名
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>lemon.t_properties.title</code>. 参数中文名
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>lemon.t_properties.value</code>. 参数值
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>lemon.t_properties.value</code>. 参数值
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>lemon.t_properties.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>lemon.t_properties.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>lemon.t_properties.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>lemon.t_properties.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>lemon.t_properties.status</code>. 参数状态，0-未删除，1-删除
     */
    public void setStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>lemon.t_properties.status</code>. 参数状态，0-未删除，1-删除
     */
    public String getStatus() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TProperties.T_PROPERTIES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TProperties.T_PROPERTIES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TProperties.T_PROPERTIES.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TProperties.T_PROPERTIES.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TProperties.T_PROPERTIES.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TProperties.T_PROPERTIES.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TProperties.T_PROPERTIES.STATUS;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord value7(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPropertiesRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPropertiesRecord
     */
    public TPropertiesRecord() {
        super(TProperties.T_PROPERTIES);
    }

    /**
     * Create a detached, initialised TPropertiesRecord
     */
    public TPropertiesRecord(Integer id, String name, String title, String value, Timestamp createTime, Timestamp updateTime, String status) {
        super(TProperties.T_PROPERTIES);

        set(0, id);
        set(1, name);
        set(2, title);
        set(3, value);
        set(4, createTime);
        set(5, updateTime);
        set(6, status);
    }
}
