package com.zero.hjy.pojo;

/**
 * 操作权限template
 */
public class Actions {

    private String action;
    private boolean defaultCheck;
    private String describe;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isDefaultCheck() {
        return defaultCheck;
    }

    public void setDefaultCheck(boolean defaultCheck) {
        this.defaultCheck = defaultCheck;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Action{" +
                "action='" + action + '\'' +
                ", defaultCheck=" + defaultCheck +
                ", describe='" + describe + '\'' +
                '}';
    }
}
