package com.sunny.shop.rpc;

import com.sunny.shop.service.product.api.UserFeignApi;
import com.sunny.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignController implements UserFeignApi{
    @Autowired
    UserService userService;
    @Override
    public Object list() {
        return userService.getOtherMethod();
    }
}
