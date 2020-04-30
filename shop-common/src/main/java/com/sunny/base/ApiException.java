package com.sunny.base;

/**
 * @author tec_feng
 * @create 2020-04-29 13:11
 */
public class ApiException extends RuntimeException{
    private ApiCode apiCode;

    public ApiException(ApiCode apiCode){
        this.apiCode = apiCode;
    }

    public ApiCode getApiCode() {
        return apiCode;
    }

    public void setApiCode(ApiCode apiCode) {
        this.apiCode = apiCode;
    }
}
