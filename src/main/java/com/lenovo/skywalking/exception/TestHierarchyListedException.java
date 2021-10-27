package com.lenovo.skywalking.exception;

public class TestHierarchyListedException extends TestListedException {
    public TestHierarchyListedException() {
    }

    public TestHierarchyListedException(final String message) {
        super(message);
    }

    public TestHierarchyListedException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public TestHierarchyListedException(final Throwable cause) {
        super(cause);
    }

    public TestHierarchyListedException(final String message,
                                        final Throwable cause,
                                        final boolean enableSuppression,
                                        final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
