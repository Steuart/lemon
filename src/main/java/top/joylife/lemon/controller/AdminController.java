package top.joylife.lemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HemingWu on 2016/10/23.
 */

@Controller
@RequestMapping("/admin/")
public class AdminController {


    @RequestMapping("home")
    public String home(){

        return "home";
    }
}

