package com.sunny.shop.controller;

import com.sunny.base.ApiCode;
import com.sunny.base.ReturnResult;
import com.sunny.base.ValidatorTips;
import com.sunny.user.dto.RegisterDto;
import com.sunny.user.model.SecurityUserDetails;
import com.sunny.security.util.JwtTokenUtil;
import com.sunny.shop.action.UserAction;
import com.sunny.user.model.UserExample;
import com.sunny.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.sunny.user.model.User;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author tec_feng
 * @create 2020-04-08 19:11
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserAction userAction;
    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/register")
    public ReturnResult register(@Valid RegisterDto user){
        ReturnResult result = userAction.register(user);
        return result;
    }

    @PostMapping("/login")
    public ReturnResult login( String userName, String password){
        User user = userAction.getByUserName(userName);
        if(!passwordEncoder.matches(password,user.getPassword())){
            return ReturnResult.fail(ApiCode.PASSWORD_ERROR);
        }
        SecurityUserDetails userDetails = new SecurityUserDetails(user);
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails
        ,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenUtil.generateToken(userDetails);
        return ReturnResult.success(token);
    }

    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable("id")Integer id){
        int i = userAction.deleteByKey(id);
        return i;
    }

    @PostMapping("/update/{id}")
    public Object update(@PathVariable("id")Integer id,@RequestBody User user){
        userAction.updateByKey(user);
        return user;
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable("id")Integer id){
        User user = userAction.selectByKey(id);
        return user;
    }

    @GetMapping("/list")
    public Object list(){
        return userAction.selectByExample(new UserExample(),0,100);
    }

    @GetMapping("/list2")
    @PreAuthorize("hasRole('p1')")
    public Object list2(){
        return userAction.selectByExample(new UserExample(),0,100);
    }
    @GetMapping("/list3")
    public Object list3(){
        return userAction.selectByExample(new UserExample(),0,100);
    }

    @GetMapping("/info1")
    public Object info1(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object details = authentication.getPrincipal();
        if(details instanceof UserDetails){
            return ((UserDetails) details).getUsername();
        }else{
            return details.toString();
        }
    }
}
