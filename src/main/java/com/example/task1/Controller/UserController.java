package com.example.task1.Controller;

import com.example.task1.Entity.User;
import com.example.task1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/loginuser")
    public User userlogin(@RequestParam String Username, @RequestParam String Password){
        return userService.login(Username, Password);
    }
    @PostMapping ("/registeruser")
    public User userregister(@RequestBody User user){
        return userService.Registration(user);
    }

}
