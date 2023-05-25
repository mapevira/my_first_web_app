package com.in28minutes.srpingboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The login controller class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 25 May 2023 - 21:30:13
 *
 */
@Controller
public class LoginController {

    @RequestMapping("login")
    public String goToLoginJsp() {
        return "login";
    }

}
