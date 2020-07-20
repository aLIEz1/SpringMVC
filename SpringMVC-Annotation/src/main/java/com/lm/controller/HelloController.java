package com.lm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author super
 * Controller 代表这个类会被Spring托管
 * 被这个注解的类中的所有方法，如果返回值是String，并且有具体的页面可以跳转，那么就会被视图解析器解析
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnnotation");
        //会被视图解析器处理
        return "hello";
    }
}
