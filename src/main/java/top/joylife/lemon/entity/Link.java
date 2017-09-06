package top.joylife.lemon.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Link {
    private Integer id;

    private String url;

    private String descri;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Byte status;

    private String image;

}