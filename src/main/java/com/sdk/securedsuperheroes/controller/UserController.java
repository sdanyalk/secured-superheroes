package com.sdk.securedsuperheroes.controller;

import com.sdk.securedsuperheroes.entity.ApplicationUser;
import com.sdk.securedsuperheroes.service.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    ApplicationUserService service;

    @PostMapping("/signup")
    public void signUp(@RequestBody ApplicationUser user) {
        service.addUser(user);
    }

}
