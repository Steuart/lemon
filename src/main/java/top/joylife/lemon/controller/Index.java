package top.joylife.lemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.common.bean.dto.AccountDto;
import top.joylife.lemon.common.bean.dto.ReData;
import top.joylife.lemon.common.util.ReUtil;
import top.joylife.lemon.service.TestService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Index {

    @Resource(name = "testService")
    private TestService testService;

    @RequestMapping("/")
    public ReData index(){
        List<AccountDto> accountDtos = testService.getData();

        return ReUtil.success(accountDtos);
    }
}
