package com.zixyos.javabien.controllers;
import com.zixyos.javabien.services.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-user")
    @ResponseBody
    public String getUser(@RequestParam String username) {
        return this.userService.getUser(username);
    }

}
