package com.sunny.user.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;

/**
 * @author tec_feng
 * @create 2020-04-29 13:22
 */
@Data
public class RegisterDto {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @NotBlank
    private String confirmPassword;
    private String phone;
}
