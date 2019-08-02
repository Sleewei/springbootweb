package com.liwei.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：leewei
 * @date ：Created in 2019/8/2 20:40
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
