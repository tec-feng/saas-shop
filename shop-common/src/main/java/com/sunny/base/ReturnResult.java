package com.sunny.base;

/**
 * @author tec_feng
 * @create 2020-04-22 13:17
 */
public class ReturnResult<T> {
    private ApiCode code;
    private String message;
    private T data;

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
        this.code = code;
        this.message = code.getMessage();
    }

    protected ReturnResult(ApiCode code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    protected ReturnResult(ApiCode code, T data) {
        this.code = code;
        this.message = code.getMessage();
        this.data = data;
    }


    public ApiCode getCode() {
        return code;
    }

    public void setCode(ApiCode code) {
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
