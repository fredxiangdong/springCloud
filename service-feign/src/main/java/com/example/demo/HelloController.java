package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangxiangdong on 2017/5/17.
 */
@RestController
public class HelloController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
