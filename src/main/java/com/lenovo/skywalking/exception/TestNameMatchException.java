package com.lenovo.skywalking.exception;

import org.apache.skywalking.apm.toolkit.trace.IgnoredException;

@IgnoredException
public class TestNameMatchException extends RuntimeException {

    public TestNameMatchException() {
    }

    public TestNameMatchException(final String message) {
        super(message);
    }

    public String testException() {
        throw new RuntimeException();
    }
}
