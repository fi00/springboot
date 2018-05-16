package cn.coolwind.springboot.web.controller;

import cn.coolwind.springboot.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public List test() {
        List list = testService.test();
        return list;
    }

}
