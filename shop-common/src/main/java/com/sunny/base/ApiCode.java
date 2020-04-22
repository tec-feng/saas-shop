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
    ERROR(201){
        @Override
        public String getMessage() {
            return "失败";
        }
    };
    private final int value;

    ApiCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public abstract String getMessage();
}
