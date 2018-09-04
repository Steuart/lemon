package top.joylife.lemon.common.bean.dto;

import lombok.Data;

@Data
public class TagDto {

    /**
     * 标签id
     */
    private Integer tagId;

    /**
     * 标签名
     */
    private String tagName;


    /**
     * 文章数
     */
    private Integer articleNumber;
}
