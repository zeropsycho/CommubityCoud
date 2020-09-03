package com.zero.hjy.utils.template;

public class ParameterFormatTemplate {

    private Object data;
    private String message;
    private Object headers;
    private int code;

    public ParameterFormatTemplate() {
    }

    public ParameterFormatTemplate(Object data, String message, String headers, int code) {
        this.data = data;
        this.message = message;
        this.headers = headers;
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ParameterFormatTemplate{" +
                "data=" + data +
                ", message='" + message + '\'' +
                ", headers='" + headers + '\'' +
                ", code=" + code +
                '}';
    }
}
