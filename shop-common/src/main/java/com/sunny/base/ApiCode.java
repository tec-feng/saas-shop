package com.sunny.base;

/**
 * @author tec_feng
 * @create 2020-04-22 13:22
 */
public enum ApiCode {
    OK(200){
        @Override
        public String getMessage() {
            return "成功";
        }
    },
    ERROR(401){
        @Override
        public String getMessage() {
            return "失败";
        }
    },
    INNER_ERROR(402){
        @Override
        public String getMessage() {
            return "系统内部错误";
        }
    },
    PASSWORD_ERROR(4001){
        @Override
        public String getMessage() {
            return "密码错误";
        }
    },
    USER_EXIST(4002){
        @Override
        public String getMessage() {
            return "用户已存在";
        }
    },
    CONFIRM_PASSWORD_NOT_SAME(4002){
        @Override
        public String getMessage() {
            return "确认密码不一致";
        }
    },
    PARAM_VERIFY_ERROR(4003){
        @Override
        public String getMessage() {
            return "参数效验出错";
        }
    },
    NAV_CATEGORY_EXIST(5001){
        @Override
        public String getMessage() {
            return "分类已存在";
        }
    };
    ;
    private final int value;

    ApiCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public abstract String getMessage();
}
