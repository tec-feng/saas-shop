package com.sunny.base;

import java.io.Serializable;

/**
 * @author tec_feng
 * @create 2020-04-22 13:17
 */
public class ReturnResult<T> implements Serializable{
    private int code;
    private String message;
    private T data;

    public ReturnResult(){

    }
    public static <T> ReturnResult<T> success(){
        return new ReturnResult<>(ApiCode.OK);
    }
    public static <T> ReturnResult<T> success(ApiCode code){
        return new ReturnResult<>(code);
    }
    public static <T> ReturnResult<T> success(ApiCode code,T data){
        return new ReturnResult<>(code,code.getMessage(),data);
    }
    public static <T> ReturnResult<T> success(T data){
        return new ReturnResult<>(ApiCode.OK,ApiCode.OK.getMessage(),data);
    }

    public static <T> ReturnResult<T> fail(){
        return new ReturnResult<>(ApiCode.ERROR);
    }
    public static <T> ReturnResult<T> fail(ApiCode code){
        return new ReturnResult<>(code);
    }

    protected ReturnResult(ApiCode code){
        this.code = code.getValue();
        this.message = code.getMessage();
    }

    protected ReturnResult(ApiCode code, String message, T data) {
        this.code = code.getValue();
        this.message = message;
        this.data = data;
    }

    protected ReturnResult(ApiCode code, T data) {
        this.code = code.getValue();
        this.message = code.getMessage();
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
