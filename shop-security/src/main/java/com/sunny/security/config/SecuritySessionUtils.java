package com.sunny.security.config;

import com.sunny.user.model.SecurityUserDetails;
import com.sunny.user.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author tec_feng
 * @create 2020-05-21 18:43
 */
public class SecuritySessionUtils {


    public static User getLoginUser(){
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        SecurityUserDetails userDetails = (SecurityUserDetails) auth.getPrincipal();
        return userDetails.getUser();
    }

}
