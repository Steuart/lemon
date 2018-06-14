package top.joylife.lemon.controller.admin;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.common.bean.dto.ArticleDto;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.util.ReUtil;

/**
 * created by wuhaiming on 2018/6/9
 */
@RestController(value = "adminArticleController")
@RequestMapping("/admin/article")
@Slf4j
public class ArticleController {

    /**
     * 获取文章
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResultData<ArticleDto> getArticle(@PathVariable Integer id){
        ArticleDto dto = new ArticleDto();
        dto.setId(id);
        dto.setMarkdown("# 葫芦娃，葫芦娃");
        return ReUtil.success(dto);
    }

    /**
     * 更新文章
     * @param articleDto
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public ResultData<String> updateArticle(@RequestBody ArticleDto articleDto){
        String articleId = "";
        return ReUtil.success(articleId);
    }

    /**
     * 删除文章
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResultData<String> deleteArticle(@PathVariable Integer id){
        String articleId = "";
        return ReUtil.success(articleId);
    }

    /**
     * 新建文章
     * @param articleDto
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResultData<String> addArticle(@RequestBody ArticleDto articleDto){
        String articleId = "";
        log.info(JSON.toJSONString(articleDto));
        return ReUtil.success(articleId);
    }


}
