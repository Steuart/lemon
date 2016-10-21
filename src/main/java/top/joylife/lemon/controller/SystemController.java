package top.joylife.lemon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.joylife.lemon.common.consts.ReCode;
import top.joylife.lemon.common.consts.ReData;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.exception.Warning;

/**
 * Created by HemingWU on 2016/10/22.
 */
@Controller
@RequestMapping("/")
public class SystemController {

    private Logger logger = LoggerFactory.getLogger(SystemController.class);
    @RequestMapping("/json")
    @ResponseBody
    public ReData index(){
        return ReUtil.success();
    }

    @RequestMapping("")
    public String home(ModelMap model){
        logger.error("dsaadasd__________________________");
        model.put("aaa","hello");
        throw new Warning(ReCode.FAIL,"helllo");

        //return "home";
    }
}
