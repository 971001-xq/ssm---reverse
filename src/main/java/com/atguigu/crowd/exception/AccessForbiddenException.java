package com.atguigu.crowd.exception;

/**
 * @author xq
 * @create 2020-11-10-21:01
 */
public class AccessForbiddenException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public AccessForbiddenException() {
        super();
    }

    public AccessForbiddenException(String message) {
        super(message);
    }

    public AccessForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbiddenException(Throwable cause) {
        super(cause);
    }

    protected AccessForbiddenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
