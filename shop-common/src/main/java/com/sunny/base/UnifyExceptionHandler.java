package com.sunny.base;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * @author tec_feng
 * @create 2020-04-29 13:10
 */
@ControllerAdvice
public class UnifyExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public ReturnResult handle(ApiException e) {
        if (e.getApiCode() != null) {
            return ReturnResult.fail(e.getApiCode());
        }
        return ReturnResult.fail();
    }

    @Override
    protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        BindingResult result = ex.getBindingResult();
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.OK).body(ApiCode.PASSWORD_ERROR.getMessage());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("bad request");
    }

}
