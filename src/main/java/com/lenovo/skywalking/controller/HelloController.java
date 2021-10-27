package com.lenovo.skywalking.controller;

import com.lenovo.skywalking.exception.TestNameMatchException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello/skywalking")
    public String sayHello() {
        return "hello skywalking";
    }

    @RequestMapping("/hello/exception")
    public String tstException() {
        TestNameMatchException te = new TestNameMatchException();
        te.testException();
        return "this is exception page";
    }

}
