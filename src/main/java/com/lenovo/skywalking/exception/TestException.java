package com.lenovo.skywalking.exception;

public class TestException extends RuntimeException {
    public TestException() {
    }

    public TestException(final String message) {
        super(message);
    }

    public TestException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public TestException(final Throwable cause) {
        super(cause);
    }

    public TestException(final String message,
                         final Throwable cause,
                         final boolean enableSuppression,
                         final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
