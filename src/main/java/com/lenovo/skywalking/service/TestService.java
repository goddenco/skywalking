package com.lenovo.skywalking.service;

import com.lenovo.skywalking.exception.TestAnnotatedException;
import com.lenovo.skywalking.exception.TestException;
import com.lenovo.skywalking.exception.TestHierarchyListedException;
import com.lenovo.skywalking.exception.TestListedException;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String testAnnotatedException() {
        throw new TestAnnotatedException();
    }

    public String testException() {
        throw new TestException();
    }

    public String testListedException() {
        throw new TestListedException();
    }

    public String testHierarchyListedException() {
        throw new TestHierarchyListedException();
    }

    public String testRecursiveException() {
        throw new TestException(new TestListedException());
    }

}
