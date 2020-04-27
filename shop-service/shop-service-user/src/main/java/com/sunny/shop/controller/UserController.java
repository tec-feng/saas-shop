package com.sunny.shop.controller;

import com.sunny.security.config.SecurityUserDetailService;
import com.sunny.security.util.JwtTokenUtil;
import com.sunny.user.model.UserExample;
import com.sunny.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.sunny.user.model.User;

/**
 *
 * @author tec_feng
 * @create 2020-04-08 19:11
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    private SecurityUserDetailService userDetailService;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/create")
    public Object create(User user){
        int insert = userService.save(user);
        return user;
    }

    @PostMapping("/login")
    public Object login(String userName,String password){
        UserDetails userDetails = userDetailService.loadUserByUsername(userName);
        if(!passwordEncoder.matches(password,userDetails.getPassword())){
            return "密码错误";
        }
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails
        ,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable("id")Integer id){
        int i = userService.deleteByKey(id);
        return i;
    }

    @PostMapping("/update/{id}")
    public Object update(@PathVariable("id")Integer id,@RequestBody User user){
        userService.updateByKey(user);
        return user;
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable("id")Integer id){
        User user = userService.selectByKey(id);
        return user;
    }

    @PreAuthorize("hasRole('p2')")
    @GetMapping("/list")
    public Object list(){
        return userService.selectByExample(new UserExample(),0,100);
    }

    @GetMapping("/list2")
    public Object list2(){
        return userService.selectByExample(new UserExample(),0,100);
    }
    @PreAuthorize("hasRole('p1')")
    @GetMapping("/list3")
    public Object list3(){
        return userService.selectByExample(new UserExample(),0,100);
    }


    @GetMapping("/list1")
    public Object list1(){
        return userService.getOtherMethod();
    }
}
