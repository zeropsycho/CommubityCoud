package com.zero.hjy.utils.jwt;

import com.zero.hjy.statuscode.StatusCode;

/**
 * JWT 过期处理类
 */
public class JwtExpiredException extends RuntimeException {

    private StatusCode statusCode;

    public JwtExpiredException(StatusCode statusCode) {
        super(statusCode.getMessage());
        this.statusCode = statusCode;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
