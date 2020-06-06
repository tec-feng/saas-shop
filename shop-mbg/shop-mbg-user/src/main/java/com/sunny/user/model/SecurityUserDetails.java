package com.sunny.user.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author tec_feng
 * @create 2020-04-22 18:53
 */
public class SecurityUserDetails implements UserDetails {
    private User user;

    public SecurityUserDetails(User user) {
        this.user = user;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user!=null?user.getPassword():null;
    }

    @Override
    public String getUsername() {
        return user!=null?user.getUserName():null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return user!=null?user.getHasForbidden():null;
    }

    @Override
    public boolean isAccountNonLocked() {
        return user!=null?user.getHasForbidden():null;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return user!=null?user.getHasForbidden():null;
    }

    @Override
    public boolean isEnabled() {
        return user!=null?user.getHasForbidden():null;
    }

    public User getUser() {
        return user;
    }
}
