package com.zixyos.javabien.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser(String username) {
        return username;
    }
}
