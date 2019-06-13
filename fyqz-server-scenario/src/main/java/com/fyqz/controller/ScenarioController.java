package com.fyqz.controller;


import com.fyqz.model.User;
import com.fyqz.rpc.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * chess 服务
 */
@RestController
public class ScenarioController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    /**
     * 向前端提供一个访问地址；通过userServiceFeign调用服务并返回结果
     * @return
     */
    @RequestMapping(value = "/personScenario",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String person(){
        String result = userServiceFeign.getUser();
        return result;
    }

    @RequestMapping(value = "/userScenario",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String user(){
        User user = new User();
        user.setName("I am  From userScenario");
        String result = userServiceFeign.hello(user);
        return result;
    }
}
