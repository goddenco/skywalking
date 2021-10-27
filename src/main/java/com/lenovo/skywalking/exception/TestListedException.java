package com.lenovo.skywalking.exception;

public class TestListedException extends RuntimeException {
    public TestListedException() {
    }

    public TestListedException(final String message) {
        super(message);
    }

    public TestListedException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public TestListedException(final Throwable cause) {
        super(cause);
    }

    public TestListedException(final String message,
                               final Throwable cause,
                               final boolean enableSuppression,
                               final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
