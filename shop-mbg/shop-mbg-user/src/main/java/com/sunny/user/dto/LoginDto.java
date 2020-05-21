package com.sunny.user.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author tec_feng
 * @create 2020-05-21 19:05
 */
@Data
public class LoginDto {
    @NotEmpty
    private String userName;
    @NotEmpty
    private String password;
}
