package com.lenovo.skywalking.controller;

import com.lenovo.skywalking.exception.TestAnnotatedException;
import com.lenovo.skywalking.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/case")
public class CaseController {

    private final TestService service;

    private static final String SUCCESS = "Success";

    @Autowired
    public CaseController(final TestService service) {
        this.service = service;
    }

    @RequestMapping("/exceptionchecker")
    @ResponseBody
    public String testcase() {

        try {
            service.testAnnotatedException();
        } catch (Exception ignore) {
            throw new TestAnnotatedException();
        }
/*

        try {
            service.testListedException();
        } catch (Exception ignore) {

        }

        try {
            service.testHierarchyListedException();
        } catch (Exception ignore) {

        }

        try {
            service.testException();
        } catch (Exception ignore) {

        }

        try {
            service.testRecursiveException();
        } catch (Exception ignore) {

        }*/
        return SUCCESS;
    }

    @RequestMapping("/healthCheck")
    @ResponseBody
    public String healthCheck() {
        // your codes
        return SUCCESS;
    }

    @RequestMapping("/log")
    @ResponseBody
    public String testLog() {
        return service.tstLog();
    }
}
