package com.lenovo.skywalking.exception;

import org.apache.skywalking.apm.toolkit.trace.IgnoredException;

@IgnoredException
public class TestAnnotatedException extends RuntimeException {
    public TestAnnotatedException() {
    }

    public TestAnnotatedException(final String message) {
        super(message);
    }

    public TestAnnotatedException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public TestAnnotatedException(final Throwable cause) {
        super(cause);
    }

    public TestAnnotatedException(final String message,
                                  final Throwable cause,
                                  final boolean enableSuppression,
                                  final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
