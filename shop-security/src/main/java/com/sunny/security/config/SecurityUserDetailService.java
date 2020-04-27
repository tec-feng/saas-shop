package com.sunny.security.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author tec_feng
 * @create 2020-04-24 13:07
 */
@Component
public class SecurityUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails sunny = User.builder().username("sunny").password("123").roles("p1").build();
        return sunny;
    }
}
