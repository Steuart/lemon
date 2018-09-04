package top.joylife.lemon.service;

import top.joylife.lemon.common.bean.dto.ArticleDto;

/**
 * created by wuhaiming on 2018/2/9
 */
public interface ArticleService {

    /**
     * 保存文章
     * @param articleDto
     * @return
     */
    Integer add(ArticleDto articleDto);

    /**
     * 更新文章
     * @param articleDto
     * @return
     */
    Integer update(ArticleDto articleDto);

    /**
     * 删除文章
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据id查询文章
     * @param id
     * @return
     */
    ArticleDto getById(Integer id);
}
