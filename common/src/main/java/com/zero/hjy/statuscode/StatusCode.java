package com.zero.hjy.statuscode;


/**
 * 返回参数
 * @author ZERO
 */
public enum StatusCode {

    // 成功
    SUCCESS(10000, "操作成功"),
    FAIL(10001, "操作失败"),

    // 参数错误
    PARAM_IS_INVALID(20001, "参数无效"),
    PARAM_IS_BLANK(20002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(20003, "参数格式错误"),
    PARAM_NOT_COMPLETE(20004, "参数缺失"),

    // 用户错误
    USER_NOT_LOGGED_IN(30001, "用户未登录，请先登录"),
    USER_LOGIN_ERROR(30002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(30003, "账号已被禁用"),
    USER_NOT_EXIST(30004, "用户不存在"),
    USER_HAS_EXISTED(30005, "用户已存在"),

    // 业务错误
    BUSINESS_GROUP_NO_ALLOWED_DEL(40001, "应用分组已经被应用使用，不能删除"),
    BUSINESS_THEME_NO_ALLOWED_DEL(40002, "主题已经被用户使用，不能删除"),
    BUSINESS_THEME_NO_ALLOWED_DISABLE(40003, "主题已经被用户使用，不能停用"),
    BUSINESS_THEME_DEFAULT_NO_ALLOWED_DEL(40004, "默认主题，不能删除"),
    BUSINESS_THEME_NO_ALLOWED_UPDATE(40005, "主题已经被用户使用，不能修改图片信息"),
    BUSINESS_IS_TOP(40040, "已经到最顶部"),
    BUSINESS_IS_BOTTOM(40041, "已经到最底部"),
    BUSINESS_NAME_EXISTED(40051, "名称已存在"),

    // 系统错误
    SYSTEM_INNER_ERROR(50001, "系统繁忙，请稍后重试"),
    UPLOAD_ERROR(50002, "系统异常，上传文件失败"),
    FILE_MAX_SIZE_OVERFLOW(50003, "上传尺寸过大"),
    FILE_ACCEPT_NOT_SUPPORT(50004, "上传文件格式不支持"),
    SET_UP_AT_LEAST_ONE_ADMIN(50005, "至少指定一个管理员"),
    URL_INVALID(50006, "地址不合法"),
    LINK_AND_LOGOUT_NO_MATCH(50006, "主页地址和注销地址IP不一致"),
    IP_AND_PORT_EXISTED(50007, "当前IP和端口已经被占中"),
    LINK_IS_REQUIRED(50008, "生成第三方token认证信息： 主页地址不能为空,请完善信息"),
    ONLY_ROOT_DEPARTMENT(50009, "组织机构只能存在一个根机构"),
    DEPART_CODE_EXISTED(50010, "组织机构编码已存在"),
    DEPART_CONTAINS_USERS(50011, "该机构下是存在用户，不允许删除"),
    DEPART_CONTAINS_SON(50012, "该机构下是存在子级机构，不允许删除"),
    DEPART_PARENT_IS_SELF(50013, "选择的父机构不能为本身"),
    DICT_EXIST_DEPEND(50014, "该字典数据存在详情依赖，不允许删除"),
    DICT_DETAIL_LOCK(50015, "该字典数据被锁定，不允许修改或删除"),
    DEPART_CODE_EXISTED_WITH_ARGS(50016, "组织机构编码【{0}】系统已存在"),

    // 数据错误
    RESULT_DATA_NONE(60001, "数据未找到"),
    DATA_IS_WRONG(60002, "数据有误"),
    DATA_ALREADY_EXISTED(60003, "数据已存在"),

    // 接口错误：60001-69999
    INTERFACE_INNER_INVOKE_ERROR(70001, "内部系统接口调用异常"),
    INTERFACE_OUTTER_INVOKE_ERROR(70002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(70003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(70004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(70005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(70006, "接口负载过高"),

    // 权限错误
    PERMISSION_UNAUTHENTICATED(80001, "此操作需要登陆系统！"),
    PERMISSION_UNAUTHORISE(80002, "权限不足，无权操作！"),
    PERMISSION_EXPIRE(80003, "登录状态过期！"),
    PERMISSION_TOKEN_EXPIRED(80004, "token已过期"),
    PERMISSION_LIMIT(80005, "访问次数受限制"),
    PERMISSION_TOKEN_INVALID(80006, "无效token"),
    PERMISSION_SIGNATURE_ERROR(80007, "签名失败")
    ;

    public int code;
    public String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
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

    /**
     * 根据索引值获取value
     * @param index
     * @return
     */
    public static String getMessage(int index) {
        for (StatusCode statusCode : StatusCode.values()) {
            if (statusCode.getCode() == index) {
                return statusCode.getMessage();
            }
        }
        return null;
    }

    /**
     * 根据value获取no
     * @param message
     * @return
     */
    public static int getCode(String message) {
        for (StatusCode statusCode : StatusCode.values()) {
            if (statusCode.getMessage().equals(message)) {
                return statusCode.getCode();
            }
        }
        return 0;
    }
}
