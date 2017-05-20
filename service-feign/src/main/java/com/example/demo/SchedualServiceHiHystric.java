package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by yangxiangdong on 2017/5/17.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
