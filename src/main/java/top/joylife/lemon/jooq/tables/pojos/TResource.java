/*
 * This file is generated by jOOQ.
*/
package top.joylife.lemon.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class TResource implements Serializable {

    private static final long serialVersionUID = 1410845741;

    private Integer   id;
    private String    resource;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   status;

    public TResource() {}

    public TResource(TResource value) {
        this.id = value.id;
        this.resource = value.resource;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.status = value.status;
    }

    public TResource(
        Integer   id,
        String    resource,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   status
    ) {
        this.id = id;
        this.resource = resource;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResource() {
        return this.resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TResource (");

        sb.append(id);
        sb.append(", ").append(resource);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
