package com.sunny.shop.config;

import com.sunny.base.ReturnResult;
import com.sunny.security.config.SecurityConfig;
import com.sunny.shop.service.user.api.UserFeignApi;
import com.sunny.user.model.SecurityUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author tec_feng
 * @create 2020-06-03 19:30
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class ProductSecurityConfig extends SecurityConfig {
    @Autowired
    private UserFeignApi userFeignApi;
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        return username -> {
            ReturnResult<SecurityUserDetails> result = userFeignApi.loadUserByUserName(username);
            return  result.getData();
        };
    }
}
