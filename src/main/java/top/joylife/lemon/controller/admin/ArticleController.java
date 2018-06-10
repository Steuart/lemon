package top.joylife.lemon.controller.admin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.util.ReUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * created by wuhaiming on 2018/6/9
 */
@RestController(value = "adminArticleController")
@RequestMapping("/admin/article")
public class ArticleController {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResultData<Map> article(@PathVariable String id){
        Map<String,Object> data = new HashMap<>();
        data.put("id", id);
        data.put("content", "# 葫芦娃，葫芦娃");
        return ReUtil.success(data);
    }
}
