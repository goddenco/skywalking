package com.lenovo.skywalking.exception;

import org.apache.skywalking.apm.toolkit.trace.IgnoredException;

@IgnoredException
public class TestHierarchyMatchException extends TestNameMatchException {
    public TestHierarchyMatchException() {
    }

    public TestHierarchyMatchException(final String message) {
        super(message);
    }
}
