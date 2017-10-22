package top.joylife.lemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.lemon.bean.dto.AccountDto;
import top.joylife.lemon.service.TestService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Index {

    @Resource(name = "testService")
    private TestService testService;

    @RequestMapping("/")
    public List<AccountDto> index(){
        return testService.getData();
    }
}
