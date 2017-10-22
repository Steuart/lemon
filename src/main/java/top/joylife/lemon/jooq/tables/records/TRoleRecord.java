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

import top.joylife.lemon.jooq.tables.TRole;


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
public class TRoleRecord extends UpdatableRecordImpl<TRoleRecord> implements Record5<Integer, String, Timestamp, Timestamp, Boolean> {

    private static final long serialVersionUID = 969229899;

    /**
     * Setter for <code>lemon.t_role.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lemon.t_role.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lemon.t_role.rolename</code>. 角色名字
     */
    public void setRolename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lemon.t_role.rolename</code>. 角色名字
     */
    public String getRolename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>lemon.t_role.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>lemon.t_role.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>lemon.t_role.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>lemon.t_role.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>lemon.t_role.status</code>. 状态标识，0-正常，1-删除
     */
    public void setStatus(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>lemon.t_role.status</code>. 状态标识，0-正常，1-删除
     */
    public Boolean getStatus() {
        return (Boolean) get(4);
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
    public Row5<Integer, String, Timestamp, Timestamp, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Timestamp, Timestamp, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TRole.T_ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TRole.T_ROLE.ROLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TRole.T_ROLE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TRole.T_ROLE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return TRole.T_ROLE.STATUS;
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
        return getRolename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value2(String value) {
        setRolename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord value5(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRoleRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4, Boolean value5) {
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
     * Create a detached TRoleRecord
     */
    public TRoleRecord() {
        super(TRole.T_ROLE);
    }

    /**
     * Create a detached, initialised TRoleRecord
     */
    public TRoleRecord(Integer id, String rolename, Timestamp createTime, Timestamp updateTime, Boolean status) {
        super(TRole.T_ROLE);

        set(0, id);
        set(1, rolename);
        set(2, createTime);
        set(3, updateTime);
        set(4, status);
    }
}