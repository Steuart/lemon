package top.joylife.lemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.common.bean.dto.ResultData;
import top.joylife.lemon.common.util.ResultUtil;
import top.joylife.lemon.service.TestService;

import javax.annotation.Resource;

@RestController
public class Index {

    @Resource(name = "testService")
    private TestService testService;

    @RequestMapping("/")
    public ResultData index(){

        return ResultUtil.success("");
    }

    @RequestMapping("/tran")
    public ResultData tran(){
        return ResultUtil.success("");
    }
}
