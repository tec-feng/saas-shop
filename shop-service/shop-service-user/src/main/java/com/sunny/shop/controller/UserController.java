package com.sunny.shop.controller;/**
 * Created by tec_feng on 2020/4/8.
 * Email: tec_feng@hotmail.com
 */

import com.sunny.user.model.UserExample;
import com.sunny.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/create")
    public Object create(User user){
        int insert = userService.save(user);
        return user;
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

    @GetMapping("/list")
    public Object list(){
        return userService.selectByExample(new UserExample(),0,100);
    }


    @GetMapping("/list1")
    public Object list1(){
        return userService.getOtherMethod();
    }
}
