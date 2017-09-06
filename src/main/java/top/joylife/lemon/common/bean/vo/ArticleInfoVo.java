package top.joylife.lemon.common.bean.vo;

import lombok.Data;
import top.joylife.lemon.entity.ArticleContent;
import top.joylife.lemon.entity.Tag;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
@Data
public class ArticleInfoVo {

    private Integer id;

    private String title;

    private String summary;

    private String author;

    private String source;

    private Integer sort;

    private Integer clickNo;

    private Integer scanNo;

    private Integer praiseNo;

    private Integer treadNo;

    private Integer commentNo;

    private Date createTime;

    private Date updateTime;

    private Byte status;

    private List<Tag> tags;

    private ArticleContent articleContent;
}
