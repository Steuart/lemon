package top.joylife.lemon.controller;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.config.SystemConfig;
import top.joylife.lemon.service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @Resource(name = "userService")
    private UserService userService;

    @Autowired
    private SystemConfig systemConfig;

    @RequestMapping("/")
    public String index(Map<String,Object> model){
        model.put("title","首页");
        return "index";
    }

    @RequestMapping("/index")
    public String home(){

        return "index";
    }

    @RequestMapping("/user")
    @ResponseBody
    public ResultData tran(){
        Map<String,Object> data = new HashMap<>();
        data.put("xxx","xxxx");
        return ReUtil.success(data);
    }

    @RequestMapping("/article")
    public String article(Map<String,Object> data){
        data.put("title","文章");
        String content="树莓派树莓派树莓派树莓派树莓派树莓派 \n" +
                "asddsasaddsasdadsa \n" +
                "# 第一章 \n" +
                "## 第二章 \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" +
                "# 一杯敬自由 \n" +
                "- sdsad \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" +
                "# 一杯敬死亡 \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" +
                "## 天亮之后潦草离场 \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" +
                "### 清醒的人最荒唐 \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" +
                "## 半壶烟沙 \n" +
                "**asddsa** \n" +
                "> sdsadsa \n" +
                "- sadsad \n" +
                "- 发顺丰大师傅 \n" +
                "------- \n" +
                "```saddsa``` \n" +
                "![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1527271624876&di=2be67e2f3bdf122cf7e0bbf0add18a97&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F48540923dd54564e96db4295bfde9c82d0584fdb.jpg)";
        MutableDataSet options = new MutableDataSet();
        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();
        // You can re-use parser and renderer instances
        Node document = parser.parse(content);
        String html = renderer.render(document);
        data.put("content",html);
        return "article";
    }
}
