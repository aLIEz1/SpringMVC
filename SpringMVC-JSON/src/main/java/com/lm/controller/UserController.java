package com.lm.controller;

import com.lm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    /**
     * 加了ResponseBody注解说明这个方法不会走视图解析器
     * 会直接返回一个字符串
     * @return
     */
    @RequestMapping("/j1")
    public String json1(){
        User user = new User("lm",18,"male");

        return "test";
    }
}
