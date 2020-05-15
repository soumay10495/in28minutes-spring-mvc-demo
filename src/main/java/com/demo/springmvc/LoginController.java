package com.demo.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //@ResponseBody
    public String getLoginPage() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginRequest(@RequestParam String username,
                                     @RequestParam String password, ModelMap modelMap) {

        if (!loginService.checkCredentials(username, password)) {
            modelMap.put("error", "Invalid Credentials");
            return "index";
        }
        modelMap.put("name", username);
        modelMap.put("password", password);
        return "user";
    }
}
