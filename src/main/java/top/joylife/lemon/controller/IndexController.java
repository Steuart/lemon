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
        String content="## 树莓派 \n" +
                "### asddsa \n" +
                "#### saddas \n" +
                "#### saddas \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
                "- sdsad \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
                " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
                "** asddsa ** \n";
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
