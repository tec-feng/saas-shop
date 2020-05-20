package com.sunny.shop.rpc;

import com.sunny.base.ApiCode;
import com.sunny.base.ReturnResult;
import com.sunny.shop.service.user.api.UserFeignApi;
import com.sunny.shop.action.UserAction;
import com.sunny.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignController implements UserFeignApi{
    @Autowired
    UserAction userAction;


    @Override
    public ReturnResult getByUserName(String userName) {
        User user = userAction.getByUserName(userName);
        return ReturnResult.success(ApiCode.OK,user);
    }
}
