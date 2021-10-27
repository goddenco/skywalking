package com.lenovo.skywalking.exception;

public class TestOtherClassLoaderException extends RuntimeException {

    public TestOtherClassLoaderException() {
    }

    public TestOtherClassLoaderException(final String message) {
        super(message);
    }

    public TestOtherClassLoaderException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public TestOtherClassLoaderException(final Throwable cause) {
        super(cause);
    }

    public TestOtherClassLoaderException(final String message,
                                         final Throwable cause,
                                         final boolean enableSuppression,
                                         final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
