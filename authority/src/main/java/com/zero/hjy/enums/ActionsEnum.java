package com.zero.hjy.enums;

import com.zero.hjy.statics.ActionStatic;

public enum ActionsEnum {

    ADD (1, ActionStatic.DESCRIBE_ADD),
    GET (2, ActionStatic.DESCRIBE_GET),
    UPDATE (3, ActionStatic.DESCRIBE_UPDATE),
    DELETE (4, ActionStatic.DESCRIBE_DELETE),
    EXPORT (5, ActionStatic.DESCRIBE_EXPORT),
    IMPORT (6, ActionStatic.DESCRIBE_IMPORT)
    ;

    public Integer actionNo;
    public String describe;

    ActionsEnum(Integer actionNo, String describe) {
        this.actionNo = actionNo;
        this.describe = describe;
    }

    public Integer getActionNo() {
        return actionNo;
    }

    public void setActionNo(Integer actionNo) {
        this.actionNo = actionNo;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 根据索引值获取value
     *
     * @param index
     * @return
     */
    public static String getDescribe(Integer index) {
        for (ActionsEnum actions : ActionsEnum.values()) {
            if (actions.getActionNo().equals(index)) {
                return actions.getDescribe();
            }
        }
        return null;
    }

    /**
     * 根据value获取no
     * @param value
     * @return
     */
    public static Integer getActionNo(String value) {
        for (ActionsEnum actions : values()) {
            if (actions.getDescribe().equals(value)) {
                return actions.getActionNo();
            }
        }
        return null;
    }
}
