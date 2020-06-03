package com.sunny.shop.config;

import com.sunny.security.config.SecurityConfig;
import com.sunny.shop.action.UserAction;
import com.sunny.shop.service.user.api.UserFeignApi;
import com.sunny.user.model.SecurityUserDetails;
import com.sunny.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author tec_feng
 * @create 2020-06-03 19:30
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class ProductSecurityConfig extends SecurityConfig {
    @Autowired
    private UserAction userAction;
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        return username -> {
            User user = userAction.getByUserName(username);
            return new SecurityUserDetails(user);
        };
    }
}
