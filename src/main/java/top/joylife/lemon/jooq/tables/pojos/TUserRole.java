/*
 * This file is generated by jOOQ.
*/
package top.joylife.lemon.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 用户角色关联
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserRole implements Serializable {

    private static final long serialVersionUID = -2064737201;

    private Integer id;
    private Integer userId;
    private Integer roleId;

    public TUserRole() {}

    public TUserRole(TUserRole value) {
        this.id = value.id;
        this.userId = value.userId;
        this.roleId = value.roleId;
    }

    public TUserRole(
        Integer id,
        Integer userId,
        Integer roleId
    ) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TUserRole (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}
