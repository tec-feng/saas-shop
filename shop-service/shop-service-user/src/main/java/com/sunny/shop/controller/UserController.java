package com.sunny.shop.controller;/**
 * Created by tec_feng on 2020/4/8.
 * Email: tec_feng@hotmail.com
 */

import com.sunny.user.mapper.UserMapper;
import com.sunny.user.model.UserExample;
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
    UserMapper userMapper;

    @PostMapping("/create")
    public Object create(User user){
        int insert = userMapper.insert(user);
        return user;
    }
    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable("id")Integer id){
        int i = userMapper.deleteByPrimaryKey(id);
        return i;
    }

    @PostMapping("/update/{id}")
    public Object update(@PathVariable("id")Integer id,@RequestBody User user){
        userMapper.updateByPrimaryKey(user);
        return user;
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable("id")Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @GetMapping("/list")
    public Object list(){
        return userMapper.selectByExample(new UserExample());
    }

}
