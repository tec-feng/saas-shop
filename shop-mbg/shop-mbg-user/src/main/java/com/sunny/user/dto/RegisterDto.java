package com.sunny.user.dto;

import com.sunny.base.ValidatorTips;
import lombok.Data;
import javax.validation.constraints.NotBlank;

/**
 * @author tec_feng
 * @create 2020-04-29 13:22
 */
@Data
public class RegisterDto {
    @NotBlank(message= ValidatorTips.USER_NOT_EMPTY)
    private String userName;
    @NotBlank(message=ValidatorTips.PASSWORD_NOT_EMPTY)
    private String password;
    @NotBlank(message=ValidatorTips.CONFIRM_PASSWORD_NOT_EMPTY)
    private String confirmPassword;
    private String phone;
}
