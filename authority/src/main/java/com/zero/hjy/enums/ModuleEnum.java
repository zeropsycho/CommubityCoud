package com.zero.hjy.enums;

import com.zero.hjy.statics.ModuleStatic;

public enum ModuleEnum {

    TEST(0L, ModuleStatic.MODULE_TEST),
    MODULE_SUPPORT(1L,ModuleStatic.MODULE_SUPPORT),
    COMMENTSS(2L, ModuleStatic.MODULE_COMMENT),
    MODULE_MEMBER(3L, ModuleStatic.MODULE_MEMBER),
    MODULE_MENU(4L, ModuleStatic.MODULE_MENU),
    MODULE_ORDER(5L, ModuleStatic.MODULE_ORDER),
    MODULE_PERMISSION(6L, ModuleStatic.MODULE_PERMISSION),
    MODULE_ROLE(7L, ModuleStatic.MODULE_ROLE),
    MODULE_USER(8L, ModuleStatic.MODULE_USER),
    MODULE_MARKETING(9L, ModuleStatic.MODULE_MARKETING),
    MODULE_PROFILE(10L,ModuleStatic.MODULE_PROFILE),
    MODULE_DASHBOARD(11L,ModuleStatic.MODULE_DASHBOARD),
    MODULE_EXCEPTION(12L,ModuleStatic.MODULE_EXCEPTION),
    MODULE_RESULT(13L,ModuleStatic.MODULE_RESULT),
    MODULE_TABLE(14L,ModuleStatic.MODULE_TABLE),
    MODULE_FORM(15L,ModuleStatic.MODULE_FORM),

    ;

    /**
     * 模块标识
     */
    public Long makeNo;
    /**
     * 模块名
     */
    public String name;

    ModuleEnum(Long makeNo, String name) {
        this.makeNo = makeNo;
        this.name = name;
    }

    public Long getMakeNo() {
        return makeNo;
    }

    public void setMakeNo(Long makeNo) {
        this.makeNo = makeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 根据索引值获取no
     *
     * @param name
     * @return getPermissionId
     */
    public static Long getMakeNo(String name) {
        for (ModuleEnum modules : ModuleEnum.values()) {
            if (modules.getName().equals(name)) {
                return modules.getMakeNo();
            }
        }
        return 0L;
    }

    /**
     * 根据value获取value
     *
     * @param makeNo
     * @return getPermissionName
     */
    public static String getName(Long makeNo) {
        for (ModuleEnum modules : ModuleEnum.values()) {
            if (modules.getMakeNo().equals(makeNo)) {
                return modules.getName();
            }
        }
        return null;
    }
}
