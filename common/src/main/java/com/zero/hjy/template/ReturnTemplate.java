package com.zero.hjy.template;

public class ReturnTemplate {

    public Object result;
    public int code;
    public String message;

    public ReturnTemplate() {
    }

    public ReturnTemplate(Object result, int code, String message) {
        this.result = result;
        this.code = code;
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserInfoTemplate{" +
                "result=" + result +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}