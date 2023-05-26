package com.in28minutes.srpingboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

/**
 * The login controller class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 25 May 2023 - 21:30:13
 *
 */
@Slf4j
@Controller
public class LoginController {

    @RequestMapping("login")
    public String goToLoginJsp(@RequestParam String name, ModelMap map) {
        if (log.isInfoEnabled()) {
            log.info("Request param is: " + name);
        }
        map.put("name", name);

        return "login";
    }

}
