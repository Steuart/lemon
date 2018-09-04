package top.joylife.lemon.controller.admin;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.common.bean.dto.ArticleDto;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.enums.SystemCode;
import top.joylife.lemon.common.exception.Warning;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.service.ArticleService;

/**
 * created by wuhaiming on 2018/6/9
 */
@RestController(value = "adminArticleController")
@RequestMapping("/admin/article")
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 获取文章
     * @param id
     * @return
     */
    @ApiOperation(value = "根据ID获取文章")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResultData<ArticleDto> getArticle(@PathVariable String id){
        if(!NumberUtils.isDigits(id)){
            throw new Warning(SystemCode.ARTICLE_ID_WRONG);
        }
        Integer articleId = Integer.valueOf(id);
        ArticleDto articleDto = articleService.getById(articleId);
        if(articleDto==null){
            throw new Warning(SystemCode.ARTICLE_NOT_FOUNT);
        }
        return ReUtil.success(articleDto);
    }

    /**
     * 更新文章
     * @param articleDto
     * @return
     */
    @ApiOperation(value = "更新文章")
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public ResultData<Integer> updateArticle(@RequestBody ArticleDto articleDto){
        Integer articleId = articleDto.getId();
        if(articleId==null){
            throw new Warning(SystemCode.ARTICLE_ID_CAN_NOT_BE_NULL);
        }
        articleService.update(articleDto);
        return ReUtil.success(articleId);
    }

    /**
     * 删除文章
     * @param id
     * @return
     */
    @ApiOperation(value = "删除文章")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResultData<String> deleteArticle(@PathVariable String id){
        if(!NumberUtils.isDigits(id)){
            throw new Warning(SystemCode.ARTICLE_ID_WRONG);
        }
        articleService.delete(Integer.valueOf(id));
        return ReUtil.success(id);
    }

    /**
     * 新建文章
     * @param articleDto
     * @return
     */
    @ApiOperation(value = "添加文章")
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResultData<Integer> addArticle(@RequestBody ArticleDto articleDto){
        Integer articleId = articleService.add(articleDto);
        return ReUtil.success(articleId);
    }


}
