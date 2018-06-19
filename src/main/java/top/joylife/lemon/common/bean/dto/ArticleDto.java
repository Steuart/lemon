package top.joylife.lemon.common.bean.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * created by wuhaiming on 2018/6/15
 */
@Data
public class ArticleDto {
    /**
     * 文章id
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 摘要
     */
    private String summary;
    /**
     * 封面图片
     */
    private String coverImg;

    /**
     * 标签
     */
    private List<String> tags;

    /**
     * 分类
     */
    private String classify;

    /**
     * 文章内容,markdown格式
     */
    private String markdown;

    /**
     * 文章内容html格式
     */
    private String html;

}
