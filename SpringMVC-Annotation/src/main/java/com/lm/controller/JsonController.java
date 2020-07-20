package com.lm.controller;

import com.alibaba.fastjson.JSON;
import com.lm.pojo.User;
import com.lm.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 标注了RestController类的方法只会返回字符串不会走视图解析器
 * 标注了Controller的类如果想要不走视图解析器方法上必须加上@ResponseBody注解
 * @author super
 */
@RestController
public class JsonController {
    @RequestMapping("/j1")
    public String json1(){
        final User user = new User(1, "梨木", 18);
        return JsonUtils.getJson(user);
    }
    @RequestMapping("/j2")
    public String json2(){
        final User user1 = new User(1, "小明", 19);
        final User user2 = new User(2, "小李", 20);
        final User user3 = new User(3, "小张", 21);
        final User user4 = new User(4, "小赵", 22);
        List<User> users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return JsonUtils.getJson(users);
    }
    @RequestMapping("/j3")
    public String json3(){
        final User user = new User(1, "梨木", 18);
        return JsonUtils.getJson(user);
    }

    /**
     * fastJson方法
     * @return
     */
    @RequestMapping("/j4")
    public String json4(){
        final User user = new User(1, "梨木", 18);
        return JSON.toJSONString(user);
    }
}
