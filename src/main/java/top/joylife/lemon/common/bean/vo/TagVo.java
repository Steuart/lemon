package top.joylife.lemon.common.bean.vo;

import lombok.Data;
import top.joylife.lemon.entity.Tag;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
@Data
public class TagVo {

    private Integer articleId;

    private Integer id;

    private String name;

    private Integer articleCount;

    private String bgColor;

    private String fontColor;

    private Date createTime;

    private Date updateTime;

    private Byte status;
}
