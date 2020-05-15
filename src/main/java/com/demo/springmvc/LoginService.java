package com.demo.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean checkCredentials(String username, String password) {
        return username.equals("sam") && password.equals("jack");
    }
}
