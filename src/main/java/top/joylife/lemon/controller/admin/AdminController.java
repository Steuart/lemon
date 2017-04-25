package top.joylife.lemon.controller.admin;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.lemon.common.consts.ReData;
import top.joylife.lemon.common.util.ReUtil;

import javax.annotation.Resource;

/**
 * Created by HemingWu on 2016/10/23.
 */

@Controller("adminController")
@RequestMapping("admin")
public class AdminController {

    @Resource
    private MongoTemplate mongoTemplate;

    @RequestMapping("home")
    public String home(){

        return "home";
    }


    @ResponseBody
    @RequestMapping("mongo")
    public ReData mongo(){
        DB db = mongoTemplate.getDb();
        DBCollection collection = db.getCollection("stock");
        DBObject dbObject = collection.findOne();
        return ReUtil.success(dbObject);
    }
}

